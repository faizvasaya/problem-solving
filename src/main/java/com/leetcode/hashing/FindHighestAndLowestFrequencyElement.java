package com.leetcode.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindHighestAndLowestFrequencyElement {

    /**
     * TC: O(N)
     * SC: O(N)
     * @param arr
     */
    public void findUsingHashMap(int[] arr) {
        System.out.println(getClass().getName());
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {
            map.put(arr[idx], map.getOrDefault(arr[idx], 0) + 1);
        }

        int highestOccurrenceElement = -1;
        int lowestOccurreceElement = -1;
        int highestOccurrences = Integer.MIN_VALUE;
        int lowestOccurrences = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> elem : map.entrySet()) {
            int numberOfOccurrences = elem.getValue();
            int element = elem.getKey();

            if (numberOfOccurrences >= highestOccurrences) {
                highestOccurrenceElement = element;
                highestOccurrences = numberOfOccurrences;
            }

            if (numberOfOccurrences <= lowestOccurrences) {
                lowestOccurreceElement = element;
                lowestOccurrences = numberOfOccurrences;
            }
        }

        System.out.println("Highest Occurrences: " + highestOccurrenceElement);

        System.out.println("Lowest Occurrences: " + lowestOccurreceElement);
    }

    /**
     * TC: O(N^2)
     * SC: O(N)
     */
    public void findUsingBruteForce(int[] arr) {

        System.out.println(getClass().getName() + "Brute Force");

        boolean[] visited = new boolean[arr.length];

        int maxFrequency = 0;
        int minFrequency = arr.length;
        int minFrequencyElement = 0;
        int maxFrequencyElement = 0;

        for (int idx = 0; idx < arr.length; idx++) {
            if (visited[idx]) {
                continue;
            }

            visited[idx] = true;

            int currentFrequency = 1;

            for (int jdx = idx + 1; jdx < arr.length; jdx++) {
                if (arr[idx] == arr[jdx]) {
                    currentFrequency++;
                    visited[jdx] = true;
                }
            }

            if (currentFrequency >= maxFrequency) {
                maxFrequency = currentFrequency;
                maxFrequencyElement = arr[idx];
            }

            if (currentFrequency <= minFrequency) {
                minFrequency = currentFrequency;
                minFrequencyElement = arr[idx];
            }
        }

        System.out.println("Highest Occurrences: " + maxFrequencyElement);

        System.out.println("Lowest Occurrences: " + minFrequencyElement);
    }
}
