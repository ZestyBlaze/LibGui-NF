package io.github.cottonmc.cotton.gui.impl.mixin.client;

import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.components.WidgetSprites;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractButton.class)
public interface PressableWidgetAccessor {
	@Accessor("SPRITES")
	static WidgetSprites libgui$getTextures() {
		throw new AssertionError();
	}
}
