package com.gamasoft.eopi.cap6_Arrays;

import java.util.Arrays;

/**
 * Created by uberto on 22/12/16.
 */
public class RemoveDuplicates {
    public static int[] remove(int[] array) {

        if (array.length == 0)
            return array;
        int last = array[0];
        int skip = 0;
        for(int p = 1; p < array.length ; p++){
            if (array[p] == last){
                skip++;
            } else if (skip > 0) {
                last = array[p];
                array[p - skip] = last;
            }
        }

        return Arrays.copyOf(array, array.length - skip);
    }
}
