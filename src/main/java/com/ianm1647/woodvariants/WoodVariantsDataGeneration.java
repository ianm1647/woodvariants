package com.ianm1647.woodvariants;

import com.ianm1647.woodvariants.data.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class WoodVariantsDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(VariantsLootTableGenerator::new);
        pack.addProvider(VariantsRecipeGenerator::new);
        pack.addProvider(VariantsModelProvider::new);
        pack.addProvider(VariantsBlockTagGenerator::new);
        pack.addProvider(VariantsItemTagGenerator::new);
    }

}
