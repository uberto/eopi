package com.gamasoft.eopi.cap6_Arrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 02/11/16.
 */
public class CircularQueueTest {


    @Test
    public void writeAndRead() throws Exception {

        CircularQueue<String> circ = new CircularQueue<String>(10);

        circ.enqueue("-3");
        circ.enqueue("-2");
        circ.enqueue("-1");
        for(int i = 0; i < 1000; i++){
            circ.enqueue(String.valueOf(i));
            String r = circ.deque();

            Assert.assertEquals(String.valueOf(i-3), r);
        }

    }


    @Test
    public void tooManyWrites() throws Exception {

        CircularQueue<String> circ = new CircularQueue<String>(10);

        for(int i = 0; i < 9; i++){
            circ.enqueue(String.valueOf(i));
        }

        try {
            circ.enqueue(String.valueOf(10));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("buffer size limit!", e.getMessage());
        }

    }
}