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

        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

        int[] nums2 = new int[]{2, 9, 2, 2, 2};
        int target7 = 2;

        int result22 = searchInRotatedSortedArray.findUsingBinarySearch(nums2, target7);
        System.out.println("The target: " + target7 + " is on: " + result22 + " index in rotated array");

        NumberOfRotationsOnASortedArray numberOfRotationsOnASortedArray = new NumberOfRotationsOnASortedArray();

        int[] nums3 = new int[]{7, 9, 11, 12, 15};

        int result23 = numberOfRotationsOnASortedArray.findRotationCount(nums3);
        System.out.println("The total number of rotated elements are: " + result23 + " in rotated array");

        SearchingInA2DMatrix searchingInA2DMatrix = new SearchingInA2DMatrix();

        int[][] nums4 = new int[][]{{18, 9, 12}, {36, -4, -91}, {44, 33, 16}};
        int target8 = 100;

        int[] result24 = searchingInA2DMatrix.searchUsingBruteForce(nums4, target8);
        System.out.println("The element: " + target8 + " is found at: " + Arrays.toString(result24));

        int[][] nums5 = new int[][]{
            {10, 20, 30},
            {15, 25, 35},
            {28, 29, 37},
            {33, 34, 38}
        };
        int target9 = 25;

        int[] result25 = searchingInA2DMatrix.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums5, target9);
        System.out.println("The element: " + target9 + " is found at: " + Arrays.toString(result25));

        int[][] nums6 = new int[][]{
            {25, 30, 35, 40},
            {51, 55, 60, 62},
            {81, 85, 90, 101}
        };

        int target10 = 110;

        boolean result26 = searchingInA2DMatrix.searchUsingReducingSearchSpaceInRowSortedMatrix(nums6, target10);
        System.out.println("The element: " + target10 + " is found at: " + result26);

        boolean result27 = searchingInA2DMatrix.searchInRowSortedMatrixUsingMathematicalMapping(nums6, target10);
        System.out.println("The element: " + target10 + " is found at: " + result27);

        SquareRootOfANumber squareRootOfANumber = new SquareRootOfANumber();
        int value = 239369;
        int result28 = squareRootOfANumber.findUsingBinarySearch(value);
        System.out.println("The least square root of: " + value + " is: " + result28);

        GuessTheNumber gtn = new GuessTheNumber();
        int n = 25;
        int pick = 22;

        System.out.println("The pick was: " + gtn.findUsingBruteForce(n, pick));
        System.out.println("The pick was: " + gtn.findUsingBinarySearch(n, pick));

        TwoSumInputArraySorted arraySorted = new TwoSumInputArraySorted();

        int[] numbers = new int[]{2, 3, 4, 7, 10};
        int target11 = 5;

        System.out.println("The two numbers are: " + Arrays.toString((arraySorted.findUsingBinarySearch(numbers, target11))));

        FindPerfectSquare findPerfectSquare = new FindPerfectSquare();

        int target13 = 2147395600;

        System.out.println("The " + target13 + " is a perfect square: " + findPerfectSquare.isPerfectSquare(target13));

        ArrangingCoins arrangingCoins = new ArrangingCoins();

        int target14 = 2_147_483_647;

        System.out.println("The " + target14 + " requires: " + arrangingCoins.findUsingBinarySearch(target14) + " rows ");

        FindIntersectionInArrays findIntersectionInArrays = new FindIntersectionInArrays();

        int[] arr1 = new int[]{0, 2, 2, 1};
        int[] arr2 = new int[]{4, 4, 1};

        int[] intersection = findIntersectionInArrays.findUsingSortingAndBinarySearch(arr1, arr2);

        System.out.println("The intersection is: " + Arrays.toString(intersection));

        CheckIfNAndItsDoubleExists checkIfNAndItsDoubleExists = new CheckIfNAndItsDoubleExists();

        int[] checkDoubleArray = new int[]{-10, -3, -6, -7};

        System.out.println("The array has double: " + checkIfNAndItsDoubleExists.checkUsingBinarySearch(checkDoubleArray));

        SingleElementInASortedArray singleElementInASortedArray = new SingleElementInASortedArray();

        int[] findSingleElement = new int[]{1, 1, 2, 3, 3};

        System.out.println("The single element in the array is: " + singleElementInASortedArray.findUsingBruteForce(findSingleElement));

        System.out.println("The single element in the array findUsingTwoPointer is: " + singleElementInASortedArray.findUsingTwoPointer(findSingleElement));

        System.out.println("The single element in the array findUsingBinarySearch is: " + singleElementInASortedArray.findUsingBinarySearch(findSingleElement));

        FourSum fourSum = new FourSum();

        int[] findFourSum = new int[]{1, 0, -1, 0, -2, 2};

        System.out.println("The 4 Sum is: " + fourSum.findUsingTwoPointer(findFourSum, 0));

        CapacityToShipPackages capacityToShipPackages = new CapacityToShipPackages();

        int[] findCapacityToShipPackages = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("The Capacity To Ship Packages is: " + capacityToShipPackages.findUsingBinarySearch(findCapacityToShipPackages, 5));

        FindDuplicateElements findDuplicateElements = new FindDuplicateElements();

        int[] findDuplicateElementsU = new int[]{3, 3, 3, 3, 3};

        System.out.println("The duplicate element using Binary Search is: " + findDuplicateElements.findUsingBinarySearch(findDuplicateElementsU));

        System.out.println("The duplicate element using cycle detection is: " + findDuplicateElements.findUsingCycleDetection(findDuplicateElementsU));

        System.out.println("The duplicate element using boolean array is: " + findDuplicateElements.findUsingBooleanArray(findDuplicateElementsU));

    }
}
