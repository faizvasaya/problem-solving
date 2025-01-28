package com.leetcode.stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringOperationsExecutor {

    public static void main(String[] args) {
        PrintAlphabet alphabet = new PrintAlphabet();
        System.out.println(alphabet.printUsingStringConcatenation());

        System.out.println(alphabet.printUsingStringBuilder());

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("abccba"));

        System.out.println(palindrome.isPalindromeUsingTwoPointer("Abccba"));

        DefangingIPAddress address = new DefangingIPAddress();
        System.out.println(address.defang("1.1.1.1"));
        System.out.println(address.defangManuallyUsingStringBuilder("1.1.1.1"));

        ShuffleString shuffleString = new ShuffleString();
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(shuffleString.restoreString("codeleet", indices));

        System.out.println(shuffleString.restoreStringUsingCyclicSort("codeleet", indices));

        GoalParser goalParser = new GoalParser();
        System.out.println(goalParser.parseUsingIfConditions("G()(al)"));

        CountItemsMatchingARule aRule = new CountItemsMatchingARule();

        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "phone"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        System.out.println(aRule.findUsingLinearSearch(items, "type", "phone"));

        SortASentence aSentence = new SortASentence();
        System.out.println(aSentence.sortUsingCyclicSort("Myself2 Me1 I4 and3"));

        System.out.println(aSentence.sortUsingManualReplacement("Myself2 Me1 I4 and3"));

        TwoStringAreEqual areEqual = new TwoStringAreEqual();
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(areEqual.arrayStringsAreEqual(word1, word2));

        LowerCaseString caseString = new LowerCaseString();
        System.out.println(caseString.toLowerCase("Hello"));

        LengthOfLastWord lengthOfLastWord= new LengthOfLastWord();
        System.out.println(lengthOfLastWord.find("luffy is still joyboy"));
    }
}
