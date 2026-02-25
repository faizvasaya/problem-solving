package com.leetcode.arrayproblems;

public class MaximumConsecutiveOnes {

    /**
     * TC: O(N) SC: O(1)
     */
    public int find(int[] nums) {
        int currentOneCounter = 0;
        int maxOneCounter = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1) {
                currentOneCounter += 1;
                maxOneCounter = Math.max(currentOneCounter, maxOneCounter);
            } else {
                currentOneCounter = 0;
            }
        }

        return maxOneCounter;
    }

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public int findUsingTwoPointer(int[] nums) {
        int maxOneCounter = 0;
        int left = 0;
        int right = 0;

        while (left < nums.length && right < nums.length) {
            if (nums[right] == 1) {
                int distance = right - left + 1;
                maxOneCounter = Math.max(distance, maxOneCounter);
            } else {
                left = right + 1;
            }
            right++;
        }

        return maxOneCounter;
    }
}
