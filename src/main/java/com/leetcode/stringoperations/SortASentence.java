package com.leetcode.stringoperations;

public class SortASentence {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public String sortUsingCyclicSort(String s) {
        String[] words = s.split(" ");
        int index = 0;

        while (index < words.length) {
            int correctIndexOfWord = (new Integer(words[index].substring(words[index].length() - 1))) - 1;

            if (index == correctIndexOfWord) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                index++;
                continue;
            }

            String temp = words[index];
            words[index] = words[correctIndexOfWord];
            words[correctIndexOfWord] = temp;
        }

        return String.join(" ", words);
    }

    public String sortUsingManualReplacement(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        int index = 0;

        while (index < words.length) {
            int expectedIndex = Character.getNumericValue(words[index].charAt(words[index].length() -1)) - 1;
            result[expectedIndex] = words[index].substring(0, words[index].length() - 1);
            index++;
        }

        return String.join(" ", result);
    }
}
