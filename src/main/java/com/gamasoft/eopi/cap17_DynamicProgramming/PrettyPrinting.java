package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by uberto on 29/11/16.
 */
public class PrettyPrinting {

    public static int messiness(List<String> text, int width) {
        return text.stream().map(s->  ((int) Math.pow((width - s.length()),2))).reduce(Integer::sum).orElse(-1);
    }

    public static List<String> justify(List<String> words, int width) {

        Map<Integer, List<String>> memo = new HashMap<>();
        return calcJustification(memo, words, width);
    }

    private static List<String> calcJustification(Map<Integer, List<String>> memo, List<String> words, int width) {
        if (memo.containsKey(words.size()))
            return memo.get(words.size());

        List<String> res = new ArrayList<>();
        if (words.size() == 0) {
            return res;
        } else if (words.size() == 1) {
            res.add(words.get(0));
            return res;
        }

        String lastLine = "";
        int messiness = Integer.MAX_VALUE;
        for (int i = words.size() - 1; i >= 0 ; i--) {

            lastLine = words.get(i) + (lastLine.isEmpty() ? "" : " ") + lastLine;
            if (lastLine.length() > width )
                break;


            List<String> lines = justify(words.subList(0, i), width);
            lines.add(lastLine);

            int currMess = messiness(lines, width);

            if (currMess < messiness) {
                messiness = currMess;
                res = lines;
            }
        }

        memo.put(words.size(), res);
        return res;
    }
}
