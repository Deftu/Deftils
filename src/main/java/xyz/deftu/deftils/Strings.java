package xyz.deftu.deftils;

import xyz.deftu.deftils.annotations.Unfinished;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Strings {

    private static final List<String> questions = Arrays.asList(
            "what",
            "why",
            "when",
            "who",
            "where",
            "how"
    );

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
    public static boolean containsIgnoreCase(String input, String check) {
        Objects.ensureNotNull(input, "Input");
        Objects.ensureNotNull(check, "Check");

        if (check.isEmpty()) {
            return true;
        }

        int length = check.length();
        for (int i = input.length() - length; i >= 0 ; i--) {
            if (input.regionMatches(true, i, check, 0, length)) {
                return true;
            }
        }

        return false;
    }

    /**
     * @param input The list of strings you'd like to list.
     * @return All input strings listed grammatically correctly in English.
     */
    public static String listGrammatically(List<String> input) {
        StringBuilder replacement = new StringBuilder();
        for (String in : input) {
            int index = input.indexOf(in);
            boolean first = index == 0;
            boolean last = index == input.size() - 1;
            if (!first && !last)
                replacement.append(", ");
            if (!first && last)
                replacement.append(" and ");
            replacement.append(in);
        }

        return replacement.toString();
    }

    /**
     * @param input The list of strings you'd like to list.
     * @return All input strings listed grammatically correctly in English.
     */
    public static String listGrammatically(String... input) {
        return listGrammatically(Arrays.asList(input));
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
     * Adds the appropriate punctuation mark at the end of a string, only supports a limited number of question words.
     *
     * <b>CURRENTLY SEMI-USABLE.</b>
     *
     * @param input The input string.
     * @return The punctuated input.
     */
    @Unfinished
    public static String punctuate(String input) {
        String mark = ".";
        if (input.contains(" ") && questions.contains(input.substring(0, input.indexOf(" ")).toLowerCase()))
            mark = "?";
        if (!input.endsWith(mark))
            input = input + mark;
        return input;
    }

    /**
     * @param strings The list of Objects to check.
     * @return The longest string out of the array.
     */
    public static String getLongestString(Object[] strings) {
        String longestString = "";
        int longest = 0;
        for (Object o : strings) {
            String string = Objects.stringify(o);
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
            return Objects.stringify(first);
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

    public static List<String> getQuestions() {
        return questions;
    }

}