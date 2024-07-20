package net.nucleartea.minenautica.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Minenautica.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MINENAUTICA_TAB = CREATIVE_MODE_TABS.register("minenautica_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.minenautica_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // add items to here to register them in the minenautica tab
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_TITANIUM.get());
                        pOutput.accept(ModItems.PEEPER_BUCKET.get());
                        pOutput.accept(ModItems.PEEPER_SPAWN_EGG.get());

                        pOutput.accept(ModItems.BOOMERANG_BUCKET.get());
                        pOutput.accept(ModItems.BOOMERANG_SPAWN_EGG.get());

                        pOutput.accept(ModItems.BLADDERFISH_BUCKET.get());
                        pOutput.accept(ModItems.BLADDERFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.GARRYFISH_BUCKET.get());
                        pOutput.accept(ModItems.GARRYFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.EYEYE_BUCKET.get());
                        pOutput.accept(ModItems.EYEYE_SPAWN_EGG.get());

                        pOutput.accept(ModItems.HOLEFISH_BUCKET.get());
                        pOutput.accept(ModItems.HOLEFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.HOOPFISH_BUCKET.get());
                        pOutput.accept(ModItems.HOOPFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.HOVERFISH_BUCKET.get());
                        pOutput.accept(ModItems.HOVERFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.REGINALD_BUCKET.get());
                        pOutput.accept(ModItems.REGINALD_SPAWN_EGG.get());

                        pOutput.accept(ModItems.SPADEFISH_BUCKET.get());
                        pOutput.accept(ModItems.SPADEFISH_SPAWN_EGG.get());

                        pOutput.accept(ModItems.CRABSQUID_SPAWN_EGG.get());
                        pOutput.accept(ModItems.CRASHFISH_SPAWN_EGG.get());

                        pOutput.accept(ModBlocks.CREEPVINE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
