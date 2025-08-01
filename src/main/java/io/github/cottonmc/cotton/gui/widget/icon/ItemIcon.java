package io.github.cottonmc.cotton.gui.widget.icon;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

/**
 * An icon that draws an item stack.
 *
 * @since 2.2.0
 */
public class ItemIcon implements Icon {
	// Matches the vanilla RecipeBookGhostSlots class (1.20.2).
	private static final int GHOST_OVERLAY_COLOR = 0x30_FFFFFF;

	private final ItemStack stack;
	private boolean ghost = false;

	/**
	 * Constructs an item icon.
	 *
	 * @param stack the drawn item stack
	 * @throws NullPointerException if the stack is null
	 */
	public ItemIcon(ItemStack stack) {
		this.stack = Objects.requireNonNull(stack, "stack");
	}

	/**
	 * Constructs an item icon with the item's default stack.
	 *
	 * @param item the drawn item
	 * @throws NullPointerException if the item is null
	 * @since 3.2.0
	 */
	public ItemIcon(Item item) {
		this(Objects.requireNonNull(item, "item").getDefaultInstance());
	}

	@Override
	public void paint(GuiGraphics context, int x, int y, int size) {
		float scale = size != 16 ? ((float) size / 16f) : 1f;
		PoseStack matrices = context.pose();
		matrices.pushPose();
		matrices.translate(x, y, 0);
		matrices.scale(scale, scale, 1);
		context.renderFakeItem(stack, 0, 0);

		if (isGhost()) {
			context.fill(RenderType.guiGhostRecipeOverlay(), 0, 0, 16, 16, GHOST_OVERLAY_COLOR);
		}

		matrices.popPose();
	}

	/**
	 * Checks whether this icon is a ghost item.
	 * Ghost items are rendered with a pale overlay.
	 *
	 * @return {@code true} if this icon is a ghost item, {@code false} otherwise
	 * @since 9.2.0
	 */
	public boolean isGhost() {
		return ghost;
	}

	/**
	 * Marks this icon as a ghost or non-ghost icon.
	 *
	 * @param ghost {@code true} if this icon is a ghost item, {@code false} otherwise
	 * @return this icon
	 * @since 9.2.0
	 */
	public ItemIcon setGhost(boolean ghost) {
		this.ghost = ghost;
		return this;
	}
}
