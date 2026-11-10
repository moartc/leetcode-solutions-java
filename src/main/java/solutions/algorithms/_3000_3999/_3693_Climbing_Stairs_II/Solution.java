package solutions.algorithms._3000_3999._3693_Climbing_Stairs_II;

class Solution {

    public int climbStairs(int n, int[] costs) {

        int[] bestArr = new int[n + 1];
        bestArr[n] = 0;
        for (int i = bestArr.length - 2; i >= 0; i--) {
            int bestStep = Integer.MAX_VALUE;
            for (int j = 1; j <= 3; j++) {
                if (i + j <= n) {
                    int costToStep = costs[i + j - 1] + j * j;
                    bestStep = Math.min(bestStep, costToStep + bestArr[i + j]);
                }
            }
            bestArr[i] = bestStep;
        }
        return bestArr[0];
    }
}