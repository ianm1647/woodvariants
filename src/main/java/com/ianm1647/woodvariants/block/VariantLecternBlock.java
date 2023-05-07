package com.ianm1647.woodvariants.block;

import com.ianm1647.woodvariants.block.entity.VariantLecternBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VariantLecternBlock extends LecternBlock {
    public VariantLecternBlock() {
        super(FabricBlockSettings.copy(Blocks.LECTERN));
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(HAS_BOOK).booleanValue()) {
            if (!world.isClient) {
                this.openScreen(world, pos, player);
            }
            return ActionResult.success(world.isClient);
        }
        ItemStack stack = player.getStackInHand(hand);
        if (stack.isIn(ItemTags.LECTERN_BOOKS)) {
            return putBookIfAbsent(player, world, pos, state, stack) ? ActionResult.success(world.isClient) : ActionResult.PASS;
        }
        return ActionResult.CONSUME;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new VariantLecternBlockEntity(pos, state);
    }

    private void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof VariantLecternBlockEntity) {
            player.openHandledScreen((VariantLecternBlockEntity)blockEntity);
            player.incrementStat(Stats.INTERACT_WITH_LECTERN);
        }
    }
}
