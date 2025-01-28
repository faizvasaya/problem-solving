package com.leetcode.stringoperations;

public class GoalParser {

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public String parseUsingIfConditions(String command) {

        StringBuilder result = new StringBuilder("");
        int index = 0;

        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append('G');
                index++;
                continue;
            }

            if (command.charAt(index) == '(' && index + 1 < command.length() && command.charAt(index + 1) == ')') {
                result.append('o');
                index += 2;
                continue;
            }

            if (command.charAt(index) == '(' && index + 3 < command.length() && command.charAt(index + 1) == 'a' && command.charAt(index + 2) == 'l' && command.charAt(index + 3) == ')') {
                result.append("al");
                index += 4;
            }
        }

        return result.toString();
    }

    public String parseUsingIfConditionsAndStartsWith(String command) {

        StringBuilder result = new StringBuilder("");
        int index = 0;

        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append('G');
                index++;
            } else if (command.startsWith("()", index)) {
                result.append('o');
                index += 2;
            } else if (command.startsWith("(al)", index)) {
                result.append("al");
                index += 4;
            }
        }

        return result.toString();
    }

    
}
