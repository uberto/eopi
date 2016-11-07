package com.gamasoft.eopi.cap8_LinkedLists;

import java.util.Comparator;

/**
 * Created by uberto on 07/11/16.
 */
public class MergeList {
    public static <T extends Comparable> ListNode<T> merge(ListNode<T> a, ListNode<T> b) {
        ListNode<T> head;

        if (a.value.compareTo(b.value) < 0) {
            head = a;
            a = a.next;
        } else {
            head = b;
            b = b.next;
        }
        ListNode<T> curr = head;

        while(a != null || b != null){
            if (a == null || b.value.compareTo(a.value) < 0){
                curr.next = b;
                b = b.next;
            } else {
                curr.next = a;
                a = a.next;
            }
            curr = curr.next;
        }

        return head;

    }

}
