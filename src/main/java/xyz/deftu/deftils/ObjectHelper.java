package xyz.deftu.deftils;

public class ObjectHelper {
    /**
     * @param o The object to stringify.
     * @return The stringified object.
     */
    public static String stringify(Object o) {
        return o == null ? "" : String.valueOf(o);
    }
}