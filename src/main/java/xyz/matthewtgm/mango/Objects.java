package xyz.matthewtgm.mango;

import org.jetbrains.annotations.Nullable;

public class Objects {

    /**
     * @param o The object to stringify.
     * @return The stringified object.
     */
    public static String stringify(@Nullable Object o) {
        return o == null ? "" : String.valueOf(o);
    }

}