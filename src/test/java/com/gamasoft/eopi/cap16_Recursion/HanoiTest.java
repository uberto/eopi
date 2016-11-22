package com.gamasoft.eopi.cap16_Recursion;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 20/11/16.
 */

//16.1

public class HanoiTest {

    @Test
    public void two() throws Exception {

        Assert.assertEquals("ab,ac,bc,", Hanoi.generate(2));
    }

    @Test
    public void one() throws Exception {

        Assert.assertEquals("ac,", Hanoi.generate(1));
    }

    @Test
    public void three() throws Exception {

        Assert.assertEquals("ac,ab,cb,ac,ba,bc,ac,", Hanoi.generate(3));
    }
}
