package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.BlockTagKeys;
import com.ianm1647.woodvariants.item.ItemTagKeys;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TagKeyRegistry {

    public static void registerTagKeys() {
        BlockTagKeys.BARRELS = blockTagKey("barrels");
        BlockTagKeys.BEEHIVES = blockTagKey("beehives");
        BlockTagKeys.BOOKSHELVES = blockTagKey("bookshelves");
        BlockTagKeys.COMPOSTERS = blockTagKey("composters");
        BlockTagKeys.CRAFTING_TABLES = blockTagKey("crafting_tables");
        BlockTagKeys.LADDERS = blockTagKey("ladders");
        BlockTagKeys.LECTERNS = blockTagKey("lecterns");

        ItemTagKeys.BARRELS = itemTagKey("barrels");
        ItemTagKeys.BEEHIVES = itemTagKey("beehives");
        ItemTagKeys.BOOKSHELVES = itemTagKey("bookshelves");
        ItemTagKeys.COMPOSTERS = itemTagKey("composters");
        ItemTagKeys.CRAFTING_TABLES = itemTagKey("crafting_tables");
        ItemTagKeys.LADDERS = itemTagKey("ladders");
        ItemTagKeys.LECTERNS = itemTagKey("lecterns");

    }

    private static TagKey<Block> blockTagKey(String path) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(WoodVariants.MODID, path));
    }

    private static TagKey<Item> itemTagKey(String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(WoodVariants.MODID, path));
    }
}
