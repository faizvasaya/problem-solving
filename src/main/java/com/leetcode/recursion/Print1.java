package com.leetcode.recursion;

public class Print1 {

    public int count = 0;

    public void print() {
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print();
    }
}
