package xyz.deftu.deftils.collections.util;

import xyz.deftu.deftils.collections.Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HeapHelper {
    public static <T> Collection<T> populateCollection(Heap<T> heap, Collection<T> collection) {
        for (T t : heap)
            collection.add(t);
        return collection;
    }

    public static <T> Collection<T> toCollection(Heap<T> heap) {
        Collection<T> collection = new ArrayList<>(Collections.emptyList());
        for (T t : heap)
            collection.add(t);
        return collection;
    }
}