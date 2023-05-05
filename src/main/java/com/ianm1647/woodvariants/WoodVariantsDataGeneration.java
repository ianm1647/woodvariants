package com.ianm1647.woodvariants;

import com.ianm1647.woodvariants.data.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class WoodVariantsDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(VariantLootTableGenerator::new);
        pack.addProvider(VariantRecipeGenerator::new);
        pack.addProvider(VariantModelProvider::new);
        pack.addProvider(VariantBlockTagGenerator::new);
        pack.addProvider(VariantItemTagGenerator::new);
    }

}
