package com.leetcode.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Arrays.sort(nums);

        int index = 1;
        while (index < nums.length) {
            if (nums[index] == nums[index - 1]) {
                return true;
            }
            index++;
        }
        return false;
    }

    public boolean containsDuplicateUsingSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        return set.size() < nums.length;
    }
}
