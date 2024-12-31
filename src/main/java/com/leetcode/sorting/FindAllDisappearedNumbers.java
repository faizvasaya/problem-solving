package com.leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Approach: Use cyclic sort to sort the numbers excluding duplicates. Then use
 * another loop to identify numbers which are not at their correct indexes by
 * checking whether if a number at an index is equal to its index + 1. If not
 * add that number to the result array.
 *
 * Approach: Use number negation. Mark the expected index of each element in the
 * nums as negative. Post this only the indexes with missing numbers will have a
 * positive number. Add one to those indexes and add them to the list.
 */
public class FindAllDisappearedNumbers {

    // Time complexity: O(N)
    // Space complexity: O(1)
    public List<Integer> findUsingCyclicSort(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int index = 0;

        while (index < nums.length) {
            int expectedIndexOfNum = nums[index] - 1;
            if (nums[index] - 1 != index && nums[index] != nums[expectedIndexOfNum]) {
                int temp = nums[expectedIndexOfNum];
                nums[expectedIndexOfNum] = nums[index];
                nums[index] = temp;
            } else {
                index++;
            }
        }

        index = 0;

        while (index < nums.length) {
            if (nums[index] != index + 1) {
                result.add(index + 1);
            }
            index++;
        }

        return result;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
    public List<Integer> findUsingNumberNegation(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int expectedIndexOfNum = Math.abs(num) - 1; //3
            nums[expectedIndexOfNum] = -Math.abs(nums[expectedIndexOfNum]);
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                result.add(index + 1);
            }
        }

        return result;
    }
}
