package xyz.deftu.mango.collections.util;

import xyz.deftu.mango.collections.Heap;
import xyz.deftu.mango.collections.impl.AdvancedHeap;
import xyz.deftu.mango.collections.impl.SimpleHeap;

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