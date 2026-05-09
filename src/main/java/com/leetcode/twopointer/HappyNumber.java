package com.leetcode.twopointer;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    /**
     * TC: O((log N) ^ 2) SC: O(log N)
     */
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = sumOfSquares(n);
        }

        return true;
    }

    public boolean isHappyUsingNotSet(int n) {
        int slow = n;
        int fast = sumOfSquares(n);

        while (slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        return slow == 1;
    }

    /**
     * TC: O(log N) SC: O(1)
     */
    private int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
