package com.leetcode.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayExecutor {
    public static void main (String[] arg){
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArrayUsingTwoPointer();
        
        int[] sortedNumbers = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Number of unique elements are: " + removeDuplicatesFromSortedArray.removeDuplicates(sortedNumbers));

        for (Integer value: sortedNumbers) {
            System.out.println(value);
        }
    }
}