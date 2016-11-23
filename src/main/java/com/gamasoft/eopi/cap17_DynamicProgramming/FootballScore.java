package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uberto on 22/11/16.
 */
public class FootballScore{

    //single score can be 2 3 7, count combination, regardless of the order

    /*
     5=1 (2+3)
     6=2 (3+3)(2+2+2)
     7=2 (7)(3+2+2)
     8=2 (3+3+2)(2+2+2+2)
     9=3 (7+2)(3+3+3)(3+2+2+2)
     10=3 (7+3)(3+3+2+2)(2+2+2+2+2)
      */


    public static int scoreCombinations(int score) {

        Map<Integer, Integer> combinationsByScore = new HashMap<>();

        putCombinationsInMap(combinationsByScore, score, 2);
        putCombinationsInMap(combinationsByScore, score, 3);
        putCombinationsInMap(combinationsByScore, score, 7);

        return combinationsByScore.getOrDefault(score, 0);
    }

    private static void putCombinationsInMap(Map<Integer, Integer> combinationsByScore, int score, int singleScore) {
        addToMap(combinationsByScore, singleScore, 1);
        for (int i =singleScore; i<= score; i++){
            addToMap(combinationsByScore, i, combinationsByScore.getOrDefault(i - singleScore, 0));
        }
    }

    private static void addToMap(Map<Integer, Integer> combinationsByScore, int index, int value) {
        combinationsByScore.put(index, combinationsByScore.getOrDefault(index, 0) + value);
    }
}
