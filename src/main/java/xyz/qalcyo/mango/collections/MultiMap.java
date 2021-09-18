package xyz.qalcyo.mango.collections;

import xyz.qalcyo.mango.annotations.Beta;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

@Beta
public interface MultiMap<K, V> {
    int size();
    boolean isEmpty();

    boolean containsKey(K key);
    boolean containsValue(V value);

    void put(K key, V value);
    void remove(K key);
    void clear();

    Set<K> keySet();
    Collection<List<V>> values();
    Collection<Map.Entry<K, List<V>>> entries();

    List<V> get(K key);

    default void forEach(BiConsumer<K, List<V>> action) {
        entries().forEach(entry -> action.accept(entry.getKey(), entry.getValue()));
    }

    Map<K, List<V>> asMap();
}