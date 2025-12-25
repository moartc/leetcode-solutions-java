package solutions.algorithms._2000_2999._2707_Extra_Characters_in_a_String;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    Check at each character if there is a string in dictionary which is a prefix for the current
    substring. If so, skip it and continue with the further part. If not, skip one character and
    call the method for the next one.
     */

    Map<Integer, Integer> cache;

    public int minExtraChar(String s, String[] dictionary) {

        cache = new HashMap<>();
        return countMin(s, 0, dictionary);
    }

    private int countMin(String s, int startingIndex, String[] dictionary) {

        if (startingIndex >= s.length()) {
            return 0;
        }

        if (cache.containsKey(startingIndex)) {
            return cache.get(startingIndex);
        }


        int best = s.length() - startingIndex;
        for (String str : dictionary) {
            if (s.startsWith(str, startingIndex)) {
                best = Math.min(best, countMin(s, startingIndex + str.length(), dictionary));
            }
        }
        best = Math.min(best, 1 + countMin(s, startingIndex + 1, dictionary));
        cache.put(startingIndex, best);
        return best;
    }
}