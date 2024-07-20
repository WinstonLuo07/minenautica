package net.nucleartea.minenautica.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.AbstractSchoolingFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.nucleartea.minenautica.item.ModItems;
import org.checkerframework.checker.units.qual.A;


public abstract class MinenauticaFish extends AbstractSchoolingFish{
    public MinenauticaFish(EntityType<? extends MinenauticaFish> entityType, Level level) {
        super(entityType, level);
    }
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState flopAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    @Override
    public int getMaxSpawnClusterSize() {
        return 15;
    }

    @Override
    public void tick() {
        super.tick();
//
        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
        this.flopAnimationState.animateWhen(!this.isInWater(), this.tickCount);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return AbstractSchoolingFish.createLivingAttributes()
                .add(Attributes.FOLLOW_RANGE, 5D)
                .add(Attributes.MAX_HEALTH, 3D);
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }

    @Override
    public ItemStack getBucketItemStack() {
        return this.getBucketItemStack();
    }

    public static class Peeper extends MinenauticaFish {

        public Peeper(EntityType<? extends Peeper> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.PEEPER_BUCKET.get());
        }
    }

    public static class Boomerang extends MinenauticaFish {

        public Boomerang(EntityType<? extends Boomerang> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.BOOMERANG_BUCKET.get());
        }
    }

    public static class Bladderfish extends MinenauticaFish {

        public Bladderfish(EntityType<? extends Bladderfish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.BLADDERFISH_BUCKET.get());
        }
    }

    public static class Garryfish extends MinenauticaFish {

        public Garryfish(EntityType<? extends Garryfish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.GARRYFISH_BUCKET.get());
        }
    }

    public static class Eyeye extends MinenauticaFish {

        public Eyeye(EntityType<? extends Eyeye> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.EYEYE_BUCKET.get());
        }
    }

    public static class Holefish extends MinenauticaFish {

        public Holefish(EntityType<? extends Holefish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.HOLEFISH_BUCKET.get());
        }
    }

    public static class Hoopfish extends MinenauticaFish {

        public Hoopfish(EntityType<? extends Hoopfish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.HOOPFISH_BUCKET.get());
        }
    }

    public static class Hoverfish extends MinenauticaFish {

        public Hoverfish(EntityType<? extends Hoverfish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.HOVERFISH_BUCKET.get());
        }
    }

    public static class Reginald extends MinenauticaFish {

        public Reginald(EntityType<? extends Reginald> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.REGINALD_BUCKET.get());
        }
    }

    public static class Spadefish extends MinenauticaFish {

        public Spadefish(EntityType<? extends Spadefish> entityType, Level level) {
            super(entityType, level);
        }

        @Override
        protected SoundEvent getFlopSound() {
            return SoundEvents.TROPICAL_FISH_FLOP;
        }

        @Override
        public ItemStack getBucketItemStack() {
            return new ItemStack(ModItems.SPADEFISH_BUCKET.get());
        }
    }


}
