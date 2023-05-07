package com.ianm1647.woodvariants.data.gen;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class VariantModelGenerator {

    public static void registerBarrel(BlockStateModelGenerator gen, Block block) {
        Identifier identifier = TextureMap.getSubId(block, "_top_open");
        gen.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(gen.createUpDefaultFacingVariantMap())
                .coordinate(BlockStateVariantMap.create(Properties.OPEN)
                .register(false, BlockStateVariant.create().put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.upload(block, gen.modelCollector)))
                .register(true, BlockStateVariant.create().put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.get(block)
                .textures((textureMap) -> textureMap.put(TextureKey.TOP, identifier))
                .upload(block, "_open", gen.modelCollector)))));
    }

    public static void registerBeehive(BlockStateModelGenerator gen, Block block) {
        gen.registerBeehive(block, TextureMap::sideFrontEnd);
    }

    public static void registerBookshelf(BlockStateModelGenerator gen, Block block, Block topBottom) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(topBottom));
        Identifier identifier = Models.CUBE_COLUMN.upload(block, textureMap, gen.modelCollector);
        gen.blockStateCollector.accept(gen.createSingletonBlockState(block, identifier));
    }

    public static void registerChest(BlockStateModelGenerator gen, Block planks, Block block) {
        gen.registerBuiltin(ModelIds.getBlockModelId(block), planks).includeWithoutItem(block);
    }

    public static void registerComposter(BlockStateModelGenerator gen, Block block) {
        gen.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
                .with(BlockStateVariant.create().put(VariantSettings.MODEL, TextureMap.getId(block)))
                .with(When.create().set(Properties.LEVEL_8, 1), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents1")))
                .with(When.create().set(Properties.LEVEL_8, 2), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents2")))
                .with(When.create().set(Properties.LEVEL_8, 3), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents3")))
                .with(When.create().set(Properties.LEVEL_8, 4), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents4")))
                .with(When.create().set(Properties.LEVEL_8, 5), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents5")))
                .with(When.create().set(Properties.LEVEL_8, 6), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents6")))
                .with(When.create().set(Properties.LEVEL_8, 7), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents7")))
                .with(When.create().set(Properties.LEVEL_8, 8), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents_ready"))));
    }

    public static void registerCraftingTable(BlockStateModelGenerator gen, Block block, Block topBottom) {
        gen.registerCubeWithCustomTextures(block, topBottom, TextureMap::frontSideWithCustomBottom);
    }

    public static void registerLadder(BlockStateModelGenerator gen, Block block) {
        gen.registerNorthDefaultHorizontalRotation(block);
        gen.registerItemModel(block);
    }

    public static void registerLectern(BlockStateModelGenerator gen, Block block) {
        gen.registerNorthDefaultHorizontalRotation(block);
    }
}
