package com.ianm1647.woodvariants.client.render;

import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.entity.VariantChestBlockEntity;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.ChestType;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class VariantTexturedRenderLayers extends TexturedRenderLayers {
    public static final SpriteIdentifier OAK_CHEST = createChestTextureId("oak_chest_single");
    public static final SpriteIdentifier OAK_CHEST_LEFT = createChestTextureId("oak_chest_left");
    public static final SpriteIdentifier OAK_CHEST_RIGHT = createChestTextureId("oak_chest_right");

    public static final SpriteIdentifier SPRUCE_CHEST = createChestTextureId("spruce_chest_single");
    public static final SpriteIdentifier SPRUCE_CHEST_LEFT = createChestTextureId("spruce_chest_left");
    public static final SpriteIdentifier SPRUCE_CHEST_RIGHT = createChestTextureId("spruce_chest_right");

    public static final SpriteIdentifier BIRCH_CHEST = createChestTextureId("birch_chest_single");
    public static final SpriteIdentifier BIRCH_CHEST_LEFT = createChestTextureId("birch_chest_left");
    public static final SpriteIdentifier BIRCH_CHEST_RIGHT = createChestTextureId("birch_chest_right");

    public static final SpriteIdentifier JUNGLE_CHEST = createChestTextureId("jungle_chest_single");
    public static final SpriteIdentifier JUNGLE_CHEST_LEFT = createChestTextureId("jungle_chest_left");
    public static final SpriteIdentifier JUNGLE_CHEST_RIGHT = createChestTextureId("jungle_chest_right");

    public static final SpriteIdentifier ACACIA_CHEST = createChestTextureId("acacia_chest_single");
    public static final SpriteIdentifier ACACIA_CHEST_LEFT = createChestTextureId("acacia_chest_left");
    public static final SpriteIdentifier ACACIA_CHEST_RIGHT = createChestTextureId("acacia_chest_right");

    public static final SpriteIdentifier DARK_OAK_CHEST = createChestTextureId("dark_oak_chest_single");
    public static final SpriteIdentifier DARK_OAK_CHEST_LEFT = createChestTextureId("dark_oak_chest_left");
    public static final SpriteIdentifier DARK_OAK_CHEST_RIGHT = createChestTextureId("dark_oak_chest_right");

    public static final SpriteIdentifier CRIMSON_CHEST = createChestTextureId("crimson_chest_single");
    public static final SpriteIdentifier CRIMSON_CHEST_LEFT = createChestTextureId("crimson_chest_left");
    public static final SpriteIdentifier CRIMSON_CHEST_RIGHT = createChestTextureId("crimson_chest_right");

    public static final SpriteIdentifier WARPED_CHEST = createChestTextureId("warped_chest_single");
    public static final SpriteIdentifier WARPED_CHEST_LEFT = createChestTextureId("warped_chest_left");
    public static final SpriteIdentifier WARPED_CHEST_RIGHT = createChestTextureId("warped_chest_right");

    public static final SpriteIdentifier MANGROVE_CHEST = createChestTextureId("mangrove_chest_single");
    public static final SpriteIdentifier MANGROVE_CHEST_LEFT = createChestTextureId("mangrove_chest_left");
    public static final SpriteIdentifier MANGROVE_CHEST_RIGHT = createChestTextureId("mangrove_chest_right");

    public static final SpriteIdentifier BAMBOO_CHEST = createChestTextureId("bamboo_chest_single");
    public static final SpriteIdentifier BAMBOO_CHEST_LEFT = createChestTextureId("bamboo_chest_left");
    public static final SpriteIdentifier BAMBOO_CHEST_RIGHT = createChestTextureId("bamboo_chest_right");

    public static final SpriteIdentifier CHERRY_CHEST = createChestTextureId("cherry_chest_single");
    public static final SpriteIdentifier CHERRY_CHEST_LEFT = createChestTextureId("cherry_chest_left");
    public static final SpriteIdentifier CHERRY_CHEST_RIGHT = createChestTextureId("cherry_chest_right");

    public static SpriteIdentifier getTextureId(BlockEntity entity, ChestType chestType, boolean christmas, WoodType woodType) {
        if (christmas) {
            return getChestTexture(chestType, CHRISTMAS, CHRISTMAS_LEFT, CHRISTMAS_RIGHT);
        }
        if (entity instanceof VariantChestBlockEntity) {
            if (woodType == WoodType.OAK) {
                return getChestTexture(chestType, OAK_CHEST, OAK_CHEST_LEFT, OAK_CHEST_RIGHT);
            } else if (woodType == WoodType.SPRUCE) {
                return getChestTexture(chestType, SPRUCE_CHEST, SPRUCE_CHEST_LEFT, SPRUCE_CHEST_RIGHT);
            } else if (woodType == WoodType.BIRCH) {
                return getChestTexture(chestType, BIRCH_CHEST, BIRCH_CHEST_LEFT, BIRCH_CHEST_RIGHT);
            } else if (woodType == WoodType.JUNGLE) {
                return getChestTexture(chestType, JUNGLE_CHEST, JUNGLE_CHEST_LEFT, JUNGLE_CHEST_RIGHT);
            } else if (woodType == WoodType.ACACIA) {
                return getChestTexture(chestType, ACACIA_CHEST, ACACIA_CHEST_LEFT, ACACIA_CHEST_RIGHT);
            } else if (woodType == WoodType.DARK_OAK) {
                return getChestTexture(chestType, DARK_OAK_CHEST, DARK_OAK_CHEST_LEFT, DARK_OAK_CHEST_RIGHT);
            } else if (woodType == WoodType.CRIMSON) {
                return getChestTexture(chestType, CRIMSON_CHEST, CRIMSON_CHEST_LEFT, CRIMSON_CHEST_RIGHT);
            } else if (woodType == WoodType.WARPED) {
                return getChestTexture(chestType, WARPED_CHEST, WARPED_CHEST_LEFT, WARPED_CHEST_RIGHT);
            } else if (woodType == WoodType.MANGROVE) {
                return getChestTexture(chestType, MANGROVE_CHEST, MANGROVE_CHEST_LEFT, MANGROVE_CHEST_RIGHT);
            } else if (woodType == WoodType.BAMBOO) {
                return getChestTexture(chestType, BAMBOO_CHEST, BAMBOO_CHEST_LEFT, BAMBOO_CHEST_RIGHT);
            } else if (woodType == WoodType.CHERRY) {
                return getChestTexture(chestType, CHERRY_CHEST, CHERRY_CHEST_LEFT, CHERRY_CHEST_RIGHT);
            }
        }
        return null;
    }

    private static SpriteIdentifier getChestTexture(ChestType type, SpriteIdentifier single, SpriteIdentifier left, SpriteIdentifier right) {
        switch (type) {
            case LEFT:
                return left;
            case RIGHT:
                return right;
            case SINGLE:
            default:
                return single;
        }
    }

    private static SpriteIdentifier createChestTextureId(String variant) {
        return new SpriteIdentifier(CHEST_ATLAS_TEXTURE, new Identifier(WoodVariants.MODID, "entity/chest/" + variant));
    }
}
