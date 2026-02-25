package com.leetcode.arrayproblems;

public class SecondSmallest {

    /**
     * TC: O(N)
     */
    public int find(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < smallest) {
                secondSmallest = smallest;
                smallest = arr[index];
            } else if (arr[index] < secondSmallest && arr[index] > smallest) {
                secondSmallest = arr[index];
            }
        }
        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }
}
