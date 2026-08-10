package solutions.algorithms._1000_1999._1510_Stone_Game_IV;

class Solution {
    /*
    1 -> 1
    2 -> 4
    3 -> 9
    4 -> 16
    -------
    results from a state x:
    1 -> win
    2 -> lose
    3 -> win
    4 -> win
    5 -> lose
    6 -> win
    7 -> win
    8 -> lose
    9 -> win
    10-> lose
     */
    public boolean winnerSquareGame(int n) {

        boolean[] dp = new boolean[n + 1];
        dp[0] = false;

        ex:
        for (int i = 1; i <= n; i++) {
            for (int k = (int) Math.sqrt(i); k >= 1; k--) {
                int idx = k * k;
                if (!dp[i - idx]) {
                    dp[i] = true;
                    continue ex;
                }
            }
            dp[i] = false;
        }
        return dp[n];
    }
}