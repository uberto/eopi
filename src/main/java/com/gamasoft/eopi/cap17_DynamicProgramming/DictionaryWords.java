package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by uberto on 02/12/16.
 */
public class DictionaryWords {
    public static Set<String> split(List<String> dict, String domain) {

        Set<String> wordSet = new HashSet<>();

        fill(wordSet, dict, domain);
        return wordSet;
    }

    private static boolean fill(Set<String> wordSet, List<String> dict, String domain) {
        if (domain.isEmpty())
            return true;

        boolean res = false;
        for(String w: dict){
            if (domain.startsWith(w)){
                String leftOver = domain.substring(w.length());
                if (fill(wordSet, dict, leftOver)){
                    wordSet.add(w);
                    res = true;
                }
            }
        }
        return res;
    }
}
