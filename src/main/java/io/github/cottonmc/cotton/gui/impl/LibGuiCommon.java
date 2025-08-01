package io.github.cottonmc.cotton.gui.impl;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(LibGuiCommon.MOD_ID)
public class LibGuiCommon {
    public static final String MOD_ID = "libgui";

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public LibGuiCommon(IEventBus modEventBus, ModContainer modContainer) {
    }
}
