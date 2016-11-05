package com.gamasoft.eopi.cap6_Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by uberto on 05/11/16.
 */
public class SpiralOrdering {
    public static List<Integer> order(Integer[][] matrix) {

        List<Integer> res = new ArrayList<>();
        int sizeY = matrix.length;
        int sizeX = matrix[0].length;

        int min = sizeX < sizeY ? sizeX : sizeY;
        int numSq = min / 2 + min % 2;

        for (int i = 0; i < numSq; i++) {
            getBorders(matrix, i, res);
        }

        return res;
    }

    private static void getBorders(Integer[][] matrix, int exclude, List<Integer> res) {
        int sizeY = matrix.length - exclude * 2;
        int sizeX = matrix[0].length - exclude * 2;

        for (int i = exclude; i < sizeX + exclude; i++) {
            res.add(matrix[exclude][i]);
        }
        for (int i = exclude + 1; i < sizeY + exclude; i++) {
            res.add(matrix[i][sizeX + exclude - 1]);
        }
        if (sizeY >= 2 * exclude) {
            for (int i = sizeX + exclude - 2; i > exclude - 1; i--) {
                res.add(matrix[sizeY + exclude - 1][i]);
            }
        }
        if (sizeX >= 2 * exclude) {
            for (int i = sizeY + exclude - 2; i > exclude; i--) {
                res.add(matrix[i][exclude]);
            }
        }
    }
}
