package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class VariantBookshelfBlock extends Block {

    public VariantBookshelfBlock() {
        super(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    }
}
