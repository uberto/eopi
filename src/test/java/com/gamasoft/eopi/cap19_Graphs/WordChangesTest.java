package com.gamasoft.eopi.cap19_Graphs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 16/12/16.
 */
//19.7
public class WordChangesTest {

    private List<String> miniDict = Arrays.asList("tea", "the", "tee");
    private List<String> bigDict = Arrays.asList("tea", "the", "tee", "thee", "three", "tyre", "tir", "try", "lyre", "sire", "she", "her", "he", "me", "my", "mum", "thus", "our", "us", "we", "pea", "lea", "jug", "gig", "gag", "jar", "they", "whey", "hey", "me", "you", "yurt", "yo", "so", "soy");

    @Test
    public void sameWord() throws Exception {

        Assert.assertEquals(0, WordChanges.findChanges("tea", "tea", miniDict));

    }

    @Test
    public void onestep() throws Exception {
        Assert.assertEquals(1, WordChanges.findChanges("tea", "tee", miniDict));
    }

    @Test
    public void twosteps() throws Exception {
        Assert.assertEquals(2, WordChanges.findChanges("tea", "the", miniDict));

    }


    @Test
    public void bigDict() throws Exception {
        Assert.assertEquals(-1, WordChanges.findChanges("lyre", "thus", bigDict));
        Assert.assertEquals(5, WordChanges.findChanges("tea", "three", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("lyre", "tee", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("three", "she", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("me", "you", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("us", "our", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("he", "they", bigDict));
        Assert.assertEquals(0, WordChanges.findChanges("soy", "yurt", bigDict));

    }

}
