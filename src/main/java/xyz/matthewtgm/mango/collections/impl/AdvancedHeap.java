package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.abstraction.AbstractHeap;

public class AdvancedHeap<T> extends AbstractHeap<T> {

    public T peek(int index) {
        return list.get(index);
    }

}