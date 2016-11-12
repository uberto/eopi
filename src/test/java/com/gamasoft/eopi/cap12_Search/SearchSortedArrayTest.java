package com.gamasoft.eopi.cap12_Search;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 12/11/16.
 */
public class SearchSortedArrayTest {

    @Test
    public void searchMiniArray(){
        int[] a = new int[]{1,2,3};

        int r = SortedArray.searchFirst(a, 2);

        Assert.assertEquals(1, r);
    }

    @Test
    public void searchRepeatedArray(){
        int[] a = new int[]{1,1,1,2,2,2,2,2,3,3};

        Assert.assertEquals(0, SortedArray.searchFirst(a, 1));
        Assert.assertEquals(3, SortedArray.searchFirst(a, 2));
        Assert.assertEquals(8, SortedArray.searchFirst(a, 3));

    }

    @Test
    public void searchBigArray(){
        int[] a = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            a[i] = i / 10;
        }

        long start = System.nanoTime();
        Assert.assertEquals(0, SortedArray.searchFirst(a, 0));
        Assert.assertEquals(7654320, SortedArray.searchFirst(a, 765432));
        Assert.assertEquals(9999990, SortedArray.searchFirst(a, 999999));
        long elapsed = System.nanoTime() - start;

        System.out.println("elapsed microsec. " + elapsed/1000);
        //~10000 for bruteforce
        //~20 with binary search

    }


}
