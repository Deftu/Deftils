package xyz.qalcyo.mango.collections.impl;

import xyz.qalcyo.mango.collections.abstraction.AbstractTriplet;

public class ImmutableTriplet<X, Y, Z> extends AbstractTriplet<X, Y, Z> {

    public ImmutableTriplet(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "[" + first + ", " + second + ", " + third + "]";
    }

}
