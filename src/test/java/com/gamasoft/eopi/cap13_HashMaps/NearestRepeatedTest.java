package com.gamasoft.eopi.cap13_HashMaps;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 15/11/16.
 */
public class NearestRepeatedTest {

    @Test
    public void nearestRepeatedElement() throws Exception {
        List<String> words = Arrays.asList(
                "all", "work", "and", "no", "play", "makes", "for", "no", "work", "no", "fun", "and", "no", "results");

        Assert.assertEquals(7, NearestRepeated.find(words));
    }

    @Test
    public void nearestRepeatedElementShort(){
        List<String> words = Arrays.asList("a","b","c","c","b");

        Assert.assertEquals(2, NearestRepeated.find(words));
    }

    @Test
    public void nearestRepeatedElementCross(){
        List<String> words = Arrays.asList("a","b","c","b","c","d","d");

        Assert.assertEquals(5, NearestRepeated.find(words));
    }

    @Test
    public void nearestRepeatedElementNothing(){
        List<String> words = Arrays.asList("a","b","c","d");

        Assert.assertEquals(-1, NearestRepeated.find(words));
    }
}
