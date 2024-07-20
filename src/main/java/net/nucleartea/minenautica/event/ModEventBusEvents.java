package net.nucleartea.minenautica.event;


import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.ModEntities;
import net.nucleartea.minenautica.entity.custom.CrabSquid;
import net.nucleartea.minenautica.entity.custom.Crashfish;
import net.nucleartea.minenautica.entity.custom.MinenauticaFish.*;

@Mod.EventBusSubscriber(modid = Minenautica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PEEPER.get(), Peeper.createAttributes().build());
        event.put(ModEntities.BOOMERANG.get(), Boomerang.createAttributes().build());
        event.put(ModEntities.BLADDERFISH.get(), Bladderfish.createAttributes().build());
        event.put(ModEntities.GARRYFISH.get(), Garryfish.createAttributes().build());
        event.put(ModEntities.EYEYE.get(), Eyeye.createAttributes().build());
        event.put(ModEntities.HOLEFISH.get(), Holefish.createAttributes().build());
        event.put(ModEntities.HOOPFISH.get(), Hoopfish.createAttributes().build());
        event.put(ModEntities.HOVERFISH.get(), Hoverfish.createAttributes().build());
        event.put(ModEntities.REGINALD.get(), Reginald.createAttributes().build());
        event.put(ModEntities.SPADEFISH.get(), Spadefish.createAttributes().build());

        event.put(ModEntities.CRABSQUID.get(), CrabSquid.createAttributes().build());
        event.put(ModEntities.CRASHFISH.get(), Crashfish.createAttributes().build());
    }
}
