package com.gamasoft.eopi;

/**
 * Created by uberto on 05/11/16.
 */
public class MaxProfit {
    public static int compute(Integer[] ticks) {

        int min = Integer.MAX_VALUE;
        int best = 0;
        for(Integer t: ticks){
            if (t < min)
                min = t;
            if (t-min > best)
                best = t - min;
        }
        return best;
    }
}
