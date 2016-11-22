package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 30/10/16.
 */
public class IncrementingSequenceTest {

    @Test
    public void simpleSeq() throws Exception {

        List<Integer> seq = new ArrayList(Arrays.asList(1, 2, 3));

        List<Integer> r = IncrementingSequence.findLongestIncrementingSequence(seq);

        Assert.assertEquals(3, r.size());

    }

    @Test
    public void simpleSeq2() throws Exception {

        List<Integer> seq = new ArrayList(Arrays.asList(1, 2, 3, 2, 3, 5, 10, 9));

        List<Integer> r = IncrementingSequence.findLongestIncrementingSequence(seq);

        Assert.assertEquals(4, r.size());
        Assert.assertEquals(10, r.get(3).intValue());

    }


    @Test
    public void simpleSeq3() throws Exception {

        List<Integer> seq = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));

        List<Integer> r = IncrementingSequence.findLongestIncrementingSequence(seq);

        Assert.assertEquals(1, r.size());

    }


    @Test
    public void notContinuousSeq() throws Exception {

        List<Integer> seq = new ArrayList(Arrays.asList(1, 2, 5, 1, 3, 4, 2 ));

        int s = IncrementingSequence.findLongestNonContIncrementingSequence(seq);

        Assert.assertEquals(4, s);

    }


    @Test
    public void notContinuousSeq2() throws Exception {

        List<Integer> seq = new ArrayList(Arrays.asList(1, 2, 3, 4, 1, 2, 5 ));

        int s = IncrementingSequence.findLongestNonContIncrementingSequence(seq);

        Assert.assertEquals(5, s);

    }

}