package solutions.algorithms._0_999._213_House_Robber_II;

import java.util.Arrays;

class Solution {

    /*
    If it's a circle, then I have an even or odd number of houses
    1. even

        o
     o     o
     o     o
        o

    2. odd

        o
     o     o
       o o

    It doesn't change much compared to "198. House Robber".
    But, if I start with the first one I cannot rob the last one

    So still I have to skip at least one, and it makes sense to skip either exactly 1 or 2
     */

    int[] cache;

    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        cache = new int[nums.length];
        Arrays.fill(cache, -1);
        // can go to the one before last
        solve(0, nums, nums.length - 2);
        int firstSol = cache[0];
        Arrays.fill(cache, -1);
        solve(1, nums, nums.length - 1);
        int secondSol = cache[1];
        return Math.max(firstSol, secondSol);
    }

    private int solve(int i, int[] nums, int lastAccessible) {

        if (i > lastAccessible) {
            return 0;
        } else {
            if (cache[i] == -1) {
                // skip and go to the next one
                int p1 = Math.max(solve(i + 1, nums, lastAccessible), solve(i + 2, nums, lastAccessible));
                // rob the current one, and go to the (i+2)th
                int p2 = nums[i] + Math.max(solve(i + 2, nums, lastAccessible), solve(i + 3, nums, lastAccessible));

                cache[i] = Math.max(p1, p2);
            }
        }
        return cache[i];
    }
}