package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.Heap;

import java.util.ArrayList;
import java.util.List;

public class SimpleHeap<T> implements Heap<T> {

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

    public T first() {
        return list.get(0);
    }
}