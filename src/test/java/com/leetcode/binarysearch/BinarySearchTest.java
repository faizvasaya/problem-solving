package com.leetcode.binarysearch;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

    // Test class for the functions from CellingOfANumber class
    private final CellingOfANumber solution = new CellingOfANumber();

    // --- Test for findCellingInAscendingOrderedArray ---
    @Test
    public void testFindCellingElementFound() {
        // Test case where the target is present in the array
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        int expected = 5; // The target itself is the ceiling
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingElementGreaterThanTarget() {
        // Test case where the ceiling is the smallest element greater than the target
        int[] array = {1, 3, 5, 7, 9};
        int target = 6;
        int expected = 7; // The smallest element greater than 6 is 7
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingTargetGreaterThanLastElement() {
        // Test case where the target is larger than all elements in the array
        int[] array = {1, 3, 5, 7, 9};
        int target = 10;
        int expected = -1; // No ceiling found
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingTargetSmallerThanFirstElement() {
        // Test case where the target is smaller than the smallest element in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 1;
        int expected = 2; // The smallest element (ceiling) is 2
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingEmptyArray() {
        // Edge case: Empty array
        int[] array = {};
        int target = 5;
        int expected = Integer.MAX_VALUE; // No elements in the array
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingArrayWithOneElement() {
        // Edge case: Array with one element
        int[] array = {10};
        int target = 10;
        int expected = 10; // Target is the only element and it is the ceiling
        assertEquals(expected, solution.findCellingInAscendingOrderedArray(array, target));
    }

    // --- Test for findFloorInAscendingOrderedArray ---
    @Test
    public void testFindFloorElementFound() {
        // Test case where the target is present in the array
        int[] array = {1, 3, 5, 7, 9};
        int target = 5;
        int expected = 5; // The target itself is the floor
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindFloorElementSmallerThanTarget() {
        // Test case where the floor is the largest element smaller than the target
        int[] array = {1, 3, 5, 7, 9};
        int target = 6;
        int expected = 5; // The largest element smaller than 6 is 5
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindFloorTargetSmallerThanFirstElement() {
        // Test case where the target is smaller than the smallest element in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 1;
        int expected = -1; // No floor found
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindFloorTargetGreaterThanLastElement() {
        // Test case where the target is larger than all elements in the array
        int[] array = {1, 3, 5, 7, 9};
        int target = 10;
        int expected = 9; // The largest element (floor) is 9
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindFloorEmptyArray() {
        // Edge case: Empty array
        int[] array = {};
        int target = 5;
        int expected = Integer.MAX_VALUE; // No elements in the array
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindFloorArrayWithOneElement() {
        // Edge case: Array with one element
        int[] array = {10};
        int target = 5;
        int expected = -1; // No floor found
        assertEquals(expected, solution.findFloorInAscendingOrderedArray(array, target));
    }

    // --- Additional Test Cases ---
    @Test
    public void testFindCellingAndFloorWithNegativeNumbers() {
        // Test case with negative numbers in the array
        int[] array = {-10, -5, 0, 5, 10};
        int target = -3;

        // Celling should be -5 and floor should be -10
        int expectedCelling = 0;
        int expectedFloor = -5;

        assertEquals(expectedCelling, solution.findCellingInAscendingOrderedArray(array, target));
        assertEquals(expectedFloor, solution.findFloorInAscendingOrderedArray(array, target));
    }

    @Test
    public void testFindCellingAndFloorWithLargeNumbers() {
        // Test case with large numbers
        int[] array = {100000, 200000, 300000, 400000, 500000};
        int target = 350000;

        // Celling should be 400000 and floor should be 300000
        int expectedCelling = 400000;
        int expectedFloor = 300000;

        assertEquals(expectedCelling, solution.findCellingInAscendingOrderedArray(array, target));
        assertEquals(expectedFloor, solution.findFloorInAscendingOrderedArray(array, target));
    }

    private final SmallestLetterGreaterThanTarget smallestLetterGreaterThanTarget = new SmallestLetterGreaterThanTarget();

    // --- Test case for letters and target in various scenarios ---
    @Test
    public void testTargetSmallerThanAllLetters() {
        // Target is smaller than the first element, so we should return the first element
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c'; // The next lexicographical character after 'a' is 'c'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetEqualsLastLetter() {
        // Target is equal to the last element in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'j';
        char expected = 'a'; // Since there's no character greater than 'j', return the first element
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetGreaterThanAllLetters() {
        // Target is greater than all the letters in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'k';
        char expected = 'a'; // As no letter is greater than 'k', return the first character 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetSmallerThanAllLetters2() {
        // Target is smaller than all the letters in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'z';
        char expected = 'a'; // Since 'z' is greater than all elements, return the first element 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetInMiddle() {
        // Target is in the middle of the array, the smallest letter greater than target should be returned
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'c';
        char expected = 'f'; // The next lexicographical character after 'c' is 'f'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetAtStart() {
        // Target is the first character in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c'; // The next lexicographical character after 'a' is 'c'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testArrayWithIdenticalCharacters() {
        // All characters are the same, so return the first element
        char[] letters = {'a', 'a', 'a', 'a'};
        char target = 'a';
        char expected = 'a'; // No element is lexicographically greater than 'a', return the first element
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetInDescendingOrder() {
        // Test case where the target is smaller than the first element
        char[] letters = {'a', 'b', 'c', 'z'};
        char target = 'y';
        char expected = 'z'; // 'z' is the smallest lexicographically character greater than 'y'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetEqualsFirstLetter() {
        // Test case where the target equals the first letter
        char[] letters = {'a', 'b', 'c', 'd'};
        char target = 'a';
        char expected = 'b'; // 'b' is the smallest lexicographically character greater than 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testTargetEqualsMiddleLetter() {
        // Target is a middle letter in the array
        char[] letters = {'a', 'd', 'f', 'j'};
        char target = 'd';
        char expected = 'f'; // The next lexicographical character after 'd' is 'f'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testArrayWithTwoLetters() {
        // Edge case: Array contains exactly two elements
        char[] letters = {'a', 'b'};
        char target = 'a';
        char expected = 'b'; // The next lexicographical character after 'a' is 'b'
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testArrayWithLargeSize() {
        // Edge case: Test with a large array
        char[] letters = new char[10000];
        for (int i = 0; i < 10000; i++) {
            letters[i] = (char) ('a' + i % 26); // Fill with a pattern of lowercase letters
        }
        char target = 'z'; // Target is 'z', and we should return the first character 'a'
        char expected = 'a';
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    @Test
    public void testArrayWithLargeTarget() {
        // Edge case: Test with a large target value
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'k'; // Since 'k' is greater than all the letters, return the first character 'a'
        char expected = 'a';
        assertEquals(expected, smallestLetterGreaterThanTarget.find(letters, target));
    }

    // --- Test case for letters and target in various scenarios ---
    @Test
    public void testTargetSmallerThanAllLettersBA() {
        // Target is smaller than the first element, so we should return the first element
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c'; // The next lexicographical character after 'a' is 'c'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetEqualsLastLetterBA() {
        // Target is equal to the last element in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'j';
        char expected = 'a'; // Since there's no character greater than 'j', return the first element
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetGreaterThanAllLettersBA() {
        // Target is greater than all the letters in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'k';
        char expected = 'a'; // As no letter is greater than 'k', return the first character 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetSmallerThanAllLetters2BA() {
        // Target is smaller than all the letters in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'z';
        char expected = 'a'; // Since 'z' is greater than all elements, return the first element 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetInMiddleBA() {
        // Target is in the middle of the array, the smallest letter greater than target should be returned
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'c';
        char expected = 'f'; // The next lexicographical character after 'c' is 'f'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetAtStartBA() {
        // Target is the first character in the array
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'a';
        char expected = 'c'; // The next lexicographical character after 'a' is 'c'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testArrayWithIdenticalCharactersBA() {
        // All characters are the same, so return the first element
        char[] letters = {'a', 'a', 'a', 'a'};
        char target = 'a';
        char expected = 'a'; // No element is lexicographically greater than 'a', return the first element
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetInDescendingOrderBA() {
        // Test case where the target is smaller than the first element
        char[] letters = {'a', 'b', 'c', 'z'};
        char target = 'y';
        char expected = 'z'; // 'z' is the smallest lexicographically character greater than 'y'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetEqualsFirstLetterBA() {
        // Test case where the target equals the first letter
        char[] letters = {'a', 'b', 'c', 'd'};
        char target = 'a';
        char expected = 'b'; // 'b' is the smallest lexicographically character greater than 'a'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testTargetEqualsMiddleLetterBA() {
        // Target is a middle letter in the array
        char[] letters = {'a', 'd', 'f', 'j'};
        char target = 'd';
        char expected = 'f'; // The next lexicographical character after 'd' is 'f'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testArrayWithTwoLettersBA() {
        // Edge case: Array contains exactly two elements
        char[] letters = {'b', 'c'};
        char target = 'b';
        char expected = 'c'; // The next lexicographical character after 'a' is 'b'
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testArrayWithLargeSizeBA() {
        // Edge case: Test with a large array
        char[] letters = new char[10000];
        for (int i = 0; i < 10000; i++) {
            letters[i] = (char) ('a' + i % 26); // Fill with a pattern of lowercase letters
        }
        char target = 'z'; // Target is 'z', and we should return the first character 'a'
        char expected = 'a';
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    @Test
    public void testArrayWithLargeTargetBA() {
        // Edge case: Test with a large target value
        char[] letters = {'a', 'c', 'f', 'j'};
        char target = 'k'; // Since 'k' is greater than all the letters, return the first character 'a'
        char expected = 'a';
        assertEquals(expected, smallestLetterGreaterThanTarget.findUsingBooleanArray(letters, target));
    }

    FirstAndLastPositionOfElementInSortedArray firstAndLastPositionOfElementInSortedArray = new FirstAndLastPositionOfElementInSortedArray();

    // Test Case 1: Target with multiple occurrences
    @Test
    public void testTargetWithMultipleOccurrences() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4}; // target 8 occurs at indices 3 and 4
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 2: Target with a single occurrence
    @Test
    public void testTargetWithSingleOccurrence() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] expected = {-1, -1}; // target 10 occurs at index 5
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 3: Target not found in the array
    @Test
    public void testTargetNotFound() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1}; // target 6 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 4: Empty array
    @Test
    public void testEmptyArray2() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1}; // No elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 5: Single element array with target present
    @Test
    public void testSingleElementArrayTargetPresent() {
        int[] nums = {5};
        int target = 5;
        int[] expected = {-1, -1}; // target 5 occurs at index 0
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 6: Single element array with target not present
    @Test
    public void testSingleElementArrayTargetNotPresent() {
        int[] nums = {5};
        int target = 6;
        int[] expected = {-1, -1}; // target 6 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 7: Target is smaller than all elements in the array
    @Test
    public void testTargetSmallerThanAllElements() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 4;
        int[] expected = {-1, -1}; // target 4 is smaller than all elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 8: Target is greater than all elements in the array
    @Test
    public void testTargetGreaterThanAllElements() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 12;
        int[] expected = {-1, -1}; // target 12 is greater than all elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 9: All elements are the same as the target
    @Test
    public void testAllElementsSameAsTarget() {
        int[] nums = {5, 5, 5, 5, 5};
        int target = 5;
        int[] expected = {0, 4}; // All elements are 5, so first and last indices are 0 and 4
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 10: Large array with target at the start
    @Test
    public void testLargeArrayWithTargetAtStart() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 1); // All elements are 1
        int target = 1;
        int[] expected = {0, 99999}; // target 1 occurs from index 0 to 99999
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 11: Large array with no target found
    @Test
    public void testLargeArrayWithTargetNotFound() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 1); // All elements are 1
        int target = 2;
        int[] expected = {-1, -1}; // target 2 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 12: Large array with multiple occurrences of target
    @Test
    public void testLargeArrayWithMultipleOccurrences() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 2); // All elements are 2
        int target = 2;
        int[] expected = {0, 99999}; // target 2 occurs at all positions from 0 to 99999
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBruteForce(nums, target));
    }

    // Test Case 1: Target with multiple occurrences
    @Test
    public void testTargetWithMultipleOccurrencesBS() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4}; // target 8 occurs at indices 3 and 4
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 2: Target with a single occurrence
    @Test
    public void testTargetWithSingleOccurrenceBS() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] expected = {-1, -1}; // target 10 occurs at index 5
        int[] result = firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target);
        assertArrayEquals(expected, result);
    }

    // Test Case 3: Target not found in the array
    @Test
    public void testTargetNotFoundBS() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1}; // target 6 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 4: Empty array
    @Test
    public void testEmptyArray2BS() {
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1}; // No elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 5: Single element array with target present
    @Test
    public void testSingleElementArrayTargetPresentBS() {
        int[] nums = {5};
        int target = 5;
        int[] expected = {-1, -1}; // target 5 occurs at index 0
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 6: Single element array with target not present
    @Test
    public void testSingleElementArrayTargetNotPresentBS() {
        int[] nums = {5};
        int target = 6;
        int[] expected = {-1, -1}; // target 6 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 7: Target is smaller than all elements in the array
    @Test
    public void testTargetSmallerThanAllElementsBS() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 4;
        int[] expected = {-1, -1}; // target 4 is smaller than all elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 8: Target is greater than all elements in the array
    @Test
    public void testTargetGreaterThanAllElementsBS() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 12;
        int[] expected = {-1, -1}; // target 12 is greater than all elements in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 9: All elements are the same as the target
    @Test
    public void testAllElementsSameAsTargetBS() {
        int[] nums = {5, 5, 5, 5, 5};
        int target = 5;
        int[] expected = {0, 4}; // All elements are 5, so first and last indices are 0 and 4
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 10: Large array with target at the start
    @Test
    public void testLargeArrayWithTargetAtStartBS() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 1); // All elements are 1
        int target = 1;
        int[] expected = {0, 99999}; // target 1 occurs from index 0 to 99999
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 11: Large array with no target found
    @Test
    public void testLargeArrayWithTargetNotFoundBS() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 1); // All elements are 1
        int target = 2;
        int[] expected = {-1, -1}; // target 2 is not in the array
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    // Test Case 12: Large array with multiple occurrences of target
    @Test
    public void testLargeArrayWithMultipleOccurrencesBS() {
        int[] nums = new int[100000];
        Arrays.fill(nums, 0, 100000, 2); // All elements are 2
        int target = 2;
        int[] expected = {0, 99999}; // target 2 occurs at all positions from 0 to 99999
        assertArrayEquals(expected, firstAndLastPositionOfElementInSortedArray.findUsingBinarySearch(nums, target));
    }

    private final FindTargetInAnInfiniteArray finder = new FindTargetInAnInfiniteArray();

    // Test 1: Basic test where the target exists in the array
    @Test
    public void testFindTargetExists() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70};
        int target = 70;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(7, result);
    }

    // Test 2: Target at the first index
    @Test
    public void testTargetAtStartInfiniteArray() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70};
        int target = 10;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(0, result);
    }

    // Test 3: Target at the last index
    @Test
    public void testTargetAtEnd() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70};
        int target = 70;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(7, result);
    }

    // Test 4: Target does not exist in the array
    @Test
    public void testTargetDoesNotExist() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70};
        int target = 100;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(-1, result);
    }

    // Test 5: Target in the middle of the array
    @Test
    public void testTargetInMiddleInfiniteArray() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70};
        int target = 33;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(4, result);
    }

    // Test 6: Empty array - Edge case
    @Test
    public void testEmptyArrayInfiniteArray() {
        int[] array = {};
        int target = 10;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(-1, result);
    }

    // Test 7: Target is very large and located beyond initial exponential range
    @Test
    public void testLargeTargetInfiniteArray() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 1000};
        int target = 1000;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(7, result);
    }

    // Test 8: Searching for a small target in a large array (large range test)
    @Test
    public void testSmallTargetLargeArray() {
        int[] array = {10, 18, 25, 31, 33, 60, 68, 70, 150, 200, 300, 500, 700, 800, 1000, 1200};
        int target = 18;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(1, result);
    }

    // Test 9: Test when target is not found, edge case of exponential range expansion
    @Test
    public void testTargetOutOfBounds() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;

        int result = finder.findUsingBinarySearch(array, target);
        assertEquals(-1, result);
    }

    private final FindPeakOfAMountainArray findPeakOfAMountainArray = new FindPeakOfAMountainArray();

    // Test 1: Basic test with a small mountain array
    @Test
    public void testBasicMountain() {
        int[] arr = {0, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 2: Test with a larger peak
    @Test
    public void testLargerPeak() {
        int[] arr = {0, 2, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 3: Test with a larger number of elements
    @Test
    public void testLargerArray() {
        int[] arr = {0, 10, 5, 2};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 4: Case where the peak is at the beginning of the array
    @Test
    public void testPeakAtStartMS() {
        int[] arr = {1, 2, 1};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 5: Case where the peak is at the end of the array
    @Test
    public void testPeakAtEndMS() {
        int[] arr = {1, 2, 3, 2, 1};
        assertEquals(2, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 6: Case where the peak is at the middle of the array
    @Test
    public void testPeakAtMiddle() {
        int[] arr = {1, 3, 2};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 7: Case with a large number of elements
    @Test
    public void testLargeArrayPeak() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = i;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = arr.length - i - 1;
        }

        // The peak should be at the middle of the array
        assertEquals((arr.length / 2) - 1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 8: Edge case where the array has only 3 elements
    @Test
    public void testMinimumSizeArray() {
        int[] arr = {0, 2, 1};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 9: Array with all elements being the same except the peak
    @Test
    public void testIdenticalElements() {
        int[] arr = {0, 1000, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 10: Edge case where the peak is at the second position
    @Test
    public void testPeakAtSecond() {
        int[] arr = {1, 2, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 11: Array where the peak is larger than all other elements
    @Test
    public void testVeryLargePeak() {
        int[] arr = {1, 1000000, 999999, 999998};
        assertEquals(1, findPeakOfAMountainArray.findUsingBruteForce(arr));
    }

    // Test 1: Basic test with a small mountain array
    @Test
    public void testBasicMountainBS() {
        int[] arr = {0, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 2: Test with a larger peak
    @Test
    public void testLargerPeakBS() {
        int[] arr = {0, 2, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 3: Test with a larger number of elements
    @Test
    public void testLargerArrayBS() {
        int[] arr = {0, 10, 5, 2};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 4: Case where the peak is at the beginning of the array
    @Test
    public void testPeakAtStartBS() {
        int[] arr = {1, 2, 1};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 5: Case where the peak is at the end of the array
    @Test
    public void testPeakAtEndBS() {
        int[] arr = {1, 2, 3, 2, 1};
        assertEquals(2, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 6: Case where the peak is at the middle of the array
    @Test
    public void testPeakAtMiddleBS() {
        int[] arr = {1, 3, 2};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 7: Case with a large number of elements
    @Test
    public void testLargeArrayPeakBS() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = i;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] = arr.length - i - 1;
        }

        // The peak should be at the middle of the array
        assertEquals((arr.length / 2), findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 8: Edge case where the array has only 3 elements
    @Test
    public void testMinimumSizeArrayBS() {
        int[] arr = {0, 2, 1};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 9: Array with all elements being the same except the peak
    @Test
    public void testIdenticalElementsBS() {
        int[] arr = {0, 1000, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 10: Edge case where the peak is at the second position
    @Test
    public void testPeakAtSecondBS() {
        int[] arr = {1, 2, 1, 0};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    // Test 11: Array where the peak is larger than all other elements
    @Test
    public void testVeryLargePeakBS() {
        int[] arr = {1, 1000000, 999999, 999998};
        assertEquals(1, findPeakOfAMountainArray.findUsingBinarySearch(arr));
    }

    @Test
    public void testSingleElementArray() {
        // Edge case: array contains only one element
        int[] nums = {10};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(0, result); // The only element is the peak
    }

    @Test
    public void testTwoElementArrayPeakAtFirst() {
        // Edge case: array contains two elements, peak at the first index
        int[] nums = {20, 10};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(0, result); // Peak is at index 0
    }

    @Test
    public void testTwoElementArrayPeakAtSecond() {
        // Edge case: array contains two elements, peak at the second index
        int[] nums = {10, 20};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(1, result); // Peak is at index 1
    }

    @Test
    public void testMultiplePeaksReturnAny() {
        // Normal case: array contains multiple peaks
        int[] nums = {1, 3, 2, 5, 4};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        // Peak can be at index 1 (3) or index 3 (5)
        boolean isValid = (result == 1 || result == 3);
        assertEquals(true, isValid);
    }

    @Test
    public void testPeakAtStart() {
        // Normal case: peak is at the start of the array
        int[] nums = {10, 2, 1};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(0, result); // Peak is at index 0
    }

    @Test
    public void testPeakAtEnd() {
        // Normal case: peak is at the end of the array
        int[] nums = {1, 2, 3, 10};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(3, result); // Peak is at index 3
    }

    @Test
    public void testPeakInMiddle() {
        // Normal case: peak is in the middle of the array
        int[] nums = {1, 2, 3, 1};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(2, result); // Peak is at index 2
    }

    @Test
    public void testLongArray() {
        // Normal case: longer array with multiple peaks
        int[] nums = {1, 3, 2, 4, 6, 5, 7, 8, 6, 4};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        // Possible peaks: index 1 (3), 4 (6), 7 (8)
        boolean isValid = (result == 1 || result == 4 || result == 7);
        assertEquals(true, isValid);
    }

    @Test
    public void testNegativeAndPositiveNumbers() {
        // Normal case: array contains both negative and positive numbers
        int[] nums = {-10, -5, -1, 0, -2, -3};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(3, result); // Peak is at index 3 (0)
    }

    @Test
    public void testAllDescending() {
        // Edge case: array is strictly descending
        int[] nums = {10, 9, 8, 7, 6};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(0, result); // Peak is at index 0
    }

    @Test
    public void testAllAscending() {
        // Edge case: array is strictly ascending
        int[] nums = {1, 2, 3, 4, 5};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(4, result); // Peak is at index 4
    }

    @Test
    public void testArrayWithLargeValues() {
        // Edge case: array contains very large values
        int[] nums = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        FindPeakElement solution = new FindPeakElement();
        int result = solution.findUsingBinarySearch(nums);
        assertEquals(2, result); // Peak is at index 2 (Integer.MAX_VALUE)
    }

    @Test
    public void testTargetAtPeak() {
        // Case: Target is the peak of the mountain
        int[] mountainArr = {1, 3, 5, 4, 2};
        int target = 5;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(2, result); // Target found at index 2
    }

    @Test
    public void testTargetInAscendingPart() {
        // Case: Target is in the ascending part of the mountain
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(2, result); // Target found at the ascending part (index 2)
    }

    @Test
    public void testTargetInDescendingPart() {
        // Case: Target is in the descending part of the mountain
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(2, result); // Return minimum index (ascending part, index 2)
    }

    @Test
    public void testTargetNotFoundPE() {
        // Case: Target does not exist in the array
        int[] mountainArr = {0, 1, 2, 4, 2, 1};
        int target = 3;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testSinglePeakMountain() {
        // Case: Mountain array with one element in ascending, one in descending
        int[] mountainArr = {1, 3, 1};
        int target = 3;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(1, result); // Peak and target found at index 1
    }

    @Test
    public void testTargetAtEdgeAscending() {
        // Case: Target is at the beginning of the ascending part
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 1;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(0, result); // Target found at index 0
    }

    @Test
    public void testTargetAtEdgeDescending() {
        // Case: Target is at the end of the descending part
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 1;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(0, result); // Return the minimum index (index 0)
    }

    @Test
    public void testLargeMountainArray() {
        // Case: Large mountain array, target is in the middle
        int[] mountainArr = new int[10001];
        for (int i = 0; i <= 5000; i++) {
            mountainArr[i] = i;
        }
        for (int i = 5001; i < 10001; i++) {
            mountainArr[i] = 10000 - i;
        }
        int target = 4000;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(4000, result); // Target found at index 4000
    }

    @Test
    public void testTargetAtPeakInLargeMountain() {
        // Case: Large mountain array, target is the peak
        int[] mountainArr = new int[10001];
        for (int i = 0; i <= 5000; i++) {
            mountainArr[i] = i;
        }
        for (int i = 5001; i < 10001; i++) {
            mountainArr[i] = 10000 - i;
        }
        int target = 5000;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(5000, result); // Target is the peak at index 5000
    }

    @Test
    public void testTargetAtEdgeOfDescending() {
        // Case: Target is at the last index of the descending part
        int[] mountainArr = {1, 2, 3, 5, 4, 2};
        int target = 2;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(1, result); // Target found at index 5
    }

    @Test
    public void testNoTargetWithRepeatedValues() {
        // Case: Mountain array with distinct values and target not present
        int[] mountainArr = {1, 3, 5, 4, 2};
        int target = 6;
        FindMinimumIndexInMountainArray solution = new FindMinimumIndexInMountainArray();
        int result = solution.findUsingBinarySearch(mountainArr, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testTargetFoundInLeftHalf() {
        // Case: Target is in the left (rotated) half of the array
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(2, result); // Target found at index 2
    }

    @Test
    public void testTargetFoundInRightHalf() {
        // Case: Target is in the right half of the array
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(5, result); // Target found at index 5
    }

    @Test
    public void testTargetAtPivot() {
        // Case: Target is at the pivot point
        int[] nums = {6, 7, 0, 1, 2, 3, 4, 5};
        int target = 0;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(2, result); // Target found at pivot index 2
    }

    @Test
    public void testTargetNotFoundSS() {
        // Case: Target is not in the array
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testSingleElementFound() {
        // Case: Array contains only one element, and target is found
        int[] nums = {5};
        int target = 5;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(0, result); // Target found at index 0
    }

    @Test
    public void testSingleElementNotFound() {
        // Case: Array contains only one element, and target is not found
        int[] nums = {5};
        int target = 3;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testArrayNotRotatedTargetFound() {
        // Case: Array is not rotated, and target is found
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(3, result); // Target found at index 3
    }

    @Test
    public void testArrayNotRotatedTargetNotFound() {
        // Case: Array is not rotated, and target is not found
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testLargeArrayTargetFound() {
        // Case: Large rotated array, target is found
        int[] nums = new int[5000];
        for (int i = 1000; i < 5000; i++) {
            nums[i - 1000] = i; // 1000 to 4999
        }
        for (int i = 0; i < 1000; i++) {
            nums[4000 + i] = i; // 0 to 999
        }
        int target = 2500;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(1500, result); // Target found at index 1500
    }

    @Test
    public void testLargeArrayTargetNotFound() {
        // Case: Large rotated array, target is not found
        int[] nums = new int[5000];
        for (int i = 1000; i < 5000; i++) {
            nums[i - 1000] = i; // 1000 to 4999
        }
        for (int i = 0; i < 1000; i++) {
            nums[4000 + i] = i; // 0 to 999
        }
        int target = 5000;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(-1, result); // Target not found
    }

    @Test
    public void testNegativeValues() {
        // Case: Array contains negative and positive values, target found
        int[] nums = {-9, -4, -1, 0, 3, 8, 12};
        int target = -4;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(1, result); // Target found at index 1
    }

    @Test
    public void testNegativeValuesNotFound() {
        // Case: Array contains negative and positive values, target not found
        int[] nums = {-9, -4, -1, 0, 3, 8, 12};
        int target = 7;
        SearchInRotatedSortedArray solution = new SearchInRotatedSortedArray();
        int result = solution.findUsingBinarySearch(nums, target);
        assertEquals(-1, result); // Target not found
    }

    private final NumberOfRotationsOnASortedArray numberOfRotationsOnASortedArray = new NumberOfRotationsOnASortedArray();

    @Test
    public void testNoRotation() {
        // Case: No rotation
        int[] arr = {7, 9, 11, 12, 15};
        assertEquals(0, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testSingleRotation() {
        // Case: Rotated once
        int[] arr = {15, 7, 9, 11, 12};
        assertEquals(1, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testMultipleRotations() {
        // Case: Rotated multiple times
        int[] arr = {15, 18, 2, 3, 6, 12};
        assertEquals(2, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testAlmostFullRotation() {
        // Case: Rotated to nearly full length of the array
        int[] arr = {7, 9, 11, 12, 5};
        assertEquals(4, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testFullRotation() {
        // Case: Fully rotated (k = length of array)
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, numberOfRotationsOnASortedArray.findRotationCount(arr)); // Same as no rotation
    }

    @Test
    public void testSmallArraySize() {
        // Case: Array of size 2, rotated once
        int[] arr = {2, 1};
        assertEquals(1, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testMinimumArraySize() {
        // Case: Array of size 1, no rotation
        int[] arr = {5};
        assertEquals(0, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testLargeArrayRC() {
        // Case: Large array
        int[] arr = {10001, 10002, 1, 2, 3, 4, 5};
        assertEquals(2, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testNegativeValuesRC() {
        // Case: Array with negative values
        int[] arr = {-9, -7, -4, 1, 2, 3, -15};
        assertEquals(6, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testMixedPositiveNegative() {
        // Case: Array with a mix of positive and negative values
        int[] arr = {5, 10, -15, -10, -5, 0};
        assertEquals(2, numberOfRotationsOnASortedArray.findRotationCount(arr));
    }

    @Test
    public void testTargetFoundInMiddle() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 29);
        assertArrayEquals(new int[]{2, 1}, result); // Target found at (2, 1)
    }

    @Test
    public void testTargetFoundInTopLeft() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 10);
        assertArrayEquals(new int[]{0, 0}, result); // Target found at top-left (0, 0)
    }

    @Test
    public void testTargetFoundInBottomRight() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 50);
        assertArrayEquals(new int[]{3, 3}, result); // Target found at bottom-right (3, 3)
    }

    @Test
    public void testTargetNotFound2D() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 100);
        assertArrayEquals(new int[]{-1, -1}, result); // Target not found
    }

    @Test
    public void testTargetSmallerThanAllElements2D() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 5);
        assertArrayEquals(new int[]{-1, -1}, result); // Target not found
    }

    @Test
    public void testSingleElementMatrixTargetFound() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {42}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 42);
        assertArrayEquals(new int[]{0, 0}, result); // Target found at (0, 0)
    }

    @Test
    public void testSingleElementMatrixTargetNotFound() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {42}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 99);
        assertArrayEquals(new int[]{-1, -1}, result); // Target not found
    }

    @Test
    public void testEmptyMatrix() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {};
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 42);
        assertArrayEquals(new int[]{-1, -1}, result); // Edge case: Empty matrix
    }

    @Test
    public void testMatrixWithEmptyRows() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {},
            {},
            {}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 42);
        assertArrayEquals(new int[]{-1, -1}, result); // Edge case: Empty rows in the matrix
    }

    @Test
    public void testTargetInLastColumn() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 13}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 13);
        assertArrayEquals(new int[]{2, 3}, result); // Target found in last column
    }

    @Test
    public void testTargetInFirstColumn() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] nums = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 13}
        };
        int[] result = searcher.searchUsingReducingSearchSpaceInRowColumnSortedMatrix(nums, 3);
        assertArrayEquals(new int[]{2, 0}, result); // Target found in first column
    }

    @Test
    public void testTargetPresent() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 3);
        assertTrue(result); // Target 3 is present in the matrix
    }

    @Test
    public void testTargetAbsent() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 13);
        assertFalse(result); // Target 13 is not present in the matrix
    }

    @Test
    public void testSingleRow() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 2, 3, 4, 5}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 4);
        assertTrue(result); // Target 4 is present in the matrix
    }

    @Test
    public void testSingleColumn() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1}, {3}, {5}, {7}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 5);
        assertTrue(result); // Target 5 is present in the matrix
    }

    @Test
    public void testSingleElement() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{5}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 5);
        assertTrue(result); // Target 5 is present in the matrix
    }

    @Test

    public void testEmptyMatrix2D() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 5);
        assertFalse(result); // Empty matrix, target cannot be present
    }

    @Test
    public void testNegativeNumbers2D() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10, -5, -1, 0}, {1, 2, 3, 4}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, -5);
        assertTrue(result); // Target -5 is present in the matrix
    }

    @Test
    public void testTargetOutOfRange() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, -100);
        assertFalse(result); // Target -100 is less than all elements in the matrix
    }

    @Test
    public void testLargestMatrix() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = new int[100][100];
        int target = 9999;

        // Fill the matrix with sequential numbers
        int value = -10000;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrix[i][j] = value++;
            }
        }

        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, target);
        assertFalse(result); // Target 9999 is greater than all elements in the matrix
    }

    @Test
    public void testMinimumValueInRange() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10000, -9999, -9998}, {-9995, -9994, -9993}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, -10000);
        assertTrue(result); // Target -10000 is present in the matrix
    }

    @Test
    public void testMaximumValueInRange() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{9997, 9998, 9999}, {10000, 10001, 10002}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 10000);
        assertTrue(result); // Target 10000 is present in the matrix
    }

    @Test
    public void testTargetTooSmall() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10000, -9999, -9998}, {-9995, -9994, -9993}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, -10001);
        assertFalse(result); // Target -10001 is smaller than all elements in the matrix
    }

    @Test
    public void testTargetTooLarge() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{9997, 9998, 9999}, {10000, 10001, 10002}};
        boolean result = searcher.searchUsingReducingSearchSpaceInRowSortedMatrix(matrix, 10003);
        assertFalse(result); // Target 10003 is larger than all elements in the matrix
    }

    @Test
    public void testTargetPresentMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 3);
        assertTrue(result); // Target 3 is present in the matrix
    }

    @Test
    public void testTargetAbsentMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 13);
        assertFalse(result); // Target 13 is not present in the matrix
    }

    @Test
    public void testSingleRowMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 2, 3, 4, 5}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 4);
        assertTrue(result); // Target 4 is present in the matrix
    }

    @Test
    public void testSingleColumnMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1}, {3}, {5}, {7}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 5);
        assertTrue(result); // Target 5 is present in the matrix
    }

    @Test
    public void testSingleElementMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{5}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 5);
        assertTrue(result); // Target 5 is present in the matrix
    }

    @Test

    public void testEmptyMatrix2DMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 5);
        assertFalse(result); // Empty matrix, target cannot be present
    }

    @Test
    public void testNegativeNumbers2DMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10, -5, -1, 0}, {1, 2, 3, 4}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, -5);
        assertTrue(result); // Target -5 is present in the matrix
    }

    @Test
    public void testTargetOutOfRangeMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, -100);
        assertFalse(result); // Target -100 is less than all elements in the matrix
    }

    @Test
    public void testLargestMatrixMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = new int[100][100];
        int target = 9999;

        // Fill the matrix with sequential numbers
        int value = -10000;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrix[i][j] = value++;
            }
        }

        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, target);
        assertFalse(result); // Target 9999 is greater than all elements in the matrix
    }

    @Test
    public void testMinimumValueInRangeMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10000, -9999, -9998}, {-9995, -9994, -9993}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, -10000);
        assertTrue(result); // Target -10000 is present in the matrix
    }

    @Test
    public void testMaximumValueInRangeMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{9997, 9998, 9999}, {10000, 10001, 10002}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 10000);
        assertTrue(result); // Target 10000 is present in the matrix
    }

    @Test
    public void testTargetTooSmallMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{-10000, -9999, -9998}, {-9995, -9994, -9993}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, -10001);
        assertFalse(result); // Target -10001 is smaller than all elements in the matrix
    }

    @Test
    public void testTargetTooLargeMM() {
        SearchingInA2DMatrix searcher = new SearchingInA2DMatrix();
        int[][] matrix = {{9997, 9998, 9999}, {10000, 10001, 10002}};
        boolean result = searcher.searchInRowSortedMatrixUsingMathematicalMapping(matrix, 10003);
        assertFalse(result); // Target 10003 is larger than all elements in the matrix
    }

    private final SquareRootOfANumber squareRootOfANumber = new SquareRootOfANumber();

    @Test
    public void testPerfectSquares() {
        assertEquals(0, squareRootOfANumber.findUsingBinarySearch(0)); // x = 0
        assertEquals(1, squareRootOfANumber.findUsingBinarySearch(1)); // x = 1
        assertEquals(2, squareRootOfANumber.findUsingBinarySearch(4)); // x = 4
        assertEquals(3, squareRootOfANumber.findUsingBinarySearch(9)); // x = 9
        assertEquals(10, squareRootOfANumber.findUsingBinarySearch(100)); // x = 100
    }

    @Test
    public void testNonPerfectSquares() {
        assertEquals(2, squareRootOfANumber.findUsingBinarySearch(8)); // x = 8
        assertEquals(4, squareRootOfANumber.findUsingBinarySearch(20)); // x = 20
        assertEquals(15, squareRootOfANumber.findUsingBinarySearch(240)); // x = 240
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(46340, squareRootOfANumber.findUsingBinarySearch(2147395600)); // Largest perfect square < 2^31 - 1
        assertEquals(46340, squareRootOfANumber.findUsingBinarySearch(2147483647)); // Largest number in range
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(0, squareRootOfANumber.findUsingBinarySearch(0)); // Lower bound
        assertEquals(1, squareRootOfANumber.findUsingBinarySearch(2)); // Just above 1
    }

    @Test
    public void testEdgeCases() {
        assertEquals(46340, squareRootOfANumber.findUsingBinarySearch(2147483646)); // Edge case near upper limit
        assertEquals(46340, squareRootOfANumber.findUsingBinarySearch(2147395601)); // Slightly above the largest perfect square
    }

    @Test
    public void testBasicCases() {
        GuessTheNumber game = new GuessTheNumber();

        // Test small range
        assertEquals(6, game.findUsingBinarySearch(10, 6)); // Picked number is in the middle
        assertEquals(1, game.findUsingBinarySearch(10, 1)); // Picked number is at the start
        assertEquals(10, game.findUsingBinarySearch(10, 10)); // Picked number is at the end
    }

    @Test
    public void testEdgeCasesGame() {
        GuessTheNumber game = new GuessTheNumber();

        // Test edge of the range
        assertEquals(1, game.findUsingBinarySearch(1, 1)); // Smallest possible range
        assertEquals(2_147_483_647, game.findUsingBinarySearch(2_147_483_647, 2_147_483_647)); // Largest possible range
    }

    @Test
    public void testLargeRange() {
        GuessTheNumber game = new GuessTheNumber();

        // Test large range with numbers picked in different positions
        assertEquals(1, game.findUsingBinarySearch(2_147_483_647, 1)); // Picked number is the smallest
        assertEquals(1_073_741_824, game.findUsingBinarySearch(2_147_483_647, 1_073_741_824)); // Picked number is in the middle
        assertEquals(2_147_483_647, game.findUsingBinarySearch(2_147_483_647, 2_147_483_647)); // Picked number is the largest
    }

    @Test
    public void testBinarySearchLogic() {
        GuessTheNumber game = new GuessTheNumber();

        // Test numbers that require multiple binary search steps
        assertEquals(50, game.findUsingBinarySearch(100, 50)); // Picked number in the middle
        assertEquals(75, game.findUsingBinarySearch(100, 75)); // Picked number in the upper half
        assertEquals(25, game.findUsingBinarySearch(100, 25)); // Picked number in the lower half
    }

    @Test
    public void testPerformance() {
        GuessTheNumber game = new GuessTheNumber();

        // Test performance on maximum range
        assertEquals(2_147_483_646, game.findUsingBinarySearch(2_147_483_647, 2_147_483_646));
    }

    @Test
    public void testBasicCasesTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test example cases
        assertArrayEquals(new int[]{1, 2}, solver.findUsingBinarySearch(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, solver.findUsingBinarySearch(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, solver.findUsingBinarySearch(new int[]{-1, 0}, -1));
    }

    @Test
    public void testNegativeNumbersTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test with negative numbers
        assertArrayEquals(new int[]{1, 4}, solver.findUsingBinarySearch(new int[]{-10, -3, 2, 7, 15}, -3));
        assertArrayEquals(new int[]{3, 5}, solver.findUsingBinarySearch(new int[]{-7, -3, 0, 5, 8}, 8));
    }

    @Test
    public void testLargeInputTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test with large array
        int[] numbers = new int[30_000];
        for (int i = 0; i < 30_000; i++) {
            numbers[i] = i + 1; // Fill array with 1 to 30000
        }
        assertArrayEquals(new int[]{1, 30_000}, solver.findUsingBinarySearch(numbers, 30_001));
        assertArrayEquals(new int[]{1, 30_000}, solver.findUsingBinarySearch(numbers, 30_001));
    }

    @Test
    public void testSmallestInputTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test smallest valid input
        assertArrayEquals(new int[]{1, 2}, solver.findUsingBinarySearch(new int[]{1, 2}, 3));
    }

    @Test
    public void testRepeatedNumbersTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test with repeated numbers
        assertArrayEquals(new int[]{1, 5}, solver.findUsingBinarySearch(new int[]{1, 1, 1, 2, 2}, 3));
        assertArrayEquals(new int[]{4, 5}, solver.findUsingBinarySearch(new int[]{1, 1, 1, 2, 2}, 4));
    }

    @Test
    public void testEdgeCasesTS() {
        TwoSumInputArraySorted solver = new TwoSumInputArraySorted();

        // Test with largest constraints
        assertArrayEquals(new int[]{1, 2}, solver.findUsingBinarySearch(new int[]{-1000, 1000}, 0));
        assertArrayEquals(new int[]{1, 3}, solver.findUsingBinarySearch(new int[]{-1000, 0, 1000}, 0));
    }

    @Test
    public void testSmallPerfectSquares() {
        FindPerfectSquare solver = new FindPerfectSquare();
        assertTrue(solver.isPerfectSquare(1)); // Smallest perfect square
        assertTrue(solver.isPerfectSquare(4)); // 2^2 = 4
        assertTrue(solver.isPerfectSquare(9)); // 3^2 = 9
        assertTrue(solver.isPerfectSquare(16)); // 4^2 = 16
    }

    @Test
    public void testSmallNonPerfectSquares() {
        FindPerfectSquare solver = new FindPerfectSquare();
        assertFalse(solver.isPerfectSquare(2)); // Not a perfect square
        assertFalse(solver.isPerfectSquare(3)); // Not a perfect square
        assertFalse(solver.isPerfectSquare(5)); // Not a perfect square
        assertFalse(solver.isPerfectSquare(6)); // Not a perfect square
    }

    @Test
    public void testLargePerfectSquares() {
        FindPerfectSquare solver = new FindPerfectSquare();
        assertTrue(solver.isPerfectSquare(2147395600)); // Largest perfect square within constraints
        assertTrue(solver.isPerfectSquare(100000000)); // 10000^2
        assertTrue(solver.isPerfectSquare(1048576)); // 1024^2
    }

    @Test
    public void testLargeNonPerfectSquares() {
        FindPerfectSquare solver = new FindPerfectSquare();
        assertFalse(solver.isPerfectSquare(2147483647)); // Largest number in constraints, not a perfect square
        assertFalse(solver.isPerfectSquare(2147395601)); // Just above the largest perfect square
        assertFalse(solver.isPerfectSquare(123456789)); // Random large non-perfect square
    }

    @Test
    public void testEdgeCasesSq() {
        FindPerfectSquare solver = new FindPerfectSquare();
        assertTrue(solver.isPerfectSquare(1)); // Edge case: smallest num
        assertFalse(solver.isPerfectSquare(2)); // Just above 1
        assertTrue(solver.isPerfectSquare(2147395600)); // Largest perfect square
        assertFalse(solver.isPerfectSquare(2147483647)); // Largest possible num
    }

    @Test
    public void testSmallInputs() {
        ArrangingCoins solver = new ArrangingCoins();

        // Test smallest possible input
        assertEquals(1, solver.findUsingBinarySearch(1)); // 1 coin -> 1 row

        // Small numbers forming complete rows
        assertEquals(2, solver.findUsingBinarySearch(5)); // 1 + 2 + (2 coins remaining)
        assertEquals(3, solver.findUsingBinarySearch(8)); // 1 + 2 + 3 (exact)
    }

    @Test
    public void testLargeInputs() {
        ArrangingCoins solver = new ArrangingCoins();

        // Test large inputs near upper constraint
        assertEquals(65535, solver.findUsingBinarySearch(2147483647)); // Approximation near max int
        assertEquals(65535, solver.findUsingBinarySearch(2147483640)); // Slightly lower than max

        // Test the largest perfect triangular number below max int
        assertEquals(65535, solver.findUsingBinarySearch(2147450880)); // (65535 * 65536) / 2
    }

    @Test
    public void testExactPerfectTriangleNumbers() {
        ArrangingCoins solver = new ArrangingCoins();

        // Test exact triangular numbers
        assertEquals(2, solver.findUsingBinarySearch(3));    // 1 + 2 + 3 = 6
        assertEquals(4, solver.findUsingBinarySearch(10));   // 1 + 2 + 3 + 4 = 10
        assertEquals(5, solver.findUsingBinarySearch(15));   // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(10, solver.findUsingBinarySearch(55));  // 1 + 2 + ... + 10 = 55
    }

    @Test
    public void testIncompleteRows() {
        ArrangingCoins solver = new ArrangingCoins();

        // Test when rows are incomplete
        assertEquals(4, solver.findUsingBinarySearch(14));   // 1 + 2 + 3 + 4 + (1 remaining)
        assertEquals(3, solver.findUsingBinarySearch(9));    // 1 + 2 + 3 + (3 remaining)
    }

    @Test
    public void testEdgeCasesAC() {
        ArrangingCoins solver = new ArrangingCoins();

        // Edge cases around powers of 2
        assertEquals(65534, solver.findUsingBinarySearch(2147395600)); // Largest perfect square
        assertEquals(4, solver.findUsingBinarySearch(10));             // Perfect triangular number
    }

    @Test
    public void testSmallInputsMS() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(9, solver.findUsingBruteForce(new int[]{2, 3, 4, 7, 11}, 5));
        assertEquals(6, solver.findUsingBruteForce(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void testEdgeCasesMS() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(1, solver.findUsingBruteForce(new int[]{2}, 1)); // First missing
        assertEquals(1000, solver.findUsingBruteForce(new int[]{}, 1000)); // No elements in array
    }

    @Test
    public void testLargeKBS() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(101, solver.findUsingBruteForce(new int[]{1, 2, 3, 4, 5}, 96));
    }

    @Test
    public void testSmallInputsMSBS() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(9, solver.findUsingBinarySearch(new int[]{2, 3, 4, 7, 11}, 5));
        assertEquals(6, solver.findUsingBinarySearch(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void testEdgeCasesMSBS() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(1, solver.findUsingBinarySearch(new int[]{2}, 1)); // First missing
        assertEquals(1000, solver.findUsingBinarySearch(new int[]{}, 1000)); // No elements in array
    }

    @Test
    public void testLargeK() {
        FindKthPositiveMissingInteger solver = new FindKthPositiveMissingInteger();
        assertEquals(101, solver.findUsingBinarySearch(new int[]{1, 2, 3, 4, 5}, 96));
    }

    @Test
    public void testTargetFound() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Test cases where the target is found
        assertEquals(2, solver.findUsingBinarySearch(new int[]{1, 3, 5, 6}, 5));
        assertEquals(0, solver.findUsingBinarySearch(new int[]{2, 4, 6, 8}, 2));
        assertEquals(3, solver.findUsingBinarySearch(new int[]{1, 3, 5, 7, 9}, 7));
    }

    @Test
    public void testTargetNotFoundINS() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Test cases where the target is not found
        assertEquals(1, solver.findUsingBinarySearch(new int[]{1, 3, 5, 6}, 2)); // Target fits between 1 and 3
        assertEquals(4, solver.findUsingBinarySearch(new int[]{1, 3, 5, 6}, 7)); // Target fits after 6
        assertEquals(0, solver.findUsingBinarySearch(new int[]{3, 5, 7}, 1)); // Target fits before 3
    }

    @Test
    public void testSingleElementArrayINS() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Edge case: Single element array
        assertEquals(0, solver.findUsingBinarySearch(new int[]{5}, 2)); // Target fits before the single element
        assertEquals(0, solver.findUsingBinarySearch(new int[]{5}, 5)); // Target matches the single element
        assertEquals(1, solver.findUsingBinarySearch(new int[]{5}, 7)); // Target fits after the single element
    }

    @Test
    public void testTargetAtBounds() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Edge cases for target at array bounds
        assertEquals(0, solver.findUsingBinarySearch(new int[]{1, 3, 5, 6}, 1)); // Target matches the first element
        assertEquals(3, solver.findUsingBinarySearch(new int[]{1, 3, 5, 6}, 6)); // Target matches the last element
    }

    @Test
    public void testLargeInput() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Edge case: Large input size
        int[] nums = new int[10_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        assertEquals(0, solver.findUsingBinarySearch(nums, 1)); // Target at start
        assertEquals(4_999, solver.findUsingBinarySearch(nums, 5000)); // Target in middle
        assertEquals(10_000, solver.findUsingBinarySearch(nums, 10_001)); // Target beyond end
    }

    @Test
    public void testNegativeNumbersINS() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Edge case: Array with negative numbers
        assertEquals(2, solver.findUsingBinarySearch(new int[]{-10, -5, 0, 5, 10}, 0)); // Target is 0
        assertEquals(0, solver.findUsingBinarySearch(new int[]{-10, -5, 0, 5, 10}, -15)); // Target fits before -10
        assertEquals(5, solver.findUsingBinarySearch(new int[]{-10, -5, 0, 5, 10}, 15)); // Target fits after 10
    }

    @Test
    public void testConstraints() {
        SearchInsertPosition solver = new SearchInsertPosition();

        // Constraint: Minimum array size
        assertEquals(0, solver.findUsingBinarySearch(new int[]{-10_000}, -20_000));
        assertEquals(1, solver.findUsingBinarySearch(new int[]{-10_000}, 10_000));

        // Constraint: Large negative and positive bounds
        assertEquals(0, solver.findUsingBinarySearch(new int[]{-10_000, 0, 10_000}, -20_000));
        assertEquals(3, solver.findUsingBinarySearch(new int[]{-10_000, 0, 10_000}, 20_000));
    }

    @Test
    public void testExampleCases() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid1 = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        assertEquals(8, solver.findUsingBruteForce(grid1)); // Example 1

        int[][] grid2 = {
            {3, 2},
            {1, 0}
        };
        assertEquals(0, solver.findUsingBruteForce(grid2)); // Example 2
    }

    @Test
    public void testEdgeCases2D() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        // Single row with all positives
        int[][] grid3 = {{5, 4, 3, 2, 1}};
        assertEquals(0, solver.findUsingBruteForce(grid3));

        // Single row with all negatives
        int[][] grid4 = {{-1, -2, -3, -4}};
        assertEquals(4, solver.findUsingBruteForce(grid4));

        // Single column with a mix of positives and negatives
        int[][] grid5 = {
            {5},
            {3},
            {0},
            {-1},
            {-2}
        };
        assertEquals(2, solver.findUsingBruteForce(grid5));
    }

    @Test
    public void testSmallMatrix() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid6 = {{-5}};
        assertEquals(1, solver.findUsingBruteForce(grid6)); // Single element matrix (negative)

        int[][] grid7 = {{5}};
        assertEquals(0, solver.findUsingBruteForce(grid7)); // Single element matrix (positive)
    }

    @Test
    public void testLargeMatrix() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        // Large matrix with a mix of positives and negatives
        int[][] grid8 = new int[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                grid8[i][j] = 50; // Fill the first 50 rows with positives
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                grid8[i][j] = -50; // Fill the last 50 rows with negatives
            }
        }
        assertEquals(50 * 100, solver.findUsingBruteForce(grid8));
    }

    @Test
    public void testMixedValuesMatrix() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid9 = {
            {5, 3, 2, -1, -2},
            {4, 2, 0, -1, -3},
            {3, 1, -2, -3, -4},
            {2, 0, -3, -4, -5},
            {1, -1, -4, -5, -6}
        };
        assertEquals(14, solver.findUsingBruteForce(grid9));
    }

    @Test
    public void testExampleCasesTP() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid1 = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        assertEquals(8, solver.findUsingBruteForce(grid1)); // Example 1

        int[][] grid2 = {
            {3, 2},
            {1, 0}
        };
        assertEquals(0, solver.findUsingBruteForce(grid2)); // Example 2
    }

    @Test
    public void testEdgeCases2DTP() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        // Single row with all positives
        int[][] grid3 = {{5, 4, 3, 2, 1}};
        assertEquals(0, solver.findUsingBruteForce(grid3));

        // Single row with all negatives
        int[][] grid4 = {{-1, -2, -3, -4}};
        assertEquals(4, solver.findUsingBruteForce(grid4));

        // Single column with a mix of positives and negatives
        int[][] grid5 = {
            {5},
            {3},
            {0},
            {-1},
            {-2}
        };
        assertEquals(2, solver.findUsingBruteForce(grid5));
    }

    @Test
    public void testSmallMatrixTP() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid6 = {{-5}};
        assertEquals(1, solver.findUsingBruteForce(grid6)); // Single element matrix (negative)

        int[][] grid7 = {{5}};
        assertEquals(0, solver.findUsingBruteForce(grid7)); // Single element matrix (positive)
    }

    @Test
    public void testLargeMatrixTP() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        // Large matrix with a mix of positives and negatives
        int[][] grid8 = new int[100][100];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 100; j++) {
                grid8[i][j] = 50; // Fill the first 50 rows with positives
            }
        }
        for (int i = 50; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                grid8[i][j] = -50; // Fill the last 50 rows with negatives
            }
        }
        assertEquals(50 * 100, solver.findUsingBruteForce(grid8));
    }

    @Test
    public void testMixedValuesMatrixTP() {
        CountNegativeNumbersInSorted2DArray solver = new CountNegativeNumbersInSorted2DArray();

        int[][] grid9 = {
            {5, 3, 2, -1, -2},
            {4, 2, 0, -1, -3},
            {3, 1, -2, -3, -4},
            {2, 0, -3, -4, -5},
            {1, -1, -4, -5, -6}
        };
        assertEquals(14, solver.findUsingTwoPointer(grid9));
    }

    private final FindIntersectionInArrays findIntersectionInArrays = new FindIntersectionInArrays();

    @Test
    public void testSmallArrays() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testNoIntersection() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testAllCommon() {
        int[] nums1 = {2, 3, 4};
        int[] nums2 = {3, 2, 4};
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testLargeValues() {
        int[] nums1 = {999, 1000};
        int[] nums2 = {999, 1000, 998};
        int[] expected = {999, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums1() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testWithDuplicateNumbersInNums1AndNums2() {
        int[] nums1 = {4, 4, 5, 5};
        int[] nums2 = {4, 4, 6};
        int[] expected = {4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testSameArrayTwice() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testUpperBoundValues() {
        int[] nums1 = {0, 1000};
        int[] nums2 = {0, 500, 1000};
        int[] expected = {0, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testSingleElementMatch() {
        int[] nums1 = {10};
        int[] nums2 = {10};
        int[] expected = {10};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    @Test
    public void testSingleElementNoMatch() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSortingAndBinarySearch(nums1, nums2)));
    }

    // Utility function to sort the result for comparison as order doesn't matter
    private int[] sortResult(int[] result) {
        Arrays.sort(result);
        return result;
    }

    @Test
    public void testSmallArraysSet() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testNoIntersectionSet() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testAllCommonSet() {
        int[] nums1 = {2, 3, 4};
        int[] nums2 = {3, 2, 4};
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testLargeValuesSet() {
        int[] nums1 = {999, 1000};
        int[] nums2 = {999, 1000, 998};
        int[] expected = {999, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums2Set() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums1Set() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testWithDuplicateNumbersInNums1AndNums2Set() {
        int[] nums1 = {4, 4, 5, 5};
        int[] nums2 = {4, 4, 6};
        int[] expected = {4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testSameArrayTwiceSet() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testUpperBoundValuesSet() {
        int[] nums1 = {0, 1000};
        int[] nums2 = {0, 500, 1000};
        int[] expected = {0, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testSingleElementMatchSet() {
        int[] nums1 = {10};
        int[] nums2 = {10};
        int[] expected = {10};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testSingleElementNoMatchSet() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingSet(nums1, nums2)));
    }

    @Test
    public void testSmallArraysHash() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testNoIntersectionHash() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testAllCommonHash() {
        int[] nums1 = {2, 3, 4};
        int[] nums2 = {3, 2, 4};
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testLargeValuesHash() {
        int[] nums1 = {999, 1000};
        int[] nums2 = {999, 1000, 998};
        int[] expected = {999, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums2hash() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testNoElementsInNums1Hash() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testWithDuplicateNumbersInNums1AndNums2Hash() {
        int[] nums1 = {4, 4, 5, 5};
        int[] nums2 = {4, 4, 6};
        int[] expected = {4};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testSameArrayTwiceHash() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testUpperBoundValuesHash() {
        int[] nums1 = {0, 1000};
        int[] nums2 = {0, 500, 1000};
        int[] expected = {0, 1000};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testSingleElementMatchHash() {
        int[] nums1 = {10};
        int[] nums2 = {10};
        int[] expected = {10};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    @Test
    public void testSingleElementNoMatchHashh() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        int[] expected = {};
        assertArrayEquals(expected, sortResult(findIntersectionInArrays.findUsingHashing(nums1, nums2)));
    }

    FindIntersectionWithDuplicates findIntersectionWithDuplicates = new FindIntersectionWithDuplicates();

    @Test
    public void testBasicCasesFI() {
        // Test case 1: Common elements with duplicates
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2, 2};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 2: Common elements, no duplicates
        nums1 = new int[]{4, 5};
        nums2 = new int[]{5, 4};
        expected = new int[]{5, 4}; // Order can vary
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 3: No intersection
        nums1 = new int[]{1, 3, 5};
        nums2 = new int[]{2, 4, 6};
        expected = new int[]{};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));
    }

    @Test
    public void testEdgeCasesFI() {
        // Test case 4: One array empty
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        int[] expected = {};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 5: Both arrays empty
        nums1 = new int[]{};
        nums2 = new int[]{};
        expected = new int[]{};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 6: Single element arrays with no intersection
        nums1 = new int[]{1};
        nums2 = new int[]{2};
        expected = new int[]{};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 7: Single element arrays with intersection
        nums1 = new int[]{2};
        nums2 = new int[]{2};
        expected = new int[]{2};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));
    }

    @Test
    public void testSpecialCases() {
        // Test case 8: One array completely contains the other
        int[] nums1 = {4, 4, 4};
        int[] nums2 = {4, 4};
        int[] expected = {4, 4};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));

        // Test case 9: Large arrays
        nums1 = new int[1000];
        nums2 = new int[1000];
        Arrays.fill(nums1, 1); // All elements in nums1 are 1
        Arrays.fill(nums2, 1); // All elements in nums2 are 1
        expected = new int[1000];
        Arrays.fill(expected, 1);
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMap(nums1, nums2));
    }

    @Test
    public void testSpecialCasesSorted() {
        // Test case 8: One array completely contains the other
        int[] nums1 = {1, 2, 2, 4, 4, 5, 5, 5};
        int[] nums2 = {1, 2, 3, 4, 4, 5};
        int[] expected = {1, 2, 4, 4, 5};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingTwoPointerInSortedArrays(nums1, nums2));
    }

    @Test
    public void testSpecialStreaming() {
        // Test case 8: One array completely contains the other
        int[] nums1 = {1, 2, 2, 4, 4, 5, 5, 5};
        Iterable<Integer> nums2Stream = Arrays.asList(1, 2, 3, 4, 4, 5);
        int[] expected = {1, 2, 4, 4, 5};
        assertArrayEquals(expected, findIntersectionWithDuplicates.findUsingHashMapStreaming(nums1, nums2Stream));
    }
}
