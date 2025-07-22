package com.leetcode.collectionsinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

public class ArrayListInJava {

    public void print() {
        List<Integer> list = new ArrayList<>(1000);

        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(50);

        for (int x : list) {
            System.out.println(x);
        }

        System.out.println();
        // list.remove(1);
        list.add(1, 100);
        list.set(3, 333);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println(list.contains(20));

        System.out.println(Arrays.asList("Monday", "Tuesday"));

        List<String> days;

        String[] array = {"Monday", "Tuesday", "Tuesday"};

        days = Arrays.asList(array);

        days.set(1, "EW");

        List<String> days1 = new ArrayList<>(days);

        days1.add("Friday");

        days1.addAll(days);

        days1.remove("Tuesday");

        System.out.println(days1);

        List<String> listSort = new ArrayList<>();
        listSort.add("Apple");
        listSort.add("Ban");
        listSort.add("Apppppple");

        // Collections.sort(listSort);
        // listSort.sort(new StringLengthComparator());
        listSort.sort((a, b) -> a.length() - b.length());
        System.out.println(listSort);
    }
}
