package com.gamasoft.eopi.cap10_BTrees;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 09/11/16.
 */

//10.4
public class FindLCATest {
    BTree<Integer> bigTree = BTree.intNode(1,
            BTree.intNode(21, BTree.intNode(31, BTree.intNode(41), BTree.intNode(42)), BTree.intNode(32, BTree.intNode(43), BTree.intNode(44))),
            BTree.intNode(22, BTree.intNode(33, BTree.intNode(45), BTree.intNode(46)), BTree.intNode(34, BTree.intNode(47), BTree.intNode(48))));


    @Test
    public void findLCA1() throws Exception {

        BTree<Integer> n = FindLCA.find(bigTree.left.right.left, bigTree.left.left.right);

        Assert.assertEquals(21, n.value.intValue());

    }


    @Test
    public void findLCA2() throws Exception {

        BTree<Integer> n = FindLCA.find(bigTree.left.right.left, bigTree.right);

        Assert.assertEquals(1, n.value.intValue());

    }


    @Test
    public void findLCA3() throws Exception {

        BTree<Integer> n = FindLCA.find(bigTree.left.left.left, bigTree.left.left.right);

        Assert.assertEquals(31, n.value.intValue());

    }
}