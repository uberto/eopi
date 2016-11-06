package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 06/11/16.
 */
public class NumAndStr {

    public static String convert(int num) {
        String r = "";
        boolean neg = false;
        if (num < 0){
            neg = true;
            num = -num;
        }

        while (true){

            char c = (char) ('0' + num % 10);

            r = c + r;

            if (num < 10)
                break;
            num /= 10;
        }

        if (neg)
            return "-" + r;
        else
            return r;
    }

    public static int convert(String str) {
        boolean neg = false;
        if (str.charAt(0) == '-'){
            neg = true;
            str = str.substring(1);
        }
        int r = 0;
        for(char c: str.toCharArray()){
            int ci = c - '0';
            r = r*10 + ci;
        }

        if (neg)
            return -r;
        else
            return r;
    }
}
