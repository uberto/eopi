package com.gamasoft.eopi.cap13_HashMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uberto on 14/11/16.
 */

//13.2
public class AnonymousLetter {
    public static boolean canWrite(String magazine, String letter) {

        Map<Character, Integer> magMap = countChar(magazine);
        Map<Character, Integer> letterMap = countChar(letter);

        for(Map.Entry<Character, Integer> kv: letterMap.entrySet()){
            if (!magMap.containsKey(kv.getKey()) || magMap.get(kv.getKey()) < kv.getValue()) {
                System.out.println("Missing " + kv.getKey() + " found " + magMap.get(kv.getKey()) + " needed " + kv.getValue() );
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> countChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(char ci: s.toCharArray()){
            char c = Character.toLowerCase(ci);
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        return map;
    }
}
