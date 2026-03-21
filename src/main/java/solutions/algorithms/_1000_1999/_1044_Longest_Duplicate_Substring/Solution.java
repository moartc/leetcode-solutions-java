package solutions.algorithms._1000_1999._1044_Longest_Duplicate_Substring;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String longestDupSubstring(String s) {

        // bin search and initial code extracted to a separate method
        int left = 1;
        int right = s.length() - 1;
        String bestFound = "";
        while (left <= right) {
            int mid = (left + right) / 2;
            String dup = getDupForSize(s, mid);
            if (dup == null) { // search short
                right = mid - 1;
            } else { // search for a longer
                bestFound = dup;
                left = mid + 1;
            }
        }
        return bestFound;
    }

    String getDupForSize(String s, int size) {
        long hash = 0;
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            hash = hash * 31 + (c - 'a' + 1);

        }
        Set<Long> allHashes = new HashSet<>();
        allHashes.add(hash);
        // check all other hashes
        long pow = 1;
        for (int i = 1; i < size; i++) {
            pow *= 31;
        }
        for (int i = 1; i + size - 1 < s.length(); i++) {
            int prevChar = s.charAt(i - 1) - 'a' + 1;
            int cIdxNext = s.charAt(i + size - 1) - 'a' + 1;
            hash = (hash - prevChar * pow) * 31 + cIdxNext;
            if (!allHashes.add(hash)) {
                // verify actual match
                String substring = s.substring(i, i + size);
                if (s.indexOf(substring) < i) {
                    // check if it's really substring or a hash collision
                    return substring;
                }
            }
        }
        return null;
    }

}