package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.client.render.block.entity.VariantChestBlockEntityRenderer;
import com.ianm1647.woodvariants.client.render.block.entity.VariantLecternBlockEntityRenderer;
import com.ianm1647.woodvariants.util.ItemTagKeys;
import com.ianm1647.woodvariants.util.VariantsPOITypes;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import net.minecraft.client.render.block.entity.LecternBlockEntityRenderer;

public class UtilRegistry {

    public static void registerUtil() {
        VariantsPOITypes.registerPoiTypes();
        fuels();
    }

    public static void registerClient() {
        registerRenderLayer();
        registerBlockEntityRenderer();
        EntityModelRegistry.registerChests();
    }

    public static void fuels() {
        FuelRegistry.INSTANCE.add(ItemTagKeys.BARRELS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BEEHIVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BOOKSHELVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.CHESTS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.COMPOSTERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.CRAFTING_TABLES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LADDERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LECTERNS, 300);
    }

    public static void registerRenderLayer() {

    }

    public static void registerBlockEntityRenderer() {
        BlockEntityRendererFactories.register(BlockEntityTypeRegistry.LECTERN, VariantLecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityTypeRegistry.CHEST, VariantChestBlockEntityRenderer::new);
    }
}
