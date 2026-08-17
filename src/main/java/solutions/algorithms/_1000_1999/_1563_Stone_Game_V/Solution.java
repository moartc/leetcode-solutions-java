package solutions.algorithms._1000_1999._1563_Stone_Game_V;

import java.util.Arrays;

class Solution {

    int[][] mem;

    public int stoneGameV(int[] stoneValue) {

        int[] leftSum = new int[stoneValue.length];
        for (int i = 0; i < stoneValue.length; i++) {
            int prev = i > 0 ? leftSum[i - 1] : 0;
            leftSum[i] = prev + stoneValue[i];
        }

        mem = new int[stoneValue.length][stoneValue.length];
        for (int[] ints : this.mem) {
            Arrays.fill(ints, -1);
        }

        return oneGame(0, stoneValue.length - 1, leftSum);
    }

    int oneGame(int l, int r, int[] leftSum) {

        if (l == r) {
            return 0;
        }

        if (mem[l][r] != -1) {
            return mem[l][r];
        }
        int bestPossible = -1;
        for (int i = l; i < r; i++) {
            int preLeft = l > 0 ? leftSum[l - 1] : 0;
            int leftPart = leftSum[i] - preLeft;
            int rightPart = leftSum[r] - leftSum[i];

            int res = 0;
            if (leftPart > rightPart) {
                res += rightPart;
                res += oneGame(i + 1, r, leftSum);
            } else if (rightPart > leftPart) {
                res += leftPart;
                res += oneGame(l, i, leftSum);
            } else {
                int r1 = leftPart + oneGame(l, i, leftSum);
                int r2 = rightPart + oneGame(i + 1, r, leftSum);
                res = Math.max(r1, r2);
            }
            bestPossible = Math.max(bestPossible, res);
        }
        mem[l][r] = bestPossible;
        return mem[l][r];
    }
}