package com.leetcode.longestabsolutefilepath;

import java.util.Stack;

/**
 * Time Complexity: O(n) where n is the length of the input string
 * Space Complexity: o(d) where d is the maximum depth of the directory structure since it will be stored in a * stack
 */
public class LongestAbsoluteFilePathUsingStackWithInteger implements LongestAbsoluteFilePath {
    @Override
    public int calculate(String systemFilePath) {

        String[] filePaths = systemFilePath.split("\n");
        Stack<Integer>  pathLengthStack = new Stack<>();
        int maximumPathLength = 0;
        pathLengthStack.push(0);

        for (String filePath: filePaths) {
            
            int level = filePath.lastIndexOf("\t") + 1;

            while(pathLengthStack.size() > level + 1 ) {
                pathLengthStack.pop();
            }

            int currentLength = pathLengthStack.peek() + filePath.length() - level + 1;

            if(filePath.contains(".")) {
                maximumPathLength = Math.max(currentLength, maximumPathLength) - 1;
            } else {
                pathLengthStack.push(currentLength);
            }
        }

        return maximumPathLength;
    }
}