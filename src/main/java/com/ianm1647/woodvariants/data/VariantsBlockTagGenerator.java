package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.block.BlockList;
import com.ianm1647.woodvariants.block.BlockTagKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class VariantsBlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    public VariantsBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        //wood variants tags

        getOrCreateTagBuilder(BlockTagKeys.BARRELS).add(Blocks.BARREL, BlockList.OAK_BARREL, BlockList.BIRCH_BARREL, BlockList.JUNGLE_BARREL,
                BlockList.ACACIA_BARREL, BlockList.DARK_OAK_BARREL, BlockList.CRIMSON_BARREL, BlockList.WARPED_BARREL,
                BlockList.MANGROVE_BARREL, BlockList.BAMBOO_BARREL, BlockList.CHERRY_BARREL);
        getOrCreateTagBuilder(BlockTagKeys.BEEHIVES).add(Blocks.BEEHIVE, BlockList.SPRUCE_BEEHIVE, BlockList.BIRCH_BEEHIVE, BlockList.JUNGLE_BEEHIVE,
                BlockList.ACACIA_BEEHIVE, BlockList.DARK_OAK_BEEHIVE, BlockList.CRIMSON_BEEHIVE, BlockList.WARPED_BEEHIVE,
                BlockList.MANGROVE_BEEHIVE, BlockList.BAMBOO_BEEHIVE, BlockList.CHERRY_BEEHIVE);
        getOrCreateTagBuilder(BlockTagKeys.BOOKSHELVES).add(Blocks.BOOKSHELF, BlockList.SPRUCE_BOOKSHELF, BlockList.BIRCH_BOOKSHELF, BlockList.JUNGLE_BOOKSHELF,
                BlockList.ACACIA_BOOKSHELF, BlockList.DARK_OAK_BOOKSHELF, BlockList.CRIMSON_BOOKSHELF, BlockList.WARPED_BOOKSHELF,
                BlockList.MANGROVE_BOOKSHELF, BlockList.BAMBOO_BOOKSHELF, BlockList.CHERRY_BOOKSHELF);
        getOrCreateTagBuilder(BlockTagKeys.COMPOSTERS).add(Blocks.COMPOSTER, BlockList.OAK_COMPOSTER, BlockList.SPRUCE_COMPOSTER, BlockList.BIRCH_COMPOSTER,
                BlockList.JUNGLE_COMPOSTER, BlockList.ACACIA_COMPOSTER, BlockList.DARK_OAK_COMPOSTER, BlockList.CRIMSON_COMPOSTER,
                BlockList.WARPED_COMPOSTER, BlockList.MANGROVE_COMPOSTER, BlockList.BAMBOO_COMPOSTER, BlockList.CHERRY_COMPOSTER);
        getOrCreateTagBuilder(BlockTagKeys.CRAFTING_TABLES).add(Blocks.CRAFTING_TABLE, BlockList.SPRUCE_CRAFTING_TABLE, BlockList.BIRCH_CRAFTING_TABLE,
                BlockList.JUNGLE_CRAFTING_TABLE, BlockList.ACACIA_CRAFTING_TABLE, BlockList.DARK_OAK_CRAFTING_TABLE, BlockList.CRIMSON_CRAFTING_TABLE,
                BlockList.WARPED_CRAFTING_TABLE, BlockList.MANGROVE_CRAFTING_TABLE, BlockList.BAMBOO_CRAFTING_TABLE, BlockList.CHERRY_CRAFTING_TABLE);
        getOrCreateTagBuilder(BlockTagKeys.LADDERS).add(Blocks.LADDER, BlockList.SPRUCE_LADDER, BlockList.BIRCH_LADDER,
                BlockList.JUNGLE_LADDER, BlockList.ACACIA_LADDER, BlockList.DARK_OAK_LADDER, BlockList.CRIMSON_LADDER,
                BlockList.WARPED_LADDER, BlockList.MANGROVE_LADDER, BlockList.BAMBOO_LADDER, BlockList.CHERRY_LADDER);
        getOrCreateTagBuilder(BlockTagKeys.LECTERNS).add(Blocks.LECTERN, BlockList.SPRUCE_LECTERN, BlockList.BIRCH_LECTERN,
                BlockList.JUNGLE_LECTERN, BlockList.ACACIA_LECTERN, BlockList.DARK_OAK_LECTERN, BlockList.CRIMSON_LECTERN,
                BlockList.WARPED_LECTERN, BlockList.MANGROVE_LECTERN, BlockList.BAMBOO_LECTERN, BlockList.CHERRY_LECTERN);

        //minecraft tags

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).addTag(BlockTagKeys.BARRELS).addTag(BlockTagKeys.BEEHIVES).addTag(BlockTagKeys.BOOKSHELVES)
                .addTag(BlockTagKeys.COMPOSTERS).addTag(BlockTagKeys.CRAFTING_TABLES).addTag(BlockTagKeys.LADDERS).addTag(BlockTagKeys.LECTERNS);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE).addTag(BlockTagKeys.LADDERS);
    }
}
