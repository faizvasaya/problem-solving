package com.leetcode.longestabsolutefilepath;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePathWithMap implements LongestAbsoluteFilePath {

    @Override
    public int calculate(String systemFilePath) {
        int maximumFilePath = 0;

        String[] filePaths = systemFilePath.split("\n");
        Map<Integer, Integer> pathSizePerDepth = new HashMap<>();

        pathSizePerDepth.put(0, 0);

        for (String filePath : filePaths) {

            String subPathName = filePath.replaceAll("\t", "");
            int currentDepth = filePath.length() - subPathName.length();

            if (subPathName.contains(".")) {
                maximumFilePath = Math.max(maximumFilePath, pathSizePerDepth.get(currentDepth) + subPathName.length());
            } else {
                pathSizePerDepth.put(currentDepth + 1, pathSizePerDepth.get(currentDepth) + subPathName.length() + 1);
            }
        }

        return maximumFilePath;
    }
}
