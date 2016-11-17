package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.cap10_BTrees.BTree;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 17/11/16.
 */

//15.1
public class VerifyBSTTest {

    BTree<Integer> smallBST = BTree.intNode(5, BTree.intNode(3, BTree.intNode(2), BTree.intNode(4)), BTree.intNode(7, BTree.intNode(6), BTree.intNode(8)));

    BTree<Integer> smallWrongBST = BTree.intNode(5, BTree.intNode(3, BTree.intNode(2), BTree.intNode(6)), BTree.intNode(7, BTree.intNode(6), BTree.intNode(8)));

    @Test
    public void verifyNodeOrder() {

        Assert.assertTrue(VerifyBST.verify(smallBST));
    }
}