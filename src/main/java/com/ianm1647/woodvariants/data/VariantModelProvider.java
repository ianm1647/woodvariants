package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.util.BlockList;
import com.ianm1647.woodvariants.data.gen.VariantModelGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class VariantModelProvider extends FabricModelProvider {
    public VariantModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {
        //Barrels
        VariantModelGenerator.registerBarrel(gen, BlockList.OAK_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.BIRCH_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.JUNGLE_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.ACACIA_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.DARK_OAK_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.CRIMSON_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.WARPED_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.MANGROVE_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.BAMBOO_BARREL);
        VariantModelGenerator.registerBarrel(gen, BlockList.CHERRY_BARREL);

        //Beehives
        VariantModelGenerator.registerBeehive(gen, BlockList.SPRUCE_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.BIRCH_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.JUNGLE_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.ACACIA_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.DARK_OAK_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.CRIMSON_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.WARPED_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.MANGROVE_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.BAMBOO_BEEHIVE);
        VariantModelGenerator.registerBeehive(gen, BlockList.CHERRY_BEEHIVE);

        //Bookshelves
        VariantModelGenerator.registerBookshelf(gen, BlockList.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        VariantModelGenerator.registerBookshelf(gen, BlockList.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);

        //Chests
        VariantModelGenerator.registerChest(gen, Blocks.ACACIA_PLANKS, BlockList.ACACIA_CHEST);

        //Composters
        VariantModelGenerator.registerComposter(gen, BlockList.OAK_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.SPRUCE_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.BIRCH_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.JUNGLE_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.ACACIA_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.DARK_OAK_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.CRIMSON_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.WARPED_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.MANGROVE_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.BAMBOO_COMPOSTER);
        VariantModelGenerator.registerComposter(gen, BlockList.CHERRY_COMPOSTER);

        //Crafting Tables
        VariantModelGenerator.registerCraftingTable(gen, BlockList.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS);
        VariantModelGenerator.registerCraftingTable(gen, BlockList.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS);

        //Ladders
        VariantModelGenerator.registerLadder(gen, BlockList.SPRUCE_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.BIRCH_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.JUNGLE_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.ACACIA_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.DARK_OAK_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.CRIMSON_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.WARPED_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.MANGROVE_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.BAMBOO_LADDER);
        VariantModelGenerator.registerLadder(gen, BlockList.CHERRY_LADDER);

        //Lecterns
        VariantModelGenerator.registerLectern(gen, BlockList.SPRUCE_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.BIRCH_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.JUNGLE_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.ACACIA_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.DARK_OAK_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.CRIMSON_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.WARPED_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.MANGROVE_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.BAMBOO_LECTERN);
        VariantModelGenerator.registerLectern(gen, BlockList.CHERRY_LECTERN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
