package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    /**
     * TC: O(N) SC: O(N)
     */
    public List<Integer> findUsingHashMap(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> occurrences = new HashMap<>();
        int requiredOccurrences = nums.length / 3;

        for (int index = 0; index < nums.length; index++) {
            occurrences.put(nums[index], occurrences.getOrDefault(nums[index], 0) + 1);
            if (occurrences.get(nums[index]) > requiredOccurrences && !result.contains(nums[index])) {
                result.add(nums[index]);
            }
        }

        return result;
    }

    public List<Integer> findUsingMooresVotingAlgorithm(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for (int index = 0; index < nums.length; index++) {
            if (count1 == 0 && nums[index] != element2) {
                element1 = nums[index];
                count1 = 1;
            } else if (count2 == 0 && nums[index] != element1) {
                element2 = nums[index];
                count2 = 1;
            } else if (nums[index] == element1) {
                count1++;
            } else if (nums[index] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int nBy3 = nums.length / 3;
        count1 = 0;
        count2 = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == element1) {
                count1++;
            } else if (nums[index] == element2) {
                count2++;
            }
        }

        if (count1 > nBy3) {
            result.add(element1);
        }

        if (count2 > nBy3) {
            result.add(element2);
        }

        return result;
    }
}
