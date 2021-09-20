package xyz.qalcyo.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.qalcyo.mango.collections.Heap;
import xyz.qalcyo.mango.collections.impl.AdvancedHeap;
import xyz.qalcyo.mango.collections.impl.SimpleHeap;

public class HeapTest {

    @Test
    @DisplayName("Test of SimpleHeaps")
    public void simple() {
        Heap<String> heap = new SimpleHeap<>();
        heap.push("hello");
        heap.push("world!");

        for (String part : heap) {
            System.out.println("For: " + part);
        }

        System.out.println("First: " + heap.first());
        System.out.println("isEmpty: " + heap.isEmpty());
        System.out.println("Pop: " + heap.pop());
        System.out.println("Pop 2: " + heap.pop());
        System.out.println("isEmpty 2: " + heap.isEmpty());
    }

    @Test
    public void advanced() {
        Heap<String> heap = new AdvancedHeap<>();
        heap.push("hello");
        heap.push("world!");

        for (String part : heap) {
            System.out.println("For: " + part);
        }

        System.out.println("First: " + heap.first());
        System.out.println("isEmpty: " + heap.isEmpty());
        System.out.println("Peeked: " + heap.peek(1));
        System.out.println("Pop: " + heap.pop());
        System.out.println("Pop 2: " + heap.pop());
        System.out.println("isEmpty 2: " + heap.isEmpty());
    }

}