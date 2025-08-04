package com.leetcode.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfOccurences {

    /**
     * Time Complexity: O(N)
     */
    public int findUsingLinearSearch(int[] arr, int elementToFind) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                count++;
            }
        }

        return count;
    }

    public void findListOfNumbersUsingHashing(int[] arr, int maxLimit, int[] elementsToSearch) {
        int[] occurrences = new int[maxLimit + 1];

        for (int i = 0; i < arr.length; i++) {
            occurrences[arr[i]] = occurrences[arr[i]] + 1;
        }

        for (int idx = 0; idx < elementsToSearch.length; idx++) {
            System.out.println(elementsToSearch[idx] + " -> " + occurrences[elementsToSearch[idx]]);
        }
    }

    public void findListOfCharactersUsingHashing(char[] arr, char[] lettersToFind) {
        int[] occurrences = new int[27];

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 'a';
            occurrences[index] += 1;
        }

        for (int i = 0; i < lettersToFind.length; i++) {
            int index = lettersToFind[i] - 'a';
            System.out.println(lettersToFind[i] + " -> " + occurrences[index]);
        }
    }

    public void findListOfNumbersUsingHashingUsingHashMap(int[] arr, int[] elementsToFind) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {
            int currentCount = occurrences.getOrDefault(arr[idx], 0);
            occurrences.put(arr[idx], currentCount + 1);
        }

        for (Object elem : occurrences.entrySet()) {
            System.out.println(elem);
        }

        for (int idx = 0; idx < elementsToFind.length; idx++) {
            System.out.println(elementsToFind[idx] + " -> " + occurrences.getOrDefault(elementsToFind[idx], 0));
        }
    }

    public void findListOfCharactersUsingHashingUsingHashMap(char[] arr, char[] elementsToFind) {
        Map<Character, Integer> occurrences = new HashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {
            int currentCount = occurrences.getOrDefault(arr[idx], 0);
            occurrences.put(arr[idx], currentCount + 1);
        }

        for (Object elem : occurrences.entrySet()) {
            System.out.println(elem);
        }

        for (int idx = 0; idx < elementsToFind.length; idx++) {
            System.out.println(elementsToFind[idx] + " -> " + occurrences.getOrDefault(elementsToFind[idx], 0));
        }
    }
}
