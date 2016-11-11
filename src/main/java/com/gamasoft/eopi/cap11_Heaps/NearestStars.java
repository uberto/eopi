package com.gamasoft.eopi.cap11_Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by uberto on 11/11/16.
 */
public class NearestStars {

    public static List<String> find(int max, Map<String, Double> stars) {

        Map<Double, String> inverted = new HashMap<>();

        for(Map.Entry<String, Double> kv: stars.entrySet()){
            double d = kv.getValue() * -1; //we use a maxheap to find a min
            inverted.put(d, kv.getKey());
        }

        MaxHeap<Double> heap = new MaxHeap<>();
        heap.addAll(inverted.keySet().toArray(new Double[stars.size()]));

        List<String> res = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            Double d = heap.pop();
            res.add(inverted.get(d));
        }


        return res;
    }
}
