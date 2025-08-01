package io.github.cottonmc.cotton.gui;

import net.neoforged.neoforge.common.util.TriState;

public class TriStateUtil {
    public static boolean get(TriState state) {
        return state == TriState.TRUE;
    }

    public static boolean orElse(TriState state, boolean value) {
        return state == TriState.DEFAULT ? value : get(state);
    }
}
