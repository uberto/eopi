package com.gamasoft.eopi.cap14_Sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 16/11/16.
 */
public class ArraysMergeTest {

    //14.2
    @Test
    public void mergeArraysSmall() throws Exception {


        Integer[] a1 = new Integer[]{1, 2, 5, null, null};
        Integer[] a2 = new Integer[]{3, 4};

        ArraysMerge.merge(a1, a2);

        Assert.assertArrayEquals(new Integer[]{1,2,3,4,5}, a1);
    }


    @Test
    public void mergeArraysLong() throws Exception {


        Integer[] a1 = new Integer[]{1, 2, 5, 7, 8, null, null, null, null, null};
        Integer[] a2 = new Integer[]{3, 4, 6, 9};

        ArraysMerge.merge(a1, a2);

        Assert.assertArrayEquals(new Integer[]{1,2,3,4,5,6,7,8,9,null}, a1);
    }
}
