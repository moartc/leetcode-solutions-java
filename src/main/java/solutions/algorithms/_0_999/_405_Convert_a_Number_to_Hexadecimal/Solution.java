package solutions.algorithms._0_999._405_Convert_a_Number_to_Hexadecimal;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        Map<Long, Character> mapping = new HashMap<>();
        mapping.put(0L, '0');
        mapping.put(1L, '1');
        mapping.put(2L, '2');
        mapping.put(3L, '3');
        mapping.put(4L, '4');
        mapping.put(5L, '5');
        mapping.put(6L, '6');
        mapping.put(7L, '7');
        mapping.put(8L, '8');
        mapping.put(9L, '9');
        mapping.put(10L, 'a');
        mapping.put(11L, 'b');
        mapping.put(12L, 'c');
        mapping.put(13L, 'd');
        mapping.put(14L, 'e');
        mapping.put(15L, 'f');

        long numToHandle = num;
        if (num < 0) {
            numToHandle = (long) (Math.pow(2, 32) + num);
        }

        StringBuilder sb = new StringBuilder();
        while (numToHandle != 0) {
            long r = numToHandle % 16;
            sb.append(mapping.get(r));
            numToHandle = numToHandle / 16;
        }
        return sb.reverse().toString();
    }
}