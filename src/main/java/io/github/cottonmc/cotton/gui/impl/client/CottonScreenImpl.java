package io.github.cottonmc.cotton.gui.impl.client;

import io.github.cottonmc.cotton.gui.GuiDescription;
import io.github.cottonmc.cotton.gui.widget.WWidget;
import org.jetbrains.annotations.Nullable;

public interface CottonScreenImpl {
	GuiDescription getDescription();

	@Nullable
	WWidget getLastResponder();

	void setLastResponder(@Nullable WWidget lastResponder);
}
