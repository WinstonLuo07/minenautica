package net.nucleartea.minenautica.block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nucleartea.minenautica.Minenautica;
import net.nucleartea.minenautica.block.custom.CreepvineBlock;
import net.nucleartea.minenautica.block.custom.CreepvinePlantBlock;
import net.nucleartea.minenautica.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Minenautica.MOD_ID);

    public static final RegistryObject<Block> CREEPVINE = registerBlock("creepvine", () -> new CreepvineBlock(BlockBehaviour.Properties.copy(Blocks.KELP)));
    public static final RegistryObject<Block> CREEPVINE_PLANT = registerBlock("creepvine_plant", () -> new CreepvinePlantBlock(BlockBehaviour.Properties.copy(Blocks.KELP_PLANT)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
