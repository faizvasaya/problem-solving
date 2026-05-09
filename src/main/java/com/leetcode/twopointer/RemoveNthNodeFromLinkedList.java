package com.leetcode.twopointer;

public class RemoveNthNodeFromLinkedList {

    public ListNode2 removeNthFromEnd(ListNode2 head, int n) {
        ListNode2 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        System.out.println(size);
        
        int index = 1;
        current = head;
        int till = size - n;
        
        if (size == n) {
            till = n;
        }
        
        System.out.println(till);

        while (index < till && current != null) {
            index++;
            current = current.next;
        }

        System.out.println(index);
        System.out.println(current.val);

        if (current.next != null) {
            current.next = current.next.next;
        } else if(size != 1) {
            current.next = null;
        } else {
            return new ListNode2();
        }

        return head;
    }
}
