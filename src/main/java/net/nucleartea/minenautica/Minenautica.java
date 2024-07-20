package net.nucleartea.minenautica;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.RenderShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nucleartea.minenautica.block.ModBlocks;
import net.nucleartea.minenautica.entity.ModEntities;
import net.nucleartea.minenautica.entity.client.CrabSquidRenderer;
import net.nucleartea.minenautica.entity.client.CrashfishRenderer;
import net.nucleartea.minenautica.entity.client.MinenauticaFishRenderers;
import net.nucleartea.minenautica.item.ModCreativeModeTabs;
import net.nucleartea.minenautica.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Minenautica.MOD_ID)
public class Minenautica
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "minenautica";
    // Directly reference a slf4j logger

    public Minenautica()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register((modEventBus));



        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);



        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
//
//        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the nucleartea block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CREEPVINE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CREEPVINE_PLANT.get(), RenderType.cutout());

            EntityRenderers.register(ModEntities.PEEPER.get(), MinenauticaFishRenderers.PeeperRenderer::new);
            EntityRenderers.register(ModEntities.BOOMERANG.get(), MinenauticaFishRenderers.BoomerangRenderer::new);
            EntityRenderers.register(ModEntities.BLADDERFISH.get(), MinenauticaFishRenderers.BladderfishRenderer::new);
            EntityRenderers.register(ModEntities.GARRYFISH.get(), MinenauticaFishRenderers.GarryfishRenderer::new);
            EntityRenderers.register(ModEntities.EYEYE.get(), MinenauticaFishRenderers.EyeyeRenderer::new);
            EntityRenderers.register(ModEntities.HOLEFISH.get(), MinenauticaFishRenderers.HolefishRenderer::new);
            EntityRenderers.register(ModEntities.HOOPFISH.get(), MinenauticaFishRenderers.HoopfishRenderer::new);
            EntityRenderers.register(ModEntities.HOVERFISH.get(), MinenauticaFishRenderers.HoverfishRenderer::new);
            EntityRenderers.register(ModEntities.REGINALD.get(), MinenauticaFishRenderers.ReginaldRenderer::new);
            EntityRenderers.register(ModEntities.SPADEFISH.get(), MinenauticaFishRenderers.SpadefishRenderer::new);
            EntityRenderers.register(ModEntities.CRABSQUID.get(), CrabSquidRenderer::new);
            EntityRenderers.register(ModEntities.CRASHFISH.get(), CrashfishRenderer::new);


        }
    }
}
