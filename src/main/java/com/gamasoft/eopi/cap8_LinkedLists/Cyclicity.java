package com.gamasoft.eopi.cap8_LinkedLists;

/**
 * Created by uberto on 07/11/16.
 */
public class Cyclicity {
    public static boolean detect(ListNode<Integer> head) {
        ListNode<Integer> fast = head;
        ListNode<Integer> slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
