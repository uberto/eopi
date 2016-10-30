package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
}