package xyz.deftu.mango;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps {

    /**
     * @param <K> The key type of this hash map.
     * @param <V> The value type of this hash map.
     * @return The created hash map.
     */
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    /**
     * @param <K> The key type of this linked hash map.
     * @param <V> The value type of this linked hash map.
     * @return The created linked hash map.
     */
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

}