package solutions.algorithms._1000_1999._1262_Greatest_Sum_Divisible_by_Three;

import java.util.Arrays;

class Solution {

    int[][] dp;

    public int maxSumDivThree(int[] nums) {
        dp = new int[nums.length + 1][3];
        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return solve(0, 0, nums);
    }

    int solve(int idx, int sum, int[] nums) {
        if (idx == nums.length) {
            if (sum == 0) {
                return 0;
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if (dp[idx][sum] != -1) {
                return dp[idx][sum];
            }
            // skip
            int skip = solve(idx + 1, sum, nums);
            // take
            int take = solve(idx + 1, (nums[idx] + sum) % 3, nums);
            take = take == Integer.MIN_VALUE ? Integer.MIN_VALUE : nums[idx] + take;
            dp[idx][sum] = Math.max(skip, take);
            return dp[idx][sum];
        }
    }
}