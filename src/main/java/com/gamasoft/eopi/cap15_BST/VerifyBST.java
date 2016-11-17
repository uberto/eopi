package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.cap10_BTrees.BTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uberto on 17/11/16.
 */
public class VerifyBST {
    public static boolean verify(BTree<Integer> tree) {

        List<Integer> list = new ArrayList<>();
        visitTree(tree, list);

        return isSorted(list);

    }

    private static boolean isSorted(List<Integer> list) {
        int pe = Integer.MIN_VALUE;
        for(int e: list){
            if (e < pe)
                return false;
            pe = e;
        }
        return true;
    }

    private static void visitTree(BTree<Integer> tree, List<Integer> values) {
        if (tree == null)
            return;
        visitTree(tree.left, values);
        values.add(tree.value);
        visitTree(tree.right, values);
    }

}
