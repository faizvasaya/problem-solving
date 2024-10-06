package com.leetcode.linkedlist;

public class LinkedListExecutor {

    public static void main(String args[]) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.append(10);
        doublyLinkedList.append(20);
        doublyLinkedList.append(30);

        doublyLinkedList.delete(5);

        doublyLinkedList.print();
        System.out.println();
        doublyLinkedList.printBackward();


    }
}
