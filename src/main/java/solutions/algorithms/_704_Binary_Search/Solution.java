package solutions.algorithms._704_Binary_Search;

class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {
        int middleIndex = (end + start) / 2;
        int val = nums[middleIndex];
        if (val == target) {
            return middleIndex;
        } else if (start == end) {
            return -1;
        } else if (val > target) {
            return search(nums, start, middleIndex, target);
        } else {
            return search(nums, middleIndex + 1, end, target);
        }
    }
}