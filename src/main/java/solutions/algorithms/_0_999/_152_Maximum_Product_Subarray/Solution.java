package solutions.algorithms._0_999._152_Maximum_Product_Subarray;

class Solution {

    /*
    If there is a zero, it splits the array
    if there is an even number of negative number, the result is still positive

    update:
    I saw a hint I should track min and max
     */
    public int maxProduct(int[] nums) {

        int globalMaxFound = nums[0];

        int maxSolution = nums[0];
        int minSolution = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            int multiplyWithMin = minSolution * val;
            int multiplyWithMax = maxSolution * val;

            maxSolution = Math.max(multiplyWithMax, multiplyWithMin);
            minSolution = Math.min(multiplyWithMax, multiplyWithMin);

            // and check and overwrite if needed with the current value
            if (maxSolution < val) {
                maxSolution = val;
            }
            if (minSolution > val) {
                minSolution = val;
            }
            // update global
            if (globalMaxFound < maxSolution) {
                globalMaxFound = maxSolution;
            }
        }
        return globalMaxFound;
    }
}