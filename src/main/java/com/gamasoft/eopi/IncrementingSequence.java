package com.gamasoft.eopi;

import java.util.ArrayList;
import java.util.LinkedList;
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


    public static int findLongestNonContIncrementingSequence(List<Integer> seq) {

        int maxStreak = 0;
        List<Integer> best = new ArrayList<>();

        for(int i = 0; i < seq.size(); i++){

            int curr = seq.get(i);

            int currStreak = 0;
            for(int j = 0; j < i; j++) {

                if (seq.get(j) < curr && best.get(j) > currStreak)
                    currStreak = best.get(j);
            }
            currStreak += 1;
            best.add(currStreak);

            if (currStreak>maxStreak)
                maxStreak = currStreak;

        }

        return maxStreak;
    }



}
