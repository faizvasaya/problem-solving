package com.leetcode.linkedlist;

public class LinkedListExecutor {

    public static void main (String args[]) {
        ILinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);

        singlyLinkedList.prepend(0);
        singlyLinkedList.prepend(8);

        singlyLinkedList.delete(0);
        singlyLinkedList.delete(2);

        singlyLinkedList.print();
    }    
}
