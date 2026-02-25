package com.leetcode.arrayproblems;

import java.util.HashMap;
import java.util.Map;

import com.leetcode.sorting.QuickSort;

public class FindSingleNumber {

    /**
     * TC: O(N*N) SC: O(1)
     */
    public int find(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            boolean isMatchingNumberFound = false;

            for (int jIndex = 0; jIndex < nums.length; jIndex++) {
                if (nums[index] == nums[jIndex] && index != jIndex) {
                    isMatchingNumberFound = true;
                }
            }

            if (!isMatchingNumberFound) {
                return nums[index];
            }
        }

        return Integer.MIN_VALUE;
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public int findUsingXOR(int[] nums) {
        int xorResult = 0;
        for (int num : nums) {
            xorResult = xorResult ^ num;
        }
        return xorResult;
    }

    /**
     * TC: O(N log M) + O(M) 
     * SC: O(N/2 + 1)
     */
    public int findUsingHashMap(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int minFrequencyElement = Integer.MIN_VALUE;

        for (int num : nums) {
            int incValue = hashMap.getOrDefault(num, 0);
            hashMap.put(num, ++incValue);
        }

        for (Map.Entry<Integer, Integer> set : hashMap.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }

        return minFrequencyElement;
    }

    /**
     * TC: O(N log N)
     * SC: O(1)
     */
    public int findUsingSorting(int[] nums) {
        QuickSort qs = new QuickSort();
        qs.qs(nums, 0, nums.length - 1);

        for (int index = 0; index < nums.length; index = index + 2) {
            if (index + 1 < nums.length && nums[index] != nums[index + 1]) {
                return nums[index];
            }
        }
        return nums[nums.length - 1];
    }
}
