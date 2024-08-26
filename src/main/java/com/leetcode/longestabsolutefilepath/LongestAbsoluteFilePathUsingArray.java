package com.leetcode.longestabsolutefilepath;

public class LongestAbsoluteFilePathUsingArray implements LongestAbsoluteFilePath {
    
    @Override
    public int calculate(String systemFilePath) {
        int maximumFilePath = 0;

        String[] filePaths = systemFilePath.split("\n");
        int[] filePathLength = new int[filePaths.length + 1];
        filePathLength[0] = 0;

        for(String filePath: filePaths) {
            String cleansedFilePath = filePath.replaceAll("\t","");
            int depth = filePath.length() - cleansedFilePath.length();

            if (cleansedFilePath.contains(".")) {
                int currentFilePath = filePathLength[depth] + cleansedFilePath.length();
                maximumFilePath = Math.max(maximumFilePath, currentFilePath);
            } else {
                filePathLength[depth + 1] = filePathLength[depth] + cleansedFilePath.length() + 1;
            }
        }

        return  maximumFilePath;
    }
}
