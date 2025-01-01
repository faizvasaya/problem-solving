package com.leetcode.sorting;

/**
 * https://leetcode.com/problems/set-mismatch/description/
 * 
 * Approach:
 * Use Cyclic sort to sort the nums array ignoring the duplicate, if the duplicate number has once been
 * placed at the required index. Then check the number that is not at the appropriate location and return the
 * number and the index + 1 of it.
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
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
                return new int[]{nums[index], index + 1};
            }
            index++;
        }
        return new int[]{};
    }
}
