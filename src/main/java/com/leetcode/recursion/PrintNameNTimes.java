package com.leetcode.recursion;

public class PrintNameNTimes {

    public int count = 0;

    public void print(int n) {
        if (count == n) {
            return;
        }
        System.out.println("Faizal");
        this.count++;
        print(n);
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N) because stack space for recursive calls
     */
    public void printWithoutGlobal(int i, int n) {
        if (i == n) {
            return;
        }
        System.out.println("Faizal");
        printWithoutGlobal(++i, n);
    }
}
