package com.leetcode.twopointer;

public class TwoPointerExecutor {

    public static void main(String[] args) {

        ListNode listNodeHead = new ListNode(3);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(-4);

        listNodeHead.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode1;

        LinkedListCycle cycle = new LinkedListCycle();
        System.out.println("Is cycle present: " + cycle.hasCycle(listNodeHead));

        System.out.println("Is cycle present: " + cycle.hasCycleSlowFastPointer(listNodeHead));

        ListNode2 listNodeHead2 = new ListNode2(1);
        ListNode2 listNode21 = new ListNode2(2);
        ListNode2 listNode22 = new ListNode2(3);
        ListNode2 listNode23 = new ListNode2(4);
        ListNode2 listNode24 = new ListNode2(5);
        ListNode2 listNode25 = new ListNode2(6);

        listNodeHead2.next = listNode21;
        listNode21.next = listNode22;
        listNode22.next = listNode23;
        listNode23.next = listNode24;
        listNode24.next = listNode25;

        FindMiddleNodeInALinkedList findMiddleNodeInALinkedList = new FindMiddleNodeInALinkedList();
        System.out.println("Middle Node is:" + findMiddleNodeInALinkedList.middleNode(listNodeHead2).val);

        System.out.println("Middle Node is:" + findMiddleNodeInALinkedList.middleNodeOnePass(listNodeHead2).val);

        HappyNumber hn = new HappyNumber();
        System.out.println("Is happy number: " + hn.isHappy(19));
        System.out.println("Is happy number: " + hn.isHappy(2));

        System.out.println("Is happy number without set: " + hn.isHappy(19));
        System.out.println("Is happy number without set: " + hn.isHappy(2));

        LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();

        ListNode listNodeHead3 = new ListNode(3);
        ListNode listNode31 = new ListNode(2);
        ListNode listNode32 = new ListNode(0);
        ListNode listNode33 = new ListNode(-4);

        listNodeHead3.next = listNode31;
        listNode31.next = listNode32;
        listNode32.next = listNode33;
        listNode33.next = listNode31;

        System.out.println("Cycle is present at: " + linkedListCycle2.detectCycle(listNodeHead).val);

        System.out.println("Cycle is present at: " + linkedListCycle2.detectCycleWithoutSpace(listNodeHead).val);

        RemoveNthNodeFromLinkedList nthNodeFromLinkedList = new RemoveNthNodeFromLinkedList();

        ListNode2 listNodeHead4 = new ListNode2(1);
        ListNode2 listNode41 = new ListNode2(2);
        // ListNode2 listNode42 = new ListNode2(3);
        // ListNode2 listNode43 = new ListNode2(4);
        // ListNode2 listNode44 = new ListNode2(5);

        listNodeHead4.next = listNode41;
        // listNode41.next = listNode42;
        // listNode42.next = listNode43;
        // listNode43.next = listNode44;


        nthNodeFromLinkedList.removeNthFromEnd(listNodeHead4, 2);

        
        System.out.print("Linked List After node removal");
        System.out.print("[");
        ListNode2 current = listNodeHead4;
        while (current != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
        System.out.println("]");

        ListNode2 listNodeHead5 = new ListNode2(1);
        ListNode2 listNodeHead6 = nthNodeFromLinkedList.removeNthFromEnd(listNodeHead5, 1);

        System.out.println();

        System.out.print("Linked List After node removal");
        System.out.print("[");
        current = listNodeHead6;
        while (current != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
        System.out.print("]");
    }
}
