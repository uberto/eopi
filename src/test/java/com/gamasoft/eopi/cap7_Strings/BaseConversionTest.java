package com.gamasoft.eopi.cap7_Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 06/11/16.
 */
public class BaseConversionTest {


    //7.2

    @Test
    public void convertBase() throws Exception {

        Assert.assertEquals("6", ConvertBase.convert("110", 2, 10));
        Assert.assertEquals("10", ConvertBase.convert("111", 2, 7));
        Assert.assertEquals("101", ConvertBase.convert("5", 10, 2));

    }
}
