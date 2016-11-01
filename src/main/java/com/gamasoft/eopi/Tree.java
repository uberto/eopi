package com.gamasoft.eopi;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by uberto on 01/11/16.
 */
public class Tree<T extends Comparable> {

    public static class Node<T extends Comparable> implements Comparable<Node<T>> {

        Set<Node<T>> children = new TreeSet<>();
        T value;
        public Node(T value){
            this.value = value;
        }

        @Override
        public int compareTo(Node<T> o) {
            return this.value.compareTo(o.value);
        }
    }
    Node<T> root;

    public void visitDeepFirst(Consumer<T> action){
        visitDF(root, action);
    }

    private void visitDF(Node<T> node, Consumer<T> action) {
        action.accept(node.value);
        for(Node<T> c: node.children)
            visitDF(c, action);
    }

    public void visitBreadthFirst(Consumer<T> action) {
        Deque<Node<T>> queue = new ArrayDeque<>();
        queue.addLast(root);

        while(!queue.isEmpty()){
            Node<T> node = queue.removeFirst();
            action.accept(node.value);
            for(Node<T> c: node.children)
                queue.addLast(c);
        }


    }


}
