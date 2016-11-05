package com.gamasoft.eopi.cap6_Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by uberto on 05/11/16.
 */
public class RandomSubset {

    public static void extract(String[] sample, int size) {

        Random r = new Random();

        for (int i = 0; i < sample.length - size; i++) {
            int li = sample.length - i - 1;
            int x = r.nextInt(sample.length - i);
            sample[x] = sample[li];
            sample[(li)] = "";
        }


        System.out.println(Arrays.asList(sample));

    }
}
