package net.igor.grimmforest.datagen;

import net.igor.grimmforest.block.GrimmsForestBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;

public class ModModelProvider {

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(GrimmsForestBlocks.GRIMM_DIRT);
    }
}
