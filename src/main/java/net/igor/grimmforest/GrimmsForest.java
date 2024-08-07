package net.igor.grimmforest;

import net.fabricmc.api.ModInitializer;

import net.igor.grimmforest.block.GrimmsForestBlocks;
import net.igor.grimmforest.item.GrimmForestItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrimmsForest implements ModInitializer {

	public static final String MOD_ID = "grimmsforest";
    public static final Logger LOGGER = LoggerFactory.getLogger("grimms-forest");

	@Override
	public void onInitialize() {

		GrimmForestItems.registerModItems();
		GrimmsForestBlocks.registerModBlocks();


	}
}