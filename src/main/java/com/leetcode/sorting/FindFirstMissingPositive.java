package com.leetcode.sorting;

/**
 * https://leetcode.com/problems/first-missing-positive/
 *
 * Approach: Using cyclic sort, sort the elements ignoring if the index of the
 * element is greater than the size of the array or less than 0, or if the
 * number is a duplicate number already present at the correct location. Once
 * sorted check the number the index that does not have the correct value and
 * return its index+1 to find the missing value. If all the indexes have the
 * correct value then return the last index +1 value.
 */
public class FindFirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int expectedIndexOfNumber = nums[index] - 1;
            if (expectedIndexOfNumber != index && expectedIndexOfNumber >= 0 && expectedIndexOfNumber < nums.length && nums[index] != nums[expectedIndexOfNumber]) {
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
                return index + 1;
            }
            index++;
        }

        return index + 1;
    }
}
