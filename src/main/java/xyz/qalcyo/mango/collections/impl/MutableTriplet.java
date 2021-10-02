package xyz.qalcyo.mango.collections.impl;

import xyz.qalcyo.mango.collections.abstraction.AbstractTriplet;

public class MutableTriplet<X, Y, Z> extends AbstractTriplet<X, Y, Z> {

    public MutableTriplet(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public MutableTriplet() {
        super();
    }

    public void first(X first) {
        this.first = first;
    }

    public void second(Y second) {
        this.second = second;
    }

    public void third(Z third) {
        this.third = third;
    }
}
