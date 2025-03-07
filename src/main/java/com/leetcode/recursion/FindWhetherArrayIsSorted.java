package com.leetcode.recursion;

public class FindWhetherArrayIsSorted {

    public boolean isArraySorted(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            if (array[index] < array[index + 1]) {
                index++;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isArraySortedRecursive(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }

        return array[index] < array[index + 1] && isArraySortedRecursive(array, ++index);
    }
}
