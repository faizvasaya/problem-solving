package com.leetcode.longestabsolutefilepath;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongestAbsoluteFilePathTest {

    @Test
    public void testLongestAbsoluteFilePathUsingStack() {
        String input = "file.ext";
        LongestAbsoluteFilePath solution = new LongestAbsoluteFilePathUsingStackWithString();
        assertEquals(8, solution.calculate(input));

        String input2 = "dir";
        assertEquals(0, solution.calculate(input2));

        String input3 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        assertEquals(20, solution.calculate(input3));

        String input4 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        assertEquals(32, solution.calculate(input4));

        String input5 = "dir\n\tsubdir1\n\tsubdir2\n\t\tsubsubdir1";
        assertEquals(0, solution.calculate(input5));

        String input6 = "";
        assertEquals(0, solution.calculate(input6));

        String input7 = "dir\n\tfile";
        assertEquals(0, solution.calculate(input7));

        String input8 = "dir\n\tsubdir1\n\t\tsubsubdir1\n\t\t\tsubsubsubdir1\n\t\t\t\tfile.ext";
        assertEquals(45, solution.calculate(input8));

        String input9 = "dir\n\tsubdir1\n\t\tfile.name.ext";
        assertEquals(25, solution.calculate(input9));

        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("dir");

        for (int i = 0; i < 500; i++) {
            inputBuilder.append("\n");
            for (int j = 0; j <= i; j++) {
                inputBuilder.append("\t");
            }
            inputBuilder.append("subdir").append(i);
        }

        inputBuilder.append("\n");
        for (int j = 0; j <= 500; j++) {
            inputBuilder.append("\t");
        }
        inputBuilder.append("file.ext");

        String input10 = inputBuilder.toString();

        assertEquals(4902, solution.calculate(input10));
    }

    @Test
    public void testLongestAbsoluteFilePathUsingStackWithInteger() {
        String input = "file.ext";
        LongestAbsoluteFilePath solution = new LongestAbsoluteFilePathUsingStackWithInteger();
        assertEquals(8, solution.calculate(input));

        String input2 = "dir";
        assertEquals(0, solution.calculate(input2));

        String input3 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        assertEquals(20, solution.calculate(input3));

        String input4 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        assertEquals(32, solution.calculate(input4));

        String input5 = "dir\n\tsubdir1\n\tsubdir2\n\t\tsubsubdir1";
        assertEquals(0, solution.calculate(input5));

        String input6 = "";
        assertEquals(0, solution.calculate(input6));

        String input7 = "dir\n\tfile";
        assertEquals(0, solution.calculate(input7));

        String input8 = "dir\n\tsubdir1\n\t\tsubsubdir1\n\t\t\tsubsubsubdir1\n\t\t\t\tfile.ext";
        assertEquals(45, solution.calculate(input8));

        String input9 = "dir\n\tsubdir1\n\t\tfile.name.ext";
        assertEquals(25, solution.calculate(input9));

        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("dir");

        for (int i = 0; i < 500; i++) {
            inputBuilder.append("\n");
            for (int j = 0; j <= i; j++) {
                inputBuilder.append("\t");
            }
            inputBuilder.append("subdir").append(i);
        }

        inputBuilder.append("\n");
        for (int j = 0; j <= 500; j++) {
            inputBuilder.append("\t");
        }
        inputBuilder.append("file.ext");

        String input10 = inputBuilder.toString();

        assertEquals(4902, solution.calculate(input10));
    }

    @Test
    public void testLongestAbsoluteFilePathUsingMap() {
        String input = "file.ext";
        LongestAbsoluteFilePath solution = new LongestAbsoluteFilePathWithMap();
        assertEquals(8, solution.calculate(input));

        String input2 = "dir";
        assertEquals(0, solution.calculate(input2));

        String input3 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        assertEquals(20, solution.calculate(input3));

        String input4 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        assertEquals(32, solution.calculate(input4));

        String input5 = "dir\n\tsubdir1\n\tsubdir2\n\t\tsubsubdir1";
        assertEquals(0, solution.calculate(input5));

        String input6 = "";
        assertEquals(0, solution.calculate(input6));

        String input7 = "dir\n\tfile";
        assertEquals(0, solution.calculate(input7));

        String input8 = "dir\n\tsubdir1\n\t\tsubsubdir1\n\t\t\tsubsubsubdir1\n\t\t\t\tfile.ext";
        assertEquals(45, solution.calculate(input8));

        String input9 = "dir\n\tsubdir1\n\t\tfile.name.ext";
        assertEquals(25, solution.calculate(input9));

        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("dir");

        for (int i = 0; i < 500; i++) {
            inputBuilder.append("\n");
            for (int j = 0; j <= i; j++) {
                inputBuilder.append("\t");
            }
            inputBuilder.append("subdir").append(i);
        }

        inputBuilder.append("\n");
        for (int j = 0; j <= 500; j++) {
            inputBuilder.append("\t");
        }
        inputBuilder.append("file.ext");

        String input10 = inputBuilder.toString();

        assertEquals(4902, solution.calculate(input10));
    }

    @Test
    public void testLongestAbsoluteFilePathUsingArray() {
        String input = "file.ext";
        LongestAbsoluteFilePath solution = new LongestAbsoluteFilePathUsingArray();
        assertEquals(8, solution.calculate(input));

        String input2 = "dir";
        assertEquals(0, solution.calculate(input2));

        String input3 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        assertEquals(20, solution.calculate(input3));

        String input4 = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        assertEquals(32, solution.calculate(input4));

        String input5 = "dir\n\tsubdir1\n\tsubdir2\n\t\tsubsubdir1";
        assertEquals(0, solution.calculate(input5));

        String input6 = "";
        assertEquals(0, solution.calculate(input6));

        String input7 = "dir\n\tfile";
        assertEquals(0, solution.calculate(input7));

        String input8 = "dir\n\tsubdir1\n\t\tsubsubdir1\n\t\t\tsubsubsubdir1\n\t\t\t\tfile.ext";
        assertEquals(45, solution.calculate(input8));

        String input9 = "dir\n\tsubdir1\n\t\tfile.name.ext";
        assertEquals(25, solution.calculate(input9));

        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("dir");

        for (int i = 0; i < 500; i++) {
            inputBuilder.append("\n");
            for (int j = 0; j <= i; j++) {
                inputBuilder.append("\t");
            }
            inputBuilder.append("subdir").append(i);
        }

        inputBuilder.append("\n");
        for (int j = 0; j <= 500; j++) {
            inputBuilder.append("\t");
        }
        inputBuilder.append("file.ext");

        String input10 = inputBuilder.toString();

        assertEquals(4902, solution.calculate(input10));
    }
}
