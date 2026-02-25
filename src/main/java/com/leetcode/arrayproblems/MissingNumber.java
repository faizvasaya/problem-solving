package com.leetcode.arrayproblems;

public class MissingNumber {

    /**
     * TC: O(N * N)
     */
    public int findUsingDoubleLoop(int[] nums) {
        for (int index = 1; index <= nums.length; index++) {
            boolean isMatched = false;
            for (int jIndex = 0; jIndex < nums.length; jIndex++) {
                if (nums[jIndex] == index) {
                    isMatched = true;
                    break;
                }
            }
            if (!isMatched) {
                return index;
            }
        }
        return -1;
    }

    /**
     * TC: O(N) + O(N) SC: O(N)
     */
    public int findUsingHashing(int[] nums) {
        boolean[] visited = new boolean[nums.length + 1];
        for (int index = 0; index < nums.length; index++) {
            visited[nums[index]] = true;
        }

        for (int index = 0; index < visited.length; index++) {
            if (!visited[index]) {
                return index;
            }
        }
        return -1;
    }

    /*
     * TC: O(N)
     * SC: O(1)
     */
    public int find(int[] nums) {
        int n = nums.length;
        int totalOfRange = n * (n + 1) / 2;
        int totalOfNums = 0;
        for (int index = 0; index < nums.length; index++) {
            totalOfNums += nums[index];
        }
        return totalOfRange - totalOfNums;
    }

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public int findUsingXOR(int[] nums) {
        int n = nums.length;
        int expectedXOR = 0;
        int actualXOR = 0;
        for (int index = 1; index <= n; index++) {
            expectedXOR = expectedXOR ^ index;
            actualXOR = actualXOR ^ nums[index - 1];
        }

        return expectedXOR ^ actualXOR;
    }
}
