package solutions.algorithms._0_999._45_Jump_Game_II;

class Solution {

    /*
    notes:
    I could only find a DP solution which is (On^2)

    I saw a small hint and I will try a different solution by keeping track of the maximum reach
     */

    public int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int currentJumps = 1;
        int currentReach = nums[0];
        int nextMaxReach = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {

            if (i == nums.length - 1) {
                return currentJumps;
            }
            currentReach--;

            int length = nums[i];
            if (length > nextMaxReach) {
                nextMaxReach = length;
            }
            if (currentReach == 0) {
                currentJumps++;
                currentReach = nextMaxReach;
                nextMaxReach = Integer.MIN_VALUE;
            } else {
                nextMaxReach--;
            }
        }
        return currentJumps;
    }
}
