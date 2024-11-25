package com.leetcode.binarysearch;

public class BinarySearchExecutor {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] sortedArray = new int[]{-18, -12, -4, 0, 25, 69, 84, 90, 101, 500};
        System.out.println("25 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 25));
        System.out.println("69 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 69));
        System.out.println("84 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 84));
        System.out.println("90 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 90));
        System.out.println("101 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 101));
        System.out.println("500 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 500));
        System.out.println("600 was found: " + bs.searchInAscendingOrderedArray(sortedArray, 600));
    }
}
