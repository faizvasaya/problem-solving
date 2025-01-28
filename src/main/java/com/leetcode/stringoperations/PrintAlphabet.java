package com.leetcode.stringoperations;

public class PrintAlphabet {

    /**
     * This approach is not good because every time a new character is
     * concatenated a new object of string is created which wastes a lot of
     * memory due to dereferenced objects.
     *
     * @return series of alphabets created using string concatenation.
     */
    public String printUsingStringConcatenation() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        return series;
    }

    /**
     * This approach is good because every time a new character is added, it
     * does not create a new object instead appends to the existing object.
     *
     * @return series of alphabets created using string builder.
     */
    public String printUsingStringBuilder() {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch);
        }
        return series.toString();
    }

    public void otherMethods() {
        String name = "Faizal";
        System.out.println(name.indexOf('a'));
    }
}
