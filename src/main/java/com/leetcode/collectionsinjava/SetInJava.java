package com.leetcode.collectionsinjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInJava {
    public void print() {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        Set<Integer> sl = new LinkedHashSet<>();
        sl.add(3);
        sl.add(1);
        sl.add(2);

        Set<Integer> slt = new TreeSet<>();
        slt.add(3);
        slt.add(1);
        slt.add(2);

        System.out.println(s);
        System.out.println(sl);
        System.out.println(slt);
    }
}
