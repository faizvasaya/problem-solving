package com.leetcode.collectionsinjava;

import java.util.IdentityHashMap;

public class IdentityHashMapInJava {

    public void print() {
        IdentityHashMap<String, Integer> hm = new IdentityHashMap<>();

        hm.put(new String("key"), null);
        hm.put(new String("key"), 1);

        System.out.println(hm);
    }
}
