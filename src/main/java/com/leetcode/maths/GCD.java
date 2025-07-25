package com.leetcode.maths;

public class GCD {

    /**
     * Time Complexity: O(Min(n1,n2)
     */
    public void find(int n1, int n2) {
        System.out.println(getClass().getName());

        int min = Math.min(n1, n2);
        for (int i = min; i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
