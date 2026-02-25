package com.leetcode.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    /*
     * TC: O(N)
     * SC: O(N)
     */
    public int remove(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int[] tempArr = new int[arr.length];
        int numberOfUniqueElements = 1;
        tempArr[numberOfUniqueElements - 1] = arr[numberOfUniqueElements - 1];

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != arr[index - 1]) {
                numberOfUniqueElements++;
                tempArr[numberOfUniqueElements - 1] = arr[index];
            }
        }
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
        return numberOfUniqueElements;
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public int removeWithoutSpace(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int numberOfUniqueElements = 1;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != arr[index - 1]) {
                arr[numberOfUniqueElements] = arr[index];
                numberOfUniqueElements++;
            }
        }
        return numberOfUniqueElements;
    }

    public int removeUsingTwoPointer(int[] arr) {
        int uniqueIndex = 0;
        int incIndex = 1;

        while (incIndex < arr.length) {
            if (arr[incIndex] != arr[incIndex - 1]) {
                arr[++uniqueIndex] = arr[incIndex];
            }
            incIndex++;
        }
        return uniqueIndex + 1;
    }

    /*
     * TC: O(N log N) + O(N)
     * SC: O(N)
     */
    public int removeWithSet(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();

        for (int index = 0; index < arr.length; index++) {
            set.add(arr[index]);
        }

        int index = 0;
        for (Integer elem : set) {
            arr[index] = elem;
            index++;
        }

        return set.size();
    }
}
