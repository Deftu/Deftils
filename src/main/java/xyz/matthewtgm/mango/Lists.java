package xyz.matthewtgm.mango;

import java.util.Comparator;
import java.util.List;

public class Lists {

    /**
     * Sorts a list by its elements' string values.
     *
     * @param list The list to sort.
     */
    public static <T> void sortByString(List<T> list) {
        list.sort(Comparator.comparing(T::toString));
    }

    /**
     * Sorts a list by its elements' string values reversed.
     *
     * @param list The list to sort.
     */
    public static <T> void sortByStringReversed(List<T> list) {
        list.sort(Comparator.comparing(T::toString).reversed());
    }

}