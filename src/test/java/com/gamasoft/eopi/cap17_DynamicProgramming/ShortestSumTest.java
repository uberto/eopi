package com.gamasoft.eopi.cap17_DynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 20/11/16.
 */
public class ShortestSumTest {


    final private int[] seq = new int[]{2,6,1,7,5,3};

    @Test
    public void impossibleCase() throws Exception {

        Assert.assertEquals(0, ShortestSum.find(seq, 50));

    }

    @Test
    public void shortSol() throws Exception {

        Assert.assertEquals(2, ShortestSum.find(seq, 11));

    }

    @Test
    public void longSol() throws Exception {

        Assert.assertEquals(4, ShortestSum.find(seq, 16));

    }


}
