package com.gamasoft.eopi.cap11_Heaps;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by uberto on 10/11/16.
 */
public class SortArrayTest {

    //11.1 (modified)

    @Test
    public void sort() throws Exception {

        Integer[] a = new Integer[]{1, 16, 19, 10};

        MaxHeap<Integer> heap = new MaxHeap<>();

        heap.addAll(a);

        Assert.assertEquals(19, heap.pop().intValue());
//        Assert.assertEquals(16, heap.pop().intValue());
//        Assert.assertEquals(10, heap.pop().intValue());
//        Assert.assertEquals(1, heap.pop().intValue());


    }
}
