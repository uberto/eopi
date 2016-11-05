package com.gamasoft.eopi.cap5_Primitive_Types;

import junit.framework.Assert;
import org.junit.Test;

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


    //5.1
    @Test()
    public void parityCheck(){
        Assert.assertEquals(0, Bits.parity(0));
        Assert.assertEquals(0, Bits.parity(3));
        Assert.assertEquals(0, Bits.parity(257));
        Assert.assertEquals(1, Bits.parity(1));
        Assert.assertEquals(1, Bits.parity(2));
        Assert.assertEquals(1, Bits.parity(2048));
        Assert.assertEquals(1, Bits.parity(2051));
    }


    //5.7
    @Test
    public void power(){
        Assert.assertEquals(1.0, Bits.power(1, 5));
        Assert.assertEquals(1.0, Bits.power(7, 0));
        Assert.assertEquals(7.0, Bits.power(7, 1));
        Assert.assertEquals(49.0, Bits.power(7, 2));
        Assert.assertEquals(625.0, Bits.power(5, 4));
        Assert.assertEquals(4096.0, Bits.power(2, 12));
        Assert.assertEquals(0.25, Bits.power(0.5, 2));
        Assert.assertEquals(2.86788021686345E10, Bits.power(123.456, 5));
        Assert.assertEquals(4294967296.0, Bits.power(2, 32));
        Assert.assertEquals(1.8446744073709552E19, Bits.power(2, 64));

    }
}