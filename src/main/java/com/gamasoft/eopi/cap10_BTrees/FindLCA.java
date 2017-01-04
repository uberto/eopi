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

        int ld = findDepth(left);
        int rd = findDepth(right);

        BTree<T> currLeft = left;
        BTree<T> currRight = right;

        if (ld > rd){
            currLeft = goUp(currLeft, ld - rd);
        }else if (rd > ld){
            currRight = goUp(currRight, rd - ld);
        }

        while (currLeft != currRight){
            currLeft = currLeft.parent;
            currRight = currRight.parent;
        }
        return currLeft;
    }

    private static <T> BTree<T> goUp(BTree<T> node, int count) {
        for (int i = 0; i < count; i++) {
            node = node.parent;
        }
        return node;
    }

    private static int findDepth(BTree node) {
        int res = 0;
        while (node.parent != null){
            res++;
            node = node.parent;
        }
        return res;
    }


}
