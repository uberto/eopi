package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 29/11/16.
 */
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
}
