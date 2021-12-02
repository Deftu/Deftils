package xyz.deftu.deftils.collections.impl;

import xyz.deftu.deftils.collections.abstraction.AbstractPair;

public class MutablePair<L, R> extends AbstractPair<L, R> {

    public MutablePair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public MutablePair() {
        super();
    }

    public void left(L left) {
        this.left = left;
    }

    public void right(R right) {
        this.right = right;
    }

}