package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;

public class VariantBarrelBlock extends BarrelBlock {
    public VariantBarrelBlock() {
        super(FabricBlockSettings.copy(Blocks.BARREL));
    }

}
