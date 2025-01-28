package com.leetcode.stringoperations;

public class LowerCaseString {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public String toLowerCase(String s) {
        char[] result = s.toCharArray();
        int index = 0;
        while (index < result.length) {
            int asciiValue = result[index];

            if (asciiValue >= 65 && asciiValue <= 90) {
                char ch = (char) (asciiValue + 32);
                result[index] = ch;
            }
            index++;
        }

        return new String(result);
    }
}
