package com.leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    /**
     * TC: O(N)
     * SC: O(N)
     */
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if(seen.contains(current)) return current;
            seen.add(current);
            current = current.next;
        }

        return null;
    }

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public ListNode detectCycleWithoutSpace(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) { // If cycle exists
                ListNode p1 = head;
                ListNode p2 = slow;
                while(p1 != p2) { // Increment head and slow pointer one untill they meet
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1;
            }
        }

        return null;
    }
}
