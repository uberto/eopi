package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 24/11/16.
 */

// 17.2
public class LevenshteinDistanceTest {


    @Test
    public void zeroStep() throws Exception {
        Assert.assertEquals(0, LevenshteinDistance.measure("abcde", "abcde"));
    }

    @Test
    public void oneStep() throws Exception {
        Assert.assertEquals(1, LevenshteinDistance.measure("aaa", "aa"));
        Assert.assertEquals(1, LevenshteinDistance.measure("aaa", "aba"));
        Assert.assertEquals(1, LevenshteinDistance.measure("a", "ab"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abde"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abcfde"));
        Assert.assertEquals(1, LevenshteinDistance.measure("abcde", "abfde"));

    }

    @Test
    public void twoSteps() throws Exception {

        Assert.assertEquals(2, LevenshteinDistance.measure("a", "bb"));
        Assert.assertEquals(2, LevenshteinDistance.measure("aaa", "a"));
        Assert.assertEquals(2, LevenshteinDistance.measure("aa", "bb"));
        Assert.assertEquals(2, LevenshteinDistance.measure("ab", "ba"));
        Assert.assertEquals(2, LevenshteinDistance.measure("abcde", "abdce"));
        Assert.assertEquals(2, LevenshteinDistance.measure("abcde", "bcdef"));
    }


    @Test
    public void daysOfTheWeek() throws Exception {

        Assert.assertEquals(2, LevenshteinDistance.measure("sunday", "monday"));
        Assert.assertEquals(3, LevenshteinDistance.measure("saturday", "sunday"));
        Assert.assertEquals(5, LevenshteinDistance.measure("friday", "saturday"));
        Assert.assertEquals(6, LevenshteinDistance.measure("friday", "yadirf"));

    }



    @Test
    public void twelveSteps() throws Exception {

        Assert.assertEquals(12, LevenshteinDistance.measure(
                "distancestring", "measuresimilar"));

    }
}
