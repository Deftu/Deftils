package xyz.deftu.deftils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Objects {

    /**
     * @param o The object to stringify.
     * @return The stringified object.
     */
    public static String stringify(@Nullable Object o) {
        return o == null ? "" : String.valueOf(o);
    }

    /**
     * Used to ensure objects aren't null.
     *
     * @param o The object to check.
     * @param name The name of the object.
     */
    public static void notNull(@Nullable Object o, @NotNull String name) {
        if (o == null)
            throw new NullPointerException(name + " == null!");
    }

    public static void notNull(@Nullable Object o) {
        notNull(o, "object");
    }

}