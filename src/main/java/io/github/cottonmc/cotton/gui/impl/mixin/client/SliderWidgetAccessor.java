package io.github.cottonmc.cotton.gui.impl.mixin.client;

import net.minecraft.client.gui.components.AbstractSliderButton;
import net.minecraft.resources.ResourceLocation;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractSliderButton.class)
public interface SliderWidgetAccessor {
	@Accessor("SLIDER_SPRITE")
	static ResourceLocation libgui$getTexture() {
		throw new AssertionError();
	}

	@Accessor("SLIDER_HANDLE_SPRITE")
	static ResourceLocation libgui$getHandleTexture() {
		throw new AssertionError();
	}

	@Accessor("SLIDER_HANDLE_HIGHLIGHTED_SPRITE")
	static ResourceLocation libgui$getHandleHighlightedTexture() {
		throw new AssertionError();
	}
}
