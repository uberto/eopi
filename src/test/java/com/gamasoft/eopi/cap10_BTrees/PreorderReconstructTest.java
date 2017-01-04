package com.gamasoft.eopi.cap10_BTrees;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 04/01/17.
 */
//10.13
public class PreorderReconstructTest {

    @Test
    public void tinyTree() throws Exception {

        String out = "1,_,_";

        BTree<Integer> root = PreorderReconstruct.createTree(out);

        Assert.assertEquals(1, root.value.intValue());
        Assert.assertNull(root.left);
        Assert.assertNull(root.right);

    }


    @Test
    public void smallTree() throws Exception {

        String out = "1,2,_,_,3,_,_";

        BTree<Integer> root = PreorderReconstruct.createTree(out);

        Assert.assertEquals(1, root.value.intValue());
        Assert.assertEquals(2, root.left.value.intValue());
        Assert.assertEquals(3, root.right.value.intValue());
        Assert.assertNull(root.left.left);
        Assert.assertNull(root.right.right);

    }


    @Test
    public void bigTree() throws Exception {

        String out = "1,11,21,_,_,_,12,_,22,31,_,_,32,41,_,_,_";

        BTree<Integer> root = PreorderReconstruct.createTree(out);

        Assert.assertEquals(1, root.value.intValue());
        Assert.assertEquals(11, root.left.value.intValue());
        Assert.assertEquals(12, root.right.value.intValue());
        Assert.assertEquals(21, root.left.left.value.intValue());
        Assert.assertEquals(22, root.right.right.value.intValue());
        Assert.assertEquals(31, root.right.right.left.value.intValue());
        Assert.assertEquals(32, root.right.right.right.value.intValue());
        Assert.assertEquals(41, root.right.right.right.left.value.intValue());

    }
}
