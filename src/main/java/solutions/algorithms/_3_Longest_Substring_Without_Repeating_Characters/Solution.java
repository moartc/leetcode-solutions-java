package solutions.algorithms._3_Longest_Substring_Without_Repeating_Characters;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        if (length <= 1) {
            return length;
        }
        LinkedList<Character> c = new LinkedList<>();
        int max = 1;
        int j = 1;
        c.add(s.charAt(0));
        while (j < length) {
            if (c.contains(s.charAt(j))) {
                if (c.size() > max) {
                    max = c.size();
                }
                int index = c.indexOf(s.charAt(j));
                int ctr = 0;
                while (ctr <= index) {
                    c.remove(0);
                    ctr++;
                }
            }
            c.add(s.charAt(j));
            j++;
        }
        return Math.max(c.size(), max);
    }
}