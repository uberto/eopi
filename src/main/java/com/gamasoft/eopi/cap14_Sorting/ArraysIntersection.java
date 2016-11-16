package com.gamasoft.eopi.cap14_Sorting;

import java.util.*;

/**
 * Created by uberto on 16/11/16.
 */
public class ArraysIntersection {


    public static Set<Integer> find(List<Integer> a, List<Integer> b) {

        int ai = 0;
        int bi = 0;

        Set<Integer> res = new LinkedHashSet<>();
        while ((ai < a.size()) && (bi < b.size())){
            int c = a.get(ai).compareTo(b.get(bi));
            if (c == 0){
                res.add(a.get(ai));
                ai++;
                bi++;
            } else if (c < 0){
                ai++;
            } else {
                bi++;
            }


        }
        return res;

    }
}
