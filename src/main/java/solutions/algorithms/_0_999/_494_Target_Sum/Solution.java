package solutions.algorithms._0_999._494_Target_Sum;

import java.util.Arrays;

class Solution {

    /*
    notes:
    at every step I can either set plus or minus, so I will start with recursive solution

    update: without any cache it beats 22.79%

    I am adding a cache - because of the constraint: 0 <= sum(nums[i]) <= 1000
    I will initialize one of its 2 dimensions to 2002 (I am not sure about '2' at the end though)
    to avoid negative indices, I will add 1000 to the current value.
    it beats 58%
    todo dp solution without recursion

     */

    int[][] cache;

    public int findTargetSumWays(int[] nums, int target) {

        cache = new int[nums.length][2002];
        for (int[] ints : cache) {
            Arrays.fill(ints, Integer.MIN_VALUE);
        }
        return rec(0, 0, target, nums);
    }

    int rec(int idx, int currentRes, int target, int[] nums) {

        if (idx == nums.length) {
            // one before last
            if (currentRes == target) {
                // found one solution
                return 1;
            } else {
                // no solution
                return 0;
            }
        }

        if (cache[idx][currentRes + 1000] != Integer.MIN_VALUE) {
            return cache[idx][currentRes + 1000];
        }

        int currentVal = nums[idx];
        int numOfSol = rec(idx + 1, currentRes + currentVal, target, nums);
        numOfSol += rec(idx + 1, currentRes - currentVal, target, nums);

        cache[idx][currentRes + 1000] = numOfSol;
        return numOfSol;
    }
}
