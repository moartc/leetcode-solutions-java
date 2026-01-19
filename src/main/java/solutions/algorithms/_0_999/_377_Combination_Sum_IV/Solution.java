package solutions.algorithms._0_999._377_Combination_Sum_IV;

class Solution {

    /*
    At every step iterate through sorted array skipping duplications

    update: I need a cache, and it works without sorting, but it only beats  6.75%
    update: added dp solution
     */

    public int combinationSum4(int[] nums, int target) {

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}