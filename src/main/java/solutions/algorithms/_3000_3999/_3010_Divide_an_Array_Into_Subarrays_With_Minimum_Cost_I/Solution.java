package solutions.algorithms._3000_3999._3010_Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I;

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] nums) {

     int f = nums[0];

        Arrays.sort(nums, 1, nums.length);

        int s = nums[1];
        int t = nums[2];

        return f + s + t;
    }
}