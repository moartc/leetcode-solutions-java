package solutions.algorithms._0_999._486_Predict_the_Winner;

import java.util.Arrays;

class Solution {

    // accepted even without caching - beats ~29%, with caching 100%
    int[][] cache;

    public boolean predictTheWinner(int[] nums) {
        cache = new int[nums.length][nums.length];
        for (int[] ints : cache) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        int score = scoreDiff(0, nums.length - 1, nums);
        return score >= 0;
    }

    int scoreDiff(int leftIdx, int rightIdx, int[] nums) {
        if (leftIdx > rightIdx) {
            return 0;
        } else if (leftIdx == rightIdx) {
            return nums[leftIdx];
        } else {
            if (cache[leftIdx][rightIdx] != Integer.MAX_VALUE) {
                return cache[leftIdx][rightIdx];
            }
            int opponent1 = scoreDiff(leftIdx + 1, rightIdx, nums);
            int left = nums[leftIdx] - opponent1;

            int opponent2 = scoreDiff(leftIdx, rightIdx - 1, nums);
            int right = nums[rightIdx] - opponent2;
            int res = Math.max(left, right);
            cache[leftIdx][rightIdx] = res;
            return cache[leftIdx][rightIdx];
        }
    }
}