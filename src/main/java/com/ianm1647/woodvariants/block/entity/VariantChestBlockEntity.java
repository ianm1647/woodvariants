package com.ianm1647.woodvariants.block.entity;

import com.ianm1647.woodvariants.registry.BlockEntityTypeRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.util.math.BlockPos;

public class VariantChestBlockEntity extends ChestBlockEntity {
    private WoodType woodType;

    public VariantChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState, WoodType woodType) {
        super(blockEntityType, blockPos, blockState);
        this.woodType = woodType;
    }

    public VariantChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(BlockEntityTypeRegistry.CHEST, blockPos, blockState);
    }

    public WoodType getWoodType() {
        return this.woodType;
    }

}
