package solutions.algorithms._0_999._198_House_Robber;

class Solution {

    int max = -1;
    int[] maxes;

    public int rob(int[] nums) {

        maxes = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        robNext(nums, 0, nums[0]);
        robNext(nums, 1, nums[1]);
        return max;
    }

    void robNext(int[] all, int currentIndex, int currentSum) {
        maxes[currentIndex] = currentSum;
        if (currentSum > max) {
            max = currentSum;
        }
        if (currentIndex + 2 <= all.length - 1 && maxes[currentIndex + 2] < currentSum + all[currentIndex + 2]) {
            robNext(all, currentIndex + 2, currentSum + all[currentIndex + 2]);
        }
        if (currentIndex + 3 <= all.length - 1 && maxes[currentIndex + 3] < currentSum + all[currentIndex + 3]) {
            robNext(all, currentIndex + 3, currentSum + all[currentIndex + 3]);
        }
    }
}