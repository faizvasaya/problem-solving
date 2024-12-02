package com.leetcode.binarysearch;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
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

}
