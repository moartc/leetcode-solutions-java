package solutions.algorithms._0_999._97_Interleaving_String;

import java.util.Arrays;

class Solution {

    /*
    I could start with the solution, where I iterate through s3 char by char and I try to match the same character
    in s1 or s2.
    In the case when both of these strings have this character I can make a branch and recursively continue
     */
    // for caching
    // 1 - trie, 0 - false, -1 - unknown
    byte[][] cache;

    public boolean isInterleave(String s1, String s2, String s3) {

        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        cache = new byte[s1.length() + 1][s2.length() + 1];
        for (byte[] ints : cache) {
            Arrays.fill(ints, (byte) -1);
        }

        return interleaveOrNot(s1, s2, s3, 0, 0);
    }

    boolean interleaveOrNot(String s1, String s2, String s3, int i1, int i2) {

        if (i1 > s1.length() - 1 && i2 > s2.length() - 1) {
            // we checked all characters
            return true;
        }

        if (cache[i1][i2] != -1) {
            return cache[i1][i2] == 1;
        }

        if (i1 >= s1.length()) {
            int initI2 = i2;
            int i3 = i2 + i1;
            while (i2 < s2.length() && i3 < s3.length()) {
                char c2 = s2.charAt(i2);
                char c3 = s3.charAt(i3);
                if (c2 != c3) {
                    cache[i1][initI2] = 0;
                    return false;
                }
                i2++;
                i3++;
            }
            cache[i1][initI2] = 1;
            return true;
        }
        if (i2 >= s2.length()) {
            int initI1 = i1;
            int i3 = i2 + i1;
            while (i1 < s1.length() && i3 < s3.length()) {
                char c1 = s1.charAt(i1);
                char c3 = s3.charAt(i3);
                if (c1 != c3) {
                    cache[initI1][i2] = 0;
                    return false;
                }
                i1++;
                i3++;
            }
            cache[initI1][i2] = 1;
            return true;
        }
        char c1 = s1.charAt(i1);
        char c2 = s2.charAt(i2);
        char c3 = s3.charAt(i1 + i2);

        if (c1 == c3) {
            if (interleaveOrNot(s1, s2, s3, i1 + 1, i2)) {
                cache[i1][i2] = 1;
                return true;
            }
        }
        if (c2 == c3) {
            if (interleaveOrNot(s1, s2, s3, i1, i2 + 1)) {
                cache[i1][i2] = 1;
                return true;
            }
        }
        cache[i1][i2] = 0;
        return false;
    }

}