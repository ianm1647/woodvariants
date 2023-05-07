package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodType;

public class VariantBeehiveBlock extends BeehiveBlock {
    public VariantBeehiveBlock() {
        super(FabricBlockSettings.copy(Blocks.BEEHIVE));
    }
}
