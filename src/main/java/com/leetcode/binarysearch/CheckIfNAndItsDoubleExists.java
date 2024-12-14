package com.leetcode.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1346. Check If N and Its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
 * 
 * Approach:
 * 
 * Binary Search: Sort the array. Then for each element of the array, find the 
 * double and the use binary
 * 
 * Using set: Store each value of the array in set and while storing also check if 
 * its double exists or its divide/2 exists in the set. If yes then return true.
 */
public class CheckIfNAndItsDoubleExists {

    // Time complexity: O(n log n) + O(N * n log n)
    public boolean checkUsingBinarySearch(int[] arr) {
        Arrays.sort(arr);
        for (int index = 0; index < arr.length; index++) {
            int multiplyValue = arr[index] * 2;
            int indexValueInSearch = this.binarySearch(arr, multiplyValue);
            if (indexValueInSearch != Integer.MAX_VALUE && indexValueInSearch != index) {
                return true;
            }
        }

        return false;
    }

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return Integer.MAX_VALUE;
    }

    // Time complexity: O(N)
    public boolean findUsingSet(int[] arr) {
        Set<Integer> visited = new HashSet<>();

        for (int nums : arr) {
            if(visited.contains(nums * 2) || ( nums % 2 == 0 && visited.contains(nums / 2))) {  
                return true;
            }

            visited.add(nums);
        }

        return false;
    }
}
