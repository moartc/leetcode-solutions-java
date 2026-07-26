package solutions.algorithms._0_999._628_Maximum_Product_of_Three_Numbers;

import java.util.Arrays;

class Solution {

    /*
    sort
    then, I can either use 3 max positive values
    or 2 min negative (they give a positive numb) and the highest positive
     */
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int lastIdx = nums.length - 1;
        int first = nums[0] * nums[1] * nums[lastIdx];
        int second = nums[lastIdx] * nums[lastIdx - 1] * nums[lastIdx - 2];
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}