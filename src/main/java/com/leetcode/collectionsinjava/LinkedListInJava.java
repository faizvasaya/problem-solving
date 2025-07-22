package com.leetcode.collectionsinjava;

import java.util.LinkedList;

public class LinkedListInJava {

    public void print() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1, 2);
        linkedList.addLast(3);
        linkedList.addFirst(1);
        linkedList.remove(new Integer(1));

        System.out.println(linkedList.get(1));

        for (Integer item : linkedList) {
            System.out.println(item);
        }

        
    }
}
