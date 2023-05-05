package com.ianm1647.woodvariants.mixin;

import com.ianm1647.woodvariants.block.VariantLecternBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LecternBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.WritableBookItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WritableBookItem.class)
public class WritableBookItemMixin {
    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    public void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        PlayerEntity player = context.getPlayer();
        Hand hand = player.getActiveHand();
        ItemStack stack = player.getStackInHand(hand);
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        BlockState blockState = world.getBlockState(pos);
        if (blockState.getBlock() instanceof VariantLecternBlock) {
            if (LecternBlock.putBookIfAbsent(context.getPlayer(), world, pos, blockState, stack)) {
                cir.setReturnValue(ActionResult.success(world.isClient));
            } else {
                cir.setReturnValue(ActionResult.PASS);
            }
        }
    }
}
