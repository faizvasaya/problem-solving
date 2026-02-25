package com.leetcode.arrayproblems;

public class CheckIfArrayIsSorted {

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public boolean isSorted(int[] arr) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 1; index < arr.length; index++) {
            if (arr[index - 1] > arr[index]) {
                return false;
            }
        }
        return true;
    }
}
