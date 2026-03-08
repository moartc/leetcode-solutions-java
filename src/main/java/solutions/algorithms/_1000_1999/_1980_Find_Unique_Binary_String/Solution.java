package solutions.algorithms._1000_1999._1980_Find_Unique_Binary_String;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /*

    convert it to int, iterate from 0 .. 2^n, find the one that is not in the array
    convert it to bin and return
     */
    public String findDifferentBinaryString(String[] nums) {


        Set<Integer> allInts = new HashSet<>();
        for (String num : nums) {
            allInts.add(binStringToInt(num));
        }
        for (int i = 0; i < (2 << nums.length); i++) {
            if (!allInts.contains(i)) {
                return intToBinString(i, nums.length);
            }
        }
        return "-1";
    }

    private String intToBinString(int i, int size) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            int res = i % 2;
            sb.append(res);
            i /= 2;
        }
        if (sb.length() < size) {
            int diff = size - sb.length();
            sb.append("0".repeat(Math.max(0, diff)));

        }
        return sb.reverse().toString();
    }

    int binStringToInt(String s) {
        int res = 0;
        int pow = 1;
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == '1') {
                res += pow;
            }
            pow <<= 1;
        }
        return res;
    }
}