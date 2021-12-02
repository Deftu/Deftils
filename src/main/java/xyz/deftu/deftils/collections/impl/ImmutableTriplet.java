package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.collections.abstraction.AbstractTriplet;

public class ImmutableTriplet<X, Y, Z> extends AbstractTriplet<X, Y, Z> {

    public ImmutableTriplet(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

}
