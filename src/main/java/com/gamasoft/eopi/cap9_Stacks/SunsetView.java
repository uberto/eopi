package com.gamasoft.eopi.cap9_Stacks;

import java.util.*;

/**
 * Created by uberto on 02/01/17.
 */
public class SunsetView {


    public static List<Integer> addBuildings(int... heights) {
        Deque<Integer> views = new ArrayDeque<>();

        for(int h: heights){
            while (!views.isEmpty() && h > views.peek()){
                views.removeFirst();
            }
            views.addFirst(h);
        }


        List<Integer> res = new ArrayList<>(views);
        Collections.reverse( res);
        return res;
    }
}
