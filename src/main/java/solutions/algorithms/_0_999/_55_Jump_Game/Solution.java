package solutions.algorithms._0_999._55_Jump_Game;

class Solution {

    /*
    I can start from the first one, track the current "reach" and update it while visiting the next indices
     */

    public boolean canJump(int[] nums) {

        if (nums.length == 1) {
            return true;
        }
        int reach = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (reach == 0) {
                // I can't get to this point
                return false;
            }
            reach--;
            if (nums[i] > reach) {
                reach = nums[i];
            }
            if (i == nums.length - 1) {
                return true;
            }
        }
        return false;
    }

}