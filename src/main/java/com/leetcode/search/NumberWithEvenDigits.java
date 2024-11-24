package com.leetcode.search;

/**
 * This is problem number 1295 from Leet code
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */
public class NumberWithEvenDigits {

    // Time complexity is O(log10(n))
    public int findNumberWithEventDigits(int number) {
        int numberOfDigits = 0;

        if (number < 0) {
            number = number * -1;
        }

        if(number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    // Time complexity is O(1)
    public int findNumberWithEventDigitsUsingLog(int number) {
        if (number < 0) {
            number = number * -1;
        }

        if(number == 0) {
            return 1;
        }

        return (int) (Math.log10(number)) + 1;
    }

    // Time complexity is O(N)
    public int findNumberWithEvenDigitsInAnArray(int[] numbers) {
        int numberOfNumbersWithEventDigits = 0;

        if (numbers.length == 0) {
            return numberOfNumbersWithEventDigits;
        }

        for (int index = 0; index < numbers.length; index++) {
            int numberOfDigits = this.findNumberWithEventDigitsUsingLog(numbers[index]);

            if (numberOfDigits % 2 == 0) {
                numberOfNumbersWithEventDigits++;
            }
        }

        return numberOfNumbersWithEventDigits;
    }
}
