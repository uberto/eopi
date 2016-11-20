package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.IncrementingSequence;
import com.gamasoft.eopi.cap10_BTrees.BTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uberto on 20/11/16.
 */
public class FindGreatestElements {
    public static List<Integer> find(BTree<Integer> tree, int numElements) {

        ArrayList<Integer> res = new ArrayList<>();

        findAndFill(tree, numElements, res);

        return res;
    }

    private static void findAndFill(BTree<Integer> tree, int numElements, List<Integer> list) {
        if (tree == null || list.size() == numElements)
            return;

        findAndFill(tree.right, numElements, list);
        if (list.size() == numElements)
            return;

        list.add(tree.value);
        findAndFill(tree.left, numElements, list);

    }
}
