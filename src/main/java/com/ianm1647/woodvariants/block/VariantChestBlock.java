package com.ianm1647.woodvariants.block;

import com.ianm1647.woodvariants.block.entity.VariantChestBlockEntity;
import com.ianm1647.woodvariants.registry.BlockEntityTypeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class VariantChestBlock extends ChestBlock {
    private final WoodType woodType;

    public VariantChestBlock(WoodType type) {
        super(FabricBlockSettings.copy(Blocks.CHEST), () -> BlockEntityTypeRegistry.CHEST);
        this.woodType = type;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(BlockEntityTypeRegistry.CHEST, pos, state, woodType);
    }

    public WoodType getWoodType() {
        return this.woodType;
    }

    public static WoodType getWoodType(Block block) {
        WoodType woodType;
        if (block instanceof VariantChestBlock) {
            woodType = ((VariantChestBlock)block).getWoodType();
        } else {
            woodType = null;
        }
        return woodType;
    }
}
