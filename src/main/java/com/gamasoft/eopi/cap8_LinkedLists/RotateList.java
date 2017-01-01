package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 01/01/17.
 */
public class RotateList {

    public static <T> LinkedListNode<T> rotateRight(LinkedListNode<T> listNode, int count) {

        int len = 0;
        LinkedListNode<T> curr = listNode;
        while (curr.next != null){
            len++;
            curr = curr.next;
        }
        LinkedListNode<T> tail = curr;
        tail.next = listNode;

        curr = listNode;
        for(int i = 0; i < len - count; i++)
            curr = curr.next;

        LinkedListNode<T> newHead = curr.next;
        curr.next = null;

        return newHead;

    }

}
