package com.gamasoft.eopi.cap8_LinkedLists;

import com.gamasoft.eopi.cap8_LinkedLists.SingleLinkedList;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 01/11/16.
 */
public class SingleLinkedListTest {

    @Test
    public void findMiddle(){

        SingleLinkedList<String> l = new SingleLinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");


        Assert.assertEquals("c", l.findMiddle().value);
    }

    @Test
    public void findMiddleInLongList(){

        SingleLinkedList<String> l = new SingleLinkedList<>();
        for(int i=1; i < 1000; i++){
            l.add(Integer.toString(i));
        }

        Assert.assertEquals("500", l.findMiddle().value);
    }

}