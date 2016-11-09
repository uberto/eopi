package com.gamasoft.eopi.cap10_BTrees;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 09/11/16.
 */
public class CheckBalanceTest {

    @Test
    public void checkBalance(){

        BTree<Integer> balancedT = BTree.intNode(5, BTree.intNode(3), BTree.intNode(7));


        Assert.assertEquals(2, CheckBalance.depth(balancedT));
        Assert.assertTrue(CheckBalance.check(balancedT));

    }


    @Test
    public void checkBalanceFalse(){

        BTree<Integer> balancedT = BTree.intNode(5, BTree.intNode(3, BTree.intNode(5, BTree.intNode(11), BTree.intNode(15)), BTree.intNode(8)), BTree.intNode(7));

        Assert.assertEquals(3, CheckBalance.depth(balancedT.left));
        Assert.assertEquals(1, CheckBalance.depth(balancedT.right));
        Assert.assertFalse(CheckBalance.check(balancedT));

    }


    @Test
    public void checkBalanceBigPerfect(){

        BTree<Integer> balancedT = BTree.intNode(1,
                BTree.intNode(2, BTree.intNode(3, BTree.intNode(4), BTree.intNode(4)), BTree.intNode(3, BTree.intNode(4), BTree.intNode(4))),
                BTree.intNode(21, BTree.intNode(31, BTree.intNode(41), BTree.intNode(41)), BTree.intNode(31, BTree.intNode(41), BTree.intNode(41))));

        Assert.assertEquals(4, CheckBalance.depth(balancedT));
        Assert.assertTrue(CheckBalance.check(balancedT));

    }


    @Test
    public void checkBalanceBigTrue(){

        BTree<Integer> balancedT = BTree.intNode(1,
                BTree.intNode(2, BTree.intNode(3), BTree.intNode(3, null, BTree.intNode(4))),
                BTree.intNode(21, BTree.intNode(31, BTree.intNode(41), BTree.intNode(41)), BTree.intNode(31, null, BTree.intNode(41))));

        Assert.assertEquals(4, CheckBalance.depth(balancedT));
        Assert.assertTrue(CheckBalance.check(balancedT));

    }


    @Test
    public void checkBalanceBigFalse(){

        BTree<Integer> balancedT = BTree.intNode(1,
                BTree.intNode(2, BTree.intNode(3), BTree.intNode(3)),
                BTree.intNode(21, BTree.intNode(31, BTree.intNode(41, BTree.intNode(51), null), BTree.intNode(41)), BTree.intNode(31, null, BTree.intNode(41))));

        Assert.assertEquals(2, CheckBalance.depth(balancedT.left));
        Assert.assertEquals(4, CheckBalance.depth(balancedT.right));
        Assert.assertFalse(CheckBalance.check(balancedT));

    }

}
