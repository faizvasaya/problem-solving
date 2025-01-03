package com.leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/largest-number/description/
 *
 * Approach: Use the built in Arrays sort method which uses merge sort
 * internally. However, since the expected output is a maximized number, we use
 * a custom sort method that compares the concatenation of a+b and b+a and sorts
 * them accordingly.
 */
public class LargestNumber {

    // Time Complexity: O(N log N)
    public String findUsingGreedyComparision(int[] nums) {
        String[] convertedArray = new String[nums.length];

        for (int index = 0; index < nums.length; index++) {
            convertedArray[index] = Integer.toString(nums[index]);
        }

        Arrays.sort(convertedArray, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        if ("0".equals(convertedArray[0])) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String convertedArray1 : convertedArray) {
            sb.append(convertedArray1);
        }

        return sb.toString();
    }
}
