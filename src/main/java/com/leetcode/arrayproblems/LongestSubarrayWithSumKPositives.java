package com.leetcode.arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumKPositives {

    /**
     * TC: O(N^2) SC: O(1)
     */
    public int find(int[] nums, int k) {
        int longestSubarray = 0;

        for (int index = 0; index < nums.length; index++) {
            int currentSum = 0;
            for (int jIndex = index; jIndex < nums.length; jIndex++) {
                currentSum = currentSum + nums[jIndex];
                if (currentSum == k) {
                    longestSubarray = Math.max(jIndex - index + 1, longestSubarray);
                }
            }
        }

        return longestSubarray;
    }

    /**
     * TC: BC: O(N) WC: O(N log N)
     */
    public int findUsingHashing(int[] nums, int k) {
        int longestSubarray = 0;
        int sum = 0;
        Map<Integer, Integer> sumToIndexMapping = new HashMap<>();
        int i = 0;

        while (i < nums.length) {
            sum = sum + nums[i];

            if (sum == k) {
                longestSubarray = Math.max(longestSubarray, i + 1);
            }

            Integer remainingSum = sum - k;
            if (sumToIndexMapping.containsKey(remainingSum)) {
                int length = i - sumToIndexMapping.get(remainingSum);
                longestSubarray = Math.max(longestSubarray, length);
            }

            if (!sumToIndexMapping.containsKey(sum)) {
                sumToIndexMapping.put(sum, i);
            }
            i++;
        }

        return longestSubarray;
    }

    /**
     * TC: O(2N)
     * SC: O(1)
     */
    public int findUsingTwoPointer(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;

        while (right < nums.length) {
            sum = sum + nums[right];

            while (sum > k && left <= right) {
                sum = sum - nums[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(right - left + 1, maxLength);
            }

            right++;
        }

        return maxLength;
    }
}
