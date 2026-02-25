package com.leetcode.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnionOfTwoSortedArrays {

    public int[] find(int[] arr1, int[] arr2) {
        int indexArr1 = 0;
        int indexArr2 = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        int mergedIndex = 0;

        while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
            if (arr1[indexArr1] <= arr2[indexArr2]) {
                mergedArray[mergedIndex] = arr1[indexArr1];
                indexArr1++;
            } else {
                mergedArray[mergedIndex] = arr2[indexArr2];
                indexArr2++;
            }
            mergedIndex++;
        }

        if (indexArr1 < arr1.length) {
            while (indexArr1 < arr1.length) {
                mergedArray[mergedIndex] = arr1[indexArr1];
                mergedIndex++;
                indexArr1++;
            }
        }

        if (indexArr2 < arr2.length) {
            while (indexArr2 < arr2.length) {
                mergedArray[mergedIndex] = arr2[indexArr2];
                mergedIndex++;
                indexArr2++;
            }
        }

        int[] uniqueElements = new int[mergedArray.length];

        System.out.println(Arrays.toString(mergedArray));

        int i = 1;
        uniqueElements[0] = mergedArray[0];
        int uniqueIndex = 1;
        while (i < mergedArray.length) {
            if (mergedArray[i] != mergedArray[i - 1]) {
                uniqueElements[uniqueIndex] = mergedArray[i];
                uniqueIndex++;
            }
            i++;
        }

        return Arrays.copyOfRange(uniqueElements, 0, uniqueIndex);
    }

    /**
     * TC: O(N1 log N1) + O(N2 log N2) + O(N1 + N2) SC: O(N1 + N2) + O(N1 + N2)
     */
    public Object[] findUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int index = 0; index < arr1.length; index++) {
            set.add(arr1[index]);
        }

        for (int index = 0; index < arr2.length; index++) {
            set.add(arr2[index]);
        }

        return set.toArray();
    }

    /**
     * TC: O(m+n)
     * SC: O(m+n)
     */
    public Object[] findUsingTwoPointer(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union.toArray();
    }
}
