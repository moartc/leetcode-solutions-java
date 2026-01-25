package solutions.algorithms._1000_1999._1140_Stone_Game_II;

import java.util.Arrays;

class Solution {
    /*
    Initially Alica can take stones from 2 piles
    if she takes 2, then M = max(1,2) and then Bob can take 2M = 4
    if she takes 1, then M = max(1,1) and then Bob can take 2M = 2

    so it's again something like 2D array with ranges, similar to Stone Game III problem I solved
    2D array represents piles x all possible M states (even these unreachable)

    update: I don't know how to solve it without recursion
    update: map for cache replaced by a 2d array

    update: another attempt to solve it without recursion - done, but it's not even faster
     */
    int[] suffix;
    int[][] cache;
    int[][] dp;

    public int stoneGameII(int[] piles) {

        int n = piles.length;
        // 2nd dim n+1 - I ignore value 0, I can take between 1 and (theoretically) all piles

        suffix = new int[n + 1];
        suffix[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = piles[i] + suffix[i + 1];
        }

        cache = new int[n][n + 1];
        for (int[] ints : cache) {
            Arrays.fill(ints, Integer.MIN_VALUE);
        }
        int recSol = recursiveSolution(0, 1, piles);
        int noRec = noRec(piles);
        return recSol;
    }

    int noRec(int[] piles) {

        int n = piles.length;
        dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int m = 1; m <= n; m++) { // all possible limits from the past (actually future since I am going backwards)
                int myBest = 0;
                for (int taken = 1; taken <= 2 * m && i + taken <= n; taken++) {
                    myBest = Math.max(myBest, suffix[i] - dp[i + taken][Math.max(m, taken)]);
                }
                dp[i][m] = myBest;
            }

        }
        return dp[0][1];
    }

    int recursiveSolution(int currentIdx, int maxM, int[] piles) {

        if (currentIdx == piles.length) {
            return 0;
        }
        if (cache[currentIdx][maxM] != Integer.MIN_VALUE) {
            return cache[currentIdx][maxM];
        }
        int bestRes = Integer.MIN_VALUE;
        // the best result is what I can get from here minus the best from the next position where my opponent starts
        for (int m = 1; m <= 2 * maxM && currentIdx + m <= piles.length; m++) {
            int finalFromThisPoint = suffix[currentIdx] - recursiveSolution(currentIdx + m, Math.max(maxM, m), piles);
            bestRes = Math.max(bestRes, finalFromThisPoint);
        }
        cache[currentIdx][maxM] = bestRes;
        return bestRes;
    }


}