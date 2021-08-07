package xyz.matthewtgm.mango.collections;

import java.util.Map;

public interface ReversibleMap<K, V> extends Map<K, V> {
    ReversibleMap<K, V> reverse();
}