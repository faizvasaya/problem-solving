package com.leetcode.search;

public class LinearSearch {

    public int findIndexInIntegerArray(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }

        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public int findIndexInIntegerArrayInARange(int[] array, int target, int startIndex, int endIndex) {
        if (array.length == 0) {
            return -1;
        }

        if (startIndex > endIndex) {
            return -1;
        }

        if (endIndex > array.length - 1) {
            return -1;
        }

        for (int index = startIndex; index <= endIndex; index++) {
            if (array[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public boolean characterExistsInAString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // Using For Each
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        // Using For loop
        // for (int index = 0; index < str.length(); index++) {
        //     if (str.charAt(index) == target) {
        //         return true;
        //     }
        // }
        return false;
    }

    public int findMinimum(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }

        int minimum = array[0];

        for (int index = 1; index < array.length; index++) {
            if (array[index] < minimum) {
                minimum = array[index];
            }
        }

        return minimum;
    }

    public int[] findIndexIn2DIntegerArray(int[][] array, int target) {
        if (array.length == 0) {
            return new int[]{-1, -1};
        }

        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[rowIndex].length; columnIndex++) {
                if (array[rowIndex][columnIndex] == target) {
                    return new int[]{rowIndex, columnIndex};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int findMaximumIn2DIntegerArray(int[][] array) {
        int maximum = Integer.MIN_VALUE;

        if (array.length == 0) {
            return maximum;
        }

        for (int[] array1 : array) {
            for (int element : array1) {
                if (element > maximum) {
                    maximum = element;
                }
            }
        }

        return maximum;
    }
}
