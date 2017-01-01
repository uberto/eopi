package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 01/11/16.
 */
public class SingleLinkedList<T> {

    LinkedListNode<T> head;

    LinkedListNode<T> add(T value){
        if (head == null){
            head = new LinkedListNode<>();
            head.value = value;
            return head;
        }
        LinkedListNode<T> curr = findLast();

        curr.next = new LinkedListNode<>();
        curr.next.value = value;
        return curr.next;
    }

    private LinkedListNode<T> findLast() {
        LinkedListNode<T> curr = head;
        while (curr.next != null)
            curr = curr.next;
        return curr;
    }

    public LinkedListNode<T> findMiddle() {
        LinkedListNode<T> currSlow = head;
        LinkedListNode<T> currFast = head;
        while (currFast.next != null && currFast.next.next != null) {
            currSlow = currSlow.next;
            currFast = currFast.next.next;
        }
        return currSlow;
    }
}
