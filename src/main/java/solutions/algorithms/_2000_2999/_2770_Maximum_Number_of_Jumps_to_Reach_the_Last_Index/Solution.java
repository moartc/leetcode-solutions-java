package solutions.algorithms._2000_2999._2770_Maximum_Number_of_Jumps_to_Reach_the_Last_Index;

import java.util.Arrays;

class Solution {

    int[] cache;

    public int maximumJumps(int[] nums, int target) {

        cache = new int[nums.length];
        Arrays.fill(cache, -1);
        int answer = getNumberOfJumps(0, nums, target);
        if (answer == Integer.MIN_VALUE) {
            return -1;
        } else {
            return answer;
        }
    }

    int getNumberOfJumps(int i, int[] nums, int target) {

        if (i == nums.length - 1) {
            return 0;
        }

        if (cache[i] != -1) {
            return cache[i];
        }
        int best = Integer.MIN_VALUE;
        for (int j = i + 1; j < nums.length; j++) {
            if (-target <= nums[j] - nums[i] && nums[j] - nums[i] <= target) {
                best = Math.max(best, getNumberOfJumps(j, nums, target));
            }
        }
        if (best == Integer.MIN_VALUE) {
            cache[i] = best;
        } else {
            cache[i] = 1 + best;
        }
        return cache[i];
    }
}