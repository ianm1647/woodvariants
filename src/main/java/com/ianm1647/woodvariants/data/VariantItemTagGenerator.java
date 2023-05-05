package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.block.BlockList;
import com.ianm1647.woodvariants.item.ItemTagKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class VariantItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public VariantItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void configure(RegistryWrapper.WrapperLookup arg) {
        //wood variants tags

        getOrCreateTagBuilder(ItemTagKeys.BARRELS).add(Blocks.BARREL.asItem(),
                BlockList.OAK_BARREL.asItem(), BlockList.BIRCH_BARREL.asItem(), BlockList.JUNGLE_BARREL.asItem(),
                BlockList.ACACIA_BARREL.asItem(), BlockList.DARK_OAK_BARREL.asItem(), BlockList.CRIMSON_BARREL.asItem(),
                BlockList.WARPED_BARREL.asItem(), BlockList.MANGROVE_BARREL.asItem(), BlockList.BAMBOO_BARREL.asItem(),
                BlockList.CHERRY_BARREL.asItem());
        getOrCreateTagBuilder(ItemTagKeys.BEEHIVES).add(Blocks.BEEHIVE.asItem(),
                BlockList.SPRUCE_BEEHIVE.asItem(), BlockList.BIRCH_BEEHIVE.asItem(), BlockList.JUNGLE_BEEHIVE.asItem(),
                BlockList.ACACIA_BEEHIVE.asItem(), BlockList.DARK_OAK_BEEHIVE.asItem(), BlockList.CRIMSON_BEEHIVE.asItem(),
                BlockList.WARPED_BEEHIVE.asItem(), BlockList.MANGROVE_BEEHIVE.asItem(), BlockList.BAMBOO_BEEHIVE.asItem(),
                BlockList.CHERRY_BEEHIVE.asItem());
        getOrCreateTagBuilder(ItemTagKeys.BOOKSHELVES).add(Blocks.BOOKSHELF.asItem(),
                BlockList.SPRUCE_BOOKSHELF.asItem(), BlockList.BIRCH_BOOKSHELF.asItem(), BlockList.JUNGLE_BOOKSHELF.asItem(),
                BlockList.ACACIA_BOOKSHELF.asItem(), BlockList.DARK_OAK_BOOKSHELF.asItem(), BlockList.CRIMSON_BOOKSHELF.asItem(),
                BlockList.WARPED_BOOKSHELF.asItem(), BlockList.MANGROVE_BOOKSHELF.asItem(), BlockList.BAMBOO_BOOKSHELF.asItem(),
                BlockList.CHERRY_BOOKSHELF.asItem());
        getOrCreateTagBuilder(ItemTagKeys.COMPOSTERS).add(Blocks.COMPOSTER.asItem(),
                BlockList.OAK_COMPOSTER.asItem(), BlockList.SPRUCE_COMPOSTER.asItem(), BlockList.BIRCH_COMPOSTER.asItem(),
                BlockList.JUNGLE_COMPOSTER.asItem(), BlockList.ACACIA_COMPOSTER.asItem(), BlockList.DARK_OAK_COMPOSTER.asItem(),
                BlockList.CRIMSON_COMPOSTER.asItem(), BlockList.WARPED_COMPOSTER.asItem(), BlockList.MANGROVE_COMPOSTER.asItem(),
                BlockList.BAMBOO_COMPOSTER.asItem(), BlockList.CHERRY_COMPOSTER.asItem());
        getOrCreateTagBuilder(ItemTagKeys.CRAFTING_TABLES).add(Blocks.CRAFTING_TABLE.asItem(),
                BlockList.SPRUCE_CRAFTING_TABLE.asItem(), BlockList.BIRCH_CRAFTING_TABLE.asItem(), BlockList.JUNGLE_CRAFTING_TABLE.asItem(),
                BlockList.ACACIA_CRAFTING_TABLE.asItem(), BlockList.DARK_OAK_CRAFTING_TABLE.asItem(), BlockList.CRIMSON_CRAFTING_TABLE.asItem(),
                BlockList.WARPED_CRAFTING_TABLE.asItem(), BlockList.MANGROVE_CRAFTING_TABLE.asItem(), BlockList.BAMBOO_CRAFTING_TABLE.asItem(),
                BlockList.CHERRY_CRAFTING_TABLE.asItem());
        getOrCreateTagBuilder(ItemTagKeys.LADDERS).add(Blocks.LADDER.asItem(),
                BlockList.SPRUCE_LADDER.asItem(), BlockList.BIRCH_LADDER.asItem(), BlockList.JUNGLE_LADDER.asItem(),
                BlockList.ACACIA_LADDER.asItem(), BlockList.DARK_OAK_LADDER.asItem(), BlockList.CRIMSON_LADDER.asItem(),
                BlockList.WARPED_LADDER.asItem(), BlockList.MANGROVE_LADDER.asItem(), BlockList.BAMBOO_LADDER.asItem(),
                BlockList.CHERRY_LADDER.asItem());
        getOrCreateTagBuilder(ItemTagKeys.LECTERNS).add(Blocks.LECTERN.asItem(),
                BlockList.SPRUCE_LECTERN.asItem(), BlockList.BIRCH_LECTERN.asItem(), BlockList.JUNGLE_LECTERN.asItem(),
                BlockList.ACACIA_LECTERN.asItem(), BlockList.DARK_OAK_LECTERN.asItem(), BlockList.CRIMSON_LECTERN.asItem(),
                BlockList.WARPED_LECTERN.asItem(), BlockList.MANGROVE_LECTERN.asItem(), BlockList.BAMBOO_LECTERN.asItem(),
                BlockList.CHERRY_LECTERN.asItem());

        //minecraft tags

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD).add(
                BlockList.CRIMSON_BARREL.asItem(), BlockList.WARPED_BARREL.asItem(),
                BlockList.CRIMSON_BEEHIVE.asItem(), BlockList.WARPED_BEEHIVE.asItem(),
                BlockList.CRIMSON_BOOKSHELF.asItem(), BlockList.WARPED_BOOKSHELF.asItem(),
                BlockList.CRIMSON_COMPOSTER.asItem(), BlockList.WARPED_COMPOSTER.asItem(),
                BlockList.CRIMSON_CRAFTING_TABLE.asItem(), BlockList.WARPED_CRAFTING_TABLE.asItem(),
                BlockList.CRIMSON_LADDER.asItem(), BlockList.WARPED_LADDER.asItem(),
                BlockList.CRIMSON_LECTERN.asItem(), BlockList.WARPED_LECTERN.asItem());

    }
}
