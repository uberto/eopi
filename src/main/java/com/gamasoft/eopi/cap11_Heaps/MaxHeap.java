package com.gamasoft.eopi.cap11_Heaps;

import com.gamasoft.eopi.cap10_BTrees.BTree;

/**
 * Created by uberto on 10/11/16.
 *
 *
 *
 *
 */
public class MaxHeap<T extends Comparable> {

    private BTree<T> head = null;

    /*
    push 1..5

    1

    2
    1

    3
    2 1

    4
    3  2
    1

    5
    4  3
    2  1
     */

    public void addAll(T[] array) {

        for (T e: array){
            BTree<T> newNode = new BTree<>(e, null, null);
            if (head == null)
                head = new BTree<>(e, null, null);
            else if (bigger(newNode, head)){
                newNode.left = head;
                newNode.right = head.left;
                head.left = head.right;
                head.right = null;
                head = newNode;
            } else
                add(head, newNode);
        }
    }

    private void add(BTree<T> n, BTree<T> newNode) {

        if(n.left == null){
            n.left = newNode;
        } else if(n.right == null){
            n.right = newNode;
        } else {
            if (bigger(newNode, n.left)) {
                newNode.left = n.left;
                newNode.right = n.left.left;
                n.left.left = null;
                n.left = newNode;
            } else if (bigger(newNode, n.right)) {
                newNode.left = n.right;
                newNode.right = n.right.left;
                n.right.left = null;
                n.right = newNode;
            } else if (bigger(n.right, n.left)) {
                add(n.right, newNode);
            } else {
                add(n.left, newNode);
            }
        }
    }

    private boolean bigger(BTree<T> left, BTree<T> right) {
        if (left == null)
            return false;
        if (right == null)
            return true;

        return left.value.compareTo(right.value) > 0;
    }

    public T pop() {
        BTree<T> res = head;
        head = popFrom(head);
        return res.value;
    }

    private BTree<T> popFrom(BTree<T> node) {
        if (node == null)
            return null;
        BTree<T> res;
        if (bigger(node.left, node.right)) {
            res = node.left;
            if (res != null) {
                res.right = popFrom(node.left);
                res.left = node.right;
            }

        }else {
            res = node.right;
            if (res != null){
                res.right = popFrom(node.right);
                res.left = node.left;
            }
        }

        return res;
    }

    public T peekMax() {
        if (head != null)
            return head.value;
        else
            return null;
    }
}


/*

15
7     10
4 3   9 8

pop

10
7    9
4 3  8

push 5
10
7    9
5 3  8
4

push 16
16
7    10
5 3  9 8
4


 */