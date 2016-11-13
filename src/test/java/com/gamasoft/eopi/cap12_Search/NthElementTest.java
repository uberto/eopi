package com.gamasoft.eopi.cap12_Search;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by uberto on 13/11/16.
 */
public class NthElementTest {

    @Test
    public void findInShortList() {

        Integer[] a = new Integer[]{2, 3, 1};
        int r = NthElement.findNthBigger(a, 3);

        Assert.assertEquals(1, r);
    }

    @Test
    public void findInReverseOrderedList(){

        Integer[] a = new Integer[]{10,9,8,7,6,5,4,3,2,1};
        int r  = NthElement.findNthBigger(a, 3);

        Assert.assertEquals(8, r);
    }

    @Test
    public void findInBigList(){

        Integer[] a = new Integer[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i % 4095 + i % 2047 + i % 1023 + i % 7 + i % 13;
        }
        int r  = NthElement.findNthBigger(a, 100);

        /*
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[100]);
        System.out.println(a[9899]);
        System.out.println(a[9900]);
        System.out.println(a[9901]);
*/
        Assert.assertEquals(7017, r);
    }
}
