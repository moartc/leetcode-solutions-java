package solutions.algorithms._0_999._33_Search_in_Rotated_Sorted_Array;

class Solution {
    public int search(int[] nums, int target) {

        return find(0, nums.length - 1, target, nums);
    }

    int find(int leftIdx, int rightIdx, int target, int[] nums) {

        if (leftIdx > rightIdx) {
            return -1;
        }

        int middleIdx = (rightIdx + leftIdx) / 2;

        int middleValue = nums[middleIdx];

        if (middleValue == target) {
            return middleIdx;
        }

        int leftValue = nums[leftIdx];
        int rightValue = nums[rightIdx];
        boolean leftLowerThanMiddle = leftValue <= middleValue;

        if (leftLowerThanMiddle) {
            if (target >= leftValue && target < middleValue) {
                return find(leftIdx, middleIdx - 1, target, nums);
            } else {
                return find(middleIdx + 1, rightIdx, target, nums);
            }
        } else {
            if (target > middleValue && target <= rightValue) {
                return find(middleIdx + 1, rightIdx, target, nums);
            } else {
                return find(leftIdx, middleIdx - 1, target, nums);
            }
        }
    }
}

// 7 0 1 2 3 4 5