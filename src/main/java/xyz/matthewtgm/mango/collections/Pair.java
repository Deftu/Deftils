package xyz.matthewtgm.mango.collections;

/**
 * Stores a pair of two types.
 *
 * @param <L> The type on the left side.
 * @param <R> The type on the right side.
 */
public interface Pair<L, R> {

    /**
     * @return The left element in this pair.
     */
    L left();

    /**
     * @return The right element in this pair.
     */
    R right();

    /**
     * Changes the left value of this pair. (optional)
     *
     * @param left The new value of this pair's left side.
     */
    default void left(L left) {
        throw new UnsupportedOperationException("Attempt to modify an immutable pair!");
    }

    /**
     * Changes the right value of this pair. (optional)
     *
     * @param right The new value of this pair's right side.
     */
    default void right(R right) {
        throw new UnsupportedOperationException("Attempt to modify an immutable pair!");
    }

    /**
     * @return The first element in this pair.
     */
    default L first() {
        return left();
    }

    /**
     * @return The second element in this pair.
     */
    default R second() {
        return right();
    }

    /**
     * Changes the first value of this pair. (optional)
     *
     * @param first The new value of this pair's first element.
     */
    default void first(L first) {
        left(first);
    }

    /**
     * Changes the second value of this pair. (optional)
     *
     * @param second The new value of this pair's second element.
     */
    default void second(R second) {
        right(second);
    }

    /**
     * @return The key element in this pair.
     */
    default L key() {
        return left();
    }

    /**
     * @return The value element in this pair.
     */
    default R value() {
        return right();
    }

    /**
     * Changes the key value of this pair. (optional)
     *
     * @param key The new value of this pair's key.
     */
    default void key(L key) {
        left(key);
    }

    /**
     * Changes the value element of this pair. (optional)
     *
     * @param value The new value of this pair's value element.
     */
    default void value(R value) {
        right(value);
    }

}