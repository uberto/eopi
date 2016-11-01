package com.gamasoft.eopi;

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

}