package com.leetcode.sorting;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 * Approach I: Use Bubble Sort to sort the array Approach II: Count the number
 * of 0s, 1s and 2s and store the count in a map. Use a loop to populate the
 * original array with those number of 0s, 1s and 2s.
 */
public class SortColors {

    // Time Complexity: O(N^2)
    public void sortColorsUsingBubbleSort(int[] nums) {
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) {
            for (int innerIndex = 1; innerIndex < nums.length - outerIndex; innerIndex++) {
                if (nums[innerIndex - 1] > nums[innerIndex]) {
                    int temp = nums[innerIndex - 1];
                    nums[innerIndex - 1] = nums[innerIndex];
                    nums[innerIndex] = temp;
                }
            }
        }
    }

    // Time Complexity: O(N)
    public void sortColorsUsingHashMapAndNumberCounting(int[] nums) {
        HashMap<Integer, Integer> occurence = new HashMap<>();
        occurence.put(0, 0);
        occurence.put(1, 0);
        occurence.put(2, 0);

        for (int index = 0; index < nums.length; index++) {
            occurence.put(nums[index], occurence.get(nums[index]) + 1);
        }

        int numsIndex = 0;
        for (int color = 0; color < 3; color++) {
            int occurences = occurence.get(color); //2
            for (int index = 0; index < occurences; index++) {
                nums[numsIndex] = color;
                numsIndex++;
            }
        }
    }
}
