package com.leetcode.stringoperations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int findUsingLinearSearch(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndexToSearchAt = 0;
        int itemCount = 0;
        Map<String, Integer> ruleKeyToIndex = new HashMap<>();
        ruleKeyToIndex.put("type", 0);
        ruleKeyToIndex.put("color", 1);
        ruleKeyToIndex.put("name", 2);
        
        ruleIndexToSearchAt = ruleKeyToIndex.get(ruleKey);

        for (List<String> list : items) {

            if (ruleValue.equals(list.get(ruleIndexToSearchAt))) {
                itemCount++;
            }
        }

        return itemCount;
    }
}
