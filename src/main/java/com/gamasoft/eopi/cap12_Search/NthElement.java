package com.gamasoft.eopi.cap12_Search;

import com.gamasoft.eopi.cap6_Arrays.DutchFlag;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by uberto on 13/11/16.
 */
public class NthElement {

    public static int findNthBigger(Integer[] array, int n){

        int target = array.length - n;
        int from = 0;
        int to = array.length;
        Random rnd = new Random();
        while (from < to) {
            int guess = rnd.nextInt(to - from) + from;
            int p = DutchFlag.sortInRange(array, guess, from, to);
            //System.out.println(p);

            if (p == target) {
                return array[p];
            } else if (p < target) {
                from = p + 1;
            } else {
                to = p;
            }

        }


        return array[0];
    }

}
