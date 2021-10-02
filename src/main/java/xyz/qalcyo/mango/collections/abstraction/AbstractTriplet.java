package xyz.qalcyo.mango.collections.abstraction;

/**
 * An abstract class for triplet values
 * Triplets are useful for things like:
 * Coordinates, colours, etcetera.
 * @param <X>
 * @param <Y>
 * @param <Z>
 */
public abstract class AbstractTriplet<X, Y, Z> {

    protected X first;
    protected Y second;
    protected Z third;

    public AbstractTriplet(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public AbstractTriplet() {
        this(null, null, null);
    }

    public X first() {
        return first;
    }

    public Y second() {
        return second;
    }

    public Z third() {
        return third;
    }

}
