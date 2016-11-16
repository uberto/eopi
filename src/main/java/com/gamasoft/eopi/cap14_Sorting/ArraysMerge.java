package com.gamasoft.eopi.cap14_Sorting;

/**
 * Created by uberto on 16/11/16.
 */
public class ArraysMerge {

    public static void merge(Integer[] a, Integer[] b) {

        int la = findLast(a);
        int bi = b.length-1;
        int ai = la;

        for (int i = la + b.length; i > 0; i--) {
            if (a[ai] >= b[bi]) {
                a[i] = a[ai];
                ai--;
            } else {
                a[i] = b[bi];
                bi--;
                if (bi < 0)
                    return;
            }
        }
    }

    private static int findLast(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null)
                return i - 1;
        }
        return -1;
    }
}


/*

1,5,7
2,4,6

1,5, , , ,7
2,4,6

1,5, , ,6,7
2,4,6

1, , ,5,6,7
2,4,6

1, ,4,5,6,7
2,4,6

1,2,4,5,6,7
2,4,6

 */
