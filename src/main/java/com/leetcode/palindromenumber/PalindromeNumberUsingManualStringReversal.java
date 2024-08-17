package com.leetcode.palindromenumber;

/*
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */
public class PalindromeNumberUsingManualStringReversal implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        String originalNumberToString = String.valueOf(number);
        String reversedString = this.reverseString(originalNumberToString);
        return originalNumberToString.equals(reversedString);
    }

    private String reverseString(String stringToReverse) {
        char[] originalString = stringToReverse.toCharArray();
        int left = 0;
        int right = originalString.length - 1;
        
        while (left < right) {
            char tempCharacter = originalString[left];
            originalString[left] = originalString[right];
            originalString[right] = tempCharacter;
            left++;
            right--;
        }

        return new String(originalString);
    }
}