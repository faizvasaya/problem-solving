package com.leetcode.arrayproblems;

public class RearrangeElementsBySign {

    /**
     * TC: O(N) SC: O(N)
     */
    public int[] rearrangeArray(int[] nums) {
        int index = 0;
        int positivePointer = 0;
        int negativePointer = 1;
        int[] rearrangedArray = new int[nums.length];
        while (index < nums.length) {
            if (nums[index] > 0) {
                rearrangedArray[positivePointer] = nums[index];
                positivePointer = positivePointer + 2;
            } else {
                rearrangedArray[negativePointer] = nums[index];
                negativePointer = negativePointer + 2;
            }

            index++;
        }

        return rearrangedArray;
    }

    /**
     * TC: O(N)
     * SC: O(N)
     */
    public int[] rearrangeArrayExtraPositivesOrNegatives(int[] nums) {
        int[] positiveElements = new int[nums.length];
        int[] negativeElements = new int[nums.length];
        int[] rearrangedArray = new int[nums.length];
        int positivePointer = 0;
        int negativePointer = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                positiveElements[positivePointer] = nums[index];
                positivePointer++;
            } else {
                negativeElements[negativePointer] = nums[index];
                negativePointer++;
            }
        }

        if (positivePointer == negativePointer) {
            for (int index = 0; index < nums.length / 2; index++) {

                rearrangedArray[2 * index] = positiveElements[index];

                rearrangedArray[2 * index + 1] = negativeElements[index];
            }

            return rearrangedArray;
        }

        if (positivePointer > negativePointer) {
            for (int index = 0; index < negativePointer; index++) {

                rearrangedArray[2 * index] = positiveElements[index];

                rearrangedArray[2 * index + 1] = negativeElements[index];
            }

            for (int index = 0; index < positivePointer - negativePointer; index++) {
                rearrangedArray[negativePointer * 2 + index]
                        = positiveElements[negativePointer + index];
            }
        } else {
            for (int index = 0; index < positivePointer; index++) {

                rearrangedArray[2 * index] = positiveElements[index];

                rearrangedArray[2 * index + 1] = negativeElements[index];
            }

            for (int index = 0; index < negativePointer - positivePointer; index++) {
                rearrangedArray[positivePointer * 2 + index]
                        = negativeElements[positivePointer + index];
            }
        }

        return rearrangedArray;
    }

    /**
     * TC: O(N + N/2) SC: O(N + N/2+ N/2)
     */
    public int[] rearrangeArrayUsingTwoLoops(int[] nums) {
        int[] positiveElements = new int[nums.length / 2];
        int[] negativeElements = new int[nums.length / 2];
        int[] rearrangedArray = new int[nums.length];
        int positivePointer = 0;
        int negativePointer = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > 0) {
                positiveElements[positivePointer] = nums[index];
                positivePointer++;
            } else {
                negativeElements[negativePointer] = nums[index];
                negativePointer++;
            }
        }

        for (int index = 0; index < nums.length / 2; index++) {

            rearrangedArray[2 * index] = positiveElements[index];

            rearrangedArray[2 * index + 1] = negativeElements[index];
        }

        return rearrangedArray;
    }
}
