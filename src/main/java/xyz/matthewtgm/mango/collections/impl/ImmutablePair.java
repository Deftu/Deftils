package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.Pair;

public class ImmutablePair<L, R> implements Pair<L, R> {

    private final L left;
    private final R right;

    public ImmutablePair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L left() {
        return left;
    }

    public R right() {
        return right;
    }

}