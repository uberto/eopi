package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 01/11/16.
 */
public class SingleLinkedList<T> {

    public static class Element<T>{

        Element<T> next;
        T value;
    }
    Element<T> head;

    Element<T> add(T value){
        if (head == null){
            head = new Element<>();
            head.value = value;
            return head;
        }
        Element<T> curr = findLast();

        curr.next = new Element<>();
        curr.next.value = value;
        return curr.next;
    }

    private Element<T> findLast() {
        Element<T> curr = head;
        while (curr.next != null)
            curr = curr.next;
        return curr;
    }

    public Element<T> findMiddle() {
        Element<T> currSlow = head;
        Element<T> currFast = head;
        while (currFast.next != null && currFast.next.next != null) {
            currSlow = currSlow.next;
            currFast = currFast.next.next;
        }
        return currSlow;
    }
}
