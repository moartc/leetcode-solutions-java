package solutions.algorithms._0_999._81_Search_in_Rotated_Sorted_Array_II;

class Solution {
    /*
    So binary search with an unknown pivot
     */
    public boolean search(int[] nums, int target) {

        return find(nums, target, 0, nums.length - 1);
    }

    /*
    case 1: 5,6,6,7,0,1,2,2,3
    case 2: 0,1,2,3,4,5
     */
    boolean find(int[] nums, int target, int low, int high) {

        if (high < low) {
            return false;
        }
        int mid = low + (high - low) / 2;
        int midV = nums[mid];
        if (midV == target) {
            return true;
        } else if (low == high) {
            return false;
        }
        // in this case I don't know where I should search, so I am searching in both parts
        if (nums[low] == nums[high]) {
            return find(nums, target, low, mid - 1) || find(nums, target, mid + 1, high);
        } else if (nums[low] < nums[high]) {
            // 0,1,2,3,4,5
            if (target < midV) {
                return find(nums, target, low, mid - 1);
            } else {
                return find(nums, target, mid + 1, high);
            }
        } else { // nums[low] > nums[high]
            // 5,6,6,7,0,1,2,2,3, I am on 0
            // 5,6,6,7,0, I am on 6
            if (target > midV) {
                if (midV <= nums[high]) {
                    if (target <= nums[high]) {
                        return find(nums, target, mid + 1, high);
                    } else {
                        return find(nums, target, low, mid - 1);
                    }
                } else {
                    return find(nums, target, mid + 1, high);
                }
            } else { // target < midV
                if (midV > nums[high]) {
                    if (target <= nums[high]) {
                        return find(nums, target, mid + 1, high);
                    } else {
                        return find(nums, target, low, mid - 1);
                    }
                } else {
                    return find(nums, target, low, mid - 1);
                }
            }
        }
    }
}