package solutions.algorithms._0_999._198_House_Robber;

import java.util.Arrays;

class Solution {

    /*
    It looks like I should either start at 0 or 1 and then skip 1 (go to the (i+2)th) or 2 (go to the (i+3)th)
     */

    // cache with the higher amount of money I can rob starting from the ith house
    int cache[];

    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        cache = new int[nums.length + 1];
        Arrays.fill(cache, -1);
        solve(0, nums);
        solve(1, nums);

        return Math.max(cache[0], cache[1]);
    }

    private int solve(int i, int[] nums) {

        if (i == nums.length - 2 || i == nums.length - 1) {
            if (cache[i] == -1) {
                cache[i] = nums[i];
            }
        } else if (i == nums.length - 3) { // from here I can only jump to the last one
            if (cache[i] == -1) {
                int current = nums[i];
                cache[i] = current + solve(i + 2, nums);
                ;
            }
        } else {
            if (cache[i] == -1) {
                int current = nums[i];
                int max = current + Math.max(solve(i + 2, nums), solve(i + 3, nums));
                cache[i] = max;
            }
        }
        return cache[i];
    }
}