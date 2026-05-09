package com.leetcode.search;

import java.util.Arrays;

public class SearchExecutor {

    public static void main(String[] args) {
        // BinarySearch bs = new BinarySearch();
        // System.out.println("Binary Search using iteration: " + bs.searchUsingIteration(new int[]{-1, 0, 3, 5, 9, 12}, 12));

        // System.out.println("Binary Search using searchUsingNLogN: " + bs.searchUsingNLogN(new int[]{-1, 0, 3, 5, 9, 12}, 12));
        // LowerBound lb = new LowerBound();
        // runTest(lb, new int[]{5, 7, 9, 12}, 1, 0);
        // runTest(lb, new int[]{1, 3, 5, 7}, 10, 4);
        // runTest(lb, new int[]{1, 2, 2, 2, 3}, 2, 1);
        // runTest(lb, new int[]{1, 4, 6, 8}, 6, 2);
        // runTest(lb, new int[]{1, 3, 5, 7}, 4, 2);
        // runTest(lb, new int[]{5}, 5, 0);
        // runTest(lb, new int[]{5}, 1, 0);
        // runTest(lb, new int[]{5}, 10, 1);
        // runTest(lb, new int[]{2, 2, 2, 2}, 2, 0);
        // runTest(lb, new int[]{2, 2, 2, 2}, 3, 4);
        // runTest(lb, new int[]{5, 5, 5}, 2, 0);
        // runTest(lb, new int[]{1, 2, 2, 2, 5}, 3, 4);
        // runTest(lb, new int[]{}, 5, 0);
        // runTest(lb, new int[]{-10, -5, -2, 0, 3}, -4, 2);
        // runTest(lb, new int[]{-2147483648, -1, 0, 5}, -2147483648, 0);
        // UpperBound ub = new UpperBound();
        // runTestUpperBound(ub, new int[]{1, 2, 2, 3}, 2, 3);
        // runTestUpperBound(ub, new int[]{3, 5, 8, 9, 15, 19}, 9, 4);
        // runTestUpperBound(ub, new int[]{5, 7, 9, 12}, 1, 0);
        // runTestUpperBound(ub, new int[]{1, 3, 5, 7}, 10, 4);
        // runTestUpperBound(ub, new int[]{1, 3, 5, 7}, 7, 4);
        // runTestUpperBound(ub, new int[]{1, 2, 2, 2, 3}, 2, 4);
        // runTestUpperBound(ub, new int[]{1, 3, 5, 7}, 4, 2);
        // runTestUpperBound(ub, new int[]{5}, 5, 1);
        // runTestUpperBound(ub, new int[]{5}, 1, 0);
        // runTestUpperBound(ub, new int[]{5}, 10, 1);
        // runTestUpperBound(ub, new int[]{2, 2, 2, 2}, 2, 4);
        // runTestUpperBound(ub, new int[]{2, 2, 2, 2}, 3, 4);
        // runTestUpperBound(ub, new int[]{5, 5, 5}, 2, 0);
        // runTestUpperBound(ub, new int[]{1, 2, 2, 2, 5}, 2, 4);
        // runTestUpperBound(ub, new int[]{}, 5, 0);
        // runTestUpperBound(ub, new int[]{-10, -5, -2, 0, 3}, -4, 2);
        // runTestUpperBound(ub, new int[]{-2147483648, -1, 0, 5}, -2147483648, 1);
        // FloorAndCeil fc = new FloorAndCeil();
        // runTestFloorAndCeil(fc, new int[]{3, 4, 4, 7, 8, 10}, 5, new int[]{4, 7});
        // runTestFloorAndCeil(fc, new int[]{3, 4, 4, 7, 8, 10}, 8, new int[]{8, 8});
        // runTestFloorAndCeil(fc, new int[]{3, 4, 5}, 1, new int[]{-1, 3});
        // runTestFloorAndCeil(fc, new int[]{3, 4, 5}, 7, new int[]{5, -1});
        // FirstAndLastPosition falp = new FirstAndLastPosition();
        // runTestFirstAndLastPosition(falp, new int[]{5, 7, 7, 8, 8, 10}, 8, new int[]{3, 4});
        // runTestFirstAndLastPosition(falp, new int[]{5, 7, 7, 8, 8, 10}, 6, new int[]{-1, -1});
        // runTestFirstAndLastPosition(falp, new int[]{}, 0, new int[]{-1, -1});
        // runTestFirstAndLastPosition(falp, new int[]{5}, 5, new int[]{0, 0});
        // runTestFirstAndLastPosition(falp, new int[]{5}, 3, new int[]{-1, -1});
        // runTestFirstAndLastPosition(falp, new int[]{1, 2, 3, 4, 5}, 3, new int[]{2, 2});
        // runTestFirstAndLastPosition(falp, new int[]{1, 2, 3, 3, 3, 4, 5}, 3, new int[]{2, 4});
        // runTestFirstAndLastPosition(falp, new int[]{2, 2, 2, 3, 4}, 2, new int[]{0, 2});
        // runTestFirstAndLastPosition(falp, new int[]{1, 2, 3, 4, 4, 4}, 4, new int[]{3, 5});
        // runTestFirstAndLastPosition(falp, new int[]{3, 4, 5, 6}, 1, new int[]{-1, -1});
        // runTestFirstAndLastPosition(falp, new int[]{1, 2, 3, 4}, 10, new int[]{-1, -1});
        // runTestFirstAndLastPosition(falp, new int[]{7, 7, 7, 7, 7}, 7, new int[]{0, 4});
        // runTestFirstAndLastPosition(falp, new int[]{2, 2}, 2, new int[]{0, 1});
        // runTestFirstAndLastPosition(falp, new int[]{2, 3}, 2, new int[]{0, 0});
        // runTestFirstAndLastPosition(falp, new int[]{1, 1, 1, 1, 1, 1, 1}, 1, new int[]{0, 6});
        // runTestFirstAndLastPosition(falp, new int[]{-10, -5, -5, -5, -2, 0, 3}, -5, new int[]{1, 3});
        // runTestFirstAndLastPosition(falp, new int[]{-1000000000, -5, 0, 5, 1000000000}, 1000000000, new int[]{4, 4});
        // NumberOfOccurrence noo = new NumberOfOccurrence();
        // runTestNumberOfOccurrence(noo, new int[]{1, 1, 2, 2, 2, 2, 3}, 2, 4);
        // runTestNumberOfOccurrence(noo, new int[]{1, 1, 2, 2, 2, 2, 3}, 4, 0);
        // runTestNumberOfOccurrence(noo, new int[]{8, 9, 10, 12, 12, 12}, 12, 3);
        // runTestNumberOfOccurrence(noo, new int[]{5}, 5, 1);
        // runTestNumberOfOccurrence(noo, new int[]{5}, 3, 0);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2, 3, 4, 5}, 3, 1);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2, 3, 4, 5}, 6, 0);
        // runTestNumberOfOccurrence(noo, new int[]{2, 2, 2, 2, 2}, 2, 5);
        // runTestNumberOfOccurrence(noo, new int[]{2, 2, 2, 2, 2}, 3, 0);
        // runTestNumberOfOccurrence(noo, new int[]{1, 1, 1, 2, 3, 4}, 1, 3);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2, 3, 4, 5, 5, 5}, 5, 3);
        // runTestNumberOfOccurrence(noo, new int[]{1, 1}, 1, 2);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2}, 1, 1);
        // runTestNumberOfOccurrence(noo, new int[]{1, 3, 5, 7}, 0, 0);
        // runTestNumberOfOccurrence(noo, new int[]{1, 3, 5, 7}, 10, 0);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2, 2, 2, 3, 3, 3, 4}, 3, 3);
        // runTestNumberOfOccurrence(noo, new int[]{1, 2, 2, 2, 3, 3, 3, 4}, 2, 3);
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{1}, 1, 0);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{1}, 0, -1);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{1, 3}, 3, 1);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{3, 1}, 1, 1);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{1, 2, 3, 4, 5}, 4, 3);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{1, 2, 3, 4, 5}, 6, -1);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{5, 1, 2, 3, 4}, 1, 1);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{5, 1, 2, 3, 4}, 5, 0);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{2, 3, 4, 5, 1}, 1, 4);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{2, 3, 4, 5, 1}, 3, 1);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{6, 7, 1, 2, 3, 4, 5}, 6, 0);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{6, 7, 1, 2, 3, 4, 5}, 4, 5);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{7, 0, 1, 2, 4, 5, 6}, 0, 1);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{7, 0, 1, 2, 4, 5, 6}, 7, 0);

        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{3, 4, 5, 6, 7, 1, 2}, 2, 6);
        runTestSearchInRotatedSortedArray(searchInRotatedSortedArray, new int[]{3, 4, 5, 6, 7, 1, 2}, 8, -1);
    }

    public static void runTest(LowerBound lb, int[] arr, int x, int expected) {

        int actual = lb.findUsingBinarySearch(arr, x);

        System.out.println("--------------LOWER BOUND------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + expected);
        System.out.println("Actual    : " + actual);

        if (actual == expected) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }

    public static void runTestUpperBound(UpperBound lb, int[] arr, int x, int expected) {

        int actual = lb.findUsingBinarySearch(arr, x);

        System.out.println("--------------UPPER BOUND------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + expected);
        System.out.println("Actual    : " + actual);

        if (actual == expected) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }

    public static void runTestFloorAndCeil(FloorAndCeil fc, int[] arr, int x, int[] expected) {

        int[] actual = fc.findUsingBinarySearch(arr, x);

        System.out.println("--------------Floor And Ceil------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + Arrays.toString(expected));
        System.out.println("Actual    : " + Arrays.toString(actual));

        if (actual[0] == expected[0] && actual[1] == expected[1]) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }

    public static void runTestFirstAndLastPosition(FirstAndLastPosition fc, int[] arr, int x, int[] expected) {

        int[] actual = fc.searchRangeUsingBinarySearch(arr, x);

        System.out.println("--------------First And Last Position------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + Arrays.toString(expected));
        System.out.println("Actual    : " + Arrays.toString(actual));

        if (actual[0] == expected[0] && actual[1] == expected[1]) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }

    public static void runTestNumberOfOccurrence(NumberOfOccurrence lb, int[] arr, int x, int expected) {

        int actual = lb.countUsingBinarySearch(arr, x);

        System.out.println("--------------Number Of Occurrence------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + expected);
        System.out.println("Actual    : " + actual);

        if (actual == expected) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }

    public static void runTestSearchInRotatedSortedArray(SearchInRotatedSortedArray lb, int[] arr, int x, int expected) {

        int actual = lb.search(arr, x);

        System.out.println("--------------Search In Rotated Sorted Array------------------------------");
        System.out.println("Array     : " + Arrays.toString(arr));
        System.out.println("Target x  : " + x);
        System.out.println("Expected  : " + expected);
        System.out.println("Actual    : " + actual);

        if (actual == expected) {
            System.out.println("Result    : ✅ PASS");
        } else {
            System.out.println("Result    : ❌ FAIL");
        }
    }
}
