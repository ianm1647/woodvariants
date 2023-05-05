package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.block.BlockList;
import com.ianm1647.woodvariants.data.gen.VariantsGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class VariantModelProvider extends FabricModelProvider {
    public VariantModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Barrels
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.OAK_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.BIRCH_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.JUNGLE_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.ACACIA_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.DARK_OAK_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.CRIMSON_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.WARPED_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.MANGROVE_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.BAMBOO_BARREL);
        VariantsGenerator.registerBarrel(blockStateModelGenerator, BlockList.CHERRY_BARREL);

        //Beehives
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.SPRUCE_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.BIRCH_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.JUNGLE_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.ACACIA_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.DARK_OAK_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.CRIMSON_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.WARPED_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.MANGROVE_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.BAMBOO_BEEHIVE);
        VariantsGenerator.registerBeehive(blockStateModelGenerator, BlockList.CHERRY_BEEHIVE);

        //Bookshelves
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        VariantsGenerator.registerBookshelf(blockStateModelGenerator, BlockList.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);

        //Chests

        //Composters
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.OAK_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.SPRUCE_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.BIRCH_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.JUNGLE_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.ACACIA_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.DARK_OAK_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.CRIMSON_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.WARPED_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.MANGROVE_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.BAMBOO_COMPOSTER);
        VariantsGenerator.registerComposter(blockStateModelGenerator, BlockList.CHERRY_COMPOSTER);

        //Crafting Tables
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS);
        VariantsGenerator.registerCraftingTable(blockStateModelGenerator, BlockList.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS);

        //Ladders
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.SPRUCE_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.BIRCH_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.JUNGLE_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.ACACIA_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.DARK_OAK_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.CRIMSON_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.WARPED_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.MANGROVE_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.BAMBOO_LADDER);
        VariantsGenerator.registerLadder(blockStateModelGenerator, BlockList.CHERRY_LADDER);

        //Lecterns
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.SPRUCE_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.BIRCH_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.JUNGLE_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.ACACIA_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.DARK_OAK_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.CRIMSON_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.WARPED_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.MANGROVE_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.BAMBOO_LECTERN);
        VariantsGenerator.registerLectern(blockStateModelGenerator, BlockList.CHERRY_LECTERN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
