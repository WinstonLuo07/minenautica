package net.nucleartea.minenautica.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.common.extensions.IForgeBucketPickup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minenautica.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));








    public static final RegistryObject<Item> PEEPER_BUCKET = ITEMS.register("peeper_bucket",
            () -> new MobBucketItem(() -> ModEntities.PEEPER.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BOOMERANG_BUCKET = ITEMS.register("boomerang_bucket",
            () -> new MobBucketItem(() -> ModEntities.BOOMERANG.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BLADDERFISH_BUCKET = ITEMS.register("bladderfish_bucket",
            () -> new MobBucketItem(() -> ModEntities.BLADDERFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GARRYFISH_BUCKET = ITEMS.register("garryfish_bucket",
            () -> new MobBucketItem(() -> ModEntities.GARRYFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> EYEYE_BUCKET = ITEMS.register("eyeye_bucket",
            () -> new MobBucketItem(() -> ModEntities.EYEYE.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOLEFISH_BUCKET = ITEMS.register("holefish_bucket",
            () -> new MobBucketItem(() -> ModEntities.HOLEFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOOPFISH_BUCKET = ITEMS.register("hoopfish_bucket",
            () -> new MobBucketItem(() -> ModEntities.HOOPFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOVERFISH_BUCKET = ITEMS.register("hoverfish_bucket",
            () -> new MobBucketItem(() -> ModEntities.HOVERFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> REGINALD_BUCKET = ITEMS.register("reginald_bucket",
            () -> new MobBucketItem(() -> ModEntities.REGINALD.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SPADEFISH_BUCKET = ITEMS.register("spadefish_bucket",
            () -> new MobBucketItem(() -> ModEntities.SPADEFISH.get(), () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));






    public static final RegistryObject<Item> PEEPER_SPAWN_EGG = ITEMS.register("peeper_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PEEPER, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> BOOMERANG_SPAWN_EGG = ITEMS.register("boomerang_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BOOMERANG, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> BLADDERFISH_SPAWN_EGG = ITEMS.register("bladderfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BLADDERFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> GARRYFISH_SPAWN_EGG = ITEMS.register("garryfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GARRYFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> EYEYE_SPAWN_EGG = ITEMS.register("eyeye_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.EYEYE, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> HOLEFISH_SPAWN_EGG = ITEMS.register("holefish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HOLEFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> HOOPFISH_SPAWN_EGG = ITEMS.register("hoopfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HOOPFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> HOVERFISH_SPAWN_EGG = ITEMS.register("hoverfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.HOVERFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> REGINALD_SPAWN_EGG = ITEMS.register("reginald_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.REGINALD, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> SPADEFISH_SPAWN_EGG = ITEMS.register("spadefish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SPADEFISH, 0x2a2e4d, 0xeaca3f, new Item.Properties()));

    public static final RegistryObject<Item> CRABSQUID_SPAWN_EGG = ITEMS.register("crabsquid_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CRABSQUID, 0x65422a, 0xb6e8cd,
                    new Item.Properties()));

    public static final RegistryObject<Item> CRASHFISH_SPAWN_EGG = ITEMS.register("crashfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CRASHFISH, 0x65422a, 0xb6e8cd,
                    new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
