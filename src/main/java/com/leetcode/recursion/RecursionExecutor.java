package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionExecutor {

    public static void main(String[] args) {
        PrintNumbers numbers = new PrintNumbers();
        numbers.print(1);

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibo(4));

        BinarySearch ob = new BinarySearch();
        int[] array = {Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 2, Integer.MIN_VALUE + 3};
        int n = array.length;
        int target = Integer.MIN_VALUE + 2;
        int result = ob.searchUsingRecursion(array, 0, n - 1, target);
        System.out.println(result);

        SumTriangleFromArray stfa = new SumTriangleFromArray();

        stfa.print(new int[]{1, 2, 3, 4, 5});

        FindMinimumMaximum findMinimum = new FindMinimumMaximum();
        System.out.println(findMinimum.findMinimum(new int[]{1, 4, 45, 6, 10, -8}, 0, Integer.MAX_VALUE));

        System.out.println(findMinimum.findMax(new int[]{1, 4, 45, 6, 10, -8}, 0, Integer.MIN_VALUE));

        System.out.println(findMinimum.findMinUsingDivideAndConquer(new int[]{1, 4, 45, 6, 10, -8}, 0, 5));

        System.out.println(findMinimum.findMaxUsingDivideAndConquer(new int[]{1, 4, 45, 6, 10, -8}, 0, 5));

        FindFirstUpperCaseLetter caseLetter = new FindFirstUpperCaseLetter();
        System.out.println(caseLetter.find("geekS"));

        System.out.println(caseLetter.findUsingRecursion("geekS".toCharArray(), 0));

        PrintNto1 printNto1 = new PrintNto1();
        System.out.println("printNto1");
        printNto1.print(5);

        Factorial factorial = new Factorial();
        System.out.println("Factorial");
        System.out.println(factorial.calculate(10));

        SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
        System.out.println("SumOfNNumbers");
        System.out.println(sumOfNNumbers.sum(5));

        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println("SumOfDigits");
        System.out.println(sumOfDigits.sum(12345));

        MultiplicationOfDigits multiplicationOfDigits = new MultiplicationOfDigits();
        System.out.println("MultiplicationOfDigits");
        System.out.println(multiplicationOfDigits.calculate(105));

        ReverseANumber reverseANumber = new ReverseANumber();
        System.out.println("ReverseANumber");
        System.out.println(reverseANumber.reverseInPlace(12345));

        CountNumberOfZeros countNumberOfZeros = new CountNumberOfZeros();
        System.out.println("CountNumberOfZeros");
        System.out.println(countNumberOfZeros.count(010010));
        System.out.println(countNumberOfZeros.countRecursive(010010));

        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        System.out.println("NumberOfStepsToReduceANumberToZero");
        System.out.println(numberOfStepsToReduceANumberToZero.countSteps(123));
        System.out.println(numberOfStepsToReduceANumberToZero.countStepsRecursive(123));

        FindWhetherArrayIsSorted findWhetherArrayIsSorted = new FindWhetherArrayIsSorted();
        System.out.println("FindWhetherArrayIsSorted");
        System.out.println(findWhetherArrayIsSorted.isArraySorted(new int[]{1, 8, 12, 15}));
        System.out.println(findWhetherArrayIsSorted.isArraySortedRecursive(new int[]{1, 8, 12, 15}, 0));

        FindElementInUnsortedArray findElementInUnsortedArray = new FindElementInUnsortedArray();
        System.out.println("FindElementInUnsortedArray");
        System.out.println(findElementInUnsortedArray.find(new int[]{1, 8, 12, 15}, 12));
        System.out.println(findElementInUnsortedArray.findUsingRecursion(new int[]{1, 8, 12, 15}, 1, 0));

        System.out.println(findElementInUnsortedArray.findPositionUsingRecursion(new int[]{1, 8, 12, 15}, 50, 0));

        System.out.println(findElementInUnsortedArray.findAllPositionUsingRecursion(new int[]{1, 8, 12, 15, 15}, 15, 0, new ArrayList<>()));

        System.out.println(findElementInUnsortedArray.findAllPositionUsingRecursionWithOutArrayListInArgs(new int[]{1, 8, 12, 15, 15}, 15, 0));

        BinarySearchInRotatedArray binarySearchInRotatedArray = new BinarySearchInRotatedArray();
        System.out.println("BinarySearchInRotatedArray");
        System.out.println(binarySearchInRotatedArray.findPosition(new int[]{5, 6, 7, 8, 9, 1, 2, 3}, 0, 7, 5));

        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("BubbleSort");
        bubbleSort.sortUsingRecursion(arr, arr.length, 0);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        SelectionSort selectionSort = new SelectionSort();
        int[] arr2 = {5, 3, 8, 4, 2};
        System.out.println("SelectionSort");
        selectionSort.selectSortUsingRecursion(arr2, 0, 1, 0);

        // Print sorted array
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        MergeSort mergeSort = new MergeSort();
        int[] arr3 = {5, 3, 8, 4, 2, 7, 6, 1};
        System.out.println("MergeSort");
        System.err.println(Arrays.toString(mergeSort.sortUsingRecursion(arr3)));
    }
}
