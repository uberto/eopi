package com.gamasoft.eopi.cap15_BST;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 17/11/16.
 */

//15.1
public class VerifyBSTTest {

    @Test
    public void verifyNodeOrder() {

        Assert.assertTrue(VerifyBST.verify(Samples.smallBST));
    }

    @Test
    public void verifyFalseNodeOrder() {

        Assert.assertFalse(VerifyBST.verify(Samples.smallWrongBST));
    }
}