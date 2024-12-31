package com.leetcode.sorting;

/**
 * Given the range of numbers is [1,n] where each element appears only once. Sort
 * the numbers.
 */
public class CyclicSort {

    public void sortAscending(int[] nums) {
        int index = 0;
        while (index < nums.length - 1) {

            int expectedItemAtTheCurrentIndex = index + 1;

            if (nums[index] == expectedItemAtTheCurrentIndex) {
                index++;
                continue;
            }

            int expectedIndexOfCurrentItem = nums[index] - 1;
            int temp = nums[expectedIndexOfCurrentItem];
            nums[expectedIndexOfCurrentItem] = nums[index];
            nums[index] = temp;
        }
    }
}
