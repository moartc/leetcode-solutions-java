package solutions.algorithms._33_Search_in_Rotated_Sorted_Array;

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        if(!(target >= nums[0] || target <= nums[right])) {
            return -1;
        }
        while (right - left > 1) {
            middle = (left + right) / 2;
            int middleValue = nums[middle];
            if(middleValue == target) {
                return middle;
            }
            if (isInLeftPart(target, nums[left], middleValue)) {
                right = middle;
            } else {
                left = middle+1;
            }
        }
        if(nums[left] == target) {
            return left;
        } else if(nums[right] == target) {
            return right;
        } else {
            return -1;
        }
    }

    boolean isInLeftPart(int target, int left, int right) {
        if(left < right) {
            return target >= left && target <= right;
        } else {
            return target <= right || target >= left;
        }
    }
}