package com.ianm1647.woodvariants.registry;

import com.google.common.collect.ImmutableMap;
import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.entity.VariantChestBlockEntity;
import com.ianm1647.woodvariants.client.render.block.entity.VariantChestBlockEntityRenderer;
import com.ianm1647.woodvariants.util.BlockList;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class EntityModelRegistry {
    public static void registerChests() {
        renderChestModel(BlockList.OAK_CHEST, WoodType.OAK);
        renderChestModel(BlockList.SPRUCE_CHEST, WoodType.SPRUCE);
        renderChestModel(BlockList.BIRCH_CHEST, WoodType.BIRCH);
        renderChestModel(BlockList.JUNGLE_CHEST, WoodType.JUNGLE);
        renderChestModel(BlockList.ACACIA_CHEST, WoodType.ACACIA);
        renderChestModel(BlockList.DARK_OAK_CHEST, WoodType.DARK_OAK);
        renderChestModel(BlockList.CRIMSON_CHEST, WoodType.CRIMSON);
        renderChestModel(BlockList.WARPED_CHEST, WoodType.WARPED);
        renderChestModel(BlockList.MANGROVE_CHEST, WoodType.MANGROVE);
        renderChestModel(BlockList.BAMBOO_CHEST, WoodType.BAMBOO);
        renderChestModel(BlockList.CHERRY_CHEST, WoodType.CHERRY);
    }

    private static void renderChestModel(Block block, WoodType woodType) {
        create(woodType);
        BuiltinItemRendererRegistry.INSTANCE.register(block, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            BlockEntity blockEntity = new VariantChestBlockEntity(BlockEntityTypeRegistry.CHEST, BlockPos.ORIGIN, block.getDefaultState(), woodType);
            MinecraftClient.getInstance().getBlockEntityRenderDispatcher().renderEntity(blockEntity, matrices, vertexConsumers, light, overlay);
        });
    }

    private static void create(WoodType woodType) {
        ImmutableMap.Builder<EntityModelLayer, TexturedModelData> builder = ImmutableMap.builder();
        TexturedModelData chestSingle = VariantChestBlockEntityRenderer.getSingleTexturedModelData();
        TexturedModelData chestLeft = VariantChestBlockEntityRenderer.getLeftDoubleTexturedModelData();
        TexturedModelData chestRight = VariantChestBlockEntityRenderer.getRightDoubleTexturedModelData();

        builder.put(createSingle(woodType), chestSingle);
        builder.put(createLeft(woodType), chestLeft);
        builder.put(createRight(woodType), chestRight);
    }

    private static EntityModelLayer createSingle(WoodType woodType) {
        Identifier identifier = new Identifier(WoodVariants.MODID, woodType.name() + "_chest_single");
        return new EntityModelLayer(identifier, "main");
    }

    private static EntityModelLayer createLeft(WoodType woodType) {
        Identifier identifier = new Identifier(WoodVariants.MODID, woodType.name() + "_chest_left");
        return new EntityModelLayer(identifier, "main");
    }

    private static EntityModelLayer createRight(WoodType woodType) {
        Identifier identifier = new Identifier(WoodVariants.MODID, woodType.name() + "_chest_right");
        return new EntityModelLayer(identifier, "main");
    }
}
