package com.ianm1647.woodvariants.data;

import com.ianm1647.woodvariants.block.BlockList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class VariantsRecipeGenerator extends FabricRecipeProvider {
    public VariantsRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        craftBarrel(exporter, BlockList.OAK_BARREL, Items.OAK_PLANKS, Items.OAK_SLAB);
        craftBarrel(exporter, BlockList.BIRCH_BARREL, Items.BIRCH_PLANKS, Items.BIRCH_SLAB);
        craftBarrel(exporter, BlockList.JUNGLE_BARREL, Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB);
        craftBarrel(exporter, BlockList.ACACIA_BARREL, Items.ACACIA_PLANKS, Items.ACACIA_SLAB);
        craftBarrel(exporter, BlockList.DARK_OAK_BARREL, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB);
        craftBarrel(exporter, BlockList.CRIMSON_BARREL, Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB);
        craftBarrel(exporter, BlockList.WARPED_BARREL, Items.WARPED_PLANKS, Items.WARPED_SLAB);
        craftBarrel(exporter, BlockList.MANGROVE_BARREL, Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB);
        craftBarrel(exporter, BlockList.BAMBOO_BARREL, Items.BAMBOO_PLANKS, Items.BAMBOO_SLAB);
        craftBarrel(exporter, BlockList.CHERRY_BARREL, Items.CHERRY_PLANKS, Items.CHERRY_SLAB);

        craftBeehive(exporter, BlockList.SPRUCE_BEEHIVE, Items.SPRUCE_PLANKS);
        craftBeehive(exporter, BlockList.BIRCH_BEEHIVE, Items.BIRCH_PLANKS);
        craftBeehive(exporter, BlockList.JUNGLE_BEEHIVE, Items.JUNGLE_PLANKS);
        craftBeehive(exporter, BlockList.ACACIA_BEEHIVE, Items.ACACIA_PLANKS);
        craftBeehive(exporter, BlockList.DARK_OAK_BEEHIVE, Items.DARK_OAK_PLANKS);
        craftBeehive(exporter, BlockList.CRIMSON_BEEHIVE, Items.CRIMSON_PLANKS);
        craftBeehive(exporter, BlockList.WARPED_BEEHIVE, Items.WARPED_PLANKS);
        craftBeehive(exporter, BlockList.MANGROVE_BEEHIVE, Items.MANGROVE_PLANKS);
        craftBeehive(exporter, BlockList.BAMBOO_BEEHIVE, Items.BAMBOO_PLANKS);
        craftBeehive(exporter, BlockList.CHERRY_BEEHIVE, Items.CHERRY_PLANKS);

        craftBookshelf(exporter, BlockList.SPRUCE_BOOKSHELF, Items.SPRUCE_PLANKS);
        craftBookshelf(exporter, BlockList.BIRCH_BOOKSHELF, Items.BIRCH_PLANKS);
        craftBookshelf(exporter, BlockList.JUNGLE_BOOKSHELF, Items.JUNGLE_PLANKS);
        craftBookshelf(exporter, BlockList.ACACIA_BOOKSHELF, Items.ACACIA_PLANKS);
        craftBookshelf(exporter, BlockList.DARK_OAK_BOOKSHELF, Items.DARK_OAK_PLANKS);
        craftBookshelf(exporter, BlockList.CRIMSON_BOOKSHELF, Items.CRIMSON_PLANKS);
        craftBookshelf(exporter, BlockList.WARPED_BOOKSHELF, Items.WARPED_PLANKS);
        craftBookshelf(exporter, BlockList.MANGROVE_BOOKSHELF, Items.MANGROVE_PLANKS);
        craftBookshelf(exporter, BlockList.BAMBOO_BOOKSHELF, Items.BAMBOO_PLANKS);
        craftBookshelf(exporter, BlockList.CHERRY_BOOKSHELF, Items.CHERRY_PLANKS);

        craftComposter(exporter, BlockList.OAK_COMPOSTER, Items.OAK_SLAB);
        craftComposter(exporter, BlockList.SPRUCE_COMPOSTER, Items.SPRUCE_SLAB);
        craftComposter(exporter, BlockList.BIRCH_COMPOSTER, Items.BIRCH_SLAB);
        craftComposter(exporter, BlockList.JUNGLE_COMPOSTER, Items.JUNGLE_SLAB);
        craftComposter(exporter, BlockList.ACACIA_COMPOSTER, Items.ACACIA_SLAB);
        craftComposter(exporter, BlockList.DARK_OAK_COMPOSTER, Items.DARK_OAK_SLAB);
        craftComposter(exporter, BlockList.CRIMSON_COMPOSTER, Items.CRIMSON_SLAB);
        craftComposter(exporter, BlockList.WARPED_COMPOSTER, Items.WARPED_SLAB);
        craftComposter(exporter, BlockList.MANGROVE_COMPOSTER, Items.MANGROVE_SLAB);
        craftComposter(exporter, BlockList.BAMBOO_COMPOSTER, Items.BAMBOO_SLAB);
        craftComposter(exporter, BlockList.CHERRY_COMPOSTER, Items.CHERRY_SLAB);

        craftCraftingTable(exporter, BlockList.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        craftCraftingTable(exporter, BlockList.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        craftCraftingTable(exporter, BlockList.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        craftCraftingTable(exporter, BlockList.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        craftCraftingTable(exporter, BlockList.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        craftCraftingTable(exporter, BlockList.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        craftCraftingTable(exporter, BlockList.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);
        craftCraftingTable(exporter, BlockList.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        craftCraftingTable(exporter, BlockList.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        craftCraftingTable(exporter, BlockList.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);

        craftLadder(exporter, BlockList.SPRUCE_LADDER, Items.SPRUCE_PLANKS);
        craftLadder(exporter, BlockList.BIRCH_LADDER, Items.BIRCH_PLANKS);
        craftLadder(exporter, BlockList.JUNGLE_LADDER, Items.JUNGLE_PLANKS);
        craftLadder(exporter, BlockList.ACACIA_LADDER, Items.ACACIA_PLANKS);
        craftLadder(exporter, BlockList.DARK_OAK_LADDER, Items.DARK_OAK_PLANKS);
        craftLadder(exporter, BlockList.CRIMSON_LADDER, Items.CRIMSON_PLANKS);
        craftLadder(exporter, BlockList.WARPED_LADDER, Items.WARPED_PLANKS);
        craftLadder(exporter, BlockList.MANGROVE_LADDER, Items.MANGROVE_PLANKS);
        craftLadder(exporter, BlockList.BAMBOO_LADDER, Items.BAMBOO_PLANKS);
        craftLadder(exporter, BlockList.CHERRY_LADDER, Items.CHERRY_PLANKS);

        craftLectern(exporter, BlockList.SPRUCE_LECTERN, Items.SPRUCE_SLAB, BlockList.SPRUCE_BOOKSHELF);
        craftLectern(exporter, BlockList.BIRCH_LECTERN, Items.BIRCH_SLAB, BlockList.BIRCH_BOOKSHELF);
        craftLectern(exporter, BlockList.JUNGLE_LECTERN, Items.JUNGLE_SLAB, BlockList.JUNGLE_BOOKSHELF);
        craftLectern(exporter, BlockList.ACACIA_LECTERN, Items.ACACIA_SLAB, BlockList.ACACIA_BOOKSHELF);
        craftLectern(exporter, BlockList.DARK_OAK_LECTERN, Items.DARK_OAK_SLAB, BlockList.DARK_OAK_BOOKSHELF);
        craftLectern(exporter, BlockList.CRIMSON_LECTERN, Items.CRIMSON_SLAB, BlockList.CRIMSON_BOOKSHELF);
        craftLectern(exporter, BlockList.WARPED_LECTERN, Items.WARPED_SLAB, BlockList.WARPED_BOOKSHELF);
        craftLectern(exporter, BlockList.MANGROVE_LECTERN, Items.MANGROVE_SLAB, BlockList.MANGROVE_BOOKSHELF);
        craftLectern(exporter, BlockList.BAMBOO_LECTERN, Items.BAMBOO_SLAB, BlockList.BAMBOO_BOOKSHELF);
        craftLectern(exporter, BlockList.CHERRY_LECTERN, Items.CHERRY_SLAB, BlockList.CHERRY_BOOKSHELF);

    }

    private void craftBarrel(Consumer<RecipeJsonProvider> exporter, Block output, Item planks, Item slabs) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output.asItem())
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .input('P', planks)
                .input('S', slabs)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private void craftBeehive(Consumer<RecipeJsonProvider> exporter, Block output, Item planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output.asItem())
                .pattern("PPP")
                .pattern("SSS")
                .pattern("PPP")
                .input('P', planks)
                .input('S', Items.HONEYCOMB)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private void craftBookshelf(Consumer<RecipeJsonProvider> exporter, Block output, Item planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output.asItem())
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .input('P', planks)
                .input('B', Items.BOOK)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private void craftComposter(Consumer<RecipeJsonProvider> exporter, Block output, Item slabs) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output.asItem())
                .pattern("P P")
                .pattern("P P")
                .pattern("PPP")
                .input('P', slabs)
                .criterion(FabricRecipeProvider.hasItem(slabs),
                        FabricRecipeProvider.conditionsFromItem(slabs))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private void craftCraftingTable(Consumer<RecipeJsonProvider> exporter, Block output, Item planks) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.DECORATIONS, output.asItem(), planks);
    }

    private void craftLadder(Consumer<RecipeJsonProvider> exporter, Block output, Item planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output.asItem())
                .pattern("P P")
                .pattern("PLP")
                .pattern("P P")
                .input('P', Items.STICK)
                .input('L', planks)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    private void craftLectern(Consumer<RecipeJsonProvider> exporter, Block output, Item slabs, Block bookshelf) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output.asItem())
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .input('S', slabs)
                .input('B', bookshelf.asItem())
                .criterion(FabricRecipeProvider.hasItem(slabs),
                        FabricRecipeProvider.conditionsFromItem(slabs))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}
