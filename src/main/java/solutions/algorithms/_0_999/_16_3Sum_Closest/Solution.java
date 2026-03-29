package solutions.algorithms._0_999._16_3Sum_Closest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestDiff = Integer.MAX_VALUE;
        int bestAnswer = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int mainV = nums[i];
            while (left < right) {
                int lV = nums[left];
                int rV = nums[right];
                int totalSum = mainV + lV + rV;
                int targetDiff = Math.abs(totalSum - target);
                if (targetDiff < bestDiff) {
                    bestDiff = targetDiff;
                    bestAnswer = totalSum;
                }
                if (totalSum == target) {
                    return totalSum;
                } else if (totalSum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return bestAnswer;
    }

}