package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.util.BlockList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class VariantLootTableGenerator extends FabricBlockLootTableProvider {
    public VariantLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(BlockList.OAK_BARREL);
        addDrop(BlockList.BIRCH_BARREL);
        addDrop(BlockList.JUNGLE_BARREL);
        addDrop(BlockList.ACACIA_BARREL);
        addDrop(BlockList.DARK_OAK_BARREL);
        addDrop(BlockList.CRIMSON_BARREL);
        addDrop(BlockList.WARPED_BARREL);
        addDrop(BlockList.MANGROVE_BARREL);
        addDrop(BlockList.BAMBOO_BARREL);
        addDrop(BlockList.CHERRY_BARREL);

        addDrop(BlockList.SPRUCE_BEEHIVE);
        addDrop(BlockList.BIRCH_BEEHIVE);
        addDrop(BlockList.JUNGLE_BEEHIVE);
        addDrop(BlockList.ACACIA_BEEHIVE);
        addDrop(BlockList.DARK_OAK_BEEHIVE);
        addDrop(BlockList.CRIMSON_BEEHIVE);
        addDrop(BlockList.WARPED_BEEHIVE);
        addDrop(BlockList.MANGROVE_BEEHIVE);
        addDrop(BlockList.BAMBOO_BEEHIVE);
        addDrop(BlockList.CHERRY_BEEHIVE);

        addDrop(BlockList.SPRUCE_BOOKSHELF);
        addDrop(BlockList.BIRCH_BOOKSHELF);
        addDrop(BlockList.JUNGLE_BOOKSHELF);
        addDrop(BlockList.ACACIA_BOOKSHELF);
        addDrop(BlockList.DARK_OAK_BOOKSHELF);
        addDrop(BlockList.CRIMSON_BOOKSHELF);
        addDrop(BlockList.WARPED_BOOKSHELF);
        addDrop(BlockList.MANGROVE_BOOKSHELF);
        addDrop(BlockList.BAMBOO_BOOKSHELF);
        addDrop(BlockList.CHERRY_BOOKSHELF);

        addDrop(BlockList.OAK_COMPOSTER);
        addDrop(BlockList.SPRUCE_COMPOSTER);
        addDrop(BlockList.BIRCH_COMPOSTER);
        addDrop(BlockList.JUNGLE_COMPOSTER);
        addDrop(BlockList.ACACIA_COMPOSTER);
        addDrop(BlockList.DARK_OAK_COMPOSTER);
        addDrop(BlockList.CRIMSON_COMPOSTER);
        addDrop(BlockList.WARPED_COMPOSTER);
        addDrop(BlockList.MANGROVE_COMPOSTER);
        addDrop(BlockList.BAMBOO_COMPOSTER);
        addDrop(BlockList.CHERRY_COMPOSTER);

        addDrop(BlockList.SPRUCE_CRAFTING_TABLE);
        addDrop(BlockList.BIRCH_CRAFTING_TABLE);
        addDrop(BlockList.JUNGLE_CRAFTING_TABLE);
        addDrop(BlockList.ACACIA_CRAFTING_TABLE);
        addDrop(BlockList.DARK_OAK_CRAFTING_TABLE);
        addDrop(BlockList.CRIMSON_CRAFTING_TABLE);
        addDrop(BlockList.WARPED_CRAFTING_TABLE);
        addDrop(BlockList.MANGROVE_CRAFTING_TABLE);
        addDrop(BlockList.BAMBOO_CRAFTING_TABLE);
        addDrop(BlockList.CHERRY_CRAFTING_TABLE);

        addDrop(BlockList.SPRUCE_LADDER);
        addDrop(BlockList.BIRCH_LADDER);
        addDrop(BlockList.JUNGLE_LADDER);
        addDrop(BlockList.ACACIA_LADDER);
        addDrop(BlockList.DARK_OAK_LADDER);
        addDrop(BlockList.CRIMSON_LADDER);
        addDrop(BlockList.WARPED_LADDER);
        addDrop(BlockList.MANGROVE_LADDER);
        addDrop(BlockList.BAMBOO_LADDER);
        addDrop(BlockList.CHERRY_LADDER);

        addDrop(BlockList.SPRUCE_LECTERN);
        addDrop(BlockList.BIRCH_LECTERN);
        addDrop(BlockList.JUNGLE_LECTERN);
        addDrop(BlockList.ACACIA_LECTERN);
        addDrop(BlockList.DARK_OAK_LECTERN);
        addDrop(BlockList.CRIMSON_LECTERN);
        addDrop(BlockList.WARPED_LECTERN);
        addDrop(BlockList.MANGROVE_LECTERN);
        addDrop(BlockList.BAMBOO_LECTERN);
        addDrop(BlockList.CHERRY_LECTERN);

    }
}
