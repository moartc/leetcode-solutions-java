package solutions.algorithms._0_999._53_Maximum_Subarray;

class Solution {
    public int maxSubArray(int[] nums) {


        if (nums.length == 1) {
            return nums[0];
        }
        int i = 1;
        int currentSum = nums[0];
        int bestFound = currentSum;
        while (i < nums.length) {
            int iV = nums[i];
            if (iV > currentSum + iV) {
                // add a single value
                currentSum = iV;
            } else {
                // increase the current sum
                currentSum += iV;
            }
            if (bestFound < currentSum) {
                bestFound = currentSum;
            }
            i++;
        }
        return bestFound;
    }
}