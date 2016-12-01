package com.gamasoft.eopi.cap18_Greedy;

import java.util.Comparator;
import java.util.List;

/**
 * Created by uberto on 01/12/16.
 */
public class TasksAndWorkers {
    public static int durationInPair(List<Integer> tasks) {
        tasks.sort(Comparator.<Integer>naturalOrder());
        int max = 0;
        for(int i = 0; i < tasks.size() / 2; i++){
            int pair = tasks.get(i) + tasks.get(tasks.size() - i - 1);
            max = Math.max(pair, max);
        }
        return max;
    }
}
