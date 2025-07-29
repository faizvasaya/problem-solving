package com.leetcode.recursion;

public class SumOfNNumber {

    public void sumTillN(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumTillN(i - 1, sum + i);
    }

    public int sumTillNReturn(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumTillNReturn(n - 1);
    }
}
