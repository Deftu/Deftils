package xyz.matthewtgm.mango.collections;

public interface Heap<T> {

    /**
     * Adds a new element to this heap.
     *
     * @param element The element to be added.
     */
    void push(T element);

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

    default T first() {
        return peek(0);
    }

}