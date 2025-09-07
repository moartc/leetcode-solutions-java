package solutions.algorithms._0_999._91_Decode_Ways;

import java.util.Arrays;

class Solution {


    /*
    Valid numbers are 1 .. 26

    1 1 2 2
    1 1 22
    1 12 2
    11 2 2
    11 22
     */
    int[] cache;

    public int numDecodings(String s) {

        char[] charArray = s.toCharArray();
        cache = new int[charArray.length];
        Arrays.fill(cache, -1);
        return count(0, charArray);
    }

    int count(int idx, char[] charArray) {

        if (idx == charArray.length) {
            return 1;
        }

        if (cache[idx] != -1) {
            return cache[idx];
        }

        int c = charArray[idx] - 48;
        int sum = 0;
        // 1 char
        if (c != 0) {
            sum += count(idx + 1, charArray);
        }
        // 2 char
        if (c == 1) {
            if (idx < charArray.length - 1) {
                // char doesn't matter
                sum += count(idx + 2, charArray);
            }
        } else if (c == 2) {
            if (idx < charArray.length - 1) {
                int c2 = charArray[idx + 1] - 48;
                if (c2 >= 0 && c2 <= 6) {
                    sum += count(idx + 2, charArray);
                }
            }
        }
        cache[idx] = sum;
        return sum;
    }
}