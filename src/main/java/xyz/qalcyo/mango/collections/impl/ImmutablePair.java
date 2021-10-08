package xyz.qalcyo.mango.collections.impl;

import xyz.qalcyo.mango.collections.abstraction.AbstractPair;

public class ImmutablePair<L, R> extends AbstractPair<L, R> {

    public ImmutablePair(L left, R right) {
        super(left, right);
    }

}