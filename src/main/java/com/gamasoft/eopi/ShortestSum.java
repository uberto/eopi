package com.gamasoft.eopi;

/**
 * Created by uberto on 20/11/16.
 */
public class ShortestSum {
    public static int find(int[] seq, int sum) {
        int currTot = 0;
        int best = 0;
        for (int v: seq){
            best++;
            currTot += v;
            if (currTot >= sum)
                break;
        }
        if (currTot < sum)
            return 0;

        currTot -= seq[0];
        for (int i = best; i < seq.length; i++) {

            currTot += seq[i] - seq[i - best + 1];
            while (currTot >= sum){
                best--;
                currTot -= seq[i - best + 1];

            }
            if (best == 1)
                break;
        }
        return best;
    }
}
