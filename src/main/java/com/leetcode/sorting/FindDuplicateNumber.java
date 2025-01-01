package com.leetcode.sorting;

public class FindDuplicateNumber {

    public int findUsingCyclicSort(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int expectedIndexOfNumber = nums[index] - 1;
            if (index != expectedIndexOfNumber) {
                if (nums[index] == nums[expectedIndexOfNumber]) {
                    return nums[index];
                }
                int temp = nums[index];
                nums[index] = nums[expectedIndexOfNumber];
                nums[expectedIndexOfNumber] = temp;
            } else {
                index++;
            }
        }
        return -1;
    }
}
