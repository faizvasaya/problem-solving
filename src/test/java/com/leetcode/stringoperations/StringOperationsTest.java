package com.leetcode.stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringOperationsTest {

    private final Palindrome instance = new Palindrome(); // Replace 'YourClassName' with the actual class name

    // Test case 1: Simple palindrome
    @Test
    public void testSimplePalindrome() {
        String input = "madam";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 2: Palindrome with mixed case
    @Test
    public void testPalindromeMixedCase() {
        String input = "RaceCar";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 3: Non-palindrome
    @Test
    public void testNonPalindrome() {
        String input = "hello";
        assertFalse(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 4: Palindrome with spaces and punctuation (should fail unless explicitly allowed)
    @Test
    public void testPalindromeWithSpacesAndPunctuation() {
        String input = "A man, a plan, a canal: Panama";
        assertFalse(instance.isPalindromeUsingTwoPointer(input)); // Assumes special chars/spaces are not ignored
    }

    // Test case 5: Empty string
    @Test
    public void testEmptyString() {
        String input = "";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 6: Single character
    @Test
    public void testSingleCharacter() {
        String input = "a";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 7: String with only whitespaces
    @Test
    public void testStringWithOnlyWhitespaces() {
        String input = "   ";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 8: String with different characters at start and end
    @Test
    public void testDifferentCharacters() {
        String input = "abcde";
        assertFalse(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 9: Long palindrome
    @Test
    public void testLongPalindrome() {
        String input = "Ablewasiereisawelba";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 10: Even-length palindrome
    @Test
    public void testEvenLengthPalindrome() {
        String input = "abccba";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    // Test case 11: Odd-length palindrome
    @Test
    public void testOddLengthPalindrome() {
        String input = "racecar";
        assertTrue(instance.isPalindromeUsingTwoPointer(input));
    }

    private final DefangingIPAddress defanger = new DefangingIPAddress();

    // Test case 1: Simple valid IP address
    @Test
    public void testSimpleIPAddress() {
        String input = "1.1.1.1";
        String expected = "1[.]1[.]1[.]1";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 2: Edge case with largest valid IPv4 address
    @Test
    public void testLargestIPAddress() {
        String input = "255.255.255.255";
        String expected = "255[.]255[.]255[.]255";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 3: Edge case with smallest valid IPv4 address
    @Test
    public void testSmallestIPAddress() {
        String input = "0.0.0.0";
        String expected = "0[.]0[.]0[.]0";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 4: Mixed segment lengths in IP address
    @Test
    public void testMixedSegmentIPAddress() {
        String input = "123.4.56.78";
        String expected = "123[.]4[.]56[.]78";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 5: IP address with single-digit segments
    @Test
    public void testSingleDigitIPAddress() {
        String input = "1.2.3.4";
        String expected = "1[.]2[.]3[.]4";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 6: IP address with leading zeros (valid for IPv4)
    @Test
    public void testIPAddressWithLeadingZeros() {
        String input = "001.002.003.004";
        String expected = "001[.]002[.]003[.]004";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 7: Random IP address
    @Test
    public void testRandomIPAddress() {
        String input = "192.168.1.1";
        String expected = "192[.]168[.]1[.]1";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    // Test case 8: IP address with different formatting edge cases
    @Test
    public void testIPAddressFormatting() {
        String input = "10.0.1.254";
        String expected = "10[.]0[.]1[.]254";
        assertEquals(expected, defanger.defang(input));
        assertEquals(expected, defanger.defangManuallyUsingStringBuilder(input));
    }

    private final ShuffleString shuffleString = new ShuffleString();

    // Test case 1: Example case with standard input
    @Test
    public void testStandardCase() {
        String input = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String expected = "leetcode";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 2: String with all letters in alphabetical order
    @Test
    public void testAlphabeticalString() {
        String input = "abc";
        int[] indices = {0, 1, 2};
        String expected = "abc";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 3: Single character string
    @Test
    public void testSingleCharacterShuffleString() {
        String input = "a";
        int[] indices = {0};
        String expected = "a";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 4: Reversed string
    @Test
    public void testReversedString() {
        String input = "abcdef";
        int[] indices = {5, 4, 3, 2, 1, 0};
        String expected = "fedcba";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 5: Smallest valid input size
    @Test
    public void testMinimumSizeInput() {
        String input = "a";
        int[] indices = {0};
        String expected = "a";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 6: Largest valid input size
    @Test
    public void testMaximumSizeInput() {
        StringBuilder sb = new StringBuilder();
        int[] indices = new int[100];
        for (int i = 0; i < 100; i++) {
            sb.append((char) ('a' + i % 26)); // Generate a repeating sequence of letters
            indices[i] = 99 - i; // Reverse indices
        }
        String input = sb.toString();
        String expected = sb.reverse().toString(); // Reversed string
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 7: Randomly shuffled indices
    @Test
    public void testRandomShuffle() {
        String input = "shuffled";
        int[] indices = {3, 5, 0, 6, 7, 4, 2, 1};
        String expected = "udeslhff";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 8: Alternate placements
    @Test
    public void testAlternatePlacement() {
        String input = "abcde";
        int[] indices = {1, 3, 0, 4, 2};
        String expected = "caebd";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 9: Duplicate characters in string
    @Test
    public void testDuplicateCharacters() {
        String input = "aabbcc";
        int[] indices = {2, 3, 4, 5, 0, 1};
        String expected = "ccaabb";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    // Test case 10: Out-of-order indices
    @Test
    public void testOutOfOrder() {
        String input = "zxcvbnm";
        int[] indices = {6, 5, 4, 3, 2, 1, 0};
        String expected = "mnbvcxz";
        assertEquals(expected, shuffleString.restoreString(input, indices));
    }

    private final GoalParser goalParser = new GoalParser();

    // Test case 1: Basic case with mixed commands
    @Test
    public void testBasicCase() {
        String command = "G()(al)";
        String expected = "Goal";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 2: Continuous "()"
    @Test
    public void testMultipleParentheses() {
        String command = "G()()()()(al)";
        String expected = "Gooooal";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 3: Alternating commands
    @Test
    public void testAlternatingCommands() {
        String command = "(al)G(al)()()G";
        String expected = "alGalooG";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 4: All single "G"
    @Test
    public void testAllSingleG() {
        String command = "GGGGG";
        String expected = "GGGGG";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 5: All "()"
    @Test
    public void testAllParentheses() {
        String command = "()()()";
        String expected = "ooo";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 6: All "(al)"
    @Test
    public void testAllAl() {
        String command = "(al)(al)(al)";
        String expected = "alalal";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 7: Empty command (shouldn't happen per constraints, added for robustness)
    @Test
    public void testEmptyCommand() {
        String command = "";
        String expected = "";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 8: Mixed command with all types
    @Test
    public void testMixedCommand() {
        String command = "G()()(al)G(al)()G";
        String expected = "GooalGaloG";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 9: Minimum length command
    @Test
    public void testMinimumLength() {
        String command = "G";
        String expected = "G";
        assertEquals(expected, goalParser.parseUsingIfConditions(command));
    }

    // Test case 10: Maximum length command
    @Test
    public void testMaximumLength() {
        StringBuilder command = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            command.append("G()(al)"); // "G()(al)" length is 6
        }
        String expected = "GoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoal"; // Repeat "Goal" 25 times
        assertEquals(expected, goalParser.parseUsingIfConditions(command.toString()));
    }

    // Test case 1: Basic case with mixed commands
    @Test
    public void testBasicCaseSW() {
        String command = "G()(al)";
        String expected = "Goal";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 2: Continuous "()"
    @Test
    public void testMultipleParenthesesSW() {
        String command = "G()()()()(al)";
        String expected = "Gooooal";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 3: Alternating commands
    @Test
    public void testAlternatingCommandsSW() {
        String command = "(al)G(al)()()G";
        String expected = "alGalooG";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 4: All single "G"
    @Test
    public void testAllSingleGSW() {
        String command = "GGGGG";
        String expected = "GGGGG";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 5: All "()"
    @Test
    public void testAllParenthesesSW() {
        String command = "()()()";
        String expected = "ooo";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 6: All "(al)"
    @Test
    public void testAllAlSW() {
        String command = "(al)(al)(al)";
        String expected = "alalal";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 7: Empty command (shouldn't happen per constraints, added for robustness)
    @Test
    public void testEmptyCommandSW() {
        String command = "";
        String expected = "";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 8: Mixed command with all types
    @Test
    public void testMixedCommandSW() {
        String command = "G()()(al)G(al)()G";
        String expected = "GooalGaloG";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 9: Minimum length command
    @Test
    public void testMinimumLengthSW() {
        String command = "G";
        String expected = "G";
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command));
    }

    // Test case 10: Maximum length command
    @Test
    public void testMaximumLengthSW() {
        StringBuilder command = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            command.append("G()(al)"); // "G()(al)" length is 6
        }
        String expected = "GoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoalGoal"; // Repeat "Goal" 25 times
        assertEquals(expected, goalParser.parseUsingIfConditionsAndStartsWith(command.toString()));
    }

    // Helper method to create test data for items
    private List<List<String>> createItems(String[][] data) {
        List<List<String>> items = new ArrayList<>();
        for (String[] row : data) {
            items.add(Arrays.asList(row));
        }
        return items;
    }

    @Test
    public void testSingleMatch() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"},
            {"computer", "silver", "lenovo"},
            {"phone", "gold", "iphone"}
        });
        String ruleKey = "color";
        String ruleValue = "silver";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(1, result);
    }

    @Test
    public void testMultipleMatches() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"},
            {"computer", "silver", "phone"},
            {"phone", "gold", "iphone"}
        });
        String ruleKey = "type";
        String ruleValue = "phone";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(2, result);
    }

    @Test
    public void testNoMatch() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"},
            {"computer", "silver", "lenovo"},
            {"phone", "gold", "iphone"}
        });
        String ruleKey = "color";
        String ruleValue = "red";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(0, result);
    }

    @Test
    public void testAllMatch() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"},
            {"phone", "silver", "iphone"},
            {"phone", "gold", "samsung"}
        });
        String ruleKey = "type";
        String ruleValue = "phone";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(3, result);
    }

    @Test
    public void testEmptyItems() {
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "type";
        String ruleValue = "phone";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(0, result);
    }

    @Test
    public void testSingleItemMatch() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"}
        });
        String ruleKey = "color";
        String ruleValue = "blue";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(1, result);
    }

    @Test
    public void testSingleItemNoMatch() {
        List<List<String>> items = createItems(new String[][]{
            {"phone", "blue", "pixel"}
        });
        String ruleKey = "color";
        String ruleValue = "red";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(0, result);
    }

    @Test
    public void testBoundaryCaseLargeItems() {
        List<List<String>> items = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            items.add(Arrays.asList("type" + i, "color" + i, "name" + i));
        }
        String ruleKey = "color";
        String ruleValue = "color9999";

        CountItemsMatchingARule counter = new CountItemsMatchingARule();
        int result = counter.findUsingLinearSearch(items, ruleKey, ruleValue);
        assertEquals(1, result);
    }

    @Test
    public void testBasicExample1() {
        SortASentence sortASentence = new SortASentence();
        String s = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testBasicExample2() {
        SortASentence sortASentence = new SortASentence();
        String s = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleWord() {
        SortASentence sortASentence = new SortASentence();
        String s = "word1";
        String expected = "word";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testUppercaseWords() {
        SortASentence sortASentence = new SortASentence();
        String s = "HELLO2 WORLD1";
        String expected = "WORLD HELLO";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testMixedCases() {
        SortASentence sortASentence = new SortASentence();
        String s = "java1 IS3 FUN2";
        String expected = "java FUN IS";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testTrailingAndLeadingSpaces() {
        SortASentence sortASentence = new SortASentence();
        String s = "this1 has2 no3 spaces4";
        String expected = "this has no spaces";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testNineWords() {
        SortASentence sortASentence = new SortASentence();
        String s = "word1 is2 a3 big4 shuffle5 for6 many7 word8 arrays9";
        String expected = "word is a big shuffle for many word arrays";
        String actual = sortASentence.sortUsingCyclicSort(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testBasicExample1MR() {
        SortASentence sortASentence = new SortASentence();
        String s = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testBasicExample2MR() {
        SortASentence sortASentence = new SortASentence();
        String s = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleWordMR() {
        SortASentence sortASentence = new SortASentence();
        String s = "word1";
        String expected = "word";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testUppercaseWordsMR() {
        SortASentence sortASentence = new SortASentence();
        String s = "HELLO2 WORLD1";
        String expected = "WORLD HELLO";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testMixedCasesMR() {
        SortASentence sortASentence = new SortASentence();
        String s = "java1 IS3 FUN2";
        String expected = "java FUN IS";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testTrailingAndLeadingSpacesMR() {
        SortASentence sortASentence = new SortASentence();
        String s = "this1 has2 no3 spaces4";
        String expected = "this has no spaces";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testNineWordsMR() {
        SortASentence sortASentence = new SortASentence();
        String s = "word1 is2 a3 big4 shuffle5 for6 many7 word8 arrays9";
        String expected = "word is a big shuffle for many word arrays";
        String actual = sortASentence.sortUsingManualReplacement(s);
        assertEquals(expected, actual);
    }

    @Test
    public void testBothArraysRepresentSameString() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testDifferentStringsRepresentation() {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertFalse(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testSingleStringInBothArrays() {
        String[] word1 = {"abc"};
        String[] word2 = {"abc"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testLongConcatenatedStringRepresentation() {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testEmptyArrays() {
        String[] word1 = {""};
        String[] word2 = {""};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testEmptyStringAndNonEmptyString() {
        String[] word1 = {""};
        String[] word2 = {"a"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertFalse(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testMaximumLengthOfWords() {
        String[] word1 = {"a".repeat(1000)};
        String[] word2 = {"a".repeat(999), "a"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testMaximumNumberOfStrings() {
        String[] word1 = new String[1000];
        String[] word2 = new String[1000];
        for (int i = 0; i < 1000; i++) {
            word1[i] = "a";
            word2[i] = "a";
        }
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertTrue(checker.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void testSingleCharacterMismatch() {
        String[] word1 = {"abc"};
        String[] word2 = {"abd"};
        TwoStringAreEqual checker = new TwoStringAreEqual();
        assertFalse(checker.arrayStringsAreEqual(word1, word2));
    }
}
