package xyz.qalcyo.mango.collections.abstraction;

import xyz.qalcyo.mango.Maps;
import xyz.qalcyo.mango.annotations.Beta;
import xyz.qalcyo.mango.collections.MultiMap;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

@Beta
public abstract class AbstractMultiMap<K, V> implements MultiMap<K, V> {

    protected final Map<K, List<V>> map = Maps.newHashMap();
    protected final Class<?> listType;

    public AbstractMultiMap(Class<?> listType) {
        this.listType = listType;
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public boolean containsValue(V value) {
        AtomicBoolean contained = new AtomicBoolean(false);
        map.forEach((key, val) -> {
            for (V v : val) {
                contained.set(v.equals(value));
            }
        });
        return contained.get();
    }

    public void put(K key, V value) {
        try {
            map.putIfAbsent(key, (List<V>) listType.newInstance());
            map.get(key).add(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remove(K key) {
        map.remove(key);
    }

    public void clear() {
        map.clear();
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public Collection<List<V>> values() {
        return map.values();
    }

    public Collection<Map.Entry<K, List<V>>> entries() {
        return map.entrySet();
    }

    public List<V> get(K key) {
        return map.get(key);
    }

    public Map<K, List<V>> asMap() {
        return map;
    }

    public String toString() {
        return map.toString();
    }

}