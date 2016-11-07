package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 07/11/16.
 */
public class ReverseSubList {

    public static void reverse(ListNode<Integer> head, int from, int len) {

        int i = 0;
        ListNode<Integer> curr = head;
        ListNode<Integer> cutPoint = curr;
        for (int j = 0; j < from; j++) {
            cutPoint = curr;
            curr = curr.next;
        }

        for (int j = 0; j < len - 1; j++) {
            ListNode<Integer> tmp = curr.next;
            curr.next = tmp.next;
            tmp.next = cutPoint.next;
            cutPoint.next = tmp;
        }
    }
}
