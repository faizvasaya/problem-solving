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

}
