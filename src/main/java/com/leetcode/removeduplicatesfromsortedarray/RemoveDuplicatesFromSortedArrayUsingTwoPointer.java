package com.leetcode.removeduplicatesfromsortedarray;

/**
 * Time Complexity : O(n) since we are iterating through the array in constant time
 * Space Complexity: O(1) since we are not using any new array to store the final array
 */
public class RemoveDuplicatesFromSortedArrayUsingTwoPointer implements RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] sortedNumbers) {
        int scannerIndex = 1;
        int uniquePositionIndex = 0;

        while(scannerIndex < sortedNumbers.length) {
            if (sortedNumbers[scannerIndex] != sortedNumbers[uniquePositionIndex]) {
                uniquePositionIndex++;
                sortedNumbers[uniquePositionIndex] = sortedNumbers[scannerIndex];
            }            
            scannerIndex++;
        }

        return uniquePositionIndex + 1;
    }
}
