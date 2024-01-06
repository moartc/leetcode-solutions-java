package solutions.algorithms._0_999._896_Monotonic_Array;

class Solution {
    public boolean isMonotonic(int[] nums) {

        if (nums.length == 1) {
            return true;
        }
        boolean isSet = false;
        boolean isIncrease = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                if (isSet) {
                    if ((isIncrease && nums[i] < nums[i - 1]) || (!isIncrease && nums[i] > nums[i - 1])) {
                        return false;
                    }
                } else {
                    isSet = true;
                    isIncrease = nums[i] > nums[i - 1];
                }
            }
        }
        return true;
    }
}