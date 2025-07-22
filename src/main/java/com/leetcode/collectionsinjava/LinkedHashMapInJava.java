package com.leetcode.collectionsinjava;

import java.util.LinkedHashMap;

public class LinkedHashMapInJava {
    public void print() {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>(2);

        hm.put(1, "ABC");
        hm.put(2, "PQR");
        hm.put(3, "XYZ");

        System.out.println(hm);
    }
}
