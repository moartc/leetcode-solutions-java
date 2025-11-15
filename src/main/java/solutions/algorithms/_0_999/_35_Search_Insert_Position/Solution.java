package solutions.algorithms._0_999._35_Search_Insert_Position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        return find(nums, target, 0, nums.length - 1);
    }

    int find(int[] nums, int target, int start, int end) {

        if (start == end) {
            if (nums[start] == target) {
                return start;
            } else {
                return nums[start] > target ? start : start + 1;
            }
        } else {
            int mid = (start + end) / 2;
            int midVal = nums[mid];
            if (midVal == target) {
                return mid;
            }
            if (midVal > target) {
                return find(nums, target, start, mid);
            } else {
                return find(nums, target, mid + 1, end);
            }
        }
    }
}