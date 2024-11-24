package com.leetcode.search;

import java.util.Arrays;

public class SearchExecutor {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arrayOfElements = new int[]{19, 25, -8, 22, 56, 78, 14};
        int target = 56;
        int indexOfTargetElement = linearSearch.findIndexInIntegerArray(arrayOfElements, target);

        System.out.println("The element: " + target + " is found at index: " + indexOfTargetElement);

        String str = "Faizal Nadir Vasaya";
        char targetToSearch = 'p';
        boolean characterExists = linearSearch.characterExistsInAString(str, targetToSearch);

        if (characterExists) {
            System.out.println("The character: " + targetToSearch + " is found in string: " + str);
        } else {
            System.out.println("The character: " + targetToSearch + " is not found in string: " + str);
        }

        int targetInRange = 14;
        int startIndex = 6;
        int endIndex = 6;

        System.out.println("The element: " + target + " is found at index: " + linearSearch.findIndexInIntegerArrayInARange(arrayOfElements, targetInRange, startIndex, endIndex) + " between " + startIndex + " and " + endIndex);

        System.out.println("The minimum element is: " + linearSearch.findMinimum(arrayOfElements));

        int[][] arrayOfElements2D = new int[][]{{19, 25, -8, 22, 56, 78, 14}, {5, 66}};
        int target2D = 5;
        int[] indexOfTargetElement2D = linearSearch.findIndexIn2DIntegerArray(arrayOfElements2D, target2D);

        System.out.println("The element: " + target + " is found at index: " + Arrays.toString(indexOfTargetElement2D));

        System.out.println("The maximum element is: " + linearSearch.findMaximumIn2DIntegerArray(arrayOfElements2D));

        NumberWithEvenDigits numberWithEvenDigits = new NumberWithEvenDigits();
        int number = Integer.MAX_VALUE;

        int result = numberWithEvenDigits.findNumberWithEventDigits(number);

        System.out.println("The number: " + number + " has: " + result + " digits.");

        int[] arrayOfElementsForEventDigits = new int[]{19, 25, -8, 22, 56, 78, 14585254, 45856};
        int numberOfNumbersWithEventDigits = numberWithEvenDigits.findNumberWithEvenDigitsInAnArray(arrayOfElementsForEventDigits);

        System.out.println("There are : " + numberOfNumbersWithEventDigits + " elements with even digits");

    }
}
