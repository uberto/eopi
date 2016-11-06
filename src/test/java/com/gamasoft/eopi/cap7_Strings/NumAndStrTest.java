package com.gamasoft.eopi.cap7_Strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 06/11/16.
 */
public class NumAndStrTest {

    //7.1
    @Test
    public void intToStr() throws Exception {

        Assert.assertEquals("12345", NumAndStr.convert(12345));
        Assert.assertEquals("-5", NumAndStr.convert(-5));
        Assert.assertEquals("1234567890", NumAndStr.convert(1234567890));

    }

    @Test
    public void strToInt() throws Exception {

        Assert.assertEquals(12345, NumAndStr.convert("12345"));
        Assert.assertEquals(-5, NumAndStr.convert("-5"));
        Assert.assertEquals(1234567890, NumAndStr.convert("1234567890"));

    }




}
