package com.leetcode.arrayproblems;

public class RepeatedMissingNumber {

    public int[] findRepeatedMissingUsingBruteForce(int[] nums, int rangeEndsAt) {
        int currentSum = 0;
        boolean repeatedNumberFound = false;
        int[] result = new int[2];

        for (int index = 0; index < nums.length; index++) {
            for (int jIndex = 0; jIndex < nums.length; jIndex++) {
                if (nums[index] == nums[jIndex] && index != jIndex) {
                    repeatedNumberFound = true;
                    result[0] = nums[index];
                    break;
                }
            }
            if (repeatedNumberFound) {
                break;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            currentSum = currentSum + nums[index];
        }

        int totalShouldBe = (rangeEndsAt * (rangeEndsAt + 1)) / 2;

        int missingNumber = totalShouldBe - (currentSum - result[0]);

        result[1] = missingNumber;

        return result;
    }

    /**
     * TC: O(N x N)
     */
    public int[] findRepeatingMissingUsingAnotherBruteForce(int[] nums, int rangeEndsAt) {
        int[] result = {-1, -1};
        for (int index = 1; index <= rangeEndsAt; index++) {
            int appearance = 0;
            for (int jIndex = 0; jIndex < nums.length; jIndex++) {
                if (nums[jIndex] == index) {
                    appearance++;
                }
            }
            if (appearance == 2) {
                result[0] = index;
            }
            if (appearance == 0) {
                result[1] = index;
            }

            if (result[0] != -1 && result[1] != -1) {
                break;
            }
        }

        return result;
    }

    /**
     * TC: O(2N) SC: O(N)
     */
    public int[] findRepeatingAndMissingUsingHashing(int[] nums, int range) {
        int[] result = {-1, -1};
        int[] hashMap = new int[range + 1];
        for (int index = 0; index < nums.length; index++) {
            hashMap[nums[index]] = ++hashMap[nums[index]];
        }

        for (int index = 1; index < hashMap.length; index++) {
            if (hashMap[index] == 2) {
                result[0] = index;
            }
            if (hashMap[index] == 0) {
                result[1] = index;
            }

            if (result[0] != -1 && result[1] != -1) {
                break;
            }
        }

        return result;
    }

    /*
    TC: O(N)
    SC: O(1)
     */
    public long[] findRepeatingAndMissingNumberUsingMathematicalOperation(int[] nums, int range) {

        long[] result = {-1, -1};

        long totalOfAllElementsOfArray = 0;
        long totalOfSquareOfAllElementsOfArray = 0;
        for (int index = 0; index < nums.length; index++) {
            totalOfAllElementsOfArray += nums[index];
            totalOfSquareOfAllElementsOfArray += ((long) nums[index] * (long) nums[index]);
        }
        long totalOfRange = (range * (range + 1)) / 2;

        long equation1 = totalOfAllElementsOfArray - totalOfRange; // (x - y) = -4

        long totalOfSquaresOfAllElements = (range * (range + 1) * (2 * range + 1)) / range;

        long equation2 = totalOfSquareOfAllElementsOfArray - totalOfSquaresOfAllElements; // (x^2 - y^2) = -24

        equation2 = equation2 / equation1;

        result[0] = (equation1 + equation2) / 2;
        result[1] = equation2 - result[0]; 

        return result;
    }


    
}
