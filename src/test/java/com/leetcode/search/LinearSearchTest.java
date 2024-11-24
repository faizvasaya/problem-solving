package com.leetcode.search;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testFindIndexElementPresent() {
        // Test case 1: Target element is present in the array
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexElementNotPresent() {
        // Test case 2: Target element is not present in the array
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexEmptyArray() {
        // Test case 3: Array is empty
        int[] array = {};
        int target = 3;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexFirstElement() {
        // Test case 4: Target element is the first element in the array
        int[] array = {5, 4, 3, 2, 1};
        int target = 5;
        int expectedIndex = 0;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexLastElement() {
        // Test case 5: Target element is the last element in the array
        int[] array = {1, 2, 3, 4, 5};
        int target = 5;
        int expectedIndex = 4;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexMultipleOccurrences() {
        // Test case 6: Target element appears multiple times in the array
        int[] array = {1, 3, 3, 4, 5};
        int target = 3;
        int expectedIndex = 1; // First occurrence index

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexSingleElement() {
        // Test case 7: Array contains only one element
        int[] array = {7};
        int target = 7;
        int expectedIndex = 0;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexNegativeNumbers() {
        // Test case 8: Array contains negative numbers
        int[] array = {-5, -4, -3, -2, -1};
        int target = -3;
        int expectedIndex = 2;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexMinMaxValues() {
        // Test case 9: Array contains minimum and maximum integer values
        int[] array = {Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE};
        int target = Integer.MAX_VALUE;
        int expectedIndex = 4;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArray(array, target);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testCharacterExistsInAStringPresent() {
        // Test case 1: Target character is present in the string
        String str = "hello";
        char target = 'e';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringNotPresent() {
        // Test case 2: Target character is not present in the string
        String str = "hello";
        char target = 'z';
        boolean expectedResult = false;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringEmptyString() {
        // Test case 3: The string is empty
        String str = "";
        char target = 'a';
        boolean expectedResult = false;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringFirstCharacter() {
        // Test case 4: The target character is the first character of the string
        String str = "hello";
        char target = 'h';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringLastCharacter() {
        // Test case 5: The target character is the last character of the string
        String str = "hello";
        char target = 'o';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringMultipleOccurrences() {
        // Test case 6: The target character appears multiple times in the string
        String str = "hello world";
        char target = 'o';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringSingleCharacterString() {
        // Test case 7: The string contains a single character
        String str = "a";
        char target = 'a';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringDifferentCase() {
        // Test case 8: The character is present but with a different case
        String str = "Hello";
        char target = 'h'; // lower case 'h'
        boolean expectedResult = false;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringSpecialCharacters() {
        // Test case 9: The string contains special characters
        String str = "@hello#";
        char target = '#';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringNumbers() {
        // Test case 10: The string contains numbers and the target is a number
        String str = "1234567890";
        char target = '5';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testCharacterExistsInAStringSpaces() {
        // Test case 11: The string contains spaces
        String str = "hello world";
        char target = ' ';
        boolean expectedResult = true;

        LinearSearch solution = new LinearSearch();
        boolean result = solution.characterExistsInAString(str, target);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindIndexInRangeElementPresent() {
        // Test case 1: Target element is present within the specified range
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int startIndex = 1;
        int endIndex = 3;
        int expectedIndex = 2;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeElementNotPresent() {
        // Test case 2: Target element is not present within the specified range
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int startIndex = 1;
        int endIndex = 3;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeEmptyArray() {
        // Test case 3: The array is empty
        int[] array = {};
        int target = 3;
        int startIndex = 0;
        int endIndex = 0;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeInvalidRangeStartGreaterThanEnd() {
        // Test case 4: startIndex is greater than endIndex
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int startIndex = 4;
        int endIndex = 1;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeEndIndexOutOfBounds() {
        // Test case 5: endIndex is out of bounds of the array
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int startIndex = 0;
        int endIndex = 10;  // Invalid endIndex, out of bounds
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeElementAtStartIndex() {
        // Test case 6: The target element is at the start of the range
        int[] array = {1, 2, 3, 4, 5};
        int target = 1;
        int startIndex = 0;
        int endIndex = 4;
        int expectedIndex = 0;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeElementAtEndIndex() {
        // Test case 7: The target element is at the end of the range
        int[] array = {1, 2, 3, 4, 5};
        int target = 5;
        int startIndex = 0;
        int endIndex = 4;
        int expectedIndex = 4;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeElementAtMidIndex() {
        // Test case 8: The target element is at the middle of the range
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int startIndex = 0;
        int endIndex = 4;
        int expectedIndex = 2;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeNoElementInRange() {
        // Test case 9: The target element does not exist in the specified range, even though it's in the array
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;
        int startIndex = 2;  // Start after element '2'
        int endIndex = 4;
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeTargetNotWithinRange() {
        // Test case 10: The target is not within the range specified, but it exists elsewhere
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        int startIndex = 0;
        int endIndex = 1;  // Range [0, 1] does not include target 30
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeSingleElementRange() {
        // Test case 11: The range contains only a single element
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;
        int startIndex = 1;
        int endIndex = 1;  // Only one element in the range
        int expectedIndex = 1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindIndexInRangeValidSingleElementRangeTargetNotPresent() {
        // Test case 12: The range contains only a single element and target is not present
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int startIndex = 1;
        int endIndex = 1;  // Only one element in the range
        int expectedIndex = -1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findIndexInIntegerArrayInARange(array, target, startIndex, endIndex);

        assertEquals(expectedIndex, result);
    }

    @Test
    public void testFindMinimumNormalCase() {
        // Test case 1: Normal case where the array contains several elements
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        int expectedMinimum = 1;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumArrayWithNegativeNumbers() {
        // Test case 2: Array with negative numbers
        int[] array = {-10, -5, -3, -20, -1};
        int expectedMinimum = -20;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumSingleElement() {
        // Test case 3: Array with a single element
        int[] array = {42};
        int expectedMinimum = 42;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumEmptyArray() {
        // Test case 4: Empty array
        int[] array = {};
        int expectedMinimum = Integer.MAX_VALUE; // Expected behavior for empty array

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumAllIdenticalElements() {
        // Test case 5: Array with all identical elements
        int[] array = {7, 7, 7, 7, 7};
        int expectedMinimum = 7;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumArrayWithZero() {
        // Test case 6: Array containing zero and other numbers
        int[] array = {0, 3, -5, 8, 1};
        int expectedMinimum = -5;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumArrayWithLargeNumbers() {
        // Test case 7: Array with large numbers, including both positive and negative
        int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE, 500, -1000};
        int expectedMinimum = Integer.MIN_VALUE;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumArrayWithOneNegativeAndOnePositive() {
        // Test case 8: Array with one positive and one negative number
        int[] array = {100, -100};
        int expectedMinimum = -100;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindMinimumArrayWithRepeatedMaxValue() {
        // Test case 9: Array where all elements are equal to Integer.MAX_VALUE
        int[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int expectedMinimum = Integer.MAX_VALUE;

        LinearSearch solution = new LinearSearch();
        int result = solution.findMinimum(array);

        assertEquals(expectedMinimum, result);
    }

    @Test
    public void testFindIndexElementPresent2D() {
        // Test case 1: Target element is present in the 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        int[] expected = {1, 1}; // The target 5 is at row 1, column 1

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexElementNotPresent2D() {
        // Test case 2: Target element is not present in the 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 10;
        int[] expected = {-1, -1}; // The target 10 is not in the array

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexEmptyArray2D() {
        // Test case 3: Empty 2D array
        int[][] array = {};
        int target = 5;
        int[] expected = {-1, -1}; // Empty array, so no element to find

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexSingleRowArray() {
        // Test case 4: 2D array with a single row
        int[][] array = {
            {1, 2, 3, 4, 5}
        };
        int target = 4;
        int[] expected = {0, 3}; // The target 4 is at row 0, column 3

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexSingleColumnArray() {
        // Test case 5: 2D array with a single column
        int[][] array = {
            {1},
            {2},
            {3},
            {4},
            {5}
        };
        int target = 3;
        int[] expected = {2, 0}; // The target 3 is at row 2, column 0

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexElementInFirstRow() {
        // Test case 6: Target element is in the first row
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 3;
        int[] expected = {0, 2}; // The target 3 is at row 0, column 2

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexElementInLastRow() {
        // Test case 7: Target element is in the last row
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 9;
        int[] expected = {2, 2}; // The target 9 is at row 2, column 2

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexMultipleRowsAndColumns() {
        // Test case 8: Target element is in a large 2D array
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 7;
        int[] expected = {1, 2}; // The target 7 is at row 1, column 2

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexFirstElement2D() {
        // Test case 9: Target element is the first element
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60}
        };
        int target = 10;
        int[] expected = {0, 0}; // The target 10 is at row 0, column 0

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexLastElement2D() {
        // Test case 10: Target element is the last element in the array
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60}
        };
        int target = 60;
        int[] expected = {1, 2}; // The target 60 is at row 1, column 2

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexAllIdenticalElements2D() {
        // Test case 11: Array where all elements are identical
        int[][] array = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };
        int target = 5;
        int[] expected = {0, 0}; // The first occurrence of 5 is at row 0, column 0

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindIndexSingleElementArray2D() {
        // Test case 12: 2D array with a single element
        int[][] array = {
            {42}
        };
        int target = 42;
        int[] expected = {0, 0}; // The only element, 42, is at row 0, column 0

        LinearSearch solution = new LinearSearch();
        int[] result = solution.findIndexIn2DIntegerArray(array, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindMaximumNormalCase() {
        // Test case 1: Normal 2D array with mixed values
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int expected = 9; // Maximum value in the array is 9

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumWithNegativeNumbers() {
        // Test case 2: 2D array with negative numbers
        int[][] array = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9}
        };
        int expected = -1; // Maximum value in the array is -1

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumArrayWithSingleElement() {
        // Test case 3: 2D array with a single element
        int[][] array = {
            {42}
        };
        int expected = 42; // The only element is the maximum

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumEmptyArray() {
        // Test case 4: Empty 2D array
        int[][] array = {};
        int expected = Integer.MIN_VALUE; // Empty array, return minimum integer value

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumAllIdenticalElements() {
        // Test case 5: 2D array where all elements are the same
        int[][] array = {
            {5, 5, 5},
            {5, 5, 5},
            {5, 5, 5}
        };
        int expected = 5; // All elements are the same, the maximum is 5

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumSingleRowArray() {
        // Test case 6: 2D array with a single row
        int[][] array = {
            {1, 3, 2, 8, 5}
        };
        int expected = 8; // Maximum value in the row is 8

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumSingleColumnArray() {
        // Test case 7: 2D array with a single column
        int[][] array = {
            {1},
            {2},
            {3},
            {4},
            {5}
        };
        int expected = 5; // Maximum value is 5

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumLargeNumbers() {
        // Test case 8: 2D array with very large and small numbers
        int[][] array = {
            {Integer.MAX_VALUE, 1, 2},
            {3, 4, Integer.MIN_VALUE},
            {5, 6, 7}
        };
        int expected = Integer.MAX_VALUE; // Maximum value in the array is Integer.MAX_VALUE

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumWithZero() {
        // Test case 9: 2D array containing zeros and other numbers
        int[][] array = {
            {0, 2, 4},
            {5, -6, 7},
            {8, -9, 10}
        };
        int expected = 10; // Maximum value in the array is 10

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMaximumWithMultipleRowsAndColumns() {
        // Test case 10: 2D array with multiple rows and columns
        int[][] array = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int expected = 90; // Maximum value in the array is 90

        LinearSearch solution = new LinearSearch();
        int result = solution.findMaximumIn2DIntegerArray(array);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithDigitsPositive() {
        // Test case 1: Positive number with multiple digits
        int number = 12345;
        int expected = 5; // The number 12345 has 5 digits

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithSingleDigit() {
        // Test case 2: Single digit number
        int number = 7;
        int expected = 1; // The number 7 has 1 digit

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithZero() {
        // Test case 3: The number 0
        int number = 0;
        int expected = 1; // The number 0 has 0 digits by the given function's logic

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithNegativeNumber() {
        // Test case 4: Negative number with multiple digits
        int number = -12345;
        int expected = 5; // The negative number -12345 has 5 digits (ignoring the sign)

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithSingleNegativeDigit() {
        // Test case 5: Negative single digit number
        int number = -7;
        int expected = 1; // The number -7 has 1 digit (ignoring the sign)

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithLargeNumber() {
        // Test case 6: Large number with many digits
        int number = Integer.MAX_VALUE;
        int expected = 10; // The number 9876543210 has 10 digits

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithZeroBeforeNumber() {
        // Test case 8: Leading zeroes in the number (ignoring leading zeroes)
        int number = 000007;
        int expected = 1; // Leading zeroes are ignored, so the number 7 has 1 digit

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEventDigits(number);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsSimpleCase() {
        // Test case 1: Simple array with a mix of numbers
        int[] numbers = {123, 4567, 890, 12345, 6789};
        int expected = 2; // Numbers with even digits: 4567 (4 digits), 890 (3 digits), total of 2 numbers with even digits.

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsAllOddDigits() {
        // Test case 2: All numbers have odd number of digits
        int[] numbers = {1, 123, 12345};
        int expected = 0; // No numbers with even digits

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsAllEvenDigits() {
        // Test case 3: All numbers have even number of digits
        int[] numbers = {12, 3456, 7890, 5678};
        int expected = 4; // All numbers have even digits: 12 (2 digits), 3456 (4 digits), 7890 (4 digits), 5678 (4 digits)

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsEmptyArray() {
        // Test case 4: Empty array (edge case)
        int[] numbers = {};
        int expected = 0; // No numbers in the array, so return 0

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsSingleElementEvenDigits() {
        // Test case 5: Array with a single element having an even number of digits
        int[] numbers = {1234};
        int expected = 1; // 1234 has 4 digits, which is even

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsSingleElementOddDigits() {
        // Test case 6: Array with a single element having an odd number of digits
        int[] numbers = {123};
        int expected = 0; // 123 has 3 digits, which is odd

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsLargeInput() {
        // Test case 7: Large input size with both even and odd digits numbers
        int[] numbers = new int[500];
        for (int i = 0; i < 500; i++) {
            numbers[i] = i + 1; // Numbers from 1 to 500
        }
        int expected = 90; // Numbers with even digits from 1 to 500

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsMaxValue() {
        // Test case 8: Array with maximum possible value of elements
        int[] numbers = {100000, 99999};
        int expected = 1; // 100000 has 6 digits (even), 99999 has 5 digits (odd)

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsEdgeCase1() {
        // Test case 9: Array with single digit numbers (all odd digits)
        int[] numbers = {1, 3, 5, 7, 9};
        int expected = 0; // All numbers have 1 digit, which is odd

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testFindNumberWithEvenDigitsEdgeCase2() {
        // Test case 10: Array with large numbers
        int[] numbers = {1000, -10000, -100000};
        int expected = 2; // All numbers have even digits (4 digits, 5 digits, 6 digits)

        NumberWithEvenDigits solution = new NumberWithEvenDigits();
        int result = solution.findNumberWithEvenDigitsInAnArray(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void testExample1() {
        // Example 1: Both customers have the same wealth.
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(6, result);
    }

    @Test
    public void testExample2() {
        // Example 2: The second customer is the richest.
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(10, result);
    }

    @Test
    public void testExample3() {
        // Example 3: The richest customer has wealth 17.
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(17, result);
    }

    @Test
    public void testSingleCustomer() {
        // Single customer with one bank account.
        int[][] accounts = {{5}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(5, result);
    }

    @Test
    public void testMultipleCustomersSameWealth() {
        // Multiple customers with the same wealth.
        int[][] accounts = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(6, result);
    }

    @Test
    public void testSingleRow() {
        // Single customer with multiple bank accounts.
        int[][] accounts = {{10, 20, 30, 40}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(100, result);
    }

    @Test
    public void testMultipleCustomersDifferentWealth() {
        // Multiple customers with different wealth.
        int[][] accounts = {{1, 2, 3}, {5, 5, 5}, {10, 1}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(15, result); // The second customer is the richest with wealth 15.
    }

    @Test
    public void testEmptyAccounts() {
        // Empty account scenario (should not occur as per constraints but useful for robustness).
        int[][] accounts = {};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(0, result); // No customers, no wealth.
    }

    @Test
    public void testLargeValues() {
        // Case with large values to test constraints.
        int[][] accounts = {{100, 100, 100}, {50, 50, 50}, {1, 1, 1}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(300, result); // The first customer is the richest with wealth 300.
    }

    @Test
    public void testOneCustomerMultipleAccounts() {
        // One customer with multiple bank accounts.
        int[][] accounts = {{50, 50, 50, 50}};
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(200, result); // Only one customer with wealth 200.
    }

    @Test
    public void testMaxSizeArray() {
        // Test with maximum possible array size (50 x 50)
        int[][] accounts = new int[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                accounts[i][j] = 100; // Set all values to 100
            }
        }
        WealthOfRichestCustomer solution = new WealthOfRichestCustomer();
        int result = solution.maximumWealth(accounts);
        assertEquals(5000, result); // The richest customer has wealth 5000.
    }

    @Test
    public void testExample1Cn() {
        // Example 1: nums = [1, 2, 1]
        int[] nums = {1, 2, 1};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testExample2Cn() {
        // Example 2: nums = [1, 3, 2, 1]
        int[] nums = {1, 3, 2, 1};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElementArray() {
        // Test case with a single element array
        int[] nums = {5};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {5, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithIdenticalElements() {
        // Test case where all elements in the array are the same
        int[] nums = {7, 7, 7};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {7, 7, 7, 7, 7, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithDistinctElements() {
        // Test case where all elements are distinct
        int[] nums = {1, 2, 3, 4};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1, 2, 3, 4, 1, 2, 3, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithMaxLength() {
        // Test case with maximum length (n = 1000) and a sequence of increasing numbers
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i + 1; // Fill with values from 1 to 1000
        }
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        
        // Generate the expected result
        int[] expected = new int[2000];
        System.arraycopy(nums, 0, expected, 0, 1000);
        System.arraycopy(nums, 0, expected, 1000, 1000);
        
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithMinimumLength() {
        // Test case with minimum length (n = 1)
        int[] nums = {1};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithLargeValues() {
        // Test case with large values in the array
        int[] nums = {1000, 999, 998};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1000, 999, 998, 1000, 999, 998};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testArrayWithAlternatingValues() {
        // Test case with alternating values
        int[] nums = {1, 1000, 1, 1000};
        ConcatenateAnArray solution = new ConcatenateAnArray();
        int[] result = solution.getConcatenation(nums);
        int[] expected = {1, 1000, 1, 1000, 1, 1000, 1, 1000};
        assertArrayEquals(expected, result);
    }
}
