package net.nucleartea.minenautica.entity.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.animal.Dolphin;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.nucleartea.minenautica.entity.WaterMonster;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Crashfish extends WaterMonster {

    private final static float FUSE_DURATION_SEC = 10F;
    private float fuse = 0;

    public Crashfish(EntityType<? extends WaterMonster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.02F, 0.1F, true);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        this.fuse = FUSE_DURATION_SEC * 20;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 15D)
                .add(Attributes.MOVEMENT_SPEED, 2D)
                .add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(net.minecraftforge.common.ForgeMod.SWIM_SPEED.get(), 2.4D);
    }

    public void tick() {
        if (this.fuse < 0) {
            explodeCrashfish();
        }

        super.tick();
    }
    private void explodeCrashfish() {
        if (!this.level().isClientSide) {
            float explosionRadius = 3F;
            this.dead = true;
            this.level().explode(this, this.getX(), this.getY(), this.getZ(), explosionRadius, Level.ExplosionInteraction.MOB);
            this.discard();
        }

    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(1, new CrashfishFindTargetAndExplodeGoal(this));
        this.goalSelector.addGoal(4, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Drowned.class, true));
    }

    public class CrashfishFindTargetAndExplodeGoal extends MeleeAttackGoal {
        private final Crashfish crashfish;
        @Nullable
        private LivingEntity target;

        public CrashfishFindTargetAndExplodeGoal(Crashfish pCrashfish) {
            super(pCrashfish,1,true);
            this.crashfish = pCrashfish;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void start() {
            this.target = this.crashfish.getTarget();
            crashfish.playSound(SoundEvents.CREEPER_PRIMED, 1.0F, 0.5F);
            crashfish.gameEvent(GameEvent.PRIME_FUSE);
            fuse = Crashfish.FUSE_DURATION_SEC * 20;
            super.start();
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void stop() {
            this.target = null;
            crashfish.fuse = Crashfish.FUSE_DURATION_SEC * 20;
            super.stop();
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            crashfish.fuse -= 1;
            if (distanceTo(target) < 2.5F) {
                crashfish.explodeCrashfish();
            }
            super.tick();
        }
    }
}
