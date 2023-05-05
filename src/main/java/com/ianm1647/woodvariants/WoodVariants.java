package com.ianm1647.woodvariants;

import com.ianm1647.woodvariants.block.BlockList;
import com.ianm1647.woodvariants.registry.BlockEntityRegistry;
import com.ianm1647.woodvariants.registry.BlockRegistry;
import com.ianm1647.woodvariants.registry.TagKeyRegistry;
import com.ianm1647.woodvariants.registry.UtilRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WoodVariants implements ModInitializer {
	public static final String MODID = "woodvariants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final ItemGroup GROUP = FabricItemGroup.builder(new Identifier(MODID, "group"))
			.icon(() -> new ItemStack(BlockList.OAK_BARREL.asItem())).build();

	@Override
	public void onInitialize() {
		BlockRegistry.registerBlocks();
		BlockEntityRegistry.registerBlockEntities();

		UtilRegistry.registerUtil();
		TagKeyRegistry.registerTagKeys();

		LOGGER.info("WoodVariants loaded");
	}
}
