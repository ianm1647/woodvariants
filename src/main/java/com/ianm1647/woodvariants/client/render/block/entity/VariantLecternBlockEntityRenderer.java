package com.ianm1647.woodvariants.client.render.block.entity;

import com.ianm1647.woodvariants.block.VariantLecternBlock;
import com.ianm1647.woodvariants.block.entity.VariantLecternBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.LecternBlock;
import net.minecraft.block.entity.LecternBlockEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.EnchantingTableBlockEntityRenderer;
import net.minecraft.client.render.entity.model.BookModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

@Environment(value= EnvType.CLIENT)
public class VariantLecternBlockEntityRenderer implements BlockEntityRenderer<VariantLecternBlockEntity> {
    private final BookModel book;

    public VariantLecternBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.book = new BookModel(ctx.getLayerModelPart(EntityModelLayers.BOOK));
    }

    @Override
    public void render(VariantLecternBlockEntity lecternBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
        BlockState blockState = lecternBlockEntity.getCachedState();
        if (!blockState.get(VariantLecternBlock.HAS_BOOK).booleanValue()) {
            return;
        }
        matrixStack.push();
        matrixStack.translate(0.5f, 1.0625f, 0.5f);
        float g = blockState.get(VariantLecternBlock.FACING).rotateYClockwise().asRotation();
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-g));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(67.5f));
        matrixStack.translate(0.0f, -0.125f, 0.0f);
        this.book.setPageAngles(0.0f, 0.1f, 0.9f, 1.2f);
        VertexConsumer vertexConsumer = EnchantingTableBlockEntityRenderer.BOOK_TEXTURE.getVertexConsumer(vertexConsumerProvider, RenderLayer::getEntitySolid);
        this.book.renderBook(matrixStack, vertexConsumer, i, j, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.pop();
    }
}