package com.leetcode.palindromenumber;

public class PalindromeNumberExecutor {
    public static void main(String[] args) {
        PalindromeNumber palindromeChecker = new PalindromeNumber();
        
        int[] testNumbers = {121, -121, 10, 12321, 0, 1234321, 1221, 123};

        for (int number : testNumbers) {
            boolean result = palindromeChecker.isPalindrome(number);
            System.out.println("Is " + number + " a palindrome? " + result);
        }
    }
}
