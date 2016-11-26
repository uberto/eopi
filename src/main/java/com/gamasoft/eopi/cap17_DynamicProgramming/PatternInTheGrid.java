package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 26/11/16.
 */
public class PatternInTheGrid {

    public static boolean exists(Integer[][] grid, List<Integer> pattern) {

        int c = pattern.get(0);

        for (int x = 0; x < grid[0].length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (grid[y][x] == c && patternFound(grid, x, y, tail(pattern)))
                    return true;
            }
        }

        return false;
    }

    private static List<Integer> tail(List<Integer> pattern) {
        return pattern.subList(1, pattern.size());
    }

    private static boolean patternFound(Integer[][] grid, int x, int y, List<Integer> pattern) {
        if (pattern.size() == 0)
            return true;
        int c = pattern.get(0);
        boolean res = false;
        if (x > 0 && grid[y][x-1] == c)
            res = res || patternFound(grid, x-1, y, tail(pattern));
        if (y > 0 && grid[y-1][x] == c)
            res = res || patternFound(grid, x, y-1, tail(pattern));
        if (x < grid[0].length - 1 && grid[y][x+1] == c)
            res = res || patternFound(grid, x+1, y, tail(pattern));
        if (y < grid.length - 1 && grid[y+1][x] == c)
            res = res || patternFound(grid, x, y+1, tail(pattern));
        return res;
    }
}
