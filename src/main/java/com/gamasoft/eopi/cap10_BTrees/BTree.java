package com.gamasoft.eopi.cap10_BTrees;

/**
 * Created by uberto on 09/11/16.
 */
public class BTree<T> {
    public final T value;
    public final BTree<T> left;
    public final BTree<T> right;

    public BTree(T value, BTree<T> left, BTree<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static BTree<Integer> intNode(int value) {
        return new BTree<>(value, null, null);
    }

    public static BTree<Integer> intNode(int value, BTree<Integer> left, BTree<Integer> right) {
        return new BTree<>(value, left, right);
    }
}
