package com.leetcode.recursion;

public class BinarySearch {

    public int searchUsingRecursion(int[] arr, int start, int end, int searchValue) {

        // Base condition
        if (start <= end) {

            // Logic 
            int mid = start + (end - start) / 2;

            if (searchValue == arr[mid]) {
                return mid;
            }

            if (searchValue > arr[mid]) {
                // Recursive call
                return this.searchUsingRecursion(arr, mid + 1, end, searchValue);
            } else {
                return this.searchUsingRecursion(arr, start, mid - 1, searchValue);
            }
        }

        return -1;
    }
}
