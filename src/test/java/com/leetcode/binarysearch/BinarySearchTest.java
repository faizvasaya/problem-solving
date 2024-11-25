package com.leetcode.binarysearch;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testElementFoundInMiddleAsc() {
        // Normal case: element is in the middle of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 6;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundAtStartAsc() {
        // Normal case: element is at the start of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 2;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundAtEndAsc() {
        // Normal case: element is at the end of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 10;
        int expected = 4; // Target is at index 4
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testElementNotFoundAsc() {
        // Case where element is not present in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testEmptyArrayAsc() {
        // Case with empty array
        int[] array = {};
        int target = 10;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testArrayWithOneElementElementPresentAsc() {
        // Case with a single element, element is present
        int[] array = {10};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testArrayWithOneElementElementNotPresentAsc() {
        // Case with a single element, element is not present
        int[] array = {10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testLargeArrayAsc() {
        // Case with large array size
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1; // Ascending order
        }
        int target = 500; // Mid value in ascending array
        int expected = 499; // Target is at index 499
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testIntegerOverflowConditionAsc() {
        // Case where the sum of start and end may cause overflow in mid calculation
        int[] array = {Integer.MIN_VALUE, -999, -500, -200, -100}; // Ascending order
        int target = Integer.MIN_VALUE;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));

        // Another test case with very large values for start and end
        int[] largeArray = {Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 3};
        target = Integer.MIN_VALUE + 2;
        expected = 1; // Target is at index 1
        assertEquals(expected, solution.searchInAscendingOrderedArray(largeArray, target));
    }

    @Test
    public void testNegativeNumbersAsc() {
        // Case with negative numbers in ascending order
        int[] array = {-5, -4, -3, -2, -1};
        int target = -3;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testLargeTargetAsc() {
        // Case where the target is larger than any element in the array (target is too large)
        int[] array = {2, 4, 6, 8, 10};
        int target = 20; // Target is larger than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testSmallTargetAsc() {
        // Case where the target is smaller than any element in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 0; // Target is smaller than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInAscendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundInMiddle() {
        // Normal case: element is in the middle of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 6;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundAtStart() {
        // Normal case: element is at the start of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundAtEnd() {
        // Normal case: element is at the end of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 2;
        int expected = 4; // Target is at index 4
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testElementNotFound() {
        // Case where element is not present in the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testEmptyArray() {
        // Case with empty array
        int[] array = {};
        int target = 10;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testArrayWithOneElementElementPresent() {
        // Case with a single element, element is present
        int[] array = {10};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testArrayWithOneElementElementNotPresent() {
        // Case with a single element, element is not present
        int[] array = {10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testLargeArray() {
        // Case with large array size
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = 1000 - i; // Descending order
        }
        int target = 500; // Mid value in descending array
        int expected = 500; // Target is at index 499
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testIntegerOverflowCondition() {
        // Case where the sum of start and end may cause overflow in mid calculation
        int[] array = {Integer.MAX_VALUE, 999, 500, 200, 100}; // Descending order
        int target = Integer.MAX_VALUE;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));

        // Another test case with very large values for start and end
        int[] largeArray = {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 3};
        target = Integer.MAX_VALUE - 2;
        expected = 1; // Target is at index 1
        assertEquals(expected, solution.searchInDescendingOrderedArray(largeArray, target));
    }

    @Test
    public void testNegativeNumbers() {
        // Case with negative numbers in descending order
        int[] array = {-1, -2, -3, -4, -5};
        int target = -3;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testLargeTarget() {
        // Case where the target is larger than any element in the array (target is too large)
        int[] array = {10, 8, 6, 4, 2};
        int target = 20; // Target is larger than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testSmallTarget() {
        // Case where the target is smaller than any element in the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 0; // Target is smaller than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));
    }

    @Test
    public void testElementFoundInMiddleOA() {
        // Normal case: element is in the middle of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 6;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementFoundAtStartOA() {
        // Normal case: element is at the start of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 2;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementFoundAtEndOA() {
        // Normal case: element is at the end of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 10;
        int expected = 4; // Target is at index 4
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementNotFoundOA() {
        // Case where element is not present in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testEmptyArrayOA() {
        // Case with empty array
        int[] array = {};
        int target = 10;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testArrayWithOneElementElementPresentOA() {
        // Case with a single element, element is present
        int[] array = {10};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testArrayWithOneElementElementNotPresentOA() {
        // Case with a single element, element is not present
        int[] array = {10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testLargeArrayOA() {
        // Case with large array size
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1; // Ascending order
        }
        int target = 500; // Mid value in ascending array
        int expected = 499; // Target is at index 499
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testIntegerOverflowConditionOA() {
        // Case where the sum of start and end may cause overflow in mid calculation
        int[] array = {Integer.MIN_VALUE, -999, -500, -200, -100}; // Ascending order
        int target = Integer.MIN_VALUE;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));

        // Another test case with very large values for start and end
        int[] largeArray = {Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 3};
        target = Integer.MIN_VALUE + 2;
        expected = 1; // Target is at index 1
        assertEquals(expected, solution.searchIArrayOrderAgnostic(largeArray, target));
    }

    @Test
    public void testNegativeNumbersOA() {
        // Case with negative numbers in ascending order
        int[] array = {-5, -4, -3, -2, -1};
        int target = -3;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testLargeTargetOAAsc() {
        // Case where the target is larger than any element in the array (target is too large)
        int[] array = {2, 4, 6, 8, 10};
        int target = 20; // Target is larger than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testSmallTargetOA() {
        // Case where the target is smaller than any element in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 0; // Target is smaller than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementFoundInMiddleOADesc() {
        // Normal case: element is in the middle of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 6;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementFoundAtStartOADesc() {
        // Normal case: element is at the start of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementFoundAtEndOADesc() {
        // Normal case: element is at the end of the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 2;
        int expected = 4; // Target is at index 4
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testElementNotFoundOADesc() {
        // Case where element is not present in the array
        int[] array = {10, 8, 6, 4, 2};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testEmptyArrayOADesc() {
        // Case with empty array
        int[] array = {};
        int target = 10;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testArrayWithOneElementElementPresentOADesc() {
        // Case with a single element, element is present
        int[] array = {10};
        int target = 10;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testArrayWithOneElementElementNotPresentOADesc() {
        // Case with a single element, element is not present
        int[] array = {10};
        int target = 5;
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testLargeArrayOADesc() {
        // Case with large array size
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = 1000 - i; // Descending order
        }
        int target = 500; // Mid value in descending array
        int expected = 500; // Target is at index 499
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testIntegerOverflowConditionOADesc() {
        // Case where the sum of start and end may cause overflow in mid calculation
        int[] array = {Integer.MAX_VALUE, 999, 500, 200, 100}; // Descending order
        int target = Integer.MAX_VALUE;
        int expected = 0; // Target is at index 0
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchInDescendingOrderedArray(array, target));

        // Another test case with very large values for start and end
        int[] largeArray = {Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 3};
        target = Integer.MAX_VALUE - 2;
        expected = 1; // Target is at index 1
        assertEquals(expected, solution.searchIArrayOrderAgnostic(largeArray, target));
    }

    @Test
    public void testNegativeNumbersOADesc() {
        // Case with negative numbers in descending order
        int[] array = {-1, -2, -3, -4, -5};
        int target = -3;
        int expected = 2; // Target is at index 2
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testLargeTargetOA() {
        // Case where the target is larger than any element in the array (target is too large)
        int[] array = {10, 8, 6, 4, 2};
        int target = 20; // Target is larger than any element
        int expected = -1; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }

    @Test
    public void testSmallTargetOADesc() {
        // Case where the target is smaller than any element in the array
        int[] array = {10, 10, 10, 10, 10};
        int target = 10; // Target is smaller than any element
        int expected = 2; // Element not found
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchIArrayOrderAgnostic(array, target));
    }
}