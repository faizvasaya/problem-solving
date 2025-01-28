package com.leetcode.stringoperations;

public class DefangingIPAddress {

    public String defang(String ipAddress) {
        return ipAddress.replace(".", "[.]");
    }

    public String defangManuallyUsingStringBuilder(String ipAddress) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < ipAddress.length(); index++) {
            char character = ipAddress.charAt(index);
            if (character == '.') {
                result.append("[.]");
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
