package com.leetcode.linkedlist;

public class DoublyLinkedList implements ILinkedList {

    class Node {

        Node prev;
        int data;
        Node next;

        public Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    @Override
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    @Override
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        if (tail.data == data) {
            tail = tail.prev;
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        current.prev.next = current.next;

        if (current.next != null) {
            current.next.prev = current.prev;
        }

    }

    @Override
    public void print() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.next;
        }

        System.out.print("null");
    }

    public void printBackward() {
        if (tail == null) {
            return;
        }

        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.prev;
        }

        System.out.print("null");
    }
}
