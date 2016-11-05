package com.gamasoft.eopi.cap5_Primitive_Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by uberto on 31/10/16.
 */
public class Bits {

    public static int countOnes(int x) {
        int tot = 0;

        while(x != 0){

            if ((x & 1) == 1)
                tot++;
            x >>>= 1;
        }
        return tot;
    }

    public static short parity(long x) {
        short p = 0;

        while(x != 0){

            p ^= (x & 1);
            x >>>= 1;
        }
        return p;
    }

    public static double power(double x, int y) {

//brute force
//        double r = x;
//        for (int i = 1; i < y; i++) {
//            r *= x;
//        }

        List<Boolean> binary = reverseBinary(y);

        double r = 1;
        for(Boolean one: binary){
            r *= r;
            if (one)
                r *= x;
        }
        return r;
    }

    private static List<Boolean> reverseBinary(int y) {
        List<Boolean> res = new ArrayList<>();
        int r = y;
        while(r != 0){
            res.add ((r & 1) == 1);
            r >>>= 1;
        }
        Collections.reverse(res);
        return res;
    }
}

