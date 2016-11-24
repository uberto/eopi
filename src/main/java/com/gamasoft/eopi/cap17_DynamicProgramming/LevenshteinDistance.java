package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uberto on 24/11/16.
 */
public class LevenshteinDistance {
    /*
    abcd -> xyzd == abc -> xyz
    abcd -> xyzw == 1 + min {  abc -> xyz, abcd -> xyz, abc -> xyzw)
     */


    public static int measure(String from, String to) {
        Map<String, Integer> dists = new HashMap<>();
        int res = measure(dists, from, to);

        System.out.println("size " + dists.size() + " axb:" + from.length()*to.length());

        return res;
    }

    private static int measure(Map<String, Integer> dists, String from, String to) {

        if (to.isEmpty())
            return from.length();
        if (from.isEmpty())
            return to.length();

        if (last(from) == last(to))
            return measure(dists, prefix(from), prefix(to));

        String key = from + ">" + to;

        if (dists.containsKey(key))
            return dists.get(key);

        int change = measure(dists, prefix(from), prefix(to));
        int remove = measure(dists, from, prefix(to));
        int add = measure(dists, prefix(from), to);

        int res = 1 + Math.min(change, Math.min(remove, add));

        dists.put(key, res);
        return res;
    }

    private static char last(String s){
        return s.charAt(s.length() - 1);
    }

    private static String prefix(String s){
        return s.substring(0, s.length() - 1);
    }

}
