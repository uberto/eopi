package com.gamasoft.eopi.cap18_Greedy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by uberto on 11/12/16.
 */
public class ThreeSumTest {

    @Test
    public void minimumSet() throws Exception {
        Set<Integer> s = new HashSet<>(Arrays.asList(1,2,3));

        Assert.assertFalse(ThreeSum.exists(s, 10));
        Assert.assertTrue(ThreeSum.exists(s, 9));
        Assert.assertTrue(ThreeSum.exists(s, 8));
        Assert.assertTrue(ThreeSum.exists(s, 7));
        Assert.assertTrue(ThreeSum.exists(s, 6));
        Assert.assertTrue(ThreeSum.exists(s, 5));
        Assert.assertTrue(ThreeSum.exists(s, 4));
        Assert.assertTrue(ThreeSum.exists(s, 3));
        Assert.assertFalse(ThreeSum.exists(s, 2));

    }



    @Test
    public void biggerSet() throws Exception {
        Set<Integer> s = new HashSet<>(Arrays.asList(2,3,8,21,55));

        Assert.assertFalse(ThreeSum.exists(s, 100));
        Assert.assertTrue(ThreeSum.exists(s, 97));
        Assert.assertTrue(ThreeSum.exists(s, 13));
        Assert.assertTrue(ThreeSum.exists(s, 79));
        Assert.assertTrue(ThreeSum.exists(s, 26));
        Assert.assertTrue(ThreeSum.exists(s, 65));
        Assert.assertFalse(ThreeSum.exists(s, 5));

    }
}
