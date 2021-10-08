package xyz.qalcyo.mango.collections;

import xyz.qalcyo.mango.collections.impl.MutableTriplet;

public interface Triplet<L, M, R> {

    default boolean isMutable() {
        return this instanceof MutableTriplet;
    }

    default boolean isImmutable() {
        return !isMutable();
    }

    /**
     * @return The left element in this triplet.
     */
    L left();

    /**
     * @return The middle element in this triplet.
     */
    M middle();

    /**
     * @return The right element in this triplet.
     */
    R right();

    /**
     * Sets the left element in this triplet.
     *
     * @param left The new value of the left element.
     */
    default void left(L left) {
        throw new UnsupportedOperationException("Attempt to modify an immutable triplet!");
    }

    /**
     * Sets the middle element in this triplet.
     *
     * @param middle The new value of the middle element.
     */
    default void middle(M middle) {
        throw new UnsupportedOperationException("Attempt to modify an immutable triplet!");
    }

    /**
     * Sets the right element in this triplet.
     *
     * @param right The new value of the right element.
     */
    default void right(R right) {
        throw new UnsupportedOperationException("Attempt to modify an immutable triplet!");
    }

    /**
     * @return The first element in this triplet.
     */
    default L first() {
        return left();
    }

    /**
     * @return The second element in this triplet.
     */
    default M second() {
        return middle();
    }

    /**
     * @return The third element in this triplet.
     */
    default R third() {
        return right();
    }

    /**
     * Sets the first element in this triplet.
     *
     * @param first The new value of the first element.
     */
    default void first(L first) {
        left(first);
    }

    /**
     * Sets the second element in this triplet.
     *
     * @param second The new value of the second element.
     */
    default void second(M second) {
        middle(second);
    }
    /**
     * Sets the third element in this triplet.
     *
     * @param third The new value of the third element.
     */
    default void third(R third) {
        right(third);
    }

}