package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.collections.abstraction.AbstractHeap;

public class AdvancedHeap<T> extends AbstractHeap<T> {
    public T peek(int index) {
        return list.get(index);
    }
}