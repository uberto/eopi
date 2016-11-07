package com.gamasoft.eopi.cap8_LinkedLists;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 07/11/16.
 */
public class MergeListTest {

    @Test
    public void mergeSortedLists() throws Exception {

        ListNode<Integer> a = LinkedLists.intList(1, 5, 6, 9);
        ListNode<Integer> b = LinkedLists.intList(2, 3, 10);

        ListNode<Integer> c = MergeList.merge(a, b);

        Assert.assertEquals("1,2,3,5,6,9,10,", LinkedLists.listToString(c));
    }
}
