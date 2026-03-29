package solutions.algorithms._1000_1999._1480_Running_Sum_of_1d_Array;

class Solution {
    public int[] runningSum(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            nums[i] = current;
        }
        return nums;
    }
}