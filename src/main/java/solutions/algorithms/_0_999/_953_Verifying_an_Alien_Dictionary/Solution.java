package solutions.algorithms._0_999._953_Verifying_an_Alien_Dictionary;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    keep the char order in a set or another collection that allows constant access to its position.
    Then iterate over pairs of words and compare them char by char until they differ.
    Stop when the first is lower than the second, and return false if the second is lower
    or if all chars are equal, but the first word is longer.

     */
    public boolean isAlienSorted(String[] words, String order) {


        Map<Character, Integer> orderMap = new HashMap<>();

        int idx = 0;
        for (char c : order.toCharArray()) {
            orderMap.put(c, idx);
            idx++;
        }

        ex:
        for (int i = 0; i < words.length - 1; i++) {
            String f = words[i];
            String s = words[i + 1];

            int charI = 0;
            while (charI < f.length() || charI < s.length()) {
                if (charI < f.length() && charI < s.length()) {
                    char c1 = f.charAt(charI);
                    char c2 = s.charAt(charI);
                    if (c1 != c2) {
                        int c1Idx = orderMap.get(c1);
                        int c2Idx = orderMap.get(c2);
                        if (c1Idx < c2Idx) {
                            continue ex;
                        } else if (c1Idx > c2Idx) {
                            return false;
                        }
                    }
                } else if (charI < f.length()) {
                    return false;
                } else {
                    continue ex;
                }

                charI++;
            }
        }
        return true;
    }
}
