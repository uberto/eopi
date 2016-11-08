package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by uberto on 01/11/16.
 */
public class TreeTest {

    @Test
    public void visitDF() {
        Tree<Integer> t = createSimpleTree();

        StringBuilder visited = new StringBuilder();

        t.visitDeepFirst(visited::append);

        Assert.assertEquals("013425", visited.toString());
    }



    @Test
    public void visitBF() {
        Tree<Integer> t = createSimpleTree();

        StringBuilder visited = new StringBuilder();

        t.visitBreadthFirst(visited::append);

        Assert.assertEquals("012345", visited.toString());
    }


    private Tree<Integer> createSimpleTree() {
    /*
        0
        1     2
        3 4   5
    */

        Tree.Node<Integer> n1 = new Tree.Node<>(1);
        n1.children.add(new Tree.Node<>(3));
        n1.children.add(new Tree.Node<>(4));
        Tree.Node<Integer> n2 = new Tree.Node<>(2);
        n2.children.add(new Tree.Node<>(5));

        Tree<Integer> t = new Tree<>();
        t.root = new Tree.Node<>(0);
        t.root.children.add(n1);
        t.root.children.add(n2);
        return t;
    }
}