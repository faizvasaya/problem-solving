package com.leetcode.arrayproblems;

public class PushNonZeroNumbersTowardFront {

    /**
     * TC: O(N) SC: O(N)
     */
    public void push(int[] arr) {
        int[] tempArray = new int[arr.length];

        int tempIndex = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != 0) {
                tempArray[tempIndex] = arr[index];
                tempIndex++;
            }
        }

        for (int index = 0; index < tempArray.length; index++) {
            arr[index] = tempArray[index];
        }
    }

    /**
     * TC: O(N) SC: O(1)
     */
    public void pushWithoutSpace(int[] arr) {
        int replaceIndex = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != 0) {
                arr[replaceIndex] = arr[index];
                replaceIndex++;
            }
        }
        for (int index = replaceIndex; index < arr.length; index++) {
            arr[index] = 0;
        }
    }

    /**
     * TC: O(N)
     * SC: O(1)
     */
    public void pushWithoutForLoop(int[] arr) {
        int i = -1;
        int j = -1;

        // Find the first zero and assign it to j
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                j = index;
                break;
            }
        }

        if (j == arr.length - 1 || j == -1) {
            return;
        }

        i = j + 1;

        // Swap zeros with numbers whenever a non zero number is found.
        while (i < arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }
}
