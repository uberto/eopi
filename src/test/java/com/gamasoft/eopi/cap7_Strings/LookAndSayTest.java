package com.gamasoft.eopi.cap7_Strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 28/12/16.
 */
public class LookAndSayTest {

    @Test
    public void one() throws Exception {
        Assert.assertEquals("1", LookAndSay.number(1));
    }

    @Test
    public void two() throws Exception {
        Assert.assertEquals("11", LookAndSay.number(2));
    }

    @Test
    public void three() throws Exception {
        Assert.assertEquals("21", LookAndSay.number(3));
    }

    @Test
    public void four() throws Exception {
        Assert.assertEquals("1211", LookAndSay.number(4));
    }

    @Test
    public void five() throws Exception {
        Assert.assertEquals("111221", LookAndSay.number(5));
    }

    @Test
    public void six() throws Exception {
        Assert.assertEquals("312211", LookAndSay.number(6));
    }

    @Test
    public void seven() throws Exception {
        Assert.assertEquals("13112221", LookAndSay.number(7));
    }

    @Test
    public void eight() throws Exception {
        Assert.assertEquals("1113213211", LookAndSay.number(8));
    }

    @Test
    public void nine() throws Exception {
        Assert.assertEquals("31131211131221", LookAndSay.number(9));
    }

    @Test
    public void ten() throws Exception {
        Assert.assertEquals("13211311123113112211", LookAndSay.number(10));
    }

}
