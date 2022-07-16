package solutions.algorithms._213_House_Robber_II;

class Solution {

    int max = Integer.MIN_VALUE;

    public int rob(int[] nums) {

        rob(nums, nums[0], 0, true, new int[nums.length]);
        int[] maxes2 = new int[nums.length];
        if (nums.length > 1) {
            rob(nums, nums[1], 1, false, maxes2);
        }
        if (nums.length > 2) {
            rob(nums, nums[2], 2, false, maxes2);
        }
        return max;
    }

    void rob(int[] nums, int currentRobbed, int currentIndex, boolean withFirst, int[] maxes) {
        if (currentRobbed > max) {
            max = currentRobbed;
        }
        if (maxes[currentIndex] >= currentRobbed) {
            return;
        } else if (maxes[currentIndex] < currentRobbed) {
            maxes[currentIndex] = currentRobbed;
        }
        int last = withFirst ? nums.length - 1 : nums.length;
        if (currentIndex + 2 < last) {
            rob(nums, currentRobbed + nums[currentIndex + 2], currentIndex + 2, withFirst, maxes);
        }
        if (currentIndex + 3 < last) {
            rob(nums, currentRobbed + nums[currentIndex + 3], currentIndex + 3, withFirst, maxes);
        }
    }
}