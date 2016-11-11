package com.gamasoft.eopi.cap11_Heaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by uberto on 11/11/16.
 */
public class NearestStarsTest {

    @Test
    public void find4NearestStars() throws Exception {

        Map<String, Double> stars = new HashMap<>();
        stars.put("a", 1.1);
        stars.put("b", 31.1);
        stars.put("c", 11.5);
        stars.put("d", 1.121);
        stars.put("e", 451.9);
        stars.put("f", 11.0);
        stars.put("g", 31.2);
        stars.put("h", 1.21);

        List<String> elements = NearestStars.find(4, stars);
        Assert.assertEquals(4, elements.size());

        String ns = String.join("", elements);

        Assert.assertEquals("adhf", ns);
    }
}
