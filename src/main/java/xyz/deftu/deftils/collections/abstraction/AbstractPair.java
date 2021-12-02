package xyz.deftu.deftils.collections.abstraction;

import xyz.deftu.deftils.collections.Pair;

public abstract class AbstractPair<L, R> implements Pair<L, R> {

    protected L left;
    protected R right;

    public AbstractPair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public AbstractPair() {
        this(null, null);
    }

    public L left() {
        return left;
    }

    public R right() {
        return right;
    }

}