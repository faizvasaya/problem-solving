package com.leetcode.binarysearch;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/ Approach: Use
 * binary search. If mid is an even index then check mid + 1 is equal to mid and
 * increment start to mid + 1 since the array before mid is correctly sorted
 * with each element twice. If mid is an odd index then check mid - 1 is equal
 * to mid and increment start to mid + 1 since the array before mid is correctly
 * sorted with each element twice. If that is not the case then decrement end to
 * mid - 1 since the array before mid has an element missing.
 */
public class SingleElementInASortedArray {

    // Time Complexity: O(Log N)
    public int findUsingBinarySearch(int nums[]) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            boolean isEvenIndex = mid % 2 == 0;

            if (isEvenIndex && nums[mid] == nums[mid + 1]) {
                start = mid + 1;
            } else if (!isEvenIndex && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

    //Time Complexity: O(N)
    public int findUsingBruteForce(int nums[]) {
        for (int index = 0; index < nums.length; index++) {

            if (index + 1 < nums.length && nums[index] == nums[index + 1]) {
                index++;
                continue;
            }
            return nums[index];
        }

        return -1;
    }

    //Time Complexity: O(N)
    public int findUsingTwoPointer(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int startPointer = 0;
        int nextPointer = 1;

        while (nextPointer <= nums.length) {
            if (nextPointer == nums.length) {
                return nums[startPointer];
            }

            if (nums[startPointer] == nums[nextPointer]) {
                startPointer = nextPointer + 1;
                nextPointer = startPointer + 1;
                continue;
            }

            return nums[startPointer];
        }

        return -1;
    }
}
