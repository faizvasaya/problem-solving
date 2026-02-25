package com.leetcode.arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * TC: O(N log N) SC: O(N)
     */
    public int findUsingHashing(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int nBy2 = nums.length / 2;
        for (int index = 0; index < nums.length; index++) {
            int currentCount = map.getOrDefault(nums[index], 0);
            map.put(nums[index], ++currentCount);
            if (currentCount > nBy2) {
                return nums[index];
            }
        }

        return Integer.MIN_VALUE;
    }

    /**
     * TC: O(N ^ 2) SC: O(1)
     */
    public int findUsingBruteForce(int[] nums) {
        int nBy2 = nums.length / 2;
        for (int index = 0; index < nums.length; index++) {
            int count = 0;
            for (int jIndex = 0; jIndex < nums.length; jIndex++) {
                if (nums[jIndex] == nums[index]) {
                    count++;
                }
            }

            if (count > nBy2) {
                return nums[index];
            }
        }

        return Integer.MIN_VALUE;
    }

    public int findUsingMooresVotingAlgorithm(int[] nums) {
        int index = 1;
        int element = nums[0];
        int count = 1;

        while (index < nums.length) {
            if (count == 0) {
                element = nums[index];
                count = 1;
            } else if (nums[index] == element) {
                count++;
            } else {
                count--;
            }

            index++;
        }
        count = 0;
        int nBy2 = nums.length / 2;
        for (int jIndex = 0; jIndex < nums.length; jIndex++) {
            if (nums[jIndex] == element) {
                count++;
            }

            if (count > nBy2) {
                return element;
            }
        }

        return Integer.MIN_VALUE;
    }

}
