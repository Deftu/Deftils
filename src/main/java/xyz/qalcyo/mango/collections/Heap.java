package xyz.qalcyo.mango.collections;

import java.util.List;

public interface Heap<T> extends Iterable<T> {

    /**
     * Adds a new element to this heap.
     *
     * @param element The element to be added.
     */
    void push(T element);

    default void populate(Heap<T> heap) {
        for (T t : heap) {
            push(t);
        }
    }

    default void populate(T[] elements) {
        for (T element : elements) {
            push(element);
        }
    }

    /**
     * Removes and returns the top of the stack.
     *
     * @return The top of the stack.
     * @throws java.util.NoSuchElementException If the stack is empty.
     */
    T pop();

    /**
     * Check if the stack has no content.
     *
     * @return Whether the stack is empty.
     */
    boolean isEmpty();

    /**
     * @return The size of this Heap.
     */
    int size();

    /**
     * Peeks at an element in the heap. (optional)
     *
     * @param index The index from the top of the stack, 0 represents the top.
     * @return The element with the index.
     * @throws UnsupportedOperationException If the Heap doesn't support peeking.
     * @throws IndexOutOfBoundsException If the index requested is more than the Heap size.
     */
    default T peek(int index) {
        throw new UnsupportedOperationException("This Heap does not support peeks!");
    }

    /**
     * @return The first element in this heap.
     */
    T first();

    List<? super T> asList();

}