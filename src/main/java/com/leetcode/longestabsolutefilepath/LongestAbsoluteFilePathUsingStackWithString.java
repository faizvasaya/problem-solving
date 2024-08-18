package com.leetcode.longestabsolutefilepath;

import java.util.Stack;

/**
 * Time Complexity: O(n) where n is the length of the input string
 * Space Complexity: o(d) where d is the maximum depth of the directory structure since it will be stored in a * stack
 */
public class LongestAbsoluteFilePathUsingStackWithString implements LongestAbsoluteFilePath {

    @Override
    public int calculate(String systemFilePath) {
        
        Stack<String> pathStack = new Stack();
        int maximumLengthOfFilePath = 0;

        String[] paths = systemFilePath.split("\n");

        for (String path : paths) {

            int level = path.lastIndexOf("\t") + 1;

            while(level < pathStack.size()) {
                pathStack.pop();
            }

            String cleansedPath = path.replaceAll("\t", "");

            if (path.contains(".")) {
                String completePath = "";
                if (pathStack.size() > 0) {
                    completePath = String.join("/", pathStack) + "/" + cleansedPath;    
                    System.out.println(completePath);
                } else {
                    completePath = cleansedPath;
                }
                
                maximumLengthOfFilePath = Math.max(maximumLengthOfFilePath, completePath.length());
            } else {  
                pathStack.push(cleansedPath);
            }
        }

        return maximumLengthOfFilePath;
    }
}
