package xyz.deftu.deftils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

    /**
     * @param <K> The key type of this hash map.
     * @param <V> The value type of this hash map.
     * @return The created hash map.
     */
    public static <K, V> HashMap<K, V> newHashMap(Map<K, V> parent) {
        return new HashMap<>(parent);
    }

    /**
     * @param <K> The key type of this hash map.
     * @param <V> The value type of this hash map.
     * @return The created hash map.
     */
    public static <K, V> HashMap<K, V> newHashMap() {
        return newHashMap(new HashMap<>());
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
     * @param <K> The key type of this linked hash map.
     * @param <V> The value type of this linked hash map.
     * @return The created linked hash map.
     */
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return newLinkedHashMap(new LinkedHashMap<>());
    }

}