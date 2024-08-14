package com.leetcode.palindromenumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        
        // Test cases
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertTrue(palindromeNumber.isPalindrome(0));
    }
}
