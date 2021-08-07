package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.Heap;

import java.util.ArrayList;
import java.util.List;

public class AdvancedHeap<T> implements Heap<T> {

    private final List<T> list = new ArrayList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public T peek(int index) {
        return list.get(index);
    }

}