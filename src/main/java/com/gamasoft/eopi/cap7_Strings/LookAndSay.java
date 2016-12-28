package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 28/12/16.
 */
public class LookAndSay {
    public static String number(int n) {
        if (n == 1)
            return "1";

        StringBuilder sb = new StringBuilder();
        String look = number(n - 1);
        int i = 0;
        while (i < look.length()) {
            char c = look.charAt(i);
            int r = 1;
            while (i + r < look.length() && look.charAt(i + r) == c)
                r++;
            sb.append(r);
            sb.append(c);
            i += r;
        }

        return sb.toString();
    }
}
