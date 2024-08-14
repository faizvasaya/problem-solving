package com.leetcode.twosumproblem;

/**
 * Time complexity: O(n^2) (Order of n square)
 * Space complexity: O(1) 
 */
public class TwoSumBruteForce implements TwoSumCalculator {

    @Override
    public int[] calculateTwoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Array nums is required to find two sum solution");
        }

        for (int outerIndex = 0; outerIndex < nums.length - 1; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) {
                if (nums[outerIndex] + nums[innerIndex] == target) {
                    return new int[]{outerIndex, innerIndex};
                }
            }
        }

        throw new IllegalArgumentException("No solution found for two sum problem");
    }
}
