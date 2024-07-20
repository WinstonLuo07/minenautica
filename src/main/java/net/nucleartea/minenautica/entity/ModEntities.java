package net.nucleartea.minenautica.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.custom.CrabSquid;
import net.nucleartea.minenautica.entity.custom.Crashfish;
import net.nucleartea.minenautica.entity.custom.MinenauticaFish.*;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Minenautica.MOD_ID);
    public static final RegistryObject<EntityType<Peeper>> PEEPER = ENTITY_TYPES.register("peeper", () -> EntityType.Builder.of(Peeper::new, MobCategory.WATER_AMBIENT).sized(0.5f,0.4f).clientTrackingRange(10).build("peeper"));

    public static final RegistryObject<EntityType<Boomerang>> BOOMERANG = ENTITY_TYPES.register("boomerang", () -> EntityType.Builder.of(Boomerang::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("boomerang"));

    public static final RegistryObject<EntityType<Bladderfish>> BLADDERFISH = ENTITY_TYPES.register("bladderfish", () -> EntityType.Builder.of(Bladderfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("bladderfish"));

    public static final RegistryObject<EntityType<Garryfish>> GARRYFISH = ENTITY_TYPES.register("garryfish", () -> EntityType.Builder.of(Garryfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("garryfish"));

    public static final RegistryObject<EntityType<Eyeye>> EYEYE = ENTITY_TYPES.register("eyeye", () -> EntityType.Builder.of(Eyeye::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("eyeye"));

    public static final RegistryObject<EntityType<Holefish>> HOLEFISH = ENTITY_TYPES.register("holefish", () -> EntityType.Builder.of(Holefish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("holefish"));

    public static final RegistryObject<EntityType<Hoopfish>> HOOPFISH = ENTITY_TYPES.register("hoopfish", () -> EntityType.Builder.of(Hoopfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("hoopfish"));

    public static final RegistryObject<EntityType<Hoverfish>> HOVERFISH = ENTITY_TYPES.register("hoverfish", () -> EntityType.Builder.of(Hoverfish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("hoverfish"));

    public static final RegistryObject<EntityType<Reginald>> REGINALD = ENTITY_TYPES.register("reginald", () -> EntityType.Builder.of(Reginald::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("reginald"));

    public static final RegistryObject<EntityType<Spadefish>> SPADEFISH = ENTITY_TYPES.register("spadefish", () -> EntityType.Builder.of(Spadefish::new, MobCategory.WATER_AMBIENT).sized(0.5f, 0.4f).clientTrackingRange(10).build("spadefish"));

    public static final RegistryObject<EntityType<CrabSquid>> CRABSQUID = ENTITY_TYPES.register("crabsquid", () -> EntityType.Builder.of(CrabSquid::new, MobCategory.MONSTER).sized(2.5f, 5f).clientTrackingRange(10).build("crabsquid"));

    public static final RegistryObject<EntityType<Crashfish>> CRASHFISH = ENTITY_TYPES.register("crashfish", () -> EntityType.Builder.of(Crashfish::new, MobCategory.WATER_CREATURE).sized(1f,1f).clientTrackingRange(10).build("crashfish"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
