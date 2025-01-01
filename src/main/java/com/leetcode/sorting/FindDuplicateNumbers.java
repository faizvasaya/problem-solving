package com.leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumbers {

    // Time Complexity: O(N)
    public List<Integer> findUsingCyclicSort(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        while (index < nums.length) {
            int expectedIndexOfNumber = nums[index] - 1;
            if (index != expectedIndexOfNumber && nums[index] != nums[expectedIndexOfNumber]) {
                int temp = nums[index];
                nums[index] = nums[expectedIndexOfNumber];
                nums[expectedIndexOfNumber] = temp;
            } else {
                index++;
            }
        }

        index = 0;

        while (index < nums.length) {
            if (nums[index] != index + 1) {
                result.add(nums[index]);
            }
            index++;
        }
        return result;
    }

    // Time Complexity: O(N)
    public List<Integer> findUsingNumberNegation(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            int expectedIndexOfNumber = Math.abs(nums[index]) - 1;
            if (nums[expectedIndexOfNumber] < 0) {
                result.add(expectedIndexOfNumber + 1);
            } else {
                nums[expectedIndexOfNumber] = -Math.abs(nums[expectedIndexOfNumber]);
            }
        }
        return result;
    }
}
