package com.leetcode.binarysearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

import java.util.Arrays;


public class SmallestLetterGreaterThanTarget {

    // Time complexity: O(log N)
    public char find(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }

    // Time complexity O(N)
    public char findUsingBooleanArray(char[] letters, char target) {
        boolean[] lettersThatExists = new boolean[26];

        for (int index = 0; index < letters.length; index++) {
            lettersThatExists[letters[index] - 'a'] = true;
        }

        System.out.println(Arrays.toString(lettersThatExists));

        for (int index = target - 'a' + 1; index < 26; index++) {
            if (lettersThatExists[index]) {
                return (char) ('a' + index);
            }
        }

        return letters[0];
    }
}
