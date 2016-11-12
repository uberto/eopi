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
    public void sortAFew() throws Exception {

        Integer[] a = new Integer[]{1, 2, 3, 4, 5};

        MaxHeap<Integer> heap = new MaxHeap<>();

        heap.addAll(a);

        Assert.assertEquals(5, heap.peekMax().intValue());

        Assert.assertEquals(5, heap.pop().intValue());
        Assert.assertEquals(4, heap.pop().intValue());
        Assert.assertEquals(3, heap.pop().intValue());
        Assert.assertEquals(2, heap.pop().intValue());
        Assert.assertEquals(1, heap.pop().intValue());

    }


    @Test
    public void sortAFewOrdered() throws Exception {

        Integer[] a = new Integer[]{5, 4, 3, 2, 1};

        MaxHeap<Integer> heap = new MaxHeap<>();

        heap.addAll(a);

        Assert.assertEquals(5, heap.peekMax().intValue());
        Assert.assertEquals(5, heap.pop().intValue());
        Assert.assertEquals(4, heap.pop().intValue());
        Assert.assertEquals(3, heap.pop().intValue());
        Assert.assertEquals(2, heap.pop().intValue());
        Assert.assertEquals(1, heap.pop().intValue());

    }


    @Test
    public void sortMany() throws Exception {

        Integer[] a = new Integer[]{1, 8, 6, 10, 5, 7, 4, 2, 3, 9};

        MaxHeap<Integer> heap = new MaxHeap<>();

        heap.addAll(a);

        Assert.assertEquals(10, heap.peekMax().intValue());
        Assert.assertEquals(10, heap.pop().intValue());
        Assert.assertEquals(9, heap.pop().intValue());
        Assert.assertEquals(8, heap.pop().intValue());
        Assert.assertEquals(7, heap.pop().intValue());
        Assert.assertEquals(6, heap.pop().intValue());
        Assert.assertEquals(5, heap.pop().intValue());
        Assert.assertEquals(4, heap.pop().intValue());
        Assert.assertEquals(3, heap.pop().intValue());
        Assert.assertEquals(2, heap.pop().intValue());
        Assert.assertEquals(1, heap.pop().intValue());

    }
}
