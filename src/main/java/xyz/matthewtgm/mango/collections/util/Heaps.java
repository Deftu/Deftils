package xyz.matthewtgm.mango.collections.util;

import xyz.matthewtgm.mango.collections.impl.AdvancedHeap;
import xyz.matthewtgm.mango.collections.impl.SimpleHeap;

public class Heaps {

    public static <T> SimpleHeap<T> newSimpleHeap() {
        return new SimpleHeap<>();
    }

    public static <T>AdvancedHeap<T> newAdvancedHeap() {
        return new AdvancedHeap<>();
    }

}