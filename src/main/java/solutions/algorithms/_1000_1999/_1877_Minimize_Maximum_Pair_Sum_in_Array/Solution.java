package solutions.algorithms._1000_1999._1877_Minimize_Maximum_Pair_Sum_in_Array;

import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int max = -1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            max = Math.max(max, sum);
            l++;
            r--;
        }
        return max;
    }
}