package solutions.algorithms._0_999._13_Roman_to_Integer;

import java.util.Map;

class Solution {

    /*
    first create a char to int map
    then go through the string, for special characters / cases like
    IV, IX, XL, XC, CD and CM I can create special handling
    then just sum the values and jump to the next char
     */
    public int romanToInt(String s) {

        Map<Character, Integer> m = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int v1 = m.get(c);
            if (i < s.length() - 1) {
                // if there is something later
                char c2 = s.charAt(i + 1);
                int v2 = m.get(c2);
                if(v1 < v2) {
                    result -= v1;
                    continue;
                }
            }
            result += v1;
        }
        return result;
    }
}