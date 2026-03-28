package solutions.algorithms._0_999._540_Single_Element_in_a_SortedArray;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (left == right) {
                return nums[left];
            } else {
                int mid = (left + right) / 2;
                int midValue = nums[mid];
                if (mid % 2 == 0) { // even
                    if (nums[mid + 1] != midValue) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                } else { // odd
                    if (nums[mid + 1] == midValue) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
