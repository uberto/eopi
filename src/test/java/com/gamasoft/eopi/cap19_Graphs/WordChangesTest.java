package com.gamasoft.eopi.cap19_Graphs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 16/12/16.
 */
//19.7 (modified)
public class WordChangesTest {

    private List<String> miniDict = Arrays.asList("tea", "tee", "the", "thee", "three");
    private List<String> bigDict = Arrays.asList("tea", "tee", "the", "thee", "three", "thu", "tye", "tyre", "tir", "try", "lyre", "sire", "she", "her", "he", "me", "my", "mum", "thus", "our", "ur", "us", "we", "pea", "lea", "jug", "gig", "gag", "jar", "they", "whey", "hey", "me", "you", "yurt", "hurt", "hart", "hast", "has", "your", "yur", "yus", "hus", "yo", "so", "soy");



    @Test
    public void checkSingleCharDiff() {

        Assert.assertTrue(WordChanges.singleCharDiff("abc", "abcd"));
        Assert.assertTrue(WordChanges.singleCharDiff("abc", "ab"));
        Assert.assertTrue(WordChanges.singleCharDiff("abc", "abd"));
        Assert.assertTrue(WordChanges.singleCharDiff("abc", "zbc"));
        Assert.assertTrue(WordChanges.singleCharDiff("aaa", "aaaa"));
        Assert.assertFalse(WordChanges.singleCharDiff("abc", "abc"));
        Assert.assertFalse(WordChanges.singleCharDiff("ad", "abc"));
        Assert.assertFalse(WordChanges.singleCharDiff("ade", "abc"));
        Assert.assertFalse(WordChanges.singleCharDiff("abcde", "abc"));
        Assert.assertFalse(WordChanges.singleCharDiff("aaaa", "aab"));

    }

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
        Assert.assertEquals(2, WordChanges.findChanges("tea", "thee", miniDict));

    }

    @Test
    public void threesteps() throws Exception {
        Assert.assertEquals(3, WordChanges.findChanges("tea", "three", miniDict));

    }

    @Test
    public void bigDict() throws Exception {
        Assert.assertEquals(2, WordChanges.findChanges("us", "our", bigDict));
        Assert.assertEquals(2, WordChanges.findChanges("he", "they", bigDict));
        Assert.assertEquals(3, WordChanges.findChanges("tea", "three", bigDict));
        Assert.assertEquals(3, WordChanges.findChanges("lyre", "tee", bigDict));
        Assert.assertEquals(3, WordChanges.findChanges("three", "she", bigDict));
        Assert.assertEquals(5, WordChanges.findChanges("lyre", "thus", bigDict));
        Assert.assertEquals(5, WordChanges.findChanges("thus", "you", bigDict));
        Assert.assertEquals(6, WordChanges.findChanges("soy", "yurt", bigDict));
        Assert.assertEquals(9, WordChanges.findChanges("me", "you", bigDict));

    }

}
