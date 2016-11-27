package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.*;

/**
 * Created by uberto on 27/11/16.
 */
public class Knapsack {
    public static int select(Set<Watch> shop, int maxWeight) {
        Set<Watch> choice = new HashSet<>(shop.size());

        Map<String, Integer> memo = new HashMap<>();
        return select(memo, shop, maxWeight, choice);
    }

    private static int select(Map<String, Integer> memo, Set<Watch> shop, int maxWeight, Set<Watch> choice) {

        String key = maxWeight + "->" + choice.toString();
        if (memo.containsKey(key))
            return memo.get(key);

        int maxVal = choice.stream().map(w -> w.price).reduce(Integer::sum).orElse(0);

        for(Watch w: shop){
            if (!choice.contains(w) && w.weight <= maxWeight) {
                Set<Watch> nc = new HashSet<>(choice);
                nc.add(w);
                int val = select(memo, shop, maxWeight - w.weight, nc);
                if (val > maxVal)
                    maxVal = val;
            }
        }

        memo.put(key, maxVal);
        return maxVal;
    }

    public static Set<Watch> shop(Watch... watches) {
        HashSet<Watch> set = new HashSet<>(watches.length);
        set.addAll(Arrays.asList(watches));
        return set;
    }

    public static class Watch {
        public final int weight;
        public final int price;

        public Watch(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "W{"+ weight +
                    "," + price +
                    '}';
        }
    }
}
