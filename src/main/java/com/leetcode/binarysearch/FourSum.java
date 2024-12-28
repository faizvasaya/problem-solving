package com.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/4sum/description/ Approach: Two - pointer: The
 * outer loop skips the last three element and the inner loop skips the last two
 * elements. Insider the inner loop, the two pointers start and end moves along
 * the array based on the conditions.
 */
public class FourSum {

    // Time Complexity: O(N^3)
    public List<List<Integer>> findUsingTwoPointer(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);

        for (int outerIndex = 0; outerIndex < nums.length - 3; outerIndex++) {
            if (outerIndex > 0 && nums[outerIndex] == nums[outerIndex - 1]) {
                continue;
            }

            for (int innerIndex = outerIndex + 1; innerIndex < nums.length - 2; innerIndex++) {
                if (innerIndex > outerIndex + 1 && nums[innerIndex] == nums[innerIndex - 1]) {
                    continue;
                }

                int start = innerIndex + 1;
                int end = nums.length - 1;

                while (start < end) {
                    long sum = (long) nums[outerIndex] + nums[innerIndex] + nums[start] + nums[end];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[outerIndex], nums[innerIndex], nums[start], nums[end]));

                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return result;
    }
}
