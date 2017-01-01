package com.gamasoft.eopi.cap8_LinkedLists;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 01/01/17.
 */

// 8.9
public class RotateListTest {

    @Test
    public void rotateList() throws Exception {

        LinkedListNode<Integer> list10 = LinkedListNode.<Integer>createList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        LinkedListNode<Integer> newHead = RotateList.rotateRight(list10, 3);


        Assert.assertEquals(8, newHead.value.intValue());
        Assert.assertEquals(9, newHead.next.value.intValue());
        Assert.assertEquals(10, newHead.next.next.value.intValue());
        Assert.assertEquals(1, newHead.next.next.next.value.intValue());
        Assert.assertEquals(2, newHead.next.next.next.next.value.intValue());
        Assert.assertEquals(3, newHead.next.next.next.next.next.value.intValue());
        Assert.assertEquals(4, newHead.next.next.next.next.next.next.value.intValue());
        Assert.assertEquals(5, newHead.next.next.next.next.next.next.next.value.intValue());
        Assert.assertEquals(6, newHead.next.next.next.next.next.next.next.next.value.intValue());
        Assert.assertEquals(7, newHead.next.next.next.next.next.next.next.next.next.value.intValue());
        Assert.assertNull(     newHead.next.next.next.next.next.next.next.next.next.next);

    }
}
