package solutions.algorithms._1000_1999._1464_Maximum_Product_of_Two_Elements_in_an_Array;

import java.util.Arrays;

class Solution {

    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        int l = (nums[0] - 1) * (nums[1] - 1);
        int h = (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        return Math.max(l, h);
    }
}