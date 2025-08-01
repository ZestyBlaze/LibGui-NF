package io.github.cottonmc.cotton.gui.impl.client;

import io.github.cottonmc.cotton.gui.impl.LibGuiCommon;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = LibGuiCommon.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = LibGuiCommon.MOD_ID, value = Dist.CLIENT)
public class LibGuiClient {
    public LibGuiClient(ModContainer container) {
        container.registerConfig(ModConfig.Type.CLIENT, LibGuiConfig.CLIENT_SPEC);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
