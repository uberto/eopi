package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 29/12/16.
 */
public class SubString {
    public static int find(String main, String substring) {
        if (substring.length() > main.length())
            return -1;

        long currHash = 0;
        long soughtHash = 0;
        long power = 1;
        for(int i=0; i<substring.length(); i++){
            currHash = currHash*10 + getCharNum(main, i);
            soughtHash = soughtHash*10 + getCharNum(substring, i);

            power *= 10;
        }
        power /= 10;

        if (currHash == soughtHash)
            return 0;

        for (int i = substring.length(); i < main.length(); i++){
            currHash -= getCharNum(main, i - substring.length()) * power;
            currHash = currHash * 10 + getCharNum(main, i);
            if (currHash == soughtHash)
                return i - substring.length() + 1;
        }

        return -1;
    }

    private static int getCharNum(String s, int pos) {
        return s.charAt(pos) - 'a';
    }
}
