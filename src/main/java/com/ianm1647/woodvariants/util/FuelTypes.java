package com.ianm1647.woodvariants.util;

import com.ianm1647.woodvariants.item.ItemTagKeys;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class FuelTypes {

    public static void fuels() {
        FuelRegistry.INSTANCE.add(ItemTagKeys.BARRELS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BEEHIVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BOOKSHELVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.COMPOSTERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.CRAFTING_TABLES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LADDERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LECTERNS, 300);
    }
}
