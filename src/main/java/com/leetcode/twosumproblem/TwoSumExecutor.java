package com.leetcode.twosumproblem;

public class TwoSumExecutor {

    public static void main(String[] args) {
        TwoSumCalculator twoSum = new TwoSumOnePassHash();

        int[] largeArray = new int[]{3, 2, 4, 5};

        int target = 9;

        try {
            int[] result = twoSum.calculateTwoSum(largeArray, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
