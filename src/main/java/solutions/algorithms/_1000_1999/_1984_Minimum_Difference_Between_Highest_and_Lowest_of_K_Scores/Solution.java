package solutions.algorithms._1000_1999._1984_Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores;

import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int minFound = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < nums.length; i++) {
            int first = nums[i];
            int last = nums[i + k - 1];
            int diff = last - first;
            minFound = Math.min(diff, minFound);
        }
        return minFound;
    }
}