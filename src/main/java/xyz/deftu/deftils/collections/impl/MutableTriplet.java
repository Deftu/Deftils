package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.collections.abstraction.AbstractTriplet;

public class MutableTriplet<X, Y, Z> extends AbstractTriplet<X, Y, Z> {

    public MutableTriplet(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public MutableTriplet() {
        super();
    }

    public void left(X first) {
        this.first = first;
    }

    public void middle(Y second) {
        this.second = second;
    }

    public void right(Z third) {
        this.third = third;
    }

}
