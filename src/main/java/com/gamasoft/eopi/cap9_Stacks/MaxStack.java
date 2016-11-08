package com.gamasoft.eopi.cap9_Stacks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by uberto on 08/11/16.
 */
public class MaxStack {
    Deque<Integer> stack = new LinkedList<>();

    Deque<Integer> max = new LinkedList<>();

    int currMax = Integer.MIN_VALUE;
    int howMany = 0;

    public void push(int i) {
        stack.push(i);
        if (i > currMax){
            max.push(currMax);
            max.push(howMany);
            currMax = i;
            howMany = 1;
        } else {
            howMany++;
        }
    }

    public int max() {
        return currMax;
    }

    public int pop() {
        howMany--;
        if (howMany == 0){
            howMany = max.pop();
            currMax = max.pop();
        }
        return stack.pop();
    }
}
