package com.leetcode.collectionsinjava;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {

    public void print() {
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "Rohan");
        map.put(1, "Rahul");
        map.put(2, "Karim");
        map.put(null, "ABC");

        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue(1));

        for (Object elem : map.keySet()) {
            System.out.println(elem);
        }

        map.remove(null);

        for (Object elem : map.entrySet()) {
            System.out.println(elem);
        }
    }
}
