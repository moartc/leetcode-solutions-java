package solutions.algorithms._55_Jump_Game;

class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int jump = nums[0];
        if (l == 1) {
            return true;
        } else if (jump == 0) {
            return false;
        } else {
            for (int i = 1; i < l; i++) {
                jump--;
                if (i == l - 1) {
                    return true;
                } else if (nums[i] > jump) {
                    jump = nums[i];
                } else if (jump == 0) {
                    return false;
                }
            }
            return false;
        }
    }
}