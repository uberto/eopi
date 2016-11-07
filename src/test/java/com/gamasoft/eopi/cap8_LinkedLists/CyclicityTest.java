package com.gamasoft.eopi.cap8_LinkedLists;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 07/11/16.
 */
public class CyclicityTest {

    @Test
    public void detectCyclicity() throws Exception {

        ListNode<Integer> cl = LinkedLists.intList(1, 2, 3, 4, 5, 6);

        cl.next.next.next.next = cl.next;

        Assert.assertTrue(Cyclicity.detect(cl));
    }

    @Test
    public void detectNonCyclicity() throws Exception {

        ListNode<Integer> ncl = LinkedLists.intList(1, 2, 3, 4, 5, 6);

        Assert.assertFalse(Cyclicity.detect(ncl));
    }

}
