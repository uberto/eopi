package com.gamasoft.eopi.cap17_DynamicProgramming;

import java.util.List;

/**
 * Created by uberto on 29/11/16.
 */
public class PrettyPrinting {

    public static int messiness(List<String> text, int width) {
        return text.stream().map(s->  ((int) Math.pow((width - s.length()),2))).reduce(Integer::sum).orElse(-1);
    }

}
