package solutions._13_Roman_to_Integer;

import java.util.Map;

class Solution {
    Map<Character, Integer> symbolToValue = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        char[] reverseInput = new StringBuffer(s).reverse().toString().toCharArray();
        int result = 0;
        int lastReadValue = 0;

        for (char c : reverseInput) {
            int currentValue = symbolToValue.get(c);
            if (lastReadValue > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            lastReadValue = currentValue;
        }
        return result;
    }
}