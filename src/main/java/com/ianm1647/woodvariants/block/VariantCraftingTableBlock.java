package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public VariantCraftingTableBlock() {
        super(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    }
}
