package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public VariantCraftingTableBlock() {
        super(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    }
}
