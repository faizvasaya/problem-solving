package com.leetcode.arrayproblems;

import java.util.Arrays;

public class SortColors {

    /**
     * *
     * TC: O(N) SC: O(1)
     *
     * @param nums
     */
    public void sortUsingCounterMethod(int[] nums) {
        int countOfZero = 0;
        int countOfOne = 0;
        int countOfTwo = 0;
        for (int index = 0; index < nums.length; index++) {
            switch (nums[index]) {
                case 0:
                    countOfZero++;
                    break;
                case 1:
                    countOfOne++;
                    break;
                case 2:
                    countOfTwo++;
                    break;
                default:
                    throw new AssertionError();
            }
        }

        for (int index = 0; index < countOfZero; index++) {
            nums[index] = 0;
        }

        for (int index = countOfZero; index < countOfZero + countOfOne; index++) {
            nums[index] = 1;
        }

        for (int index = countOfZero + countOfOne; index < countOfZero + countOfOne + countOfTwo; index++) {
            nums[index] = 2;
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public void sortUsingDutchNationalFlagAlgorithm(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid < nums.length && mid <= high) {
            switch (nums[mid]) {
                case 0:
                    this.swap(nums, mid, low);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    this.swap(nums, mid, high);
                    high--;
                    break;
                default:
                    throw new AssertionError();
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int indexA, int indexB) {
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }
}
