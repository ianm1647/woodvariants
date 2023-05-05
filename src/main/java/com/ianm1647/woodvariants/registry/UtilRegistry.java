package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.block.entity.BlockEntityList;
import com.ianm1647.woodvariants.item.ItemTagKeys;
import com.ianm1647.woodvariants.util.VariantsPOITypes;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.LecternBlockEntityRenderer;

public class UtilRegistry {

    public static void registerUtil() {
        VariantsPOITypes.registerPoiTypes();
        fuels();
    }

    public static void registerClient() {
        registerRenderLayer();
        registerBlockEntityRenderer();
    }

    public static void fuels() {
        FuelRegistry.INSTANCE.add(ItemTagKeys.BARRELS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BEEHIVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.BOOKSHELVES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.COMPOSTERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.CRAFTING_TABLES, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LADDERS, 300);
        FuelRegistry.INSTANCE.add(ItemTagKeys.LECTERNS, 300);
    }

    public static void registerRenderLayer() {

    }

    public static void registerBlockEntityRenderer() {
        BlockEntityRendererFactories.register(BlockEntityList.SPRUCE_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.BIRCH_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.JUNGLE_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.ACACIA_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.DARK_OAK_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.CRIMSON_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.WARPED_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.MANGROVE_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.BAMBOO_LECTERN, LecternBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(BlockEntityList.CHERRY_LECTERN, LecternBlockEntityRenderer::new);
    }
}
