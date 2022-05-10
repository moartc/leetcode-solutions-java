package solutions.algorithms._34_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        while (right - left > 1) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else {
                left = middle;
            }
        }
        if (nums[left] != target && nums[right] != target) {
            return new int[]{-1, -1};
        } else {
            int forLeft;
            int forRight;
            if (nums[left] == target) {
                forLeft = left;
                forRight = left;
            } else {
                forLeft = right;
                forRight = right;
            }
            while (forLeft >= 0 && nums[forLeft] == target ) {
                forLeft--;
            }
            while (forRight < nums.length && nums[forRight] == target) {
                forRight++;
            }
            return new int[]{forLeft + 1, forRight - 1};
        }
    }
}