package com.gamasoft.eopi.cap16_Recursion;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by uberto on 21/11/16.
 */
public class QueensTest {

    @Test
    public void sizeThree() throws Exception {

        List<Queens.Board> boards = Queens.generate(3);

        for (Queens.Board b: boards){
            System.out.println(b.toString());
        }
        Assert.assertEquals(0, boards.size());
    }

    @Test
    public void sizeFour() throws Exception {

        List<Queens.Board> boards = Queens.generate(4);

        for (Queens.Board b: boards){
            System.out.println(b.toString());
        }


        Assert.assertEquals(2, boards.size());
        Assert.assertEquals("1302", boards.get(0).toString());
        Assert.assertEquals("2031", boards.get(1).toString());

    }


    @Test
    public void otherSizes() throws Exception {

        Assert.assertEquals(10, Queens.generate(5).size());
        Assert.assertEquals(4, Queens.generate(6).size());
        Assert.assertEquals(40, Queens.generate(7).size());
        Assert.assertEquals(92, Queens.generate(8).size());

    }

}
