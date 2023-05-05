package com.ianm1647.woodvariants;

import com.ianm1647.woodvariants.registry.UtilRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value= EnvType.CLIENT)
public class WoodVariantsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        UtilRegistry.registerClient();

    }
}
