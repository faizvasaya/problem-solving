package com.leetcode.hashing;

public class HashingExecutor {

    public static void main(String[] args) {
        FindNumberOfOccurences findNumberOfOccurences = new FindNumberOfOccurences();
        System.out.println(findNumberOfOccurences.findUsingLinearSearch(new int[]{1, 1, 2, 3, 4, 5, 1, 1}, 10));

        findNumberOfOccurences.findListOfNumbersUsingHashing(new int[]{0, 1, 2, 1, 1, 2, 3, 4, 5}, 12, new int[]{0, 1, 5});

        findNumberOfOccurences.findListOfCharactersUsingHashing(new char[]{'a', 'b', 'b', 'y', 'y', 'z'}, new char[]{'a', 'z', 'v', 'y'});

        findNumberOfOccurences.findListOfNumbersUsingHashingUsingHashMap(
                new int[]{1, 2, 3, 4, 1, 4, 4, 4, 999999999, 0, -1}, new int[]{1, 5, 4, 40000000, -1}
        );

        findNumberOfOccurences.findListOfCharactersUsingHashingUsingHashMap(new char[]{'a', 'b', 'b', 'y', 'y', 'z'}, new char[]{'a', 'z', 'v', 'y'});

        FindHighestAndLowestFrequencyElement andLowestFrequencyElement = new FindHighestAndLowestFrequencyElement();
        andLowestFrequencyElement.findUsingHashMap(new int[]{1, 2, 1, 4, 4, 4, 8, -1, -1, 0, 100});
        andLowestFrequencyElement.findUsingBruteForce(new int[]{1, 2, 1, 4, 4, 4, 8, -1, -1, 0, 100});
    }
}
