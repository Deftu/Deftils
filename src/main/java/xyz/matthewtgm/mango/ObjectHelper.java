package xyz.matthewtgm.mango;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ObjectHelper {

    /**
     * @param o The object to stringify.
     * @return The stringified object.
     */
    public static String stringify(@Nullable Object o) {
        return o == null ? "" : Objects.toString(o);
    }

}