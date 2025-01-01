package com.leetcode.sorting;

import java.util.Arrays;
import java.util.List;

public class SortingExecutor {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] nums = new int[]{5, 4, 1, 2, 3};

        bubbleSort.sortAscending(nums);

        System.out.println(Arrays.toString(nums));

        SelectionSort selectionSort = new SelectionSort();

        int[] numSselectionSort = new int[]{5, 4, 1, 2, 3};

        selectionSort.sortAscending(numSselectionSort);

        System.out.println(Arrays.toString(numSselectionSort));

        InsertionSort insertionSort = new InsertionSort();

        int[] numSInsertionSort = new int[]{5, 4, 1, 2, 3};

        insertionSort.sortAscending(numSInsertionSort);

        System.out.println(Arrays.toString(numSInsertionSort));

        CyclicSort cyclicSort = new CyclicSort();

        int[] numSCyclicSort = new int[]{5, 4, 1, 2, 3};

        cyclicSort.sortAscending(numSCyclicSort);

        System.out.println(Arrays.toString(numSCyclicSort));

        MissingNumberFromArrayOf0ToN missingNumberFromArrayOf0ToN = new MissingNumberFromArrayOf0ToN();

        int[] numSMissingNumberFromArrayOf0ToN = new int[]{0, 1};

        int result = missingNumberFromArrayOf0ToN.findUsingCyclicSort(numSMissingNumberFromArrayOf0ToN);

        System.out.println(result);

        int result2 = missingNumberFromArrayOf0ToN.findUsingSum(numSMissingNumberFromArrayOf0ToN);

        System.out.println(result2);

        FindAllDisappearedNumbers findAllDisappearedNumbers = new FindAllDisappearedNumbers();

        int[] numSFindAllDisappearedNumbers = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result3 = findAllDisappearedNumbers.findUsingCyclicSort(numSFindAllDisappearedNumbers);

        System.out.println(result3);

        int[] numSFindAllDisappearedNumbersNumberNegation = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result4 = findAllDisappearedNumbers.findUsingNumberNegation(numSFindAllDisappearedNumbersNumberNegation);

        System.out.println(result4);

        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();

        int[] numSFindDuplicateNumber = new int[]{3, 3, 3, 3, 3};

        int result5 = findDuplicateNumber.findUsingCyclicSort(numSFindDuplicateNumber);

        System.out.println(result5);

        FindDuplicateNumbers findDuplicateNumbers = new FindDuplicateNumbers();

        int[] numSFindDuplicateNumbers = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result6 = findDuplicateNumbers.findUsingCyclicSort(numSFindDuplicateNumbers);

        System.out.println(result6);

        List<Integer> result7 = findDuplicateNumbers.findUsingNumberNegation(numSFindDuplicateNumbers);

        System.out.println(result7);
    }
}
