package com.leetcode.sorting;

import static org.junit.Assert.assertArrayEquals;
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
}
