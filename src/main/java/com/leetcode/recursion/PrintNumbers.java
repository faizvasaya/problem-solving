package com.leetcode.recursion;

public class PrintNumbers {

    public void print(int n) {
        // Base Condition / Exit condition
        if (n > 5) {
            // The return
            return;
        }
        // Body
        System.out.println(n);

        // Recursive call
        print(n + 1);
    }
}
