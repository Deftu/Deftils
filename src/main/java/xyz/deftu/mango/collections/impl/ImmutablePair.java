package xyz.deftu.mango.collections.impl;

import xyz.deftu.mango.collections.abstraction.AbstractPair;

public class ImmutablePair<L, R> extends AbstractPair<L, R> {

    public ImmutablePair(L left, R right) {
        super(left, right);
    }

}