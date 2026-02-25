package com.leetcode.arrayproblems;

public class LinearSearch {

    public int search(int[] arr, int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch) {
                return index;
            }
        }

        return -1;
    }
}
