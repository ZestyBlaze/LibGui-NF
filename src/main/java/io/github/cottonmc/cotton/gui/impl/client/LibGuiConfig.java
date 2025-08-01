package io.github.cottonmc.cotton.gui.impl.client;

import net.neoforged.neoforge.common.ModConfigSpec;

public class LibGuiConfig {
	public static final ModConfigSpec CLIENT_SPEC;

	public static ModConfigSpec.BooleanValue darkMode;

	private static void setupClientConfig(ModConfigSpec.Builder builder) {
		darkMode = builder.comment("Whether dark mode should be enabled. Will only affect Vanilla-styled GUIs.")
				.define("darkMode", false);
	}

	static {
		ModConfigSpec.Builder clientBuilder = new ModConfigSpec.Builder();
		setupClientConfig(clientBuilder);
		CLIENT_SPEC = clientBuilder.build();
	}
}
