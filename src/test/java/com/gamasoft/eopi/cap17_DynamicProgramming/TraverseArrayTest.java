package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 25/11/16.
 */
public class TraverseArrayTest {

    @Test
    public void oneStep() throws Exception {

        Assert.assertEquals(1, TraverseArray.count(4,0));
        Assert.assertEquals(1, TraverseArray.count(0,10));

    }

    @Test
    public void twoSteps() throws Exception {

        Assert.assertEquals(2, TraverseArray.count(1,1));

    }

    @Test
    public void threeSteps() throws Exception {

        Assert.assertEquals(3, TraverseArray.count(2,1));
        Assert.assertEquals(3, TraverseArray.count(1,2));

    }


    @Test
    public void manySteps() throws Exception {

        Assert.assertEquals(6, TraverseArray.count(2,2));
        Assert.assertEquals(70, TraverseArray.count(4,4));

    }
}
