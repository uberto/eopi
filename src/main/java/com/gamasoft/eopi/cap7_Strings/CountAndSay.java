package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 28/12/16.
 */
public class CountAndSay {
    public static String number(int n) {
        if (n == 1)
            return "1";

        String look = number(n - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10; i++){
            int k = countChar(look, String.valueOf(i).charAt(0));
            if (k > 0) {
                sb.append(k);
                sb.append(i);
            }
        }
        return sb.toString();
    }

    private static int countChar(String s, char c) {
        int r = 0;
        for(char a: s.toCharArray()){
            if (a == c)
                r++;
        }
        return r;
    }
}
