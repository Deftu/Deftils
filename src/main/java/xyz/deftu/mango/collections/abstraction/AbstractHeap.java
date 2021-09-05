package xyz.deftu.mango.collections.abstraction;

import org.jetbrains.annotations.NotNull;
import xyz.deftu.mango.collections.Heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractHeap<T> implements Heap<T> {

    protected final List<T> list = new ArrayList<>();

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

    @NotNull
    public Iterator<T> iterator() {
        return list.iterator();
    }

}