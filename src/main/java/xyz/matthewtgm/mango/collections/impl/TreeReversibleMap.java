package xyz.matthewtgm.mango.collections.impl;

import xyz.matthewtgm.mango.collections.ReversibleMap;
import xyz.matthewtgm.mango.exceptions.UnfinishedApiException;

import java.util.TreeMap;

public class TreeReversibleMap<K, V> extends TreeMap<K, V> implements ReversibleMap<K, V> {

    public ReversibleMap<K, V> reverse() {
        throw new UnfinishedApiException("Reverse method is yet to be finished!");
    }

}