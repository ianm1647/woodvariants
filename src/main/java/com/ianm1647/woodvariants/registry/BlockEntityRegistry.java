package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.WoodVariants;
import com.ianm1647.woodvariants.block.BlockList;
import com.ianm1647.woodvariants.block.entity.BlockEntityList;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LecternBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEntityRegistry {

    public static void registerBlockEntities() {
        BlockEntityList.SPRUCE_LECTERN = lectern("spruce", BlockList.SPRUCE_LECTERN);
        BlockEntityList.BIRCH_LECTERN = lectern("birch", BlockList.BIRCH_LECTERN);
        BlockEntityList.JUNGLE_LECTERN = lectern("jungle", BlockList.JUNGLE_LECTERN);
        BlockEntityList.ACACIA_LECTERN = lectern("acacia", BlockList.ACACIA_LECTERN);
        BlockEntityList.DARK_OAK_LECTERN = lectern("dark_oak", BlockList.DARK_OAK_LECTERN);
        BlockEntityList.CRIMSON_LECTERN = lectern("crimson", BlockList.CRIMSON_LECTERN);
        BlockEntityList.WARPED_LECTERN = lectern("warped", BlockList.WARPED_LECTERN);
        BlockEntityList.MANGROVE_LECTERN = lectern("mangrove", BlockList.MANGROVE_LECTERN);
        BlockEntityList.BAMBOO_LECTERN = lectern("bamboo", BlockList.BAMBOO_LECTERN);
        BlockEntityList.CHERRY_LECTERN = lectern("cherry", BlockList.CHERRY_LECTERN);

    }

    private static BlockEntityType<LecternBlockEntity> lectern(String name, Block block) {
        Identifier identifier = new Identifier(WoodVariants.MODID, name + "_lectern_entity");
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, identifier, FabricBlockEntityTypeBuilder.create(LecternBlockEntity::new, block).build(null));
    }
}
