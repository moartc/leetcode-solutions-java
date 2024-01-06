package solutions.algorithms._10031_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum;

import java.util.Arrays;

class Solution {
    public int missingInteger(int[] nums) {

        int sum = 0;

        if (nums.length == 1) {
            return nums[0] + 1;
        }

        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1];

            // there is no sequence
            if (nums[i - 1] + 1 != nums[i]) {
                // increase by 1 if the sum == first element
                if (i == 1) {
                    sum++;
                }
                // sort rest to find a missing number
                Arrays.sort(nums, i, nums.length);
                while (i < nums.length) {
                    if (nums[i] == sum) {
                        // if number exists - increase
                        sum++;
                    }
                    i++;
                }
                return sum;
            }
        }
        // outside the array, need to add the last element
        return sum + nums[nums.length - 1];
    }
}