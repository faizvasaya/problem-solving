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

        CellingOfANumber cellingOfANumber = new CellingOfANumber();
        int[] sortedArray2 = new int[]{2, 3, 5, 9, 14, 16, 18};
        int target = 18;
        int result14 = cellingOfANumber.findCellingInAscendingOrderedArray(sortedArray2, target);
        System.out.println("The celling of: " + target + " is: " + result14);

        int target2 = 6;
        int result1 = cellingOfANumber.findFloorInAscendingOrderedArray(sortedArray2, target2);
        System.out.println("The floor of: " + target + " is: " + result1);

        SmallestLetterGreaterThanTarget smallestLetterGreaterThanTarget = new SmallestLetterGreaterThanTarget();

        char[] sortedArray3 = new char[]{'a','b'};

        char target3 = 'a';

        int result15 = smallestLetterGreaterThanTarget.findUsingBooleanArray(sortedArray3, target3);

        System.out.println("The smallest letter greater than : " + target3 + " is: " + result15);
    }
}
