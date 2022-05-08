package xyz.deftu.deftils;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class StringHelper {
    /**
     * @param string The string to check.
     * @return Whether the string is empty or null.
     */
    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    /**
     * @param input The input string to check inside of.
     * @param check The check to look for.
     * @return Whether the input string contains the check.
     */
    public static boolean containsIgnoreCase(@NotNull String input, @NotNull String check) {
        if (check.isEmpty())
            return true;
        int length = check.length();
        for (int i = input.length() - length; i >= 0 ; i--) {
            if (input.regionMatches(true, i, check, 0, length)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param prefix The prefix to prepend.
     * @param string The string to prepend to.
     * @return The modified string.
     */
    public static String prepend(String prefix, String string) {
        return prefix + string;
    }

    /**
     * Capitalizes the first letter in the input.
     *
     * @param input The input string.
     * @return The capitalized input.
     */
    public static String capitalize(String input) {
        return Character.toString(input.charAt(0)).toUpperCase() + input.substring(1);
    }

    /**
     * @param strings The list of Objects to check.
     * @return The longest string out of the array.
     */
    public static String fetchLongestString(Object[] strings) {
        String longest = "";
        for (Object string : strings) {
            if (string.toString().length() > longest.length()) {
                longest = string.toString();
            }
        }
        return longest;
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

    /**
     * @param iterator The iterator to check all elements of.
     * @param separator The seperator to join with.
     * @return The string joined from the iterator.
     */
    private static String join(Iterator<?> iterator, String separator) {
        if (iterator == null)
            return null;
        if (!iterator.hasNext())
            return "";
        Object first = iterator.next();
        if (!iterator.hasNext())
            return ObjectHelper.stringify(first);
        StringBuilder builder = new StringBuilder();
        if (first != null)
            builder.append(first);
        while (iterator.hasNext()) {
            if (separator != null)
                builder.append(separator);
            Object obj = iterator.next();
            if (obj != null)
                builder.append(obj);
        }
        return builder.toString();
    }
}