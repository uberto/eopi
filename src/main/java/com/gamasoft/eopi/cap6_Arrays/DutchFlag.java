package com.gamasoft.eopi.cap6_Arrays;

import java.util.Arrays;

/**
 * Created by uberto on 04/11/16.
 */
public class DutchFlag {
    public static int sort(Integer[] array, int pivotIndex) {

        return sortInRange(array, pivotIndex, 0, array.length);
    }

    public static int sortInRange(Integer[] array, int pivotIndex, int from, int to) {
        int pivotVal = array[pivotIndex];
        int lastPre = from-1;

        for (int i = from; i < to; i++) {
            if (array[i] < pivotVal){
                lastPre += 1;
                swap(array, i, lastPre);
            }
        }

        int firstPost = to;
        for (int i = to - 1; i > lastPre; i--) {
            if (array[i] > pivotVal){
                firstPost -= 1;
                swap(array, i, firstPost);
            }
        }

        return lastPre + 1;
    }

    private static void swap(Integer[] array, int from, int to) {
        int tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }
}
