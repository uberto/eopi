package com.gamasoft.eopi.cap5_Primitive_Types;

/**
 * Created by uberto on 21/12/16.
 */
public class Palindrome {
    public static boolean check(int x) {
        return x == reverse(x);
    }

    public static int reverse(int x) {

        int r = 0;
        int l = x;

        while( l > 0){
            int c = l % 10;
            r *= 10;
            r += c;
            l /= 10;
        }
        return r;
    }
}
