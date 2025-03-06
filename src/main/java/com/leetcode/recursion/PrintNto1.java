package com.leetcode.recursion;

public class PrintNto1 {

    // Space Complexity: O(N)
    public void print(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);

        System.out.println(n);
    }
}
