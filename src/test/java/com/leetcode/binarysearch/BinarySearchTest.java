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
}
