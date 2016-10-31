package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by uberto on 31/10/16.
 */
public class BitsTest {

    @Test
    public void countOnes() throws Exception {

        Assert.assertEquals(0, Bits.countOnes(0));
        Assert.assertEquals(1, Bits.countOnes(1));
        Assert.assertEquals(1, Bits.countOnes(2));
        Assert.assertEquals(2, Bits.countOnes(3));
        Assert.assertEquals(1, Bits.countOnes(4));
        Assert.assertEquals(1, Bits.countOnes(256));
        Assert.assertEquals(8, Bits.countOnes(255));


        int x = 0b1010101010;
        Assert.assertEquals(5, Bits.countOnes(x));



    }
}