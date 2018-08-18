package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by uberto on 27/11/16.
 */
public class Knapsack {
    public static int select(Set<Watch> shop, int maxWeight) {
        Set<Watch> choice = new HashSet<>(shop.size());

        KnapMemo memo = new KnapMemo();
        return select(memo, shop, maxWeight, choice);
    }

    private static int select(KnapMemo memo, Set<Watch> shop, int maxWeight, Set<Watch> choice) {
        String key = choice.toString();

        int best = memo.best(key, maxWeight);
        if (best > -1)
            return best;


        int maxVal = choice.stream().map(w -> w.price()).reduce(Integer::sum).orElse(0);

        for(Watch w: shop){
            if (!choice.contains(w) && w.weight() <= maxWeight) {
                Set<Watch> nc = new HashSet<>(choice);
                nc.add(w);
                int val = select(memo, shop, maxWeight - w.weight(), nc);
                if (val > maxVal)
                    maxVal = val;
            }
        }

        memo.storeBest(key, maxWeight, maxVal);
        return maxVal;
    }

    public static Set<Watch> shop(Watch... watches) {
        HashSet<Watch> set = new HashSet<>(watches.length);
        set.addAll(Arrays.asList(watches));
        return set;
    }

    interface Watch{

        int weight();

        int price();
    }


    __ByValue public static class WatchV implements Watch {
        public final int weight;
        public final int price;

        public WatchV(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public String toString() {
            return "W{"+ weight +
                    "," + price +
                    '}';
        }

        @Override
        public int weight() {
            return weight;
        }

        @Override
        public int price() {
            return price;
        }
    }

    private static class KnapMemo extends HashMap<String, SortedMap<Integer, Integer>>{
        public int best(String key, int maxWeight) {
            if (!containsKey(key))
                return -1;

            SortedMap<Integer, Integer> solutions = get(key);

            if (solutions.containsKey(maxWeight))
                return solutions.get(maxWeight);

            SortedMap<Integer, Integer> hm = solutions.headMap(maxWeight);
            if (hm.isEmpty())
                return -1;
            return solutions.get(hm.lastKey());

        }

        public void storeBest(String key, int maxWeight, int val) {
            SortedMap<Integer, Integer> solutions = getOrDefault(key, new TreeMap<>());

            solutions.entrySet().removeIf(entry -> entry.getKey() >= maxWeight && entry.getValue() <= val);

            solutions.put(maxWeight, val);
            put(key, solutions);
        }
    }
}
