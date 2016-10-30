package com.gamasoft.eopi;

import java.util.List;

/**
 * Created by uberto on 30/10/16.
 */
public class IncrementingSequence {

    public static List<Integer> findLongestIncrementingSequence(List<Integer> seq) {

        int from = 0;
        int last = Integer.MIN_VALUE;
        int maxStreak = 0;
        int currStreak = 0;

        for(int i = 0; i < seq.size(); i++){

            int curr = seq.get(i);

            if (curr < last ) {
                currStreak = 1;
            } else {
                currStreak++;
                if (currStreak > maxStreak){
                    maxStreak = currStreak;
                    from = i - currStreak + 1;
                }
            }

            last = curr;
        }

        return seq.subList(from, from + maxStreak);
    }


    public static List<Integer> findLongestNonContIncrementingSequence(List<Integer> seq) {

        int from = 0;
        int last = Integer.MIN_VALUE;
        int maxStreak = 0;
        int currStreak = 0;

        for(int i = 0; i < seq.size(); i++){

            int curr = seq.get(i);

//            if (curr < last ) {
//                currStreak = 1;
//            } else {
//                currStreak++;
//                if (currStreak > maxStreak){
//                    maxStreak = currStreak;
//                    from = i - currStreak + 1;
//                }
//            }
//
            last = curr;
        }

        return seq.subList(from, from + maxStreak);
    }



}
