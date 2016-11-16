package com.gamasoft.eopi.cap14_Sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 16/11/16.
 */
public class ArraysIntersectionTest {

    //14.1
    @Test
    public void intersectSmall() throws Exception {

        List<Integer> a1 = Arrays.asList(1, 2, 3);
        List<Integer> a2 = Arrays.asList(3, 4);

        Set<Integer> r = ArraysIntersection.find(a1, a2);

        Assert.assertArrayEquals(new Integer[]{3}, r.toArray());
    }

    @Test
    public void intersectBig() throws Exception {

        List<Integer> a1 = Arrays.asList(1,1,2,2,3,5,5,5,7,8,9);
        List<Integer> a2 = Arrays.asList(2,2,2,2,5,6,6,6,7,10);

        Set<Integer> r = ArraysIntersection.find(a1, a2);

        Assert.assertArrayEquals(new Integer[]{2,5,7}, r.toArray());
    }
}
