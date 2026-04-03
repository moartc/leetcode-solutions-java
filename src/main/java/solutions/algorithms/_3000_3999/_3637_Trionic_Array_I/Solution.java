package solutions.algorithms._3000_3999._3637_Trionic_Array_I;

class Solution {
    public boolean isTrionic(int[] nums) {

        // 0 - incr, 1 decr, 2 - incr
        int mode = 0;
        boolean wasMode0 = false;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            if (prev == curr) {
                return false; // always false
            }
            if (mode == 0) {
                if (prev < curr) {
                    wasMode0 = true;
                } else {
                    mode++;
                }
            } else if (mode == 1) {
                if (!wasMode0) {
                    return false;
                }
                if (prev <= curr) {
                    mode++;
                }
            } else if (mode == 2) {
                if (prev >= curr) {
                    return false;
                }
            }
        }
        return mode == 2;
    }
}