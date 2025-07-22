package com.leetcode.patterns;

public class AllStar {
    /**
     * Time Complexity: O(n ^ 2)
     */
    public void print(int n) {
        System.out.println(getClass().getName());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
