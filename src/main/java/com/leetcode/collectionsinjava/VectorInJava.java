package com.leetcode.collectionsinjava;

import java.util.Arrays;
import java.util.Vector;

public class VectorInJava {

    public void print() {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);

        Vector<Integer> vector25 = new Vector<>(5, 25);

        vector25.add(90);

        Vector<Integer> vector10 = new Vector<>(Arrays.asList(1, 2, 3));

        vector10.add(10);

        System.out.println(vector10);
    }
}
