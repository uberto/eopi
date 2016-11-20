package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.cap10_BTrees.BTree;

/**
 * Created by uberto on 19/11/16.
 */
public class Samples {

    static BTree<Integer> tinyBST = BTree.intNode(5, BTree.intNode(3), BTree.intNode(9));
    static BTree<Integer> smallBST = BTree.intNode(5, BTree.intNode(3, BTree.intNode(2), BTree.intNode(4)), BTree.intNode(7, BTree.intNode(6), BTree.intNode(8)));
    static BTree<Integer> smallWrongBST = BTree.intNode(5, BTree.intNode(3, BTree.intNode(2), BTree.intNode(6)), BTree.intNode(7, BTree.intNode(6), BTree.intNode(8)));
    static BTree<Integer> mediumBST = BTree.intNode(20, BTree.intNode(10, BTree.intNode(5, BTree.intNode(3), BTree.intNode(9)), BTree.intNode(15)), BTree.intNode(30, BTree.intNode(21), BTree.intNode(50, BTree.intNode(45), BTree.intNode(58))));

}
