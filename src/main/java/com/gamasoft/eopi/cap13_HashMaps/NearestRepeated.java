package com.gamasoft.eopi.cap13_HashMaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by uberto on 15/11/16.
 */
public class NearestRepeated {
    public static int find(List<String> words) {

        Map<String, Integer> pos = new HashMap<>(words.size());

        int closestIndex = -1;
        int closestVal = Integer.MAX_VALUE;
        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            if (pos.containsKey(w)) {
                Integer wi = pos.get(w);
                if (i - wi < closestVal){
                    closestVal = i - wi;
                    closestIndex = wi;
                }

            }
            pos.put(w, i);
        }

        return closestIndex;
    }
}
