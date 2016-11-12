package com.gamasoft.eopi.cap12_Search;

/**
 * Created by uberto on 12/11/16.
 */
public class SortedArray {

    public static int searchFirst(int[] array, int value) {

        int s = 0;
        int e = array.length - 1;
        int m = (s + e) / 2;

        while (s < e){
            int g = array[m];
            if (g == value) {
                return first(array, m);
            } else if (g > value){
                e = m - 1;
            } else {
                s = m + 1;
            }
            m = (s + e) / 2;
        }

        return -1;
    }

    private static int first(int[] array, int m) {
        int r = array[m];
        for (int i = m - 1; i >= 0 ; i--) {
            if (array[i] != r)
                return i + 1;
        }
        return 0;
    }


    public static int searchFirstBruteForce(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }
}
