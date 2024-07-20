package net.nucleartea.minenautica.entity.custom;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.nucleartea.minenautica.entity.WaterMonster;

import java.util.EnumSet;
import java.util.List;

public class CrabSquid extends WaterMonster {

    private static final double EMP_MAX_RADIUS = 12D;
    private static final double EMP_RANGE = 9;
//    private static final int NUMBER_OF_RINGS = 100;
    public static final int EMP_DURATION_TICKS = 30;


    private EMPTicker tickingTask;

    public CrabSquid(EntityType<? extends WaterMonster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
//        this.lookControl = new SmoothSwimmingLookControl(this, 10);
    }
    //crab squid TODO
    //attack light sources and player when in certain range
    //swim around and crawl on the ground when grounded

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
        if (tickingTask != null) {
            tickingTask.tick();
        }
    }

    @Override
    protected void registerGoals() {
//        this.goalSelector.addGoal(4, new Guardian.GuardianAttackGoal(this));
//        this.goalSelector.addGoal(5, movetowardsrestrictiongoal);
//        this.goalSelector.addGoal(7, this.randomStrollGoal);
//        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
//        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Guardian.class, 12.0F, 0.01F));
        this.goalSelector.addGoal(1, new CrabsquidEMPGoal(this, EMP_RANGE)); // Adjust the priority and radius as needed
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(3, new RandomFloatAroundGoal(this, 1.0D, 25));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true, false ));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, GlowSquid.class, true, false ));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 300D)
                .add(Attributes.MOVEMENT_SPEED, 2D)
                .add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(net.minecraftforge.common.ForgeMod.SWIM_SPEED.get(), 2D)
                .add(Attributes.ATTACK_DAMAGE, 25D);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    protected void handleAirSupply(int pAirSupply) {
        this.setAirSupply(300);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    public class EMPTicker {
        private final CrabSquid crabsquid;
        private final int totalTicks; // Total ticks for the entire EMP duration
        private int currentTick = 0;
        private Vec3 height;


        public EMPTicker(CrabSquid crabsquid, int totalTicks, Vec3 height) {
            this.crabsquid = crabsquid;
            this.totalTicks = totalTicks;
            this.height = height;
        }

        public void tick() {
            if (currentTick > totalTicks) {
                crabsquid.tickingTask = null;
                return;
            }

            double progress = (double) currentTick / totalTicks;
            double currentRadius = progress * EMP_MAX_RADIUS;
            crabsquid.propagateEMPEffect(currentRadius, height);

            currentTick++;
        }
    }


    class CrabsquidEMPGoal extends Goal {
        private final CrabSquid crabsquid;
        private final double searchRadius;

        public CrabsquidEMPGoal(CrabSquid crabsquid, double searchRadius) {
            this.crabsquid = crabsquid;
            this.searchRadius = searchRadius;
            this.setFlags(EnumSet.of(Goal.Flag.TARGET));
        }

        @Override
        public void tick() {
            super.tick();
        }

        @Override
        public boolean canUse() {
            List players = crabsquid.level().getEntitiesOfClass(Player.class, crabsquid.getBoundingBox().inflate(searchRadius), player -> player.isHolding(Items.TORCH));
            return !players.isEmpty();
        }

        @Override
        public boolean canContinueToUse() {
            return super.canContinueToUse();
        }

        @Override
        public void start() {
            crabsquid.triggerEMP();
        }
    }
    // Call this method to trigger the EMP attack
    public void triggerEMP() {
        if (this.tickingTask != null) {return;}
        if (!this.level().isClientSide()) {
//            for (int i = 1; i <= EMP_MAX_RADIUS; i++) {
//                final int currentRadius = i;
//                this.level().getServer().
//                this.level().getServer().execute((Runnable) () -> propagateEMPEffect(currentRadius));
//            }
            this.tickingTask = new EMPTicker(this, EMP_DURATION_TICKS, this.getEyePosition());

        }
    }
    private void propagateEMPEffect(double radius, Vec3 eyePosition) {
        createEMPEffect(radius, eyePosition);
        applyEMPEffects(radius, eyePosition);
    }

    private void createEMPEffect(double radius, Vec3 eyePosition) {
        Vec3 pos = eyePosition;
        Level level = this.level();
        if (level instanceof ServerLevel) {
            ServerLevel serverWorld = (ServerLevel) level;
            // Create a ring particle effect expanding outward
            for (int i = 0; i < radius * 10; i++) {
                double angle = 2 * Math.PI * i / (radius * 10);
                double xOffset = radius * Math.cos(angle);
                double zOffset = radius * Math.sin(angle);
                serverWorld.sendParticles(ParticleTypes.GLOW_SQUID_INK, pos.x + xOffset, pos.y, pos.z + zOffset, 1, 0, 0, 0, 0);
            }
        }
    }

    private void applyEMPEffects(double radius, Vec3 eyePosition) {
        Vec3 pos = eyePosition;
        AABB area = new AABB(pos.x - radius, pos.y - 2, pos.z - radius, pos.x + radius, pos.y + 2, pos.z + radius);
        for (Entity entity : this.level().getEntities(this, area)) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                // Apply effects to players within the radius
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 4));
                livingEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 2, 1));
//                livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 1));
//                livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 1));
            }
        }
    }


    public class RandomFloatAroundGoal extends Goal {
        private final CrabSquid crabSquid;
        private final double speedModifier;
        private final int interval;
        private int executionTicks;
        private int bobbingTick;

        public RandomFloatAroundGoal(CrabSquid crabSquid, double speedModifier, int interval) {
            this.crabSquid = crabSquid;
            this.speedModifier = speedModifier;
            this.interval = interval;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            return this.crabSquid.isInWater();
        }

        @Override
        public boolean canContinueToUse() {
            return this.canUse();
        }

        @Override
        public void start() {
            this.executionTicks = 0;
            this.bobbingTick = this.crabSquid.getRandom().nextInt(60);
        }

        @Override
        public void stop() {
            this.crabSquid.getMoveControl().setWantedPosition(this.crabSquid.getX(), this.crabSquid.getY(), this.crabSquid.getZ(), 0.0D);
        }

        @Override
        public void tick() {
            ++this.executionTicks;
            if (this.executionTicks % this.interval == 0) {
                RandomSource randomSource = this.crabSquid.getRandom();
                double offsetX = (randomSource.nextFloat() * 2.0F - 1.0F) * 16.0F;
                double offsetY = (randomSource.nextFloat() * 2.0F - 1.0F) * 16.0F;
                double offsetZ = (randomSource.nextFloat() * 2.0F - 1.0F) * 16.0F;

                // Adjust vertical bobbing magnitude
                offsetY *= 1.4F; // You can adjust this multiplier as needed

                this.crabSquid.getMoveControl().setWantedPosition(
                        this.crabSquid.getX() + offsetX,
                        this.crabSquid.getY() + offsetY,
                        this.crabSquid.getZ() + offsetZ,
                        this.speedModifier
                );
            }

            // Bobbing logic
            bobbingTick++;
            if (bobbingTick > 60) {
                bobbingTick = 0;
            }
            double bobbingFactor = Math.sin(bobbingTick / 60.0 * 2 * Math.PI) * 0.05; // Adjust as needed
            this.crabSquid.setDeltaMovement(this.crabSquid.getDeltaMovement().add(0, bobbingFactor, 0));
        }
    }



}
