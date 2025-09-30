package solutions.algorithms._0_999._115_Distinct_Subsequences;

import java.util.Arrays;

class Solution {

    /*
    Recursive solution: at each step:
    1. if the current char from s equals the current char from t
       - take the current char and move both pointers, or
       - skip the char and move the pointer in s
    2. if the chars are not equal,  move the pointer in s

    it beats 41%

     */

    int[][] cache;

    public int numDistinct(String s, String t) {
        cache = new int[s.length()][t.length()];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        return numbOfSub(0, s.toCharArray(), 0, t.toCharArray());
    }

    int numbOfSub(int is, char[] s, int it, char[] t) {

        if (is >= s.length || it >= t.length) {
            return 0;
        }
        if (cache[is][it] != -1) {
            return cache[is][it];
        }
        int numb = 0;

        if (it == t.length - 1 && s[is] == t[it]) {
            numb = 1;
        }
        //
        char cs = s[is];
        char ct = t[it];
        if (cs == ct) {
            numb += numbOfSub(is + 1, s, it + 1, t);
        }
        numb += numbOfSub(is + 1, s, it, t);
        cache[is][it] = numb;
        return numb;
    }

}