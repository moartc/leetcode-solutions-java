package solutions.algorithms._0_999._312_Burst_Balloons;

import java.util.Arrays;

class Solution {

    /*
    I found a hint that I could think about the last balloon to burst.
     */
    int[][] cache;

    public int maxCoins(int[] nums) {

        int[] newNums = new int[nums.length + 2];
        newNums[0] = 1;
        newNums[newNums.length - 1] = 1;
        System.arraycopy(nums, 0, newNums, 1, nums.length);
        cache = new int[nums.length + 1][nums.length + 1];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        // padding included
        return solve(1, newNums.length - 2, newNums);
    }

    int solve(int leftIdx, int rightIdx, int[] nums) {

        if (leftIdx > rightIdx) {
            return 0;
        }

        if (cache[leftIdx][rightIdx] != -1) {
            return cache[leftIdx][rightIdx];
        }

        if (leftIdx == rightIdx) {
            // there are no more balloons
            cache[leftIdx][rightIdx] = nums[leftIdx - 1] * nums[leftIdx] * nums[leftIdx + 1];
            return cache[leftIdx][rightIdx];
        } else {

            int bestFound = 0;
            for (int i = leftIdx; i <= rightIdx; i++) {
                int leftResult = solve(leftIdx, i - 1, nums);
                int rightResult = solve(i + 1, rightIdx, nums);
                int lastBalloonResult = nums[leftIdx - 1] * nums[i] * nums[rightIdx + 1];
                int total = leftResult + rightResult + lastBalloonResult;
                if (total > bestFound) {
                    bestFound = total;
                }
            }
            cache[leftIdx][rightIdx] = bestFound;
            return bestFound;
        }
    }
}