package com.gamasoft.eopi.cap10_BTrees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by uberto on 09/11/16.
 */
public class FindLCA {
    public static <T> BTree<T> find(BTree<T> left, BTree<T> right) {

        Deque<BTree<T>> pLeft= parents(left);
        Deque<BTree<T>> pRight= parents(right);

        BTree<T> res = null;
        while(pLeft.peekLast() == pRight.peekLast()){
            res = pLeft.removeLast();
            pRight.removeLast();
        }

        return res;
    }

    private static <T> Deque<BTree<T>> parents(BTree<T> node) {
        Deque<BTree<T>> res = new LinkedList<>();
        while (node != null){
            res.add(node);
            node = node.parent;
        }
        return res;
    }
}
