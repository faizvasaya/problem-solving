package com.leetcode.linkedlist;

public class SinglyLinkedList implements ILinkedList {

    class Node {

        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public  Node head;

    @Override
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    @Override
    public void prepend(int data) {
        Node newHeadNode = new Node(data);
        newHeadNode.next = head;
        head = newHeadNode;
    }

    @Override
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + "=>");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
}
