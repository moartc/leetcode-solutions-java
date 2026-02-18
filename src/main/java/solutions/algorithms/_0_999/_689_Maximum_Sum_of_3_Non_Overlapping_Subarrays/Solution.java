package solutions.algorithms._0_999._689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

class Solution {
    /*
    I could iterate through the array once and in an additional array store the sums of subarrays
     of length k starting at each index
    I can do it in O(n)
    for example for [1,2,1,2,6,7,5,1] I have
    3, 3, 3, 8, 13, 12, 6
    then I can use simple dfs with caching (initially, then hopefully backtracking)

    DFS gives TLE, but instead of caching I could create a 2D array with 3 rows
    In each row (representing number of subarrays) at each index I store the current best possible sum and idx that gives me this sum
    for values 3, 3, 3, 8, 13, 12, 6:
    [3[0], 3[0], 3[0], x,  x, x,  x]
    [x, x, 6[0,2], 11[0,3]. 16[0,4], x, x]
    [x, x, x, x, 19[0,2,4] , 23[0,3,5], 23[0,3,5]]
    "x" means unreachable. I should use row above and precomputed sums from each index
     */
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {

        int[] sumsFromIdx = new int[nums.length - k + 1];

        int currSum = 0;
        for (int j = 0; j < k; j++) {
            currSum += nums[j];
        }
        sumsFromIdx[0] = currSum;
        int f = 0;
        int s = f + k - 1;
        while (s < nums.length - 1) {
            currSum -= nums[f];
            f++;
            s++;
            currSum += nums[s];
            sumsFromIdx[f] = currSum;
        }

        // last 4 - value plus up to 3 indices
        int[][][] dp = new int[3][sumsFromIdx.length][4];
        dp[0][0] = new int[]{sumsFromIdx[0], 0, -1, -1};
        for (int a = 1; a < sumsFromIdx.length - 2 * k; a++) {
            if (sumsFromIdx[a] > dp[0][a - 1][0]) {
                dp[0][a] = new int[]{sumsFromIdx[a], a, -1, -1};
            } else {
                dp[0][a] = dp[0][a - 1];
            }
        }
        for (int b = k; b < sumsFromIdx.length - k; b++) {
            int current = dp[0][b - k][0] + sumsFromIdx[b];
            if (b == k || current > dp[1][b - 1][0]) {
                dp[1][b] = new int[]{current, dp[0][b - k][1], b, -1};
            } else {
                dp[1][b] = dp[1][b - 1];
            }
        }
        for (int c = (2 * k); c < sumsFromIdx.length; c++) {
            int current = dp[1][c - k][0] + sumsFromIdx[c];
            if (c == 2 * k || current > dp[2][c - 1][0]) {
                dp[2][c] = new int[]{current, dp[1][c - k][1], dp[1][c - k][2], c};
            } else {
                dp[2][c] = dp[2][c - 1];
            }
        }
        int[] last = dp[2][sumsFromIdx.length - 1];
        return new int[]{last[1], last[2], last[3]};
    }
}