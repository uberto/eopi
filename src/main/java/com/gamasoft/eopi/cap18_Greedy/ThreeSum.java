package com.gamasoft.eopi.cap18_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 11/12/16.
 */
public class ThreeSum {
    public static boolean exists(Set<Integer> set, int sum) {

        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);

        if (l.get(0) * 3 > sum)
            return false;
        if (l.get(l.size() - 1) * 3 < sum)
            return false;

        if (sum % 3 == 0 && l.contains(sum / 3))
            return true;

        for (int i = 0; i<l.size(); i++){
            int x = sum - l.get(i)*2;
            if (l.contains(x))
                return true;
            if (x <= 0)
                break;
        }



            return false;
    }
}
