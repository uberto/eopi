package com.gamasoft.eopi.cap18_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 11/12/16.
 */
public class ThreeSum {
    public static boolean exists3Sum(Set<Integer> set, int sum) {

        if (sum % 3 == 0 && set.contains(sum / 3)) {
            return true;
        }
        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);
        if (l.get(0) * 3 > sum) {
            return false;
        }
        if (l.get(l.size() - 1) * 3 < sum) {
            return false;
        }

        for (int i = 0; i<l.size(); i++){
            int x = sum - l.get(i);
            if (exists2Sum(l, x))
                return true;
            if (x <= l.get(0))
                break;
        }

        return false;
    }

    private static boolean exists2Sum(List<Integer> orderedList, int sum) {
        int right = orderedList.size() - 1;
        int left = 0;


        while (left < right){
            int sumE = orderedList.get(left) + orderedList.get(right);
            if (sumE < sum)
                left++;
            else if (sumE > sum)
                right--;
            else
                return true;
        }
        return false;
    }

}
