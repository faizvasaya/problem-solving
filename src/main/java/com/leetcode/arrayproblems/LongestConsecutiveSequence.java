package com.leetcode.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /**
     * TC: O(N x N x N)
     */
    public int findUsingBruteForce(int[] nums) {
        int maxSubsequenceCount = 0;
        for (int index = 0; index < nums.length; index++) {
            int currentSubsequence = 1;
            int x = nums[index];
            while (this.linearSearch(nums, x + 1)) {
                x++;
                currentSubsequence++;
            }
            maxSubsequenceCount = Math.max(maxSubsequenceCount, currentSubsequence);
        }
        return maxSubsequenceCount;
    }

    private boolean linearSearch(int[] nums, int elementToSearch) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == elementToSearch) {
                return true;
            }
        }
        return false;
    }

    /**
     * TC: O(N log N) + O(N)
     */
    public int findUsingSorting(int[] nums) {
        Arrays.sort(nums);
        int maxSubSequence = 0;
        int currentSubsequence = 1;
        int previous = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] - 1 == previous) {
                currentSubsequence++;
            } else if (nums[index] != previous) {
                currentSubsequence = 1;
            }
            previous = nums[index];
            maxSubSequence = Math.max(maxSubSequence, currentSubsequence);
        }

        return maxSubSequence;
    }

    /**
     * TC: O(N) + O(N)
     * SC: O(N)
     */
    public int findUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maximumSequence = 0;
        for (int index = 0; index < nums.length; index++) {
            set.add(nums[index]);
        }

        for (int num : set) {
            int currentSequence = 1;
            if (!set.contains(num - 1)) {
                while (set.contains(num + 1)) {
                    currentSequence++;
                    num++;
                }
            }
            maximumSequence = Math.max(currentSequence, maximumSequence);
        }

        return maximumSequence;
    }
}
