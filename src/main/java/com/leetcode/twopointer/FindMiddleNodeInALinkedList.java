package com.leetcode.twopointer;

public class FindMiddleNodeInALinkedList {

    /**
     * TC: O(N) SC: O(1) Pass: 2
     */
    public ListNode2 middleNode(ListNode2 head) {

        ListNode2 current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        current = head;
        for (int index = 0; index < count / 2; index++) {
            current = current.next;
        }

        return current;
    }

    /**
     * TC: O(N) SC: O(1) Pass: 1
     */
    public ListNode2 middleNodeOnePass(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
