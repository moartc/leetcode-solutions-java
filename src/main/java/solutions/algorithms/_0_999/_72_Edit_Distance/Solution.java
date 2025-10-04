package solutions.algorithms._0_999._72_Edit_Distance;

import java.util.Arrays;

class Solution {

    /*

    I could iterate through the longer word (if they're not equal)

    if both characters on the same index are different
     - I can insert it (if word2 is longer) or change it
     - I can delete it (if word2 is shorter) or change it
     update:
     Actually I should always check try to delete and insert (even when number of characters is the same)
    it beats ~95%
     */

    int[][] cache;

    public int minDistance(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        // I might go out of bound by 1
        cache = new int[w1.length + 1][w2.length + 1];

        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        return findSolution(w1, w2, 0, 0);
    }

    int findSolution(char[] w1, char[] w2, int idx1, int idx2) {

        if (cache[idx1][idx2] != -1) {
            return cache[idx1][idx2];
        }

        if (idx1 >= w1.length) {
            if (idx2 < w2.length) {
                return w2.length - idx2;
            } else {
                return 0;
            }
        } else if (idx2 >= w2.length) {
            return w1.length - idx1;
        } else {
            if (w1[idx1] == w2[idx2]) {
                cache[idx1][idx2] = findSolution(w1, w2, idx1 + 1, idx2 + 1);
            } else {
                int a1 = 1 + findSolution(w1, w2, idx1 + 1, idx2);
                int a2 = 1 + findSolution(w1, w2, idx1, idx2 + 1);
                // replace
                int a3 = 1 + findSolution(w1, w2, idx1 + 1, idx2 + 1);
                cache[idx1][idx2] = Math.min(Math.min(a1, a2), a3);
            }
            return cache[idx1][idx2];
        }
    }

}