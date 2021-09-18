package xyz.qalcyo.mango.collections.impl;

import xyz.qalcyo.mango.collections.abstraction.AbstractPair;

public class MutablePair<L, R> extends AbstractPair<L, R> {

    public void left(L left) {
        this.left = left;
    }

    public void right(R right) {
        this.right = right;
    }

}