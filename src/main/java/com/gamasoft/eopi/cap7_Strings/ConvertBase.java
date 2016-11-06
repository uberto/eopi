package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 06/11/16.
 */
public class ConvertBase {
    public static String convert(String baseNum, int baseFrom, int baseTo) {
        String res = "";

        int base10 = convert(baseNum, baseFrom);

        return convert(base10, baseTo);
    }

    public static String convert(int num, int base) {
        String r = "";
        boolean neg = false;
        if (num < 0){
            neg = true;
            num = -num;
        }

        while (true){
            char c = (char) ('0' + num % base);
            r = c + r;
            if (num < base)
                break;
            num /= base;
        }

        if (neg)
            return "-" + r;
        else
            return r;
    }

    public static int convert(String str, int base) {
        boolean neg = false;
        if (str.charAt(0) == '-'){
            neg = true;
            str = str.substring(1);
        }
        int r = 0;
        for(char c: str.toCharArray()){
            int ci = c - '0';
            r = r * base + ci;
        }

        if (neg)
            return -r;
        else
            return r;
    }
}
