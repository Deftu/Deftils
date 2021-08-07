package xyz.matthewtgm.mango;

import java.util.Iterator;

public class StringHelper {

    /**
     * @param strings The list of Objects to check.
     * @return The longest string out of the array.
     */
    public static String getLongestString(Object[] strings) {
        String longestString = "";
        int longest = 0;
        for (Object o : strings) {
            String string = ObjectHelper.stringify(o);
            if (string.length() > longest) {
                longestString = string;
                longest = string.length();
            }
        }
        return longestString;
    }

    /**
     * @param strings The list of Objects to check.
     * @return The longest string's length.
     */
    public static int getLongestStringWidth(Object[] strings) {
        return getLongestString(strings).length();
    }

    /**
     * @param iterable The iterable to check all elements of.
     * @param separator The seperator to join with.
     * @return The string joined from the iterable.
     */
    public static String join(Iterable<?> iterable, String separator) {
        if (iterable == null)
            return null;
        return join(iterable.iterator(), separator);
    }

    private static String join(Iterator<?> iterator, String separator) {
        if (iterator == null)
            return null;
        if (!iterator.hasNext())
            return "";
        Object first = iterator.next();
        if (!iterator.hasNext())
            return ObjectHelper.stringify(first);
        StringBuilder buf = new StringBuilder();
        if (first != null)
            buf.append(first);
        while (iterator.hasNext()) {
            if (separator != null)
                buf.append(separator);
            Object obj = iterator.next();
            if (obj != null)
                buf.append(obj);
        }
        return buf.toString();
    }

}