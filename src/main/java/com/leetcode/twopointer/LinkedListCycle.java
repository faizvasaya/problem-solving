package com.leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    /**
     * SC: O(N) TC: O(N)
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();

        ListNode current = head;

        while (current != null) {
            if (!seen.add(current)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /**
     * SC: O(1)
     * TC: O(N)
     */
    public boolean hasCycleSlowFastPointer(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
