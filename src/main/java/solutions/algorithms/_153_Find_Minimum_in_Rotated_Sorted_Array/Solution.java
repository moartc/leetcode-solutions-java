package solutions.algorithms._153_Find_Minimum_in_Rotated_Sorted_Array;

class Solution {

    public int findMin(int[] nums) {
        if (nums.length == 1 || nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int left = 0;
        int right = (short) (nums.length - 1);
        while (Math.abs(right - left) != 1) {
            int middle = (left + right) / 2;
            if (nums[middle] > nums[right]) { // it's in the left part
                left = middle;
            } else { // it's in the right part
                right = middle;
            }
        }
        return nums[left] < nums[right] ? nums[left] : nums[right];
    }
}