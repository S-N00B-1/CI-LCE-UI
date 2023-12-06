package net.kyrptonaught.lceui;

import net.minecraft.inventory.Inventory;
import net.minecraft.screen.slot.Slot;

/**
 * @author Pedro270707
 * @since 0.0.5
 * A slot that can be scaled and positioned with floating points instead of integers.
 */
public class ScalableSlot extends Slot {
    public static ScalableSlot scalableSlotToDraw = null;

    public final float floatX;
    public final float floatY;
    public final float scale;
    public final float itemScale;

    public ScalableSlot(Inventory inventory, int index, float x, float y, float scale, float itemScale) {
        super(inventory, index, (int)x, (int)y);
        this.floatX = x;
        this.floatY = y;
        this.scale = scale;
        this.itemScale = itemScale;
    }

    public ScalableSlot(Inventory inventory, int index, float x, float y, float scale) {
        this(inventory, index, x, y, scale, 7.0f/8.0f);
    }
}
