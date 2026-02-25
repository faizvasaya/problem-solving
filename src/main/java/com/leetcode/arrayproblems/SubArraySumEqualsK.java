package com.leetcode.arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    /**
     * TC: O(N x N)
     */
    public int subArraySumUsingBruteForce(int[] nums, int k) {
        int subArrayCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int subArraySum = nums[i];
            if (subArraySum == k) {
                subArrayCount++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                subArraySum += nums[j];
                if (subArraySum == k) {
                    subArrayCount++;
                }
            }
        }

        return subArrayCount;
    }

    /**
     * TC: O(N x Log N)
     * SC: O(N)
     */
    public int subArraySumUsingPrefixSum(int[] nums, int k) {
        long prefixSum = 0;
        int count = 0;
        Map<Long, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0L, 1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            long want = prefixSum - k;
            count += prefixMap.getOrDefault(want, 0);
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
