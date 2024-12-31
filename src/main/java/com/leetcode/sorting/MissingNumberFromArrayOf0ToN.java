package com.leetcode.sorting;

/**
 * https://leetcode.com/problems/missing-number/description/
 *
 * Approach: Use Cyclic Sort and sort the array excluding the element that needs
 * to be placed at that missing index at the end. Once sorted, the index that
 * does not have the required number is the only one that's missing.
 * 
 * Approach 2: Use Sum Of All formula. Calculate the sum of all the numbers till N
 * and then deduct it from sum of all the elements in the array.
 */
public class MissingNumberFromArrayOf0ToN {

    // Time complexity: O(N)
    // Space complexity: O(1)
    public int findUsingCyclicSort(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != index && nums[index] != nums.length) {
                int temp = nums[index];
                nums[index] = nums[temp];
                nums[temp] = temp;
            } else {
                index++;
            }
        }

        index = 0;

        while (index < nums.length) {
            if (nums[index] != index) {
                return index;
            }
            index++;
        }

        return index;
    }


    // Time complexity: O(N)
    // Space complexity: O(1)
    public int findUsingSum(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int index = 0; index < nums.length; index++) {
            actualSum += nums[index];
        }
        return expectedSum - actualSum;
    }
}
