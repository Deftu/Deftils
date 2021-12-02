package xyz.deftu.deftils.collections.util;

import xyz.deftu.deftils.collections.Heap;
import xyz.deftu.deftils.collections.impl.AdvancedHeap;
import xyz.deftu.deftils.collections.impl.SimpleHeap;

import java.util.Collection;
import java.util.Collections;

public class Heaps {

    public static <T> SimpleHeap<T> newSimpleHeap() {
        return new SimpleHeap<>();
    }

    public static <T> AdvancedHeap<T> newAdvancedHeap() {
        return new AdvancedHeap<>();
    }

    public static <T> Collection<T> populateCollection(Heap<T> heap, Collection<T> collection) {
        for (T t : heap) {
            collection.add(t);
        }
        return collection;
    }

    public static <T> Collection<T> toCollection(Heap<T> heap) {
        Collection<T> collection = Collections.EMPTY_LIST;
        for (T t : heap)
            collection.add(t);
        return collection;
    }

}