package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 01/01/17.
 */
public class LinkedListNode<T> {

    LinkedListNode<T> next;
    T value;

    public static <T> LinkedListNode<T>createList(T... values) {

        LinkedListNode<T> dummyHead = new LinkedListNode<>();
        LinkedListNode<T> current = dummyHead;
        for(T val: values){
            current.next = new LinkedListNode<>();
            current.next.value = val;
            current = current.next;
        }
        return dummyHead.next;

    }
}
