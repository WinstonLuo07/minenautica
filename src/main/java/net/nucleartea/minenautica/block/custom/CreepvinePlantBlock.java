package net.nucleartea.minenautica.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.KelpPlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.nucleartea.minenautica.block.ModBlocks;

public class CreepvinePlantBlock extends KelpPlantBlock {
    public static final BooleanProperty MATURE = BooleanProperty.create("mature");

    public CreepvinePlantBlock(Properties p_54323_) {
        super(p_54323_);
        this.registerDefaultState(this.stateDefinition.any().setValue(MATURE, Boolean.valueOf(false)));
    }
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(MATURE);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.CREEPVINE.get();
    }
}
