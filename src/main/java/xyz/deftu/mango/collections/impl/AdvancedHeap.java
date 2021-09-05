package xyz.deftu.mango.collections.impl;

import xyz.deftu.mango.collections.abstraction.AbstractHeap;

public class AdvancedHeap<T> extends AbstractHeap<T> {

    public T peek(int index) {
        return list.get(index);
    }

}