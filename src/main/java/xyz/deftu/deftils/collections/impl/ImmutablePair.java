package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.collections.abstraction.AbstractPair;

public class ImmutablePair<L, R> extends AbstractPair<L, R> {

    public ImmutablePair(L left, R right) {
        super(left, right);
    }

}