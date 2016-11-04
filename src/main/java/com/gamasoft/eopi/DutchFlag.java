package com.gamasoft.eopi;

import java.util.Arrays;

/**
 * Created by uberto on 04/11/16.
 */
public class DutchFlag {
    public static Integer[] sort(Integer[] array, int pivotIndex) {

        int pivotVal = array[pivotIndex];
        int lastPre = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivotVal){
                lastPre += 1;
                swap(array, i, lastPre);
            }
        }

        int firstPost = array.length;
        for (int i = array.length - 1; i > lastPre; i--) {
            if (array[i] > pivotVal){
                firstPost -= 1;
                swap(array, i, firstPost);
            }
        }

        return array;
    }

    private static void swap(Integer[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }
}
