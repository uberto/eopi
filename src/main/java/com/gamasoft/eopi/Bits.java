package com.gamasoft.eopi;

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
}
