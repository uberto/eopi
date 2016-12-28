package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 28/12/16.
 */
public class Palindromic {
    public static boolean is(String s) {
        int b = 0;
        int e = s.length()-1;
        while (b < e){

            while(!isAlpha(s.charAt(b)) && b <= e)
                b++;
            while(!isAlpha(s.charAt(e)) && e >= b)
                e--;
            if (s.charAt(b) != s.charAt(e))
                return false;

            b++;
            e--;
        }
        return true;
    }

    private static boolean isAlpha(char c) {
        return c >= 'a' && c <= 'z';
    }
}
