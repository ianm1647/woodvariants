package com.ianm1647.woodvariants.registry;

import com.ianm1647.woodvariants.util.FuelTypes;
import com.ianm1647.woodvariants.util.VariantsPOITypes;

public class UtilRegistry {

    public static void registerUtil() {
        VariantsPOITypes.registerPoiTypes();
        FuelTypes.fuels();
    }
}
