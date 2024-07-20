package net.nucleartea.minenautica.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.entity.client.*;

@Mod.EventBusSubscriber(modid = Minenautica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {



    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PEEPER_LAYER, PeeperModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOOMERANG_LAYER, BoomerangModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BLADDERFISH_LAYER, BladderfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GARRYFISH_LAYER, GarryfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.EYEYE_LAYER, EyeyeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HOLEFISH_LAYER, HolefishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HOOPFISH_LAYER, HoopfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.HOVERFISH_LAYER, HoverfishModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.REGINALD_LAYER, ReginaldModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SPADEFISH_LAYER, SpadefishModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.CRABSQUID_LAYER, CrabSquidModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CRASHFISH_LAYER, CrashfishModel::createBodyLayer);
    }
}
