package xyz.deftu.deftils;

public class Objects {

    /**
     * @param o The object to stringify.
     * @return The stringified object.
     */
    public static String stringify(Object o) {
        return o == null ? "" : String.valueOf(o);
    }

    /**
     * Used to ensure objects aren't null.
     *
     * @param o The object to check.
     * @param name The name of the object.
     */
    public static void notNull(Object o, String name) {
        if (o == null)
            throw new NullPointerException(name + " == null!");
    }

    public static void notNull(Object o) {
        notNull(o, "object");
    }

}