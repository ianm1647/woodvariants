package com.ianm1647.woodvariants.registry;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.entity.VariantLecternBlockEntity;
import com.ianm1647.woodvariants.util.BlockList;
import com.ianm1647.woodvariants.block.entity.VariantChestBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder.Factory;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Set;


public class BlockEntityTypeRegistry {

    public static BlockEntityType<BeehiveBlockEntity> BEEHIVE;
    public static BlockEntityType<VariantChestBlockEntity> CHEST;
    public static BlockEntityType<VariantLecternBlockEntity> LECTERN;

    public static void registerBlockEntities() {
        BEEHIVE = blockEntityType("variant_beehive", BeehiveBlockEntity::new,
                BlockList.SPRUCE_BEEHIVE,
                BlockList.BIRCH_BEEHIVE,
                BlockList.JUNGLE_BEEHIVE,
                BlockList.ACACIA_BEEHIVE,
                BlockList.DARK_OAK_BEEHIVE,
                BlockList.CRIMSON_BEEHIVE,
                BlockList.WARPED_BEEHIVE,
                BlockList.MANGROVE_BEEHIVE,
                BlockList.BAMBOO_BEEHIVE,
                BlockList.CHERRY_BEEHIVE
        );

        CHEST = blockEntityType("variant_chest", VariantChestBlockEntity::new,
                BlockList.OAK_CHEST,
                BlockList.SPRUCE_CHEST,
                BlockList.BIRCH_CHEST,
                BlockList.JUNGLE_CHEST,
                BlockList.ACACIA_CHEST,
                BlockList.DARK_OAK_CHEST,
                BlockList.CRIMSON_CHEST,
                BlockList.WARPED_CHEST,
                BlockList.MANGROVE_CHEST,
                BlockList.BAMBOO_CHEST,
                BlockList.CHERRY_CHEST
        );

        LECTERN = blockEntityType("variant_lectern", VariantLecternBlockEntity::new,
                BlockList.SPRUCE_LECTERN,
                BlockList.BIRCH_LECTERN,
                BlockList.JUNGLE_LECTERN,
                BlockList.ACACIA_LECTERN,
                BlockList.DARK_OAK_LECTERN,
                BlockList.CRIMSON_LECTERN,
                BlockList.WARPED_LECTERN,
                BlockList.MANGROVE_LECTERN,
                BlockList.BAMBOO_LECTERN,
                BlockList.CHERRY_LECTERN
        );
    }

    private static BlockEntityType blockEntityType(String name, Factory<? extends BlockEntity> builder, Block... block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, identifier, FabricBlockEntityTypeBuilder.create(builder, block).build(null));
    }
}
