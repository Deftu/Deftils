package xyz.deftu.deftils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionHelper {
    /**
     * @param <K> The key type of this hash map.
     * @param <V> The value type of this hash map.
     * @return The created hash map.
     */
    public static <K, V> HashMap<K, V> newHashMap(Map<K, V> parent) {
        return new HashMap<>(parent);
    }

    /**
     * @param <K> The key type of this linked hash map.
     * @param <V> The value type of this linked hash map.
     * @return The created linked hash map.
     */
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<K, V> parent) {
        return new LinkedHashMap<>(parent);
    }

    /**
     * @param <T> The type to be used by the array list.
     * @return The created array list.
     */
    public static <T> ArrayList<T> newArrayList(List<T> parent) {
        return new ArrayList<>(parent);
    }

    /**
     * @param <T> The type to be used by the array list.
     * @return The created array list.
     */
    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... elements) {
        return newArrayList(Arrays.asList(elements));
    }

    /**
     * @param <T> The type to be used by the linked list.
     * @return The created linked list.
     */
    public static <T> LinkedList<T> newLinkedList(List<T> parent) {
        return new LinkedList<>(parent);
    }

    /**
     * @param <T> The type to be used by the linked list.
     * @return The created linked list.
     */
    @SafeVarargs
    public static <T> LinkedList<T> newLinkedList(T... elements) {
        return newLinkedList(Arrays.asList(elements));
    }

    /**
     * @param <T> The type to be used by the copy-on-write array list.
     * @return The created copy-on-write array list.
     */
    public static <T> CopyOnWriteArrayList<T> newCopyOnWriteArrayList(List<T> parent) {
        return new CopyOnWriteArrayList<>(parent);
    }

    /**
     * @param <T> The type to be used by the copy-on-write array list.
     * @return The created copy-on-write array list.
     */
    public static <T> CopyOnWriteArrayList<T> newCopyOnWriteArrayList(T... elements) {
        return newCopyOnWriteArrayList(Arrays.asList(elements));
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> type) {
        Collection<T> collection = toCollection((Iterable<T>) iterable);
        T[] array = (T[]) Array.newInstance(type, collection.size());
        return collection.toArray(array);
    }

    public static <T> Collection<T> toCollection(Iterable<T> iterable) {
        return (iterable instanceof Collection) ?
                (Collection<T>) iterable :
                null;
    }
}