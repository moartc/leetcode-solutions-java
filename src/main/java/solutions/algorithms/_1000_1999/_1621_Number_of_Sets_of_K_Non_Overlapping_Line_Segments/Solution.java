package solutions.algorithms._1000_1999._1621_Number_of_Sets_of_K_Non_Overlapping_Line_Segments;

import java.util.Arrays;

class Solution {
    long[][] dp;
    long[][] sumCache;

    int MOD = 1000000000 + 7;

    public int numberOfSets(int n, int k) {


        dp = new long[n + 1][k + 1];
        sumCache = new long[n + 1][k + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
            Arrays.fill(sumCache[i], -1);
        }

        return (int) rec(0, k, n);
    }

    long rec(int currIndex, int stillToFind, int n) {
        if (dp[currIndex][stillToFind] != -1) {
            return dp[currIndex][stillToFind];
        }
        if (stillToFind == 0) {
            return 1;
        }
        if (currIndex >= n) {
            return 0;
        } else {
            // can pause from here and I still have the same number to find
            long r1 = rec(currIndex + 1, stillToFind, n) % MOD;

            // can set 1 and have -1 to find
            long r2 = sumRec(currIndex + 1, stillToFind - 1, n) % MOD;

            dp[currIndex][stillToFind] = (r1 + r2) % MOD;
            return dp[currIndex][stillToFind] % MOD;
        }
    }

    // weird caching for sum, without it TLE
    long sumRec(int i, int stillToFind, int n) {
        if (i >= n) {
            return 0;
        }
        if (sumCache[i][stillToFind] != -1) {
            return sumCache[i][stillToFind] % MOD;
        }
        sumCache[i][stillToFind] = rec(i, stillToFind, n) + sumRec(i + 1, stillToFind, n) % MOD;
        return sumCache[i][stillToFind];
    }
}