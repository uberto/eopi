package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.cap10_BTrees.BTree;

/**
 * Created by uberto on 19/11/16.
 */
public class FirstGreater {
    public static int find(BTree<Integer> tree, int greaterThan) {


        return findFirstGreater(tree, greaterThan, Integer.MAX_VALUE);

    }

    private static int findFirstGreater(BTree<Integer> tree, int greaterThan, int currMin) {

        if (tree == null)
            return currMin;

        if (tree.value > greaterThan){
            return findFirstGreater(tree.left, greaterThan, Math.min(currMin, tree.value));
        } else {
            return findFirstGreater(tree.right, greaterThan, currMin);
        }


    }
}
