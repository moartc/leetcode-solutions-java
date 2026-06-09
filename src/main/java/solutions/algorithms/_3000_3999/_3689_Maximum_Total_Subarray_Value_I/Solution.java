package solutions.algorithms._3000_3999._3689_Maximum_Total_Subarray_Value_I;

class Solution {

    /*
    I don't know why I would choose anything else after finding the best subarray
    so, just find one - search for the max and min values
    then max - min gives some value, and the result is this value multiplied by k
    */
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        long res = max - min;
        return res * k;
    }
}