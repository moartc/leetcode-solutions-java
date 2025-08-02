package solutions.algorithms._0_999._3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {


        if (s.isEmpty()) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        // length is >= 2
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = 1;

        set.add(charArray[0]);

        int longestFound = 1;

        while (j < charArray.length) {

            // get the next possible element
            char next = charArray[j];
            if (set.contains(next)) {
                // it's already added
                // remove one pointed by i and retry
                char beginningChar = charArray[i];
                set.remove(beginningChar);
                i++;
            } else {
                set.add(next);
                j++;
                longestFound = Math.max(longestFound, set.size());
            }
        }
        return longestFound;
    }

    // a b c d b e f g h i j k l
}