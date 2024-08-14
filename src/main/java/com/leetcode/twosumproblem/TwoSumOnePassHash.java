package com.leetcode.twosumproblem;

import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity: O(n) with only one pass required
 * Space Complexity: O(n)
 */
public class TwoSumOnePassHash implements TwoSumCalculator {

    @Override
    public int[] calculateTwoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (hashMap.containsKey(complement)) {
                return new int[]{hashMap.get(complement), index};
            }
            hashMap.put(nums[index], index);
        }

        throw new IllegalArgumentException("No two sum solution found for the provided arguments");
    }
}
