package com.leetcode.arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    /**
     * TC: O(N^2) SC: O(1)
     */
    public int[] findUsingBruteForce(int[] nums, int target) {

        for (int index = 0; index < nums.length - 1; index++) {
            for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
                if (nums[index] + nums[jIndex] == target) {
                    return new int[]{index, jIndex};
                }
            }
        }

        return new int[]{};
    }

    /**
     * TC: O(N) SC: O(N)
     * In worst case: O(N log N)
     */
    public int[] findUsingHashing(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            Integer complementsLocation = map.get(complement);
            if (complementsLocation != null && complementsLocation != index) {
                return new int[]{index, complementsLocation};
            }
        }

        return new int[]{};
    }

    /**
     * TC: O(N) SC: O(N)
     * In worst case: O(N log N)
     */
    public int[] findUsingHashingSinglePass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            Integer complementsLocation = map.get(complement);
            if (complementsLocation != null && complementsLocation != index) {
                return new int[]{index, complementsLocation};
            }
            map.put(nums[index], index);
        }

        return new int[]{};
    }
}
