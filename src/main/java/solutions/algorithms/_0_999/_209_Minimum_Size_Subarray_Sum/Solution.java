package solutions.algorithms._0_999._209_Minimum_Size_Subarray_Sum;

class Solution {

    /*
    Start from the same index. If the total (initially the value at index 0) is lower than the
    target, move the right pointer forward and add the next value to the current sum.
    If the current sum is greater than the target, check if the current length is smaller than the previously found one.
    Then move the left pointer to decrease the sum. If it's below the target, move the right pointer
    if it's above, move the left one.
     */
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int r = 0;
        int bestFound = Integer.MAX_VALUE;
        int currentSum = nums[0];
        while (l <= r) {

            if (currentSum >= target) {
                // new best
                int currLength = r - l + 1;
                if (currLength < bestFound) {
                    bestFound = currLength;
                }
                // decrease the sum
                currentSum -= nums[l];
                l++;
            } else if (r < nums.length - 1) {
                r++;
                currentSum += nums[r];
            } else { // right is already at the last index
                break;
            }
        }
        if (bestFound == Integer.MAX_VALUE) {
            // not found
            return 0;
        } else {
            return bestFound;
        }
    }
}