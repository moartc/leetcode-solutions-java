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
    todo maybe try to solve it without recursion
     */
    int[] suffix;
    int[][] cache;

    public int stoneGameII(int[] piles) {

        int n = piles.length;
        // 2nd dim n+1 - I ignore value 0, I can take between 1 and (theoretically) all piles

        suffix = new int[n + 1];
        suffix[n - 1] = piles[n - 1];
        suffix[n] = 0;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = piles[i] + suffix[i + 1];
        }

        cache = new int[n][n + 1];
        for (int[] ints : cache) {
            Arrays.fill(ints, Integer.MIN_VALUE);
        }
        return foo(0, 1, piles);
    }

    int foo(int currentIdx, int maxM, int[] piles) {

        if (currentIdx == piles.length) {
            return 0;
        }
        if (cache[currentIdx][maxM] != Integer.MIN_VALUE) {
            return cache[currentIdx][maxM];
        }
        int bestRes = Integer.MIN_VALUE;
        // the best result is what I can get from here minus the best from the next position where my opponent starts
        for (int m = 1; m <= 2 * maxM && currentIdx + m <= piles.length; m++) {
            int finalFromThisPoint = suffix[currentIdx] - foo(currentIdx + m, Math.max(maxM, m), piles);
            bestRes = Math.max(bestRes, finalFromThisPoint);
        }
        cache[currentIdx][maxM] = bestRes;
        return bestRes;
    }
}