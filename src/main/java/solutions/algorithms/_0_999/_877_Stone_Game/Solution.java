package solutions.algorithms._0_999._877_Stone_Game;

class Solution {
    /*
    The simplest recursive solution will probably TLE since this is a DP problem.
    It's 2^n, where n is the number of piles.

    Ok, so basically Alica can always take either all even or all odd indices
    the sum of elements in one of those sets is greater than the other, so since Alice plays optimally
    she can pick that set and always win.

    I could return here true, but I will implement it anyway.
    rec even with cache gives me TLE
    I could implement something like I did in Stone Game III

    I have an array stone x stone
    I iterate as length from 2 to stones array length
    in a loop I should set [i][j] = max from 2, when I choose left(i) or right(j)
    if, for i, j, I choose
    i, my result is dp[i][i] - dp[i+1][j]
    j, my result is dp[j][j] - dp[i][j-1]
    I should take max from these 2

    */
    public boolean stoneGame(int[] piles) {

        // return true; <- that's also a valid solution

        int[][] dp = new int[piles.length][piles.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = piles[i];
        }

        for (int range = 2; range <= piles.length; range++) {
            for (int i = 0; i + range - 1 < piles.length; i++) {
                int j = i + range - 1;
                int leftChoice = dp[i][i] - dp[i + 1][j];
                int rightChoice = dp[j][j] - dp[i][j - 1];
                dp[i][j] = Math.max(leftChoice, rightChoice);
            }
        }
        return dp[0][piles.length - 1] > 0;
    }

}