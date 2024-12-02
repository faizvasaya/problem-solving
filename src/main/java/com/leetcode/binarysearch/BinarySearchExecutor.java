package com.leetcode.binarysearch;

import java.util.Arrays;

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

        char[] sortedArray3 = new char[]{'a', 'b'};

        char target3 = 'a';

        int result15 = smallestLetterGreaterThanTarget.findUsingBooleanArray(sortedArray3, target3);

        System.out.println("The smallest letter greater than : " + target3 + " is: " + result15);

        FirstAndLastPositionOfElementInSortedArray firstAndLastPositionOfElementInSortedArray = new FirstAndLastPositionOfElementInSortedArray();
        int[] sortedArray4 = new int[]{2, 2, 2, 3, 3, 3, 9, 14, 16, 18, 18, 18};
        int target4 = 18;
        int[] result16 = firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(sortedArray4, target4);
        System.out.println("The FirstAndLastPositionOfElementInSortedArray of: " + target4 + " is: " + Arrays.toString(result16));

        int[] result17 = firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(sortedArray4, target4);
        System.out.println("The FirstAndLastPositionOfElementInSortedArray of: " + target4 + " is: " + Arrays.toString(result17));

        FindTargetInAnInfiniteArray findTargetInAnInfiniteArray = new FindTargetInAnInfiniteArray();

        int[] sortedArray5 = new int[]{10, 18, 25, 31, 33, 60, 68, 70};
        int target5 = 100;

        int result18 = findTargetInAnInfiniteArray.findUsingBinarySearch(sortedArray5, target5);
        System.out.println("The element : " + target5 + " exists at: " + result18 + " position");

        FindPeakOfAMountainArray findPeakOfAMountainArray = new FindPeakOfAMountainArray();

        int[] mountainArray = new int[]{55, 65, 75, 20, 22, 5};

        int result19 = findPeakOfAMountainArray.findUsingBinarySearch(mountainArray);
        System.out.println("The peak index is : " + result19);

        FindPeakElement findPeakElement = new FindPeakElement();

        int[] nums = new int[]{1400, 1200, 1100, 1200, 800};

        int result20 = findPeakElement.findUsingBinarySearch(nums);
        System.out.println("The peak index is : " + result20);

        FindMinimumIndexInMountainArray findMinimumIndexInMountainArray = new FindMinimumIndexInMountainArray();

        int[] nums1 = new int[]{1, 2, 4, 5, 3, 2, 1};
        int target6 = 3;

        int result21 = findMinimumIndexInMountainArray.findUsingBinarySearch(nums1, target6);
        System.out.println("The minimum index for target: " + target6 + " is: " + result21);
    }
}
