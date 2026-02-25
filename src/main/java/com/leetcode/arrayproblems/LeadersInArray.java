package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    /**
     * TC: O(N x N) SC: O(N)
     */
    public List<Integer> findUsingBruteForce(int[] nums) {
        List<Integer> leaders = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            boolean isLeader = true;
            for (int jIndex = index + 1; jIndex < nums.length; jIndex++) {
                if (nums[index] < nums[jIndex]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                leaders.add(nums[index]);
            }
        }

        return leaders;
    }

    /**
     * TC: O(N) SC: O(N)
     */
    public List<Integer> findUsingOptimalApproach(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int index = nums.length - 1; index >= 0; index--) {
            if (nums[index] > max) {
                max = nums[index];
                leaders.add(nums[index]);
            }
        }

        return leaders;
    }
}
