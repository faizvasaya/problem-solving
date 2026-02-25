package com.leetcode.arrayproblems;

import java.util.Arrays;

public class MaximumSubarray {

    /**
     * TC: O(N ^ 2)
     */
    public int findUsingBruteForce(int[] nums) {
        int largestSum = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            int currentSum = 0;
            for (int jIndex = index; jIndex < nums.length; jIndex++) {
                currentSum = currentSum + nums[jIndex];
                largestSum = Math.max(largestSum, currentSum);
            }
        }
        return largestSum;
    }

    public int findUsingKanadesAlgorithm(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int index = 1; index < nums.length; index++) {
            maxEndingHere = Math.max(nums[index], nums[index] + maxEndingHere);

            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public int findUsingKanadesAlgorithm2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int index = 0; index < nums.length; index++) {
            sum = sum + nums[index];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public int findUsingKanadesAlgorithm2PrintRange(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] range = {-1, -1};

        for (int index = 0; index < nums.length; index++) {
            if (sum == 0) {
                range[0] = index;
            }
            sum = sum + nums[index];

            if (sum > max) {
                max = sum;
                range[1] = index;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(Arrays.toString(range));
        return max;
    }
}
