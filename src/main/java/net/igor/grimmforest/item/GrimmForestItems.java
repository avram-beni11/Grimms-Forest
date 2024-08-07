package net.igor.grimmforest.item;

import net.igor.grimmforest.GrimmsForest;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GrimmForestItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GrimmsForest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GrimmsForest.LOGGER.info("Registering items for " + GrimmsForest.MOD_ID);
    }
}
