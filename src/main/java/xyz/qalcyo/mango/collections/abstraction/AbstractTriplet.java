package xyz.qalcyo.mango.collections.abstraction;

import xyz.qalcyo.mango.collections.Triplet;

public abstract class AbstractTriplet<L, M, R> implements Triplet<L, M, R> {

    protected L first;
    protected M second;
    protected R third;

    public AbstractTriplet(L first, M second, R third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public AbstractTriplet() {
        this(null, null, null);
    }

    public L left() {
        return first;
    }

    public M middle() {
        return second;
    }

    public R right() {
        return third;
    }

}
