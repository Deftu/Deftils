package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.abstraction.AbstractPair;

public class ImmutablePair<L, R> extends AbstractPair<L, R> {

    public ImmutablePair(L left, R right) {
        super(left, right);
    }

}