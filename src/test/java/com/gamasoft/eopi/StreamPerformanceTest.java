package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by uberto on 29/11/16.
 */
public class StreamPerformanceTest {
    @Test
    public void benchMark() throws Exception {

        Map<Integer, Integer> prices = new HashMap<>();
        int maxNumbers = 20000;
        for (int i = 0; i < maxNumbers; i++) {
            prices.put(i, i * 2);
        }
        int maxWeight = maxNumbers/2;

        int iterations = 1000;
        for (int i = 0; i < iterations; i++) {
            useStreamReduce(prices, maxWeight);
        }
        for (int i = 0; i < iterations; i++) {
            useTraditional(prices, maxWeight);
        }



        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            Assert.assertEquals(20000, useTraditional(prices, maxWeight));
        }
        long end = System.nanoTime();
        System.out.println("Traditional: " + (end - start));


        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            Assert.assertEquals(20000, useStreamReduce(prices, maxWeight));
        }
        end = System.nanoTime();
        System.out.println("Stream:      " + (end - start));


    }

    private static int useTraditional(Map<Integer, Integer> prices, int maxWeight) {
        int pMax = -1;
        for (int p : prices.keySet()) {
            if (p <= maxWeight) {
                pMax = Math.max(pMax, p);
            }
        }
        return pMax == -1 ? -1 : prices.get(pMax);
    }

    private static int useStream(Map<Integer, Integer> prices, int maxWeight) {
        return prices.keySet().stream().filter(x -> x <= maxWeight).max(Comparator.naturalOrder())
                .map(prices::get).orElse(-1);
    }

    private static int useStreamReduce(Map<Integer, Integer> prices, int maxWeight) {
        return prices.keySet().stream().reduce((max, x) -> x > maxWeight ? max : Math.max(max, x) )
                .map(prices::get).orElse(-1);
    }
}
