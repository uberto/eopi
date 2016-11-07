package com.gamasoft.eopi.cap8_LinkedLists;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 07/11/16.
 */
public class ReverseSubListTest {

    @Test
    public void reverseSubList() throws Exception {
        ListNode<Integer> a = LinkedLists.intList(1, 2, 3, 4, 5, 6);

        ReverseSubList.reverse(a, 2, 3);

        Assert.assertEquals("1,2,5,4,3,6,", LinkedLists.listToString(a));

    }
}
