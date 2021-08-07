package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.Pair;

public class MutablePair<L, R> implements Pair<L, R> {

    private L left;
    private R right;

    public MutablePair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public MutablePair() {
        this(null, null);
    }

    public L left() {
        return left;
    }

    public R right() {
        return right;
    }

    public void left(L left) {
        this.left = left;
    }

    public void right(R right) {
        this.right = right;
    }

}