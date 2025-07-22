package com.leetcode.collectionsinjava;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListInJava {

    public void print() {
        // List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Bread");
        list.add("Milk");
        list.add("Butter");

        // Iterator<String> it = list.iterator();

        // while (it.hasNext()) {
        //     String item = it.next();
        //     if (item.equals("Milk")) {
        //         it.remove();
        //     }

        // }

        for (String item : list) {
            if (item.equals("Milk")) {
                list.add("NewItem");
            }
        }

        System.out.println(list);
    }
}
