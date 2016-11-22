package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uberto on 22/11/16.
 */
public class FootballScore{

    //2 3 7
    public static int scoreCombinations(int score) {

        Map<Integer, Integer> combinationsByScore = new HashMap<>();
        combinationsByScore.put(2, 1);
        combinationsByScore.put(3, 1);
        combinationsByScore.put(7, 1);
        for (int i = 0; i <= score; i++) {
            int tot = combinationSingleScore(combinationsByScore, i, 0);
            tot += combinationSingleScore(combinationsByScore, i, 2);
            tot += combinationSingleScore(combinationsByScore, i, 3);
            tot += combinationSingleScore(combinationsByScore, i, 7);

            combinationsByScore.put(i, tot);
        }

        return combinationsByScore.get(score);
    }

        private static int combinationSingleScore(Map<Integer, Integer> combinationsByScore, int sum, int singleScore) {
            int tot = 0;
            if (combinationsByScore.containsKey(sum - singleScore) ) {
                tot = combinationsByScore.get(sum - singleScore);
            }
            return tot;
        }
}
