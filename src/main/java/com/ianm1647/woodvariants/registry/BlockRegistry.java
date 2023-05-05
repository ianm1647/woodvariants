package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.*;
import com.ianm1647.woodvariants.util.VariantsPOITypes;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static void registerBlocks() {
        BlockList.OAK_BARREL = barrel("oak_barrel", new VariantBarrelBlock());
        BlockList.BIRCH_BARREL = barrel("birch_barrel", new VariantBarrelBlock());
        BlockList.JUNGLE_BARREL = barrel("jungle_barrel", new VariantBarrelBlock());
        BlockList.ACACIA_BARREL = barrel("acacia_barrel", new VariantBarrelBlock());
        BlockList.DARK_OAK_BARREL = barrel("dark_oak_barrel", new VariantBarrelBlock());
        BlockList.CRIMSON_BARREL = barrel("crimson_barrel", new VariantBarrelBlock());
        BlockList.WARPED_BARREL = barrel("warped_barrel", new VariantBarrelBlock());
        BlockList.MANGROVE_BARREL = barrel("mangrove_barrel", new VariantBarrelBlock());
        BlockList.BAMBOO_BARREL = barrel("bamboo_barrel", new VariantBarrelBlock());
        BlockList.CHERRY_BARREL = barrel("cherry_barrel", new VariantBarrelBlock());

        BlockList.SPRUCE_BEEHIVE = beehive("spruce_beehive", new VariantBeehiveBlock());
        BlockList.BIRCH_BEEHIVE = beehive("birch_beehive", new VariantBeehiveBlock());
        BlockList.JUNGLE_BEEHIVE = beehive("jungle_beehive", new VariantBeehiveBlock());
        BlockList.ACACIA_BEEHIVE = beehive("acacia_beehive", new VariantBeehiveBlock());
        BlockList.DARK_OAK_BEEHIVE = beehive("dark_oak_beehive", new VariantBeehiveBlock());
        BlockList.CRIMSON_BEEHIVE = beehive("crimson_beehive", new VariantBeehiveBlock());
        BlockList.WARPED_BEEHIVE = beehive("warped_beehive", new VariantBeehiveBlock());
        BlockList.MANGROVE_BEEHIVE = beehive("mangrove_beehive", new VariantBeehiveBlock());
        BlockList.BAMBOO_BEEHIVE = beehive("bamboo_beehive", new VariantBeehiveBlock());
        BlockList.CHERRY_BEEHIVE = beehive("cherry_beehive", new VariantBeehiveBlock());

        BlockList.SPRUCE_BOOKSHELF = bookshelf("spruce_bookshelf", new VariantBookshelfBlock());
        BlockList.BIRCH_BOOKSHELF = bookshelf("birch_bookshelf", new VariantBookshelfBlock());
        BlockList.JUNGLE_BOOKSHELF = bookshelf("jungle_bookshelf", new VariantBookshelfBlock());
        BlockList.ACACIA_BOOKSHELF = bookshelf("acacia_bookshelf", new VariantBookshelfBlock());
        BlockList.DARK_OAK_BOOKSHELF = bookshelf("dark_oak_bookshelf", new VariantBookshelfBlock());
        BlockList.CRIMSON_BOOKSHELF = bookshelf("crimson_bookshelf", new VariantBookshelfBlock());
        BlockList.WARPED_BOOKSHELF = bookshelf("warped_bookshelf", new VariantBookshelfBlock());
        BlockList.MANGROVE_BOOKSHELF = bookshelf("mangrove_bookshelf", new VariantBookshelfBlock());
        BlockList.BAMBOO_BOOKSHELF = bookshelf("bamboo_bookshelf", new VariantBookshelfBlock());
        BlockList.CHERRY_BOOKSHELF = bookshelf("cherry_bookshelf", new VariantBookshelfBlock());

        BlockList.OAK_COMPOSTER = composter("oak_composter", new VariantComposterBlock());
        BlockList.SPRUCE_COMPOSTER = composter("spruce_composter", new VariantComposterBlock());
        BlockList.BIRCH_COMPOSTER = composter("birch_composter", new VariantComposterBlock());
        BlockList.JUNGLE_COMPOSTER = composter("jungle_composter", new VariantComposterBlock());
        BlockList.ACACIA_COMPOSTER = composter("acacia_composter", new VariantComposterBlock());
        BlockList.DARK_OAK_COMPOSTER = composter("dark_oak_composter", new VariantComposterBlock());
        BlockList.CRIMSON_COMPOSTER = composter("crimson_composter", new VariantComposterBlock());
        BlockList.WARPED_COMPOSTER = composter("warped_composter", new VariantComposterBlock());
        BlockList.MANGROVE_COMPOSTER = composter("mangrove_composter", new VariantComposterBlock());
        BlockList.BAMBOO_COMPOSTER = composter("bamboo_composter", new VariantComposterBlock());
        BlockList.CHERRY_COMPOSTER = composter("cherry_composter", new VariantComposterBlock());

        BlockList.SPRUCE_CRAFTING_TABLE = craftingTable("spruce_crafting_table", new VariantCraftingTableBlock());
        BlockList.BIRCH_CRAFTING_TABLE = craftingTable("birch_crafting_table", new VariantCraftingTableBlock());
        BlockList.JUNGLE_CRAFTING_TABLE = craftingTable("jungle_crafting_table", new VariantCraftingTableBlock());
        BlockList.ACACIA_CRAFTING_TABLE = craftingTable("acacia_crafting_table", new VariantCraftingTableBlock());
        BlockList.DARK_OAK_CRAFTING_TABLE = craftingTable("dark_oak_crafting_table", new VariantCraftingTableBlock());
        BlockList.CRIMSON_CRAFTING_TABLE = craftingTable("crimson_crafting_table", new VariantCraftingTableBlock());
        BlockList.WARPED_CRAFTING_TABLE = craftingTable("warped_crafting_table", new VariantCraftingTableBlock());
        BlockList.MANGROVE_CRAFTING_TABLE = craftingTable("mangrove_crafting_table", new VariantCraftingTableBlock());
        BlockList.BAMBOO_CRAFTING_TABLE = craftingTable("bamboo_crafting_table", new VariantCraftingTableBlock());
        BlockList.CHERRY_CRAFTING_TABLE = craftingTable("cherry_crafting_table", new VariantCraftingTableBlock());

        BlockList.SPRUCE_LADDER = ladder("spruce_ladder", new VariantLadderBlock());
        BlockList.BIRCH_LADDER = ladder("birch_ladder", new VariantLadderBlock());
        BlockList.JUNGLE_LADDER = ladder("jungle_ladder", new VariantLadderBlock());
        BlockList.ACACIA_LADDER = ladder("acacia_ladder", new VariantLadderBlock());
        BlockList.DARK_OAK_LADDER = ladder("dark_oak_ladder", new VariantLadderBlock());
        BlockList.CRIMSON_LADDER = ladder("crimson_ladder", new VariantLadderBlock());
        BlockList.WARPED_LADDER = ladder("warped_ladder", new VariantLadderBlock());
        BlockList.MANGROVE_LADDER = ladder("mangrove_ladder", new VariantLadderBlock());
        BlockList.BAMBOO_LADDER = ladder("bamboo_ladder", new VariantLadderBlock());
        BlockList.CHERRY_LADDER = ladder("cherry_ladder", new VariantLadderBlock());

        BlockList.SPRUCE_LECTERN = lectern("spruce_lectern", new VariantLecternBlock());
        BlockList.BIRCH_LECTERN = lectern("birch_lectern", new VariantLecternBlock());
        BlockList.JUNGLE_LECTERN = lectern("jungle_lectern", new VariantLecternBlock());
        BlockList.ACACIA_LECTERN = lectern("acacia_lectern", new VariantLecternBlock());
        BlockList.DARK_OAK_LECTERN = lectern("dark_oak_lectern", new VariantLecternBlock());
        BlockList.CRIMSON_LECTERN = lectern("crimson_lectern", new VariantLecternBlock());
        BlockList.WARPED_LECTERN = lectern("warped_lectern", new VariantLecternBlock());
        BlockList.MANGROVE_LECTERN = lectern("mangrove_lectern", new VariantLecternBlock());
        BlockList.BAMBOO_LECTERN = lectern("bamboo_lectern", new VariantLecternBlock());
        BlockList.CHERRY_LECTERN = lectern("cherry_lectern", new VariantLecternBlock());

    }

    private static Block barrel(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        VariantsPOITypes.BARRELS.put(identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block beehive(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        VariantsPOITypes.BEEHIVES.put(identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block bookshelf(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block composter(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        VariantsPOITypes.COMPOSTERS.put(identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block craftingTable(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block ladder(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Block lectern(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        blockItem(name, block);
        VariantsPOITypes.LECTERNS.put(identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    private static Item blockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(WoodVariants.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(WoodVariants.GROUP).register(entries -> entries.add(item));
        return item;
    }

}
