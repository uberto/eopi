package com.gamasoft.eopi.cap18_Greedy;

import java.util.List;

/**
 * Created by uberto on 12/12/16.
 */

//18.6
public class Gasup {
    public static int findStart(List<Double> distances, List<Double> gas) {

        int minId = 0;
        double minGas = gas.get(0) - distances.get(0);
        double currGas = minGas;
        for (int i = 1; i < distances.size(); i++) {
            currGas += gas.get(i) - distances.get(i);
            if (currGas < minGas){
                minGas = currGas;
                minId = i;
            }
        }

        return (minId + 1) % distances.size();
    }
}
