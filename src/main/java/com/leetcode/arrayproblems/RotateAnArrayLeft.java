package com.leetcode.arrayproblems;

public class RotateAnArrayLeft {

    /**
     * TC: O(N * N) - This causes Time Limit Exceeded error. Brute Force.
     */
    public void rotate(int[] arr, int k) {
        k = k % arr.length;

        for (int rotationTry = 0; rotationTry < k; rotationTry++) {
            int elementToRotate = arr[0];

            for (int index = 1; index < arr.length; index++) {
                arr[index - 1] = arr[index];
            }

            arr[arr.length - 1] = elementToRotate;
        }
    }

    /**
     * TC: O(N) SC: O(N) 1. Modulo K because there can be max N-1 rotations
     * before the array resets to what was original 2. Move elements to rotate
     * to a temp array 3. Shift the remaining elements by k spaces towards left
     * 4. Move back the elements from temp array to original array
     */
    public void rotateSinglePass(int[] arr, int k) {

        k = k % arr.length;

        int[] tempArray = new int[k];

        for (int index = 0; index < k; index++) {
            tempArray[index] = arr[index];
        }

        for (int index = 0; index < arr.length - k; index++) {
            arr[index] = arr[index + k];
        }

        for (int index = arr.length - k; index < arr.length; index++) {
            arr[index] = tempArray[index - (arr.length - k)];
        }
    }

    /**
     * TC: O(N)
     * SC: O(1)
     * 1. Reverse the left part
     * 2. Reverse the right part
     * 3. Reverse the whole array
     */
    public void rotateUsingReverse(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
