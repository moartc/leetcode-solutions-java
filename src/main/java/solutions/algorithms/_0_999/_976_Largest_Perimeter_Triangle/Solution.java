package solutions.algorithms._0_999._976_Largest_Perimeter_Triangle;

import java.util.Arrays;

class Solution {

    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];

            if (a + b > c && a + c > b && b + c > a) {
                return a + b + c;
            }
        }
        return 0;
    }
}