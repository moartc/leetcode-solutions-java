package solutions.algorithms._0_999._10_Regular_Expression_Matching;

import java.util.Arrays;

class Solution {

    /*
    Since it's a DP problem then I am starting with 2D array.
    update:
    I'm trying a recursive solution with some caching, because I don't know how to solve it with DP
    it actually beats 100% xD
    todo cleanup / fix / find a better solution
     */

    int[][] cache;

    public boolean isMatch(String s, String p) {

        char[] pArray = p.toCharArray();
        char[] sArray = s.toCharArray();

        // -1 - unset, 0 - false, 1 - true
        cache = new int[sArray.length + 1][pArray.length + 1];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        return rec(0, 0, sArray, pArray);
    }

    boolean rec(int i, int j, char[] sArr, char[] pArr) {

        if (cache[i][j] != -1) {
            return cache[i][j] == 1;
        }

        if (i == sArr.length && j == pArr.length) {
            return true;
        }
        if (j >= pArr.length) {
            return false;
        }
        if (i == sArr.length) {
            // string is behind, if it's something with '*' in the pattern then I can skip it
            if (j < pArr.length - 1 && pArr[j + 1] == '*') {
                return rec(i, j + 2, sArr, pArr);
            } else {
                return false;
            }
        }
        char patternChar = pArr[j];
        char stringChar = sArr[i];
//        System.out.println("match char = " + stringChar + ", with patter = " + patternChar);
        if (patternChar == '.' || stringChar == patternChar) {
            // I can check the next one
            boolean answer;
            if (j < pArr.length - 1 && pArr[j + 1] == '*') {
                // skip it completely
                answer = rec(i, j + 2, sArr, pArr);
                // match it once
                answer |= rec(i + 1, j + 2, sArr, pArr);
                // use it
                answer |= rec(i + 1, j, sArr, pArr);
            } else {
                // match . only once
                answer = rec(i + 1, j + 1, sArr, pArr);
            }
            cache[i][j] = answer ? 1 : 0;
            return answer;
        } else {
            // string doesn't match
            if (j < pArr.length - 1 && pArr[j + 1] == '*') {
                // match it once
                boolean answer = rec(i, j + 2, sArr, pArr);
                cache[i][j] = answer ? 1 : 0;
                return answer;
            } else {
                cache[i][j] = 0;
                return false;
            }
        }
    }

}