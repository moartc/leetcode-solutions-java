package solutions.algorithms._0_999._918_Maximum_Sum_Circular_Subarray;

class Solution {

    /*
    Something similar to my solution to problem 53 - Maximum Subarray + now "wrapping" to handle.
    I could use 2 pointers to track the beginning and the end of the current subarray.

    update (after 1.5h of trying): it's actually not easy to solve without a 'trick'.
    The trick is to loop again to find the minimum subarray and subtract it
    from the total sum.
    (if all nums are negative I still have to return the result from the regular max)
     */
    public int maxSubarraySumCircular(int[] nums) {

        int currentSubArraySum = nums[0];
        int maxFound = nums[0];

        boolean allNegative = nums[0] < 0;
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            if (val > 0) {
                allNegative = false;
            }
            if (currentSubArraySum + val > val) {
                currentSubArraySum += val;
            } else {
                currentSubArraySum = val;
            }
            maxFound = Math.max(currentSubArraySum, maxFound);
        }

        if (allNegative) {
            return maxFound;
        }

        // find minimum
        int currSum = nums[0];
        int minFound = nums[0];
        int totalSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            totalSum += val;
            if (currSum + val < val) {
                currSum += val;
            } else {
                currSum = val;
            }
            minFound = Math.min(minFound, currSum);
        }

        int maxFromTheSecondRun = totalSum - minFound;
        maxFound = Math.max(maxFromTheSecondRun, maxFound);
        return maxFound;
    }
}