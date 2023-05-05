package com.ianm1647.woodvariants.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntityType;

public class VariantChestBlock extends ChestBlock {
    public VariantChestBlock() {
        super(FabricBlockSettings.copy(Blocks.CHEST), () -> BlockEntityType.CHEST);
    }
}
