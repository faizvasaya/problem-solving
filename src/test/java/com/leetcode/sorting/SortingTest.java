package com.leetcode.sorting;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SortingTest {

    @Test
    public void testAlreadySortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverseSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testUnsortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {3, 1, 4, 5, 2};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {42};
        int[] expected = {42};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {};
        int[] expected = {};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testArrayWithDuplicates() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};
        bubbleSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    SelectionSort selectionSort = new SelectionSort();

    @Test
    public void testAlreadySortedArraySS() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverseSortedArraySS() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testUnsortedArraySS() {
        int[] input = {3, 1, 4, 5, 2};
        int[] expected = {1, 2, 3, 4, 5};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementArraySS() {
        int[] input = {42};
        int[] expected = {42};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArraySS() {
        int[] input = {};
        int[] expected = {};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testArrayWithDuplicatesSS() {
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};
        selectionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    InsertionSort insertionSort = new InsertionSort();

    @Test
    public void testAlreadySortedArrayIS() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverseSortedArrayIS() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testUnsortedArrayIS() {
        int[] input = {3, 1, 4, 5, 2};
        int[] expected = {1, 2, 3, 4, 5};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementArrayIS() {
        int[] input = {42};
        int[] expected = {42};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArrayIS() {
        int[] input = {};
        int[] expected = {};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testArrayWithDuplicatesIS() {
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};
        insertionSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    CyclicSort cyclicSort = new CyclicSort();

    @Test
    public void testAlreadySortedArrayCS() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        cyclicSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverseSortedArrayCS() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        cyclicSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testUnsortedArrayCS() {
        int[] input = {3, 1, 4, 5, 2};
        int[] expected = {1, 2, 3, 4, 5};
        cyclicSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElementArrayCS() {
        int[] input = {1};
        int[] expected = {1};
        cyclicSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArrayCS() {
        int[] input = {};
        int[] expected = {};
        cyclicSort.sortAscending(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSmallArrayMissingMiddle() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {3, 0, 1};
        int expected = 2;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testSmallArrayMissingEnd() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0, 1};
        int expected = 2;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testLargerArray() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testArrayWithZeroMissing() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {1, 2, 3, 4, 5};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testArrayWithLastNumberMissing() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0, 1, 2, 3, 4};
        int expected = 5;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testSingleElementMissing() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0};
        int expected = 1;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testSingleElementZeroMissing() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {1};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testEmptyArrayMS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testArrayWithMultipleShuffledElements() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {7, 6, 4, 2, 3, 1, 0, 9, 5};
        int expected = 8;
        assertEquals(expected, missingNumber.findUsingCyclicSort(input));
    }

    @Test
    public void testSmallArrayMissingMiddleUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {3, 0, 1};
        int expected = 2;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testSmallArrayMissingEndUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0, 1};
        int expected = 2;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testLargerArrayUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testArrayWithZeroMissingUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {1, 2, 3, 4, 5};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testArrayWithLastNumberMissingUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0, 1, 2, 3, 4};
        int expected = 5;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testSingleElementMissingUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {0};
        int expected = 1;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testSingleElementZeroMissingUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {1};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testEmptyArrayMSUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {};
        int expected = 0;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    @Test
    public void testArrayWithMultipleShuffledElementsUS() {
        MissingNumberFromArrayOf0ToN missingNumber = new MissingNumberFromArrayOf0ToN();
        int[] input = {7, 6, 4, 2, 3, 1, 0, 9, 5};
        int expected = 8;
        assertEquals(expected, missingNumber.findUsingSum(input));
    }

    private final FindAllDisappearedNumbers finder = new FindAllDisappearedNumbers();

    @Test
    public void testSingleDisappearedNumber() {
        int[] nums = {1, 1};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(2), result);
    }

    @Test
    public void testMultipleDisappearedNumbers() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(5, 6), result);
    }

    @Test
    public void testAllNumbersPresent() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testEmptyArrayDP() {
        int[] nums = {};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testSingleElementArrayMissingNumber() {
        int[] nums = {1};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testDuplicatesOnly() {
        int[] nums = {2, 2, 2, 2};
        List<Integer> result = finder.findUsingCyclicSort(nums);
        assertEquals(Arrays.asList(1, 3, 4), result);
    }

    @Test
    public void testSingleDisappearedNumberNN() {
        int[] nums = {1, 1};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(2), result);
    }

    @Test
    public void testMultipleDisappearedNumbersNN() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(5, 6), result);
    }

    @Test
    public void testAllNumbersPresentNN() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testEmptyArrayDPNN() {
        int[] nums = {};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testSingleElementArrayMissingNumberNN() {
        int[] nums = {1};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testDuplicatesOnlyNN() {
        int[] nums = {2, 2, 2, 2};
        List<Integer> result = finder.findUsingNumberNegation(nums);
        assertEquals(Arrays.asList(1, 3, 4), result);
    }

    private final FindDuplicateNumbers findDuplicateNumbers = new FindDuplicateNumbers();

    @Test
    public void testExample1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(3, 2);
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 1, 2};
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testExample3() {
        int[] nums = {1};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testEmptyArrayA() {
        int[] nums = {};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testAllDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
        List<Integer> expected = Arrays.asList(1, 3, 2, 4);
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testAlternatingDuplicates() {
        int[] nums = {3, 1, 4, 2, 1, 5, 6, 3, 7, 8};
        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, findDuplicateNumbers.findUsingCyclicSort(nums));
    }

    @Test
    public void testExample1NN() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(2, 3);
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testExample2NN() {
        int[] nums = {1, 1, 2};
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testExample3NN() {
        int[] nums = {1};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testEmptyArrayANN() {
        int[] nums = {};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testNoDuplicatesNN() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testAllDuplicatesNN() {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }

    @Test
    public void testAlternatingDuplicatesNN() {
        int[] nums = {3, 1, 4, 2, 1, 5, 6, 3, 7, 8};
        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, findDuplicateNumbers.findUsingNumberNegation(nums));
    }
    private final SetMismatch setMismatch = new SetMismatch();

    @Test
    public void testExample1SM() {
        int[] nums = {1, 2, 2, 4};
        int[] expected = {2, 3}; // 2 is duplicated, 3 is missing
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testExample2SM() {
        int[] nums = {1, 1};
        int[] expected = {1, 2}; // 1 is duplicated, 2 is missing
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testNoDuplicatesAtStart() {
        int[] nums = {2, 2};
        int[] expected = {2, 1}; // 2 is duplicated, 1 is missing
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testLargeInputWithErrors() {
        int n = 10000; // Maximum length of the array
        int[] nums = new int[n];

        // Populate nums with [1, 2, 3, ... n] but duplicate one value and remove another
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        nums[n - 1] = 5000; // Duplicate 5000, remove n

        int[] expected = {5000, 10000};
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testSmallInputWithDuplicate() {
        int[] nums = {3, 1, 3};
        int[] expected = {3, 2}; // 3 is duplicated, 2 is missing
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testAlreadySortedArrayWithError() {
        int[] nums = {1, 2, 3, 4, 4};
        int[] expected = {4, 5}; // 4 is duplicated, 5 is missing
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    @Test
    public void testSingleElementArraySM() {
        // Invalid case: array size is less than 2 (2 <= nums.length)
        int[] nums = {1};
        int[] expected = {}; // Should handle such cases with no errors
        assertArrayEquals(expected, setMismatch.findErrorNums(nums));
    }

    private final FindFirstMissingPositive findFirstMissingPositive = new FindFirstMissingPositive();

    @Test
    public void testExample1findFirstMissingPositive() {
        int[] nums = {1, 2, 0};
        int expected = 3; // Explanation: The numbers in the range [1,2] are all present.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testExample2findFirstMissingPositive() {
        int[] nums = {3, 4, -1, 1};
        int expected = 2; // Explanation: 1 is in the array, but 2 is missing.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testExample3findFirstMissingPositive() {
        int[] nums = {7, 8, 9, 11, 12};
        int expected = 1; // Explanation: The smallest positive integer 1 is missing.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testSingleElementMissingPositive() {
        int[] nums = {2};
        int expected = 1; // Explanation: The smallest missing positive is 1.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] nums = {-1, -2, -3};
        int expected = 1; // Explanation: No positive integers present, smallest is 1.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testAllNumbersPresentInRange() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 6; // Explanation: All numbers in range [1,5] present, next is 6.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testEmptyArrayfindFirstMissingPositive() {
        int[] nums = {};
        int expected = 1; // Explanation: No numbers present, smallest is 1.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testLargeInputWithMissingValue() {
        int n = 100000;
        int[] nums = new int[n - 1];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = i; // Missing number is 100000
        }
        int expected = n;
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testArrayWithDuplicatesfindFirstMissingPositive() {
        int[] nums = {1, 1, 3, 3};
        int expected = 2; // Explanation: 2 is missing.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    public void testArrayWithMixedLargeAndNegativeNumbers() {
        int[] nums = {2147483647, -2147483648, 0, 1, 2};
        int expected = 3; // Explanation: Smallest missing positive is 3.
        assertEquals(expected, findFirstMissingPositive.firstMissingPositive(nums));
    }

    private final MergeSortedArray merger = new MergeSortedArray();

    @Test
    public void testExample1MS() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testExample2MS() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1, n = 0;
        int[] expected = {1};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testExample3MS() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        int[] expected = {1};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums1 = {-3, -2, -1, 0, 0, 0};
        int[] nums2 = {-5, -4, -2};
        int m = 3, n = 3;
        int[] expected = {-5, -4, -3, -2, -2, -1};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testWithIdenticalElements() {
        int[] nums1 = {1, 1, 1, 0, 0, 0};
        int[] nums2 = {1, 1, 1};
        int m = 3, n = 3;
        int[] expected = {1, 1, 1, 1, 1, 1};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEmptyNums2() {
        int[] nums1 = {2, 5, 6};
        int[] nums2 = {};
        int m = 3, n = 0;
        int[] expected = {2, 5, 6};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEmptyNums1() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 0, n = 3;
        int[] expected = {1, 2, 3};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testLargeInput() {
        int m = 100, n = 100;
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        // Populate nums1 with odd numbers, nums2 with even numbers
        for (int i = 0; i < m; i++) {
            nums1[i] = 2 * i + 1;
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = 2 * (i + 1);
        }

        int[] expected = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            expected[i] = i + 1;
        }

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testOverlapRanges() {
        int[] nums1 = {1, 2, 4, 0, 0, 0};
        int[] nums2 = {2, 3, 5};
        int m = 3, n = 3;
        int[] expected = {1, 2, 2, 3, 4, 5};

        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    private final MajorityElement solver = new MajorityElement();

    @Test
    public void testExample1MajorityElement() {
        int[] nums = {3, 2, 3};
        int expected = 3;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testExample2MajorityElement() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {10};
        int expected = 10;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testAllElementsSame() {
        int[] nums = {7, 7, 7, 7};
        int expected = 7;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testLargeInputWithMajority() {
        int n = 50000;
        int[] nums = new int[n];

        // Fill the array: Majority element is 1
        for (int i = 0; i < n / 2 + 1; i++) {
            nums[i] = 1;
        }
        for (int i = n / 2 + 1; i < n; i++) {
            nums[i] = 2;
        }

        int expected = 1;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testNegativeAndPositiveNumbers() {
        int[] nums = {-1, -1, -1, 2, 2, -1, 3};
        int expected = -1;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testEdgeCaseMinimumSize() {
        int[] nums = {1};
        int expected = 1;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testEdgeCaseTwoElements() {
        int[] nums = {1, 1};
        int expected = 1;
        assertEquals(expected, solver.findMajorityElement(nums));
    }

    @Test
    public void testMultipleCandidatesButOneMajority() {
        int[] nums = {4, 4, 2, 4, 3, 4, 4};
        int expected = 4;
        assertEquals(expected, solver.findMajorityElement(nums));
    }
}
