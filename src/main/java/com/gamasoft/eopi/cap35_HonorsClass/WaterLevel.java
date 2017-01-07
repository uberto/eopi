package com.gamasoft.eopi.cap35_HonorsClass;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by uberto on 07/01/17.
 */
public class WaterLevel {

    static class Mark{
        int pos;
        int height;

        public Mark(int pos, int height){
            this.pos = pos;
            this.height = height;
        }
    }

    public static int calculate(List<Integer> mountains) {
        int tot = 0;

        Deque<Mark> levels = new LinkedList<>();

        int pos = 0;
        for(int h: mountains){

            int lh = 0;
            while(!levels.isEmpty() && levels.peekFirst().height <= h){

                Mark curr = levels.removeFirst();
                tot += (pos  - curr.pos - 1) * (curr.height - lh);
                lh = curr.height;
            }
            if (!levels.isEmpty() ){
                tot += (pos  - levels.peekFirst().pos - 1) * (h - lh);
            }


            levels.addFirst(new Mark(pos, h));

            pos++;
        }

        return tot;
    }
}
