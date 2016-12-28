package com.gamasoft.eopi.cap7_Strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 28/12/16.
 */
//7.8 modified
public class CountAndSayTest {

    @Test
    public void one() throws Exception {
        Assert.assertEquals("1", CountAndSay.number(1));
    }

    @Test
    public void two() throws Exception {
        Assert.assertEquals("11", CountAndSay.number(2));
    }

    @Test
    public void three() throws Exception {
        Assert.assertEquals("21", CountAndSay.number(3));
    }

    @Test
    public void four() throws Exception {
        Assert.assertEquals("1112", CountAndSay.number(4));
    }

    @Test
    public void five() throws Exception {
        Assert.assertEquals("3112", CountAndSay.number(5));
    }

    @Test
    public void six() throws Exception {
        Assert.assertEquals("211213", CountAndSay.number(6));
    }

    @Test
    public void seven() throws Exception {
        Assert.assertEquals("312213", CountAndSay.number(7));
    }

    @Test
    public void eight() throws Exception {
        Assert.assertEquals("212223", CountAndSay.number(8));
    }

    @Test
    public void nine() throws Exception {
        Assert.assertEquals("114213", CountAndSay.number(9));
    }

    @Test
    public void ten() throws Exception {
        Assert.assertEquals("31121314", CountAndSay.number(10));
    }

    @Test
    public void twelve() throws Exception {
        Assert.assertEquals("31221324", CountAndSay.number(12));
    }

    @Test
    public void thirteen() throws Exception {
        Assert.assertEquals("21322314", CountAndSay.number(13));
    }

    @Test
    public void twenty() throws Exception {
        Assert.assertEquals("21322314", CountAndSay.number(20));
    }

}
