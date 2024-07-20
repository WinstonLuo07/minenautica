package net.nucleartea.minenautica.block.custom;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.nucleartea.minenautica.block.ModBlocks;

public class CreepvineBlock extends KelpBlock {


    public CreepvineBlock(Properties p_54300_) {
        super(p_54300_);
    }

    @Override
    protected BlockState updateBodyAfterConvertedFromHead(BlockState pHead, BlockState pBody) {
        // Get the current age of the head block
        int age = pHead.getValue(GrowingPlantHeadBlock.AGE);

        // Calculate whether the plant is mature (age greater than half of max age)
        boolean isMature = age > GrowingPlantHeadBlock.MAX_AGE / 2;

        // Update the 'mature' property of the body block
        pBody = pBody.setValue(CreepvinePlantBlock.MATURE, isMature);

        // Call the superclass method to handle any additional logic
        return super.updateBodyAfterConvertedFromHead(pHead, pBody);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.CREEPVINE_PLANT.get();
    }
}

