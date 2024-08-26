package com.leetcode.longestabsolutefilepath;

public class LongestAbsoluteFilePathExecutor {
    public static void main(String[] args) {
        LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePathUsingArray();

        String systemFilePath = "dir\n\tsubdir\n\t\tfile.ext";

        System.err.println("The longest absolute file path is: " + longestAbsoluteFilePath.calculate(systemFilePath));

        String systemFilePath2 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";

        System.err.println("The longest absolute file path is: " + longestAbsoluteFilePath.calculate(systemFilePath2));

        String systemFilePath3 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

        System.err.println("The longest absolute file path is: " + longestAbsoluteFilePath.calculate(systemFilePath3));
    }
}
