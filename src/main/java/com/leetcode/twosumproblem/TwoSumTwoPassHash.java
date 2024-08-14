package com.leetcode.twosumproblem;

import java.util.HashMap;
import java.util.Map;

/*
 * Time Complexity: O(n) (But runs the loop twice)
 * Space Complexity: O(n)
 */
public class TwoSumTwoPassHash implements TwoSumCalculator {

    @Override
    public int[] calculateTwoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        // 1st pass
        for (int index = 0; index < nums.length; index++) {
            if (!hashMap.containsKey(nums[index])) {
                hashMap.put(nums[index], index);
            }
        }

        // 2nd pass
        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            boolean hashMapHasKey = hashMap.containsKey(complement) && hashMap.get(complement) != index;
            if (hashMapHasKey) {
                return new int[]{index, hashMap.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution found for the given arguments");
    }
}
