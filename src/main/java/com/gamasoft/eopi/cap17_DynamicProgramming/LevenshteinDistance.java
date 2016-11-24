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

    private static Map<String, Integer> dists = new HashMap<>();


    public static int measure(String from, String to) {

        if (to.isEmpty())
            return from.length();
        if (from.isEmpty())
            return to.length();

        if (last(from) == last(to))
            return measure(prefix(from), prefix(to));

        if (from.equals(to))
            return 0;
        String key = from + ">" + to;

        if (dists.containsKey(key))
            return dists.get(key);

        int v1 = measure(prefix(from), prefix(to));
        int v2 = measure(from, prefix(to));
        int v3 = measure(prefix(from), to);


        int res = 1 + Math.min(v1, Math.min(v2, v3));

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
