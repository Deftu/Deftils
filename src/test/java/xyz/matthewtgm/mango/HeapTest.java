package xyz.matthewtgm.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.matthewtgm.mango.collections.Heap;
import xyz.matthewtgm.mango.collections.impl.AdvancedHeap;
import xyz.matthewtgm.mango.collections.impl.SimpleHeap;

public class HeapTest {

    @Test
    @DisplayName("Test of SimpleHeaps")
    public void simple() {
        Heap<String> heap = new SimpleHeap<>();
        heap.push("hello");
        heap.push("world!");
        System.out.println(heap.first());
        System.out.println(heap.isEmpty());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.isEmpty());
    }

    @Test
    @DisplayName("Test of AdvancedHeaps")
    public void advanced() {
        Heap<String> heap = new AdvancedHeap<>();
        heap.push("hello");
        heap.push("world!");
        System.out.println(heap.first());
        System.out.println(heap.isEmpty());
        System.out.println(heap.peek(1));
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.isEmpty());
    }

}