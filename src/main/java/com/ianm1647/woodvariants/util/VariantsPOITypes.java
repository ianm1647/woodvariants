package com.ianm1647.woodvariants.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.ianm1647.woodvariants.mixin.PointOfInterestTypesAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VariantsPOITypes {
    private static final Map<BlockState, RegistryEntry<PointOfInterestType>> POI_TO_STATS = PointOfInterestTypesAccessor.getPointOfInterestStatesToType();
    public static Map<Identifier, Block> BARRELS = Maps.newHashMap();
    public static Map<Identifier, Block> COMPOSTERS = Maps.newHashMap();
    public static Map<Identifier, Block> LECTERNS = Maps.newHashMap();

    public static Map<Identifier, Block> BEEHIVES = Maps.newHashMap();

    public static void registerPoiTypes() {
        registerPOI(PointOfInterestTypes.FARMER, COMPOSTERS);
        registerPOI(PointOfInterestTypes.FISHERMAN, BARRELS);
        registerPOI(PointOfInterestTypes.LIBRARIAN, LECTERNS);

        registerPOI(PointOfInterestTypes.BEEHIVE, BEEHIVES);
    }

    private static void registerPOI(RegistryKey<PointOfInterestType> type, Map<Identifier, Block> map) {
        List<BlockState> villagerBlockStates = new ArrayList(Registries.POINT_OF_INTEREST_TYPE.get(type).blockStates());
        for (Block block : map.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                POI_TO_STATS.putIfAbsent(blockState, Registries.POINT_OF_INTEREST_TYPE.getEntry(type).get());
            }
            villagerBlockStates.addAll(blockStates);
        }
    }
}
