package solutions.algorithms._1000_1999._1406_Stone_Game_III;

class Solution {

    /*
    I can iterate backwards and store the best possible outcome at position i.
    Then, if the value at 0 is >0, Alice wins, if it's <0, Bob wins. If it's 0 it's a tie.
     */
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        // I don't need to worry about going out of bounds with n+3
        int[] dp = new int[n + 3];

        for (int i = n - 1; i >= 0; i--) {
            int best = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = 0; j < 3 && i + j < n; j++) {
                sum += stoneValue[i + j];
                int bestFromThePositionOneAfterCurrent = dp[i + j + 1];
                best = Math.max(best, sum - bestFromThePositionOneAfterCurrent);
            }
            dp[i] = best;
        }

        if (dp[0] > 0) {
            return "Alice";
        } else if (dp[0] < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}