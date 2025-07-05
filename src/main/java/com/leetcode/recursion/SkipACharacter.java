package com.leetcode.recursion;

public class SkipACharacter {

    public String skip(String str, char c) {

        StringBuilder result = new StringBuilder();

        for (int idx = 0; idx < str.length(); idx++) {
            if (str.charAt(idx) == c) {
                continue;
            }
            result.append(str.charAt(idx));
        }

        return result.toString();
    }

    public String skipUsingRecursion(String str, char skipChar, StringBuilder ans, int currIndex) {
        if (currIndex == str.length()) {
            return ans.toString();
        }

        if (str.charAt(currIndex) != skipChar) {
            ans.append(str.charAt(currIndex));
        }

        return skipUsingRecursion(str, skipChar, ans, ++currIndex);
    }

    public String skipUsingTailRecursion(String str, char skipChar, int currIndex) {
        if (str.length() == currIndex) {
            return "";
        }

        char current = str.charAt(currIndex);
        String next = skipUsingTailRecursion(str, skipChar, currIndex + 1);

        if (current == skipChar) {
            return next;
        }

        return current + next;
    }
}
