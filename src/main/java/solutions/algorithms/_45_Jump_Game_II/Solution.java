package solutions.algorithms._45_Jump_Game_II;

class Solution {
    public int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }
        int i = 0;
        int jumps = 1;
        while (i + nums[i] < nums.length - 1) {
            i += getBest(nums, i);
            jumps++;
        }
        return jumps;
    }

    int getBest(int[] nums, int start) {
        int max = Integer.MIN_VALUE;
        int dec = 0;
        int toReturn = -1;
        for (int i = nums[start]; i > 0; i--) {
            if (i < nums.length) {
                int val = nums[start + i] - (dec++);
                dec++;
                if (val >= max) {
                    max = val;
                    toReturn = i;
                }
            }
        }
        return toReturn;
    }
}