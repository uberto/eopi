package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 02/12/16.
 */

//17.7
public class DictionaryWordsTest {

    @Test
    public void verySimple() throws Exception {

        List<String> dict = Arrays.asList("a", "man");
        Set<String> res = DictionaryWords.split(dict, "aman");

        Assert.assertEquals(2, res.size());
        Assert.assertTrue(res.contains("a"));
        Assert.assertTrue(res.contains("man"));

    }

    @Test
    public void notSoSimple() throws Exception {

        List<String> dict = Arrays.asList("or", "be", "not", "to", "otto");
        Set<String> res = DictionaryWords.split(dict, "tobeornottobe");

        Assert.assertEquals(4, res.size());
        Assert.assertTrue(res.contains("to"));
        Assert.assertTrue(res.contains("not"));
    }

    @Test
    public void multiSol() throws Exception {

        List<String> dict = Arrays.asList("not", "so", "fast", "ast", "of", "nots", "oso");
        Set<String> res = DictionaryWords.split(dict, "notsofast");

        Assert.assertEquals(6, res.size());
        Assert.assertFalse(res.contains("oso"));
    }



    @Test
    public void trickySol() throws Exception {

        List<String> dict = Arrays.asList("not", "so", "fast", "n", "ots", "ofas", "of", "as");
        Set<String> res = DictionaryWords.split(dict, "notsofast");

        Assert.assertEquals(3, res.size());
        Assert.assertTrue(res.contains("not"));
        Assert.assertTrue(res.contains("so"));
        Assert.assertTrue(res.contains("fast"));
    }
}
