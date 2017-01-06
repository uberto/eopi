package com.gamasoft.eopi.cap10_BTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uberto on 04/01/17.
 */
public class PreorderReconstruct {
    public static BTree<Integer> createTree(String output) {
        String[] values = output.split(",");
        List<Integer> list = new ArrayList<>();

        for (String v: values)
            if (v.equals("_"))
                list.add(null);
            else
                list.add(Integer.valueOf(v));


        return constructTree(list, 0).node;

    }

    private static Result constructTree(List<Integer> list, int offset) {
        Integer val = list.get(offset);
        if (val == null)
            return new Result(null, 1);

        Result leftRes = constructTree(list, offset + 1);
        Result rightRes = constructTree(list, offset + 1 + leftRes.nodesRead);
        BTree<Integer> node = new BTree<>(val, leftRes.node, rightRes.node);
        return new Result(node, 1+leftRes.nodesRead+rightRes.nodesRead);


    }


    private static class Result{
        public BTree<Integer> node = null;
        public int nodesRead = 0;

        public Result(BTree<Integer> node, int nodesRead) {
            this.node = node;
            this.nodesRead = nodesRead;
        }
    }


}
