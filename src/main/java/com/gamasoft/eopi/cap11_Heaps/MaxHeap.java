package com.gamasoft.eopi.cap11_Heaps;

import com.gamasoft.eopi.cap10_BTrees.BTree;

/**
 * Created by uberto on 10/11/16.
 */
public class MaxHeap<T extends Comparable> {

    private BTree<T> head = new BTree<>(null, null, null);;

    public void addAll(T[] array) {


        for (T e: array){
            add(head, e);
        }
    }

    private void add(BTree<T> n, T e) {

        BTree<T> newNode = new BTree<>(e, null, null);
        if(n.left == null){
            n.left = newNode;
        } else if(n.right == null){
            n.right = newNode;
        } else {
            if (n.left.value.compareTo(n.right.value) > 0 && (e.compareTo(n.left.value) > 0)) {
                newNode.right = n.left;
                n.left = newNode;
            } else if (n.right.value.compareTo(n.left.value) > 0 && (e.compareTo(n.right.value) > 0)) {
                newNode.left = n.right;
                n.right = newNode;
            } else if ((e.compareTo(n.right.value) < 0)) {
                add(n.right, e);
            } else {
                add(n.left, e);
            }
        }
    }

    public T pop() {
//        BTree<T> node = this.head;
//        if (node.left.value.compareTo(node.right.value) > 0){
//            node.
//        }
//
      return head.right.value;
    }
}
