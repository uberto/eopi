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

        return fill(wordSet, dict, domain);

    }

    private static Set<String> fill(Set<String> wordSet, List<String> dict, String domain) {

        for(String w: dict){
            if (domain.startsWith(w)){
                String leftOver = domain.substring(w.length());
                if (leftOver.isEmpty()) {
                    Set<String> set = new HashSet<>();
                    set.add(w);
                    return set;
                } else {
                    Set<String> set = fill(wordSet, dict, leftOver);
                    if (!set.isEmpty()){
                        wordSet.addAll(set);
                        wordSet.add(w);
                    }
                }
            }
        }
        return wordSet;
    }
}
