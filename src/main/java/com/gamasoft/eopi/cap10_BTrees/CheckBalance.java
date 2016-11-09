package com.gamasoft.eopi.cap10_BTrees;

/**
 * Created by uberto on 09/11/16.
 */
public class CheckBalance {
    public static boolean check(BTree<?> tree) {
        return depth(tree) < Integer.MAX_VALUE;
    }

    public static int depth(BTree<?> tree) {
        if (tree == null)
            return 0;
        else {
            int l = depth(tree.left) + 1;
            int r = depth(tree.right) + 1;
            if (Math.abs(l-r) > 1)
                return Integer.MAX_VALUE;
            else
                return Math.max(l, r);
        }
    }
}
