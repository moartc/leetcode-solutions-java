package solutions.algorithms._0_999._162_Find_Peak_Element;

class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int middle = (left + right) / 2;
            int nextMiddle = middle + 1;
            if (nums[middle] < nums[nextMiddle]) {
                left = middle;
            } else {
                right = middle;
            }
        }
        if (nums[left] > nums[right]) {
            return left;
        } else {
            return right;
        }
    }
}