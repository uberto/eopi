package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 07/11/16.
 */
public class LinkedLists {

    public static ListNode<Integer> intList(int... ints) {

        ListNode<Integer> head = new ListNode<>();
        ListNode<Integer> prev = head;
        for (int i: ints){
            ListNode<Integer> curr = new ListNode<Integer>();
            curr.value = i;
            prev.next = curr;
            prev = curr;
        }

        return head.next;

    }

    public static <T> String listToString(ListNode<T> head) {
        StringBuilder sb = new StringBuilder();

        ListNode<T> curr = head;
        while (curr != null){
            //System.out.println(curr.value);
            sb.append(curr.value.toString());
            sb.append(",");
            curr = curr.next;
        }

        return sb.toString();
    }
}
