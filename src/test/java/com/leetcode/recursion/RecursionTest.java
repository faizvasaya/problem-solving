package com.leetcode.recursion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTest {

    @Test
    public void testElementFoundInMiddleAsc() {
        // Normal case: element is in the middle of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 6;
        int expected = 2; // Target is at index 2
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testElementFoundAtStartAsc() {
        // Normal case: element is at the start of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 2;
        int expected = 0; // Target is at index 0
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testElementFoundAtEndAsc() {
        // Normal case: element is at the end of the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 10;
        int expected = 4; // Target is at index 4
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testElementNotFoundAsc() {
        // Case where element is not present in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 5;
        int expected = -1; // Element not found
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testEmptyArrayAsc() {
        // Case with empty array
        int[] array = {};
        int target = 10;
        int expected = -1; // Element not found
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testArrayWithOneElementElementPresentAsc() {
        // Case with a single element, element is present
        int[] array = {10};
        int target = 10;
        int expected = 0; // Target is at index 0
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testArrayWithOneElementElementNotPresentAsc() {
        // Case with a single element, element is not present
        int[] array = {10};
        int target = 5;
        int expected = -1; // Element not found
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testLargeArrayAsc() {
        // Case with large array size
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1; // Ascending order
        }
        int target = 500; // Mid value in ascending array
        int expected = 499; // Target is at index 4993
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testIntegerOverflowConditionAsc() {
        // Case where the sum of start and end may cause overflow in mid calculation
        int[] array = {Integer.MIN_VALUE, -999, -500, -200, -100}; // Ascending order
        int target = Integer.MIN_VALUE;
        int expected = 0; // Target is at index 0
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));

        // Another test case with very large values for start and end
        int[] largeArray = {Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 3};
        target = Integer.MIN_VALUE + 2;
        int expected2 = 1; // Target is at index 1
        int n2 = largeArray.length;
        assertEquals(expected2, solution.searchUsingRecursion(largeArray, 0, n2 - 1, target));
    }

    @Test
    public void testNegativeNumbersAsc() {
        // Case with negative numbers in ascending order
        int[] array = {-5, -4, -3, -2, -1};
        int target = -3;
        int expected = 2; // Target is at index 2
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testLargeTargetAsc() {
        // Case where the target is larger than any element in the array (target is too large)
        int[] array = {2, 4, 6, 8, 10};
        int target = 20; // Target is larger than any element
        int expected = -1; // Element not found
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testSmallTargetAsc() {
        // Case where the target is smaller than any element in the array
        int[] array = {2, 4, 6, 8, 10};
        int target = 0; // Target is smaller than any element
        int expected = -1; // Element not found
        int n = array.length;
        BinarySearch solution = new BinarySearch();
        assertEquals(expected, solution.searchUsingRecursion(array, 0, n - 1, target));
    }

    @Test
    public void testRegularCase() {
        int[] input = {1, 2, 3, 4, 5};
        String expectedOutput = "[48]\n[20, 28]\n[8, 12, 16]\n[3, 5, 7, 9]\n[1, 2, 3, 4, 5]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {5};
        String expectedOutput = "[5]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testTwoElements() {
        int[] input = {3, 7};
        String expectedOutput = "[10]\n[3, 7]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testAllSameElements() {
        int[] input = {2, 2, 2, 2, 2};
        String expectedOutput = "[32]\n[16, 16]\n[8, 8, 8]\n[4, 4, 4, 4]\n[2, 2, 2, 2, 2]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testNegativeNumbers() {
        int[] input = {-1, -2, -3, -4, -5};
        String expectedOutput = "[-48]\n[-20, -28]\n[-8, -12, -16]\n[-3, -5, -7, -9]\n[-1, -2, -3, -4, -5]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        String expectedOutput = "";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    @Test
    public void testLargeNumbers() {
        int[] input = {1000, 2000, 3000, 4000, 5000};
        String expectedOutput = "[48000]\n[20000, 28000]\n[8000, 12000, 16000]\n[3000, 5000, 7000, 9000]\n[1000, 2000, 3000, 4000, 5000]\n";

        assertEquals(expectedOutput, getOutputFromPrintMethod(input));
    }

    private String getOutputFromPrintMethod(int[] input) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        SumTriangleFromArray sumTriangle = new SumTriangleFromArray();
        sumTriangle.print(input);

        System.setOut(System.out); // Reset output stream
        return outputStream.toString();
    }

    FindFirstUpperCaseLetter finder = new FindFirstUpperCaseLetter();

    @Test
    public void testFirstUppercaseIterative() {
        assertEquals('K', finder.find("geeksforgeeKs"));
        assertEquals('S', finder.find("geekS"));
        assertEquals('A', finder.find("Abc"));
        assertEquals('N', finder.find("myNameIsJohn"));
        assertEquals(0, finder.find("lowercase")); // No uppercase letter
        assertEquals(0, finder.find("")); // Empty string
    }

    @Test
    public void testFirstUppercaseRecursive() {
        assertEquals('K', finder.findUsingRecursion("geeksforgeeKs".toCharArray(), 0));
        assertEquals('S', finder.findUsingRecursion("geekS".toCharArray(), 0));
        assertEquals('A', finder.findUsingRecursion("Abc".toCharArray(), 0));
        assertEquals('N', finder.findUsingRecursion("myNameIsJohn".toCharArray(), 0));
        assertEquals(0, finder.findUsingRecursion("lowercase".toCharArray(), 0)); // No uppercase letter
        assertEquals(0, finder.findUsingRecursion("".toCharArray(), 0)); // Empty string
    }
}
