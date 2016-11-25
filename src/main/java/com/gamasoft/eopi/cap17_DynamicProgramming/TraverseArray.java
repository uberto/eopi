package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uberto on 25/11/16.
 */
public class TraverseArray {

    public static int count(int toX, int toY) {
        Map<String, Integer> dp = new HashMap<>();

        return count(dp, toX,toY);
    }

    private static int count(Map<String, Integer> dp, int toX, int toY) {
        String key = toX + ">" + toY;
        if (dp.containsKey(key))
            return dp.get(key);
        int tot = 0;
        if (toX > 0)
            tot += count(toX - 1, toY);
        else
            return 1;

        if (toY > 0)
            tot += count(toX, toY - 1);
        else
            return 1;

        dp.put(key, tot);
        return tot;
    }
}
