package com.gamasoft.eopi.cap16_Recursion;

/**
 * Created by uberto on 20/11/16.
 */
public class Hanoi {
    public static String generate(int towerHeigh) {

        return generate(towerHeigh, "a", "c", "b");
    }

    private static String generate(int h, String from, String to, String using) {
        if (h == 1)
            return from + to + ",";
        else
            return generate(h - 1, from, using, to) + from+to+"," + generate(h - 1, using, to, from);
    }
}
