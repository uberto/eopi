package com.gamasoft.eopi.cap15_BST;

import com.gamasoft.eopi.cap10_BTrees.BTree;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 19/11/16.
 */
public class FirstGreaterTest {

    static BTree<Integer> smallBST = BTree.intNode(5, BTree.intNode(3), BTree.intNode(9));
    static BTree<Integer> mediumBST = BTree.intNode(20, BTree.intNode(10, BTree.intNode(5, BTree.intNode(3), BTree.intNode(9)), BTree.intNode(15)), BTree.intNode(30, BTree.intNode(21), BTree.intNode(50, BTree.intNode(45), BTree.intNode(58))));

    @Test
    public void findInSmallBST() throws Exception {

       Assert.assertEquals(9, FirstGreater.find(smallBST, 6));

    }

    @Test
    public void findInMediumBST() throws Exception {

        Assert.assertEquals(15, FirstGreater.find(mediumBST, 10));
        Assert.assertEquals(5, FirstGreater.find(mediumBST, 3));
        Assert.assertEquals(10, FirstGreater.find(mediumBST, 9));
        Assert.assertEquals(30, FirstGreater.find(mediumBST, 21));
        Assert.assertEquals(58, FirstGreater.find(mediumBST, 51));
        Assert.assertEquals(45, FirstGreater.find(mediumBST, 31));

    }

}
