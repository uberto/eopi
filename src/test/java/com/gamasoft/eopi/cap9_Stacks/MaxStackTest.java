package com.gamasoft.eopi.cap9_Stacks;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 08/11/16.
 */
public class MaxStackTest {

    //9.1
    @Test
    public void stackWithMax() throws Exception {

        MaxStack s = new MaxStack();

        s.push(4);
        s.push(8);
        s.push(1);

        Assert.assertEquals(8, s.max());

        Assert.assertEquals(1, s.pop());
        Assert.assertEquals(8, s.max());
        Assert.assertEquals(8, s.pop());
        Assert.assertEquals(4, s.max());

    }
}
