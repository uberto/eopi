package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 29/11/16.
 */

//17.11

public class PrettyPrintingTest {

    @Test
    public void smallMessiness() throws Exception {
        List<String> text = Arrays.asList("1 2", "3", "45");

        Assert.assertEquals(5, PrettyPrinting.messiness(text, 3));


    }

    @Test
    public void messiness() throws Exception {
        List<String> text = Arrays.asList("to be or", "not to be", "this is", "the", "question");

        Assert.assertEquals(27, PrettyPrinting.messiness(text, 8));

        List<String> text2 = Arrays.asList("to be or", "not to", "be this", "is the", "question");

        Assert.assertEquals(9, PrettyPrinting.messiness(text2, 8));

    }

    @Test
    public void tinyPrettyPringing() throws Exception {
        List<String> words = Arrays.asList("a", "b");

        List<String> lines = PrettyPrinting.justify(words, 3);
        Assert.assertEquals(1, lines.size());
        Assert.assertEquals(0, PrettyPrinting.messiness(lines, 3));


    }


    @Test
    public void smallPrettyPringing() throws Exception {
        List<String> words = Arrays.asList("a", "b", "c", "d");

        List<String> lines = PrettyPrinting.justify(words, 3);
        Assert.assertEquals(2, lines.size());
        Assert.assertEquals(0, PrettyPrinting.messiness(lines, 3));


        List<String> lines5 = PrettyPrinting.justify(words, 5);
        Assert.assertEquals(2, lines5.size());
        Assert.assertEquals(8, PrettyPrinting.messiness(lines5, 5));

    }

    @Test
    public void longPrettyPrinting() throws Exception {
        List<String> words = Arrays.asList("to", "be", "or", "not", "to", "be", "this", "is", "the", "question");

        List<String> lines8 = PrettyPrinting.justify(words, 8);

        Assert.assertEquals(5, lines8.size());
        Assert.assertEquals(9, PrettyPrinting.messiness(lines8, 8));

        List<String> lines9 = PrettyPrinting.justify(words, 9);
        Assert.assertEquals(5, lines9.size());
        Assert.assertEquals(24, PrettyPrinting.messiness(lines9, 9));

        List<String> lines10 = PrettyPrinting.justify(words, 10);
        Assert.assertEquals(5, lines10.size());
        Assert.assertEquals(49, PrettyPrinting.messiness(lines10, 10));


        List<String> lines12 = PrettyPrinting.justify(words, 12);
        Assert.assertEquals(4, lines12.size());
        Assert.assertEquals(42, PrettyPrinting.messiness(lines12, 12));

        List<String> lines13 = PrettyPrinting.justify(words, 13);
        Assert.assertEquals(3, lines13.size());
        Assert.assertEquals(2, PrettyPrinting.messiness(lines13, 13));
    }

}
