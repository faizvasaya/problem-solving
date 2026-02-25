package com.leetcode.arrayproblems;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

    /**
     * TC: O(N * M) SC: O(M+N)
     */
    public Object[] find(int[] arr1, int[] arr2) {
        int lastMatchedAt = -1;
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int index = 0; index < arr1.length; index++) {
            for (int jindex = lastMatchedAt + 1; jindex < arr2.length; jindex++) {
                if (arr1[index] == arr2[jindex]) {
                    lastMatchedAt = jindex;
                    intersection.add(arr1[index]);
                    break;
                }
                if (arr2[jindex] > arr1[index]) {
                    break;
                }
            }
        }
        return intersection.toArray(new Integer[0]);
    }

    /**
     * TC: O(M+N)
     * SC: O(M+N)
     */
    public Object[] findUsingTwoPointer(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }
        
        return intersection.toArray();
    }
}
