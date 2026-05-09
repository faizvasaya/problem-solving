package com.leetcode.arrayproblems;

import java.util.Arrays;
import java.util.List;

public class ArrayProblems {

    public static void main(String[] args) {
        System.out.println("Array Problems");

        int[] arr = {10, 20, 1, 2, 99, 205, 23};
        FindLargestElementInArray findLargestElementInArray = new FindLargestElementInArray();
        System.out.println("Largest element is: " + findLargestElementInArray.findLargestElement(arr));

        int[] arr2 = {10, 20, 1, 2, 99, 205, 23};
        System.out.println("Largest element is: " + findLargestElementInArray.findLargestInN(arr2));

        int[] arr3 = {12, 35, 1, 10, 34, 1};
        int[] arr4 = {10, 5, 10};
        int[] arr5 = {10, 10, 10};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        System.out.println("Second Largest Element is: " + secondLargestElement.find(arr3));
        System.out.println("Second Largest Element is: " + secondLargestElement.find(arr4));
        System.out.println("Second Largest Element is: " + secondLargestElement.find(arr5));

        int[] arr6 = {12, 35, 1, 10, 34, 1};
        int[] arr7 = {10, 5, 10};
        int[] arr8 = {10, 10, 10};
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingN(arr6));
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingN(arr7));
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingN(arr8));

        int[] arr9 = {12, 35, 1, 10, 34, 1};
        int[] arr10 = {10, 5, 10};
        int[] arr11 = {10, 10, 10};
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingNSinglePass(arr9));
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingNSinglePass(arr10));
        System.out.println("Second Largest Element is: " + secondLargestElement.findUsingNSinglePass(arr11));

        int[] arr12 = {12, 35, 1, 10, 34, 1};
        int[] arr13 = {10, 5, 10};
        int[] arr14 = {10, 10, 10};
        SecondSmallest secondSmallest = new SecondSmallest();
        System.out.println("Second Smallest Element is: " + secondSmallest.find(arr12));
        System.out.println("Second Smallest Element is: " + secondSmallest.find(arr13));
        System.out.println("Second Smallest Element is: " + secondSmallest.find(arr14));

        int[] arr15 = {1, 2, 1, 3, 4};
        int[] arr16 = {1, 2, 2, 3, 3, 4};
        int[] arr17 = {10, 10, 10};
        CheckIfArrayIsSorted checkIfArrayIsSorted = new CheckIfArrayIsSorted();
        System.out.println("Check If Array Is Sorted: " + checkIfArrayIsSorted.isSorted(arr15));
        System.out.println("Check If Array Is Sorted: " + checkIfArrayIsSorted.isSorted(arr16));
        System.out.println("Check If Array Is Sorted: " + checkIfArrayIsSorted.isSorted(arr17));

        int[] arr18 = {1, 1, 2};
        int[] arr19 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr20 = {10, 10, 10};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.remove(arr18));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.remove(arr19));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.remove(arr20));

        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithoutSpace(arr18));
        System.out.println(Arrays.toString(arr18));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithoutSpace(arr19));
        System.out.println(Arrays.toString(arr19));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithoutSpace(arr20));
        System.out.println(Arrays.toString(arr20));

        int[] arr21 = {1, 1, 2};
        int[] arr22 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr23 = {10, 10, 10};

        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithSet(arr21));
        System.out.println(Arrays.toString(arr21));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithSet(arr22));
        System.out.println(Arrays.toString(arr22));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeWithSet(arr23));
        System.out.println(Arrays.toString(arr23));

        int[] arr24 = {1, 1, 2};
        int[] arr25 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arr26 = {10, 10, 10};

        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeUsingTwoPointer(arr24));
        System.out.println(Arrays.toString(arr24));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeUsingTwoPointer(arr25));
        System.out.println(Arrays.toString(arr25));
        System.out.println("Remove Duplicates From Sorted Array: " + removeDuplicatesFromSortedArray.removeUsingTwoPointer(arr26));
        System.out.println(Arrays.toString(arr26));

        int[] arr27 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr28 = {-1, -100, 3, 99};

        RotateAnArrayRight rotateAnArrayRight = new RotateAnArrayRight();
        rotateAnArrayRight.rotate(arr27, 3);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr27));

        rotateAnArrayRight.rotate(arr28, 2);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr28));

        int[] arr35 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr36 = {-1, -100, 3, 99};

        rotateAnArrayRight.rotateSinglePass(arr35, 3);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr27));

        rotateAnArrayRight.rotateSinglePass(arr36, 2);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr28));

        int[] arr40 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr41 = {-1, -100, 3, 99};

        rotateAnArrayRight.rotateWithoutSpace(arr40, 3);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr40));

        rotateAnArrayRight.rotateWithoutSpace(arr41, 2);
        System.out.println("Rotate An Array Right: " + Arrays.toString(arr41));

        int[] arr29 = {1, 2, 3, 4, 5};
        int[] arr30 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr31 = {7, 3, 9, 1};

        RotateAnArrayLeft rotateAnArrayLeft = new RotateAnArrayLeft();
        rotateAnArrayLeft.rotate(arr29, 2);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr29));

        rotateAnArrayLeft.rotate(arr30, 3);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr30));

        rotateAnArrayLeft.rotate(arr31, 9);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr31));

        int[] arr32 = {1, 2, 3, 4, 5};
        int[] arr33 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr34 = {7, 3, 9, 1};

        rotateAnArrayLeft.rotateSinglePass(arr32, 2);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr32));

        rotateAnArrayLeft.rotateSinglePass(arr33, 3);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr30));

        rotateAnArrayLeft.rotateSinglePass(arr34, 9);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr31));

        int[] arr37 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr38 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] arr39 = {7, 3, 9, 1};

        rotateAnArrayLeft.rotateUsingReverse(arr37, 3);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr37));

        rotateAnArrayLeft.rotateUsingReverse(arr38, 3);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr38));

        rotateAnArrayLeft.rotateUsingReverse(arr39, 9);
        System.out.println("Rotate An Array Left: " + Arrays.toString(arr39));

        PushNonZeroNumbersTowardFront nonZeroNumbersTowardFront = new PushNonZeroNumbersTowardFront();

        int[] arr42 = {0, 1, 0, 3, 12};
        int[] arr43 = {0};

        nonZeroNumbersTowardFront.push(arr42);
        System.out.println("Push Non Zero Numbers Toward Front: " + Arrays.toString(arr42));

        nonZeroNumbersTowardFront.push(arr43);
        System.out.println("Push Non Zero Numbers Toward Front: " + Arrays.toString(arr43));

        int[] arr44 = {0, 1, 0, 3, 12};
        int[] arr45 = {0};

        nonZeroNumbersTowardFront.pushWithoutSpace(arr44);
        System.out.println("Push Non Zero Numbers Toward Front: " + Arrays.toString(arr44));

        nonZeroNumbersTowardFront.pushWithoutSpace(arr45);
        System.out.println("Push Non Zero Numbers Toward Front: " + Arrays.toString(arr45));

        int[] arr46 = {0, 1, 0, 3, 12};
        int[] arr47 = {0};
        int[] arr48 = {2, 1};

        nonZeroNumbersTowardFront.pushWithoutForLoop(arr46);
        System.out.println("pushWithoutForLoop Push Non Zero Numbers Toward Front: " + Arrays.toString(arr46));

        nonZeroNumbersTowardFront.pushWithoutForLoop(arr47);
        System.out.println(" pushWithoutForLoop Push Non Zero Numbers Toward Front: " + Arrays.toString(arr47));

        nonZeroNumbersTowardFront.pushWithoutForLoop(arr48);
        System.out.println(" pushWithoutForLoop Push Non Zero Numbers Toward Front: " + Arrays.toString(arr48));

        LinearSearch linearSearch = new LinearSearch();

        int[] arr49 = {0, 1, 0, 3, 12};
        int[] arr50 = {0, -1, 25, 6};

        System.out.println("Linear Search: " + linearSearch.search(arr49, 0));

        System.out.println("Linear Search: " + linearSearch.search(arr50, 60));

        int[] arr51 = {1, 2, 3, 4, 5, 5};
        int[] arr52 = {1, 5, 6, 10};

        FindUnionOfTwoSortedArrays findUnionOfTwoSortedArrays = new FindUnionOfTwoSortedArrays();

        System.out.println("Find Union Of Two Sorted Arrays: " + Arrays.toString(findUnionOfTwoSortedArrays.find(arr51, arr52)));

        System.out.println("Find Union Of Two Sorted Arrays Using Set: " + Arrays.toString(findUnionOfTwoSortedArrays.findUsingSet(arr51, arr52)));

        System.out.println("Find Union Of Two Sorted Arrays Using findUsingTwoPointer: " + Arrays.toString(findUnionOfTwoSortedArrays.findUsingTwoPointer(arr51, arr52)));

        int[] arr53 = {1, 2, 10};
        int[] arr54 = {1, 2, 5, 25, 50, 60, 80};

        IntersectionOfTwoSortedArrays intersectionOfTwoSortedArrays = new IntersectionOfTwoSortedArrays();

        System.out.println("Find Intersection Of Two Sorted Arrays: " + Arrays.toString(intersectionOfTwoSortedArrays.find(arr53, arr54)));

        System.out.println("findUsingTwoPointer Find Intersection Of Two Sorted Arrays: " + Arrays.toString(intersectionOfTwoSortedArrays.findUsingTwoPointer(arr53, arr54)));

        int[] arr55 = {3, 0, 1};
        int[] arr56 = {0, 1};
        int[] arr57 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        MissingNumber missingNumber = new MissingNumber();

        System.out.println("Find Missing Number: " + missingNumber.find(arr55));
        System.out.println("Find Missing Number: " + missingNumber.find(arr56));
        System.out.println("Find Missing Number: " + missingNumber.find(arr57));

        System.out.println("findUsingDoubleLoop Find Missing Number: " + missingNumber.findUsingDoubleLoop(arr55));
        System.out.println("findUsingDoubleLoop Find Missing Number: " + missingNumber.findUsingDoubleLoop(arr56));
        System.out.println("findUsingDoubleLoop Find Missing Number: " + missingNumber.findUsingDoubleLoop(arr57));

        System.out.println("findUsingHashing Find Missing Number: " + missingNumber.findUsingHashing(arr55));
        System.out.println("findUsingHashing Find Missing Number: " + missingNumber.findUsingHashing(arr56));
        System.out.println("findUsingHashing Find Missing Number: " + missingNumber.findUsingHashing(arr57));

        System.out.println("findUsingXOR Find Missing Number: " + missingNumber.findUsingXOR(arr55));
        System.out.println("findUsingXOR Find Missing Number: " + missingNumber.findUsingXOR(arr56));
        System.out.println("findUsingXOR Find Missing Number: " + missingNumber.findUsingXOR(arr57));

        MaximumConsecutiveOnes consecutiveOnes = new MaximumConsecutiveOnes();

        int[] arr59 = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int[] arr60 = {1, 0, 1, 1, 0, 1};

        System.out.println("Maximum Consecutive Ones: " + consecutiveOnes.find(arr59));
        System.out.println("Maximum Consecutive Ones: " + consecutiveOnes.find(arr60));

        System.out.println("findUsingTwoPointer Maximum Consecutive Ones: " + consecutiveOnes.findUsingTwoPointer(arr59));
        System.out.println("findUsingTwoPointer Maximum Consecutive Ones: " + consecutiveOnes.findUsingTwoPointer(arr60));

        FindSingleNumber findSingleNumber = new FindSingleNumber();

        int[] arr61 = {2, 2, 1};
        int[] arr62 = {4, 1, 2, 1, 2};
        int[] arr63 = {1};

        System.out.println("Find Single Number: " + findSingleNumber.find(arr61));
        System.out.println("Find Single Number: " + findSingleNumber.find(arr62));
        System.out.println("Find Single Number: " + findSingleNumber.find(arr63));

        System.out.println("findUsingXOR Find Single Number: " + findSingleNumber.findUsingXOR(arr61));
        System.out.println("findUsingXOR Find Single Number: " + findSingleNumber.findUsingXOR(arr62));
        System.out.println("findUsingXOR Find Single Number: " + findSingleNumber.findUsingXOR(arr63));

        System.out.println("findUsingHashMap Find Single Number: " + findSingleNumber.findUsingHashMap(arr61));
        System.out.println("findUsingHashMap Find Single Number: " + findSingleNumber.findUsingHashMap(arr62));
        System.out.println("findUsingHashMap Find Single Number: " + findSingleNumber.findUsingHashMap(arr63));

        System.out.println("findUsingSorting Find Single Number: " + findSingleNumber.findUsingSorting(arr61));
        System.out.println("findUsingSorting Find Single Number: " + findSingleNumber.findUsingSorting(arr62));
        System.out.println("findUsingSorting Find Single Number: " + findSingleNumber.findUsingSorting(arr63));

        LongestSubarrayWithSumKPositives longestSubarrayWithSumKPositives = new LongestSubarrayWithSumKPositives();

        int[] arr64 = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int[] arr65 = {1, 2, 1, 1, 1};
        int[] arr66 = {2, 3, 1, 1, 1};
        int[] arr67 = {1, 100, 2, 3};
        int[] arr68 = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int[] arr69 = {2, 0, 0, 0, 3};

        System.out.println("Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.find(arr64, 1));
        System.out.println("Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.find(arr65, 3));
        System.out.println("Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.find(arr66, 6));
        System.out.println("Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.find(arr67, 5));

        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr64, 1));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr65, 3));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr66, 6));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr67, 5));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr68, 10));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingHashing(arr69, 3));

        System.out.println("findUsingTwoPointer Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr64, 1));
        System.out.println("findUsingTwoPointer Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr65, 3));
        System.out.println("findUsingTwoPointer Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr66, 6));
        System.out.println("findUsingTwoPointer Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr67, 5));
        System.out.println("findUsingTwoPointer Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr68, 10));
        System.out.println("findUsingHashing Longest Subarray With Sum K Positives: " + longestSubarrayWithSumKPositives.findUsingTwoPointer(arr69, 3));

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println("Maximum Subarray Using BruteForce: " + maximumSubarray.findUsingBruteForce(nums));

        System.out.println("Maximum Subarray Using findUsingKanadesAlgorithm: " + maximumSubarray.findUsingKanadesAlgorithm(nums));

        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};
        TwoSumProblem twoSumProblem = new TwoSumProblem();
        System.out.println("TwoSumProblem Using BruteForce: " + Arrays.toString(twoSumProblem.findUsingBruteForce(nums1, 9)));
        System.out.println("TwoSumProblem Using BruteForce: " + Arrays.toString(twoSumProblem.findUsingBruteForce(nums2, 6)));
        System.out.println("TwoSumProblem Using BruteForce: " + Arrays.toString(twoSumProblem.findUsingBruteForce(nums3, 6)));

        System.out.println("TwoSumProblem Using findUsingHashing: " + Arrays.toString(twoSumProblem.findUsingHashing(nums1, 9)));
        System.out.println("TwoSumProblem Using findUsingHashing: " + Arrays.toString(twoSumProblem.findUsingHashing(nums2, 6)));
        System.out.println("TwoSumProblem Using findUsingHashing: " + Arrays.toString(twoSumProblem.findUsingHashing(nums3, 6)));

        System.out.println("TwoSumProblem Using findUsingHashingSinglePass: " + Arrays.toString(twoSumProblem.findUsingHashingSinglePass(nums1, 9)));
        System.out.println("TwoSumProblem Using findUsingHashingSinglePass: " + Arrays.toString(twoSumProblem.findUsingHashingSinglePass(nums2, 6)));
        System.out.println("TwoSumProblem Using findUsingHashingSinglePass: " + Arrays.toString(twoSumProblem.findUsingHashingSinglePass(nums3, 6)));

        int[] nums4 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        int[] nums5 = {2, 0, 1};
        SortColors sortColors = new SortColors();

        sortColors.sortUsingCounterMethod(nums4);
        sortColors.sortUsingCounterMethod(nums5);

        sortColors.sortUsingDutchNationalFlagAlgorithm(nums4);
        sortColors.sortUsingDutchNationalFlagAlgorithm(nums5);

        int[] nums6 = {3, 2, 3};
        int[] nums7 = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();

        System.out.println("Majority Element Using Hashing: " + majorityElement.findUsingHashing(nums6));
        System.out.println("Majority Element Using Hashing: " + majorityElement.findUsingHashing(nums7));

        System.out.println("Majority Element UsingBruteForce: " + majorityElement.findUsingBruteForce(nums6));
        System.out.println("Majority Element UsingBruteForce: " + majorityElement.findUsingBruteForce(nums7));

        System.out.println("Majority Element UsingMooresVotingAlgorithm: " + majorityElement.findUsingMooresVotingAlgorithm(nums6));
        System.out.println("Majority Element UsingMooresVotingAlgorithm: " + majorityElement.findUsingMooresVotingAlgorithm(nums7));

        int[] nums8 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] nums9 = {-4, -2, -3, -1};

        MaximumSubarray maximumSubarray2 = new MaximumSubarray();
        System.out.println("MaximumSubarray Using Kanades Algorithm: " + maximumSubarray2.findUsingKanadesAlgorithm2(nums8));
        System.out.println("MaximumSubarray Using Kanades Algorithm: " + maximumSubarray2.findUsingKanadesAlgorithm2(nums9));

        System.out.println("MaximumSubarray Using Kanades Algorithm Print array: " + maximumSubarray2.findUsingKanadesAlgorithm2PrintRange(nums8));
        System.out.println("MaximumSubarray Using Kanades Algorithm Print array: " + maximumSubarray2.findUsingKanadesAlgorithm2PrintRange(nums9));

        int[] nums10 = {7, 1, 5, 3, 6, 4};
        int[] nums11 = {7, 6, 4, 3, 1};

        StockBuySell stockBuySell = new StockBuySell();
        System.out.println("StockBuySell: " + stockBuySell.maxProfit(nums10));
        System.out.println("StockBuySell: " + stockBuySell.maxProfit(nums11));

        System.out.println("StockBuySell Single Pass: " + stockBuySell.maxProfitUsingSinglePass(nums10));
        System.out.println("StockBuySell Single Pass: " + stockBuySell.maxProfitUsingSinglePass(nums11));

        int[] nums12 = {3, 1, -2, -5, 2, -4};
        int[] nums13 = {1, -1};

        int[] nums14 = {1, 2, -1, -2, 5, 100, 15, 18};
        int[] nums15 = {1, 2, -1, -2, -5};
        int[] nums16 = {1, 2, -1, -2, 5, -6};

        RearrangeElementsBySign rearrangeElementsBySign = new RearrangeElementsBySign();
        System.out.println("RearrangeElementsBySign: " + Arrays.toString(rearrangeElementsBySign.rearrangeArray(nums12)));
        System.out.println("RearrangeElementsBySign: " + Arrays.toString(rearrangeElementsBySign.rearrangeArray(nums13)));

        System.out.println("RearrangeElementsBySign Two Loops: " + Arrays.toString(rearrangeElementsBySign.rearrangeArrayUsingTwoLoops(nums12)));
        System.out.println("RearrangeElementsBySign Two Loops: " + Arrays.toString(rearrangeElementsBySign.rearrangeArrayUsingTwoLoops(nums13)));

        System.out.println("rearrangeArrayExtraPositivesOrNegatives: " + Arrays.toString(rearrangeElementsBySign.rearrangeArrayExtraPositivesOrNegatives(nums14)));
        System.out.println("rearrangeArrayExtraPositivesOrNegatives: " + Arrays.toString(rearrangeElementsBySign.rearrangeArrayExtraPositivesOrNegatives(nums15)));
        System.out.println("rearrangeArrayExtraPositivesOrNegatives: " + Arrays.toString(rearrangeElementsBySign.rearrangeArrayExtraPositivesOrNegatives(nums16)));

        AllPermutations allPermutations = new AllPermutations();
        int[] numbers = new int[]{3, 1, 2};
        System.out.println(allPermutations.permute(numbers));

        List<Integer> A = Arrays.asList(new Integer[]{5, 4, 3, 2, 1});
        List<Integer> ans = allPermutations.generateNextPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

        LeadersInArray lia = new LeadersInArray();
        int[] numbers1 = {4, 7, 1, 0};
        int[] numbers2 = {10, 22, 12, 3, 0, 6};

        System.out.println("The leaders are: " + lia.findUsingBruteForce(numbers1));
        System.out.println("The leaders are: " + lia.findUsingBruteForce(numbers2));

        System.out.println("The leaders are: " + lia.findUsingOptimalApproach(numbers1));
        System.out.println("The leaders are: " + lia.findUsingOptimalApproach(numbers2));

        LongestConsecutiveSequence ls = new LongestConsecutiveSequence();
        int[] numbers3 = {100, 4, 200, 1, 3, 2};
        int[] numbers4 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] numbers5 = {1, 0, 1, 2};
        int[] numbers6 = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println("The longest consecutive subsequence is: " + ls.findUsingBruteForce(numbers3));
        System.out.println("The longest consecutive subsequence is: " + ls.findUsingBruteForce(numbers4));
        System.out.println("The longest consecutive subsequence is: " + ls.findUsingBruteForce(numbers5));
        System.out.println("The longest consecutive subsequence is: " + ls.findUsingBruteForce(numbers6));

        System.out.println("The longest consecutive subsequence findUsingSorting is: " + ls.findUsingSorting(numbers3));
        System.out.println("The longest consecutive subsequence findUsingSorting is: " + ls.findUsingSorting(numbers4));
        System.out.println("The longest consecutive subsequence findUsingSorting is: " + ls.findUsingSorting(numbers5));
        System.out.println("The longest consecutive subsequence findUsingSorting is: " + ls.findUsingSorting(numbers6));

        System.out.println("The longest consecutive subsequence findUsingSet is: " + ls.findUsingSet(numbers3));
        System.out.println("The longest consecutive subsequence findUsingSet is: " + ls.findUsingSet(numbers4));
        System.out.println("The longest consecutive subsequence findUsingSet is: " + ls.findUsingSet(numbers5));
        System.out.println("The longest consecutive subsequence findUsingSet is: " + ls.findUsingSet(numbers6));

        SetMatrixZeros smz = new SetMatrixZeros();
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix2 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        int[][] updatedMatrix = smz.performUsingBruteForce(matrix);
        int[][] updatedMatrix2 = smz.performUsingBruteForce(matrix2);
        for (int i = 0; i < updatedMatrix.length; i++) {
            for (int j = 0; j < updatedMatrix[i].length; j++) {
                System.out.print(" " + updatedMatrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < updatedMatrix2.length; i++) {
            for (int j = 0; j < updatedMatrix2[i].length; j++) {
                System.out.print(" " + updatedMatrix2[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========");

        int[][] matrix3 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix4 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        smz.performUsingBruteForceInPlace(matrix3);
        smz.performUsingBruteForceInPlace(matrix4);
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(" " + matrix3[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                System.out.print(" " + matrix4[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========");

        int[][] matrix5 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix6 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        smz.performUsingBruteForceInPlaceMinusOneLogic(matrix5);
        smz.performUsingBruteForceInPlaceMinusOneLogic(matrix6);
        for (int i = 0; i < matrix5.length; i++) {
            for (int j = 0; j < matrix5[i].length; j++) {
                System.out.print(" " + matrix5[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                System.out.print(" " + matrix6[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========");

        int[][] matrix7 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix8 = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        smz.performUsingNSquareUsingMarkingLogic(matrix7);
        smz.performUsingNSquareUsingMarkingLogic(matrix8);
        for (int i = 0; i < matrix7.length; i++) {
            for (int j = 0; j < matrix7[i].length; j++) {
                System.out.print(" " + matrix7[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                System.out.print(" " + matrix8[i][j]);
            }
            System.out.println();
        }

        System.out.println("RotateImage ===== rotateOptimalSolution ==== RotateImage");

        RotateImage rotateImage = new RotateImage();
        int[][] matrix9 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix10 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        rotateImage.rotateOptimalSolution(matrix9);
        rotateImage.rotateOptimalSolution(matrix10);
        for (int i = 0; i < matrix9.length; i++) {
            for (int j = 0; j < matrix9[i].length; j++) {
                System.out.print(" " + matrix9[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10[i].length; j++) {
                System.out.print(" " + matrix10[i][j]);
            }
            System.out.println();
        }

        System.out.println("RotateImage ========= RotateImage");

        int[][] matrix11 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix12 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        int[][] updatedMatrix11 = rotateImage.rotateUsingBruteForceWithoutReverse(matrix11);
        int[][] updatedMatrix12 = rotateImage.rotateUsingBruteForceWithoutReverse(matrix12);

        for (int i = 0; i < updatedMatrix11.length; i++) {
            for (int j = 0; j < updatedMatrix11[i].length; j++) {
                System.out.print(" " + updatedMatrix11[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < updatedMatrix12.length; i++) {
            for (int j = 0; j < updatedMatrix12[i].length; j++) {
                System.out.print(" " + updatedMatrix12[i][j]);
            }
            System.out.println();
        }

        System.out.println("=========");

        System.out.println("SpiralOrder ======== SpiralOrder");

        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] matrix13 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 24}
        };
        int[][] matrix14 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        List<Integer> updatedMatrix13 = spiralOrder.findUsingBruteForce(matrix13);
        List<Integer> updatedMatrix14 = spiralOrder.findUsingBruteForce(matrix14);
        System.out.print("SpiralOrder is : [");
        for (int i = 0; i < updatedMatrix13.size(); i++) {
            System.out.print(updatedMatrix13.get(i) + " ");
        }
        System.out.println("]");

        System.out.print("SpiralOrder is : [");
        for (int i = 0; i < updatedMatrix14.size(); i++) {
            System.out.print(updatedMatrix14.get(i) + " ");
        }
        System.out.println("]");

        int[] nums17 = {1, 1, 1};
        int[] nums18 = {1, 2, 3};
        int[] nums19 = {0, 0};
        int[] nums20 = {-1, -1, 1};

        SubArraySumEqualsK arraySumEqualsK = new SubArraySumEqualsK();
        System.out.println("SubArraySumEqualsK: " + arraySumEqualsK.subArraySumUsingBruteForce(nums17, 2));
        System.out.println("SubArraySumEqualsK: " + arraySumEqualsK.subArraySumUsingBruteForce(nums18, 3));
        System.out.println("SubArraySumEqualsK: " + arraySumEqualsK.subArraySumUsingBruteForce(nums19, 0));
        System.out.println("SubArraySumEqualsK: " + arraySumEqualsK.subArraySumUsingBruteForce(nums20, 0));

        System.out.println("SubArraySumEqualsK subArraySumUsingTwoPointer: " + arraySumEqualsK.subArraySumUsingPrefixSum(nums17, 2));
        System.out.println("SubArraySumEqualsK subArraySumUsingTwoPointer: " + arraySumEqualsK.subArraySumUsingPrefixSum(nums18, 3));
        System.out.println("SubArraySumEqualsK subArraySumUsingTwoPointer: " + arraySumEqualsK.subArraySumUsingPrefixSum(nums19, 0));
        System.out.println("SubArraySumEqualsK subArraySumUsingTwoPointer: " + arraySumEqualsK.subArraySumUsingPrefixSum(nums20, 0));

        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> pascalsTriangle1 = pt.generateUsingBruteForce(5);
        List<List<Integer>> pascalsTriangle2 = pt.generateUsingBruteForce(1);

        System.out.print("PascalsTriangle is : [");
        for (int i = 0; i < pascalsTriangle1.size(); i++) {
            List<Integer> temp = pascalsTriangle1.get(i);
            System.out.print(" [");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("PascalsTriangle is : [");
        for (int i = 0; i < pascalsTriangle2.size(); i++) {
            List<Integer> temp = pascalsTriangle2.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.println("PascalsTriangle returnTheValueAtRAndC: " + pt.returnTheValueAtRAndC(6, 4));
        System.out.println("PascalsTriangle returnTheValueAtRAndC: " + pt.returnTheValueAtRAndC(1, 1));

        System.out.println("PascalsTriangle findNCR: " + pt.findNCR(6, 4));
        System.out.println("PascalsTriangle findNCR: " + pt.findNCR(1, 1));

        System.out.println("PascalsTriangle printPascalTriangleRowUsingNCR: " + Arrays.toString(pt.printPascalTriangleRowUsingNCR(5)));
        System.out.println("PascalsTriangle printPascalTriangleRowUsingNCR: " + Arrays.toString(pt.printPascalTriangleRowUsingNCR(1)));

        MajorityElementII mjele = new MajorityElementII();
        int[] mjeleNums = {3, 2, 3};
        int[] mjeleNums2 = {1};
        int[] mjeleNums3 = {1, 2};

        List<Integer> mjeleResult1 = mjele.findUsingHashMap(mjeleNums);
        List<Integer> mjeleResult2 = mjele.findUsingHashMap(mjeleNums2);
        List<Integer> mjeleResult3 = mjele.findUsingHashMap(mjeleNums3);

        System.out.print("MajorityElementII [");
        for (int j = 0; j < mjeleResult1.size(); j++) {
            System.out.print(" " + mjeleResult1.get(j) + " ");
        }
        System.out.println("]");

        System.out.print("MajorityElementII [");
        for (int j = 0; j < mjeleResult2.size(); j++) {
            System.out.print(" " + mjeleResult2.get(j) + " ");
        }
        System.out.println("]");

        System.out.print("MajorityElementII [");
        for (int j = 0; j < mjeleResult3.size(); j++) {
            System.out.print(" " + mjeleResult3.get(j) + " ");
        }
        System.out.println("]");

        List<Integer> mjeleResult4 = mjele.findUsingMooresVotingAlgorithm(mjeleNums);
        List<Integer> mjeleResult5 = mjele.findUsingMooresVotingAlgorithm(mjeleNums2);
        List<Integer> mjeleResult6 = mjele.findUsingMooresVotingAlgorithm(mjeleNums3);

        System.out.print("MajorityElementII findUsingMooresVotingAlgorithm [");
        for (int j = 0; j < mjeleResult4.size(); j++) {
            System.out.print(" " + mjeleResult4.get(j) + " ");
        }
        System.out.println("]");

        System.out.print("MajorityElementII findUsingMooresVotingAlgorithm [");
        for (int j = 0; j < mjeleResult5.size(); j++) {
            System.out.print(" " + mjeleResult5.get(j) + " ");
        }
        System.out.println("]");

        System.out.print("MajorityElementII findUsingMooresVotingAlgorithm [");
        for (int j = 0; j < mjeleResult6.size(); j++) {
            System.out.print(" " + mjeleResult6.get(j) + " ");
        }
        System.out.println("]");

        ThreeSum threeSum = new ThreeSum();
        int[] numbers7 = {-1, 0, 1, 2, -1, -4};
        int[] numbers8 = {0, 1, 1};
        int[] numbers9 = {0, 0, 0};

        List<List<Integer>> triplets1 = threeSum.threeSumUsingBruteForce(numbers7);
        List<List<Integer>> triplets2 = threeSum.threeSumUsingBruteForce(numbers8);
        List<List<Integer>> triplets3 = threeSum.threeSumUsingBruteForce(numbers9);

        List<List<Integer>> triplets4 = threeSum.threeSumHashing(numbers7);
        List<List<Integer>> triplets5 = threeSum.threeSumHashing(numbers8);
        List<List<Integer>> triplets6 = threeSum.threeSumHashing(numbers9);

        System.out.print("ThreeSum is : [");
        for (int i = 0; i < triplets1.size(); i++) {
            List<Integer> temp = triplets1.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("ThreeSum is : [");
        for (int i = 0; i < triplets2.size(); i++) {
            List<Integer> temp = triplets2.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("ThreeSum is : [");
        for (int i = 0; i < triplets3.size(); i++) {
            List<Integer> temp = triplets3.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("ThreeSum Using Hashing is : [");
        for (int i = 0; i < triplets4.size(); i++) {
            List<Integer> temp = triplets4.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("ThreeSum Using Hashing is : [");
        for (int i = 0; i < triplets5.size(); i++) {
            List<Integer> temp = triplets5.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        System.out.print("ThreeSum Using Hashing is : [");
        for (int i = 0; i < triplets6.size(); i++) {
            List<Integer> temp = triplets6.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(" " + temp.get(j) + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        LargestSubArrayWithSum0 arrayWithSum0 = new LargestSubArrayWithSum0();
        int[] arrForLargestSubArrayWithSum0 = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println("LargestSubArrayWithSum0 :" + arrayWithSum0.find(arrForLargestSubArrayWithSum0));

        int[][] unmergedIntervals = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        MergeOverlappingIntervals mergeOverlappingIntervals = new MergeOverlappingIntervals();
        int[][] mergedIntervals = mergeOverlappingIntervals.findUsingBruteForce(unmergedIntervals);

        System.out.print("Merge Overlapping Intervals is : [");
        for (int i = 0; i < mergedIntervals.length; i++) {
            int[] temp = mergedIntervals[i];
            System.out.print("[");
            for (int j = 0; j < temp.length; j++) {
                System.out.print(" " + temp[j] + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        int[][] unmergedIntervals1 = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        int[][] mergedIntervals1 = mergeOverlappingIntervals.findUsingSingleIteration(unmergedIntervals1);

        System.out.print("Merge Overlapping Intervals is : [");
        for (int i = 0; i < mergedIntervals1.length; i++) {
            int[] temp = mergedIntervals1[i];
            System.out.print("[");
            for (int j = 0; j < temp.length; j++) {
                System.out.print(" " + temp[j] + " ");
            }
            System.out.print("]");
        }
        System.out.println("]");

        MergeTwoSortedArray mtsa = new MergeTwoSortedArray();
        int[] mtsaNums1 = {1, 3, 5, 7};
        int[] mtsaNums2 = {0, 2, 6, 8, 9};
        mtsa.mergeUsingBruteForce(mtsaNums1, mtsaNums2, mtsaNums1.length, mtsaNums2.length);

        int[] mtsaNums3 = {1, 3, 5, 7};
        int[] mtsaNums4 = {0, 2, 6, 8, 9};
        mtsa.mergeWithoutUsingExtraSpace(mtsaNums3, mtsaNums4, mtsaNums3.length, mtsaNums4.length);

        int[] mtsaNums5 = {1, 3, 5, 7};
        int[] mtsaNums6 = {0, 2, 6, 8, 9};
        mtsa.mergeWithoutExtraSpaceShellSort(mtsaNums5, mtsaNums6, mtsaNums5.length, mtsaNums6.length);

        int[] mtsaNums7 = {1, 2, 3, 0, 0, 0};
        int[] mtsaNums8 = {10, 11, 12};
        mtsa.mergeInPlace(mtsaNums7, mtsaNums8, 3, mtsaNums8.length);

        int[] range = {4, 3, 6, 2, 1, 1};
        RepeatedMissingNumber repeatedMissingNumber = new RepeatedMissingNumber();
        int[] result = repeatedMissingNumber.findRepeatedMissingUsingBruteForce(range, 6);

        System.out.println("Repeated Missing Number is : " + Arrays.toString(result));

        int[] result2 = repeatedMissingNumber.findRepeatingMissingUsingAnotherBruteForce(range, 6);

        System.out.println("Repeated Missing Number is : " + Arrays.toString(result2));

        int[] result3 = repeatedMissingNumber.findRepeatingAndMissingUsingHashing(range, 6);

        System.out.println("Repeated Missing Number is : " + Arrays.toString(result3));

        long[] result4 = repeatedMissingNumber.findRepeatingAndMissingNumberUsingMathematicalOperation(range, 6);

        System.out.println("Repeated Missing Number is : " + Arrays.toString(result4));

        CountInversions ci = new CountInversions();
        System.out.println("Inversions: " + ci.countUsingBruteForce(new int[]{5, 3, 2, 4, 1}));
        int[] arr70 = {5, 3, 2, 4, 1};
        System.out.println("Inversions Merge Sort: " + ci.countUsingMergeSort(arr70));

        ReversePairs rv = new ReversePairs();
        System.out.println("Inversions Reverse Pairs: " + rv.countUsingBruteForce(new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647}));

        System.out.println("Inversions Reverse Pairs: " + rv.countUsingMergeSort(new int[]{40, 25, 19, 12, 9, 6, 2}));

        MaxProductSubarray mps = new MaxProductSubarray();
        System.out.println("MaxProductSubarray: " + mps.maxProductUsingBruteForce(new int[]{2, 3, -2, 4}));

        System.out.println("MaxProductSubarray: " + mps.maxProductUsingSingleIteration(new int[]{-2, 0, -1}));
    }
}
