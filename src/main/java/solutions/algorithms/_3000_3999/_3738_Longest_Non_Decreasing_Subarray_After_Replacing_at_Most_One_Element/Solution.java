package solutions.algorithms._3000_3999._3738_Longest_Non_Decreasing_Subarray_After_Replacing_at_Most_One_Element;

class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int maxFound = 1;
        int left = 0;
        int right = 1;
        int changedIdx = -1;
        while (right < nums.length) {
            if ((right - 1 != changedIdx && nums[right] >= nums[right - 1]) || (right - 1 == changedIdx && nums[right] >= nums[right - 2])) {
                // fine, check the size
                int size = right - left + 1;
                maxFound = Math.max(maxFound, size);
                right++;
            } else {
                if (changedIdx == -1) {
                    // accept and mark
                    changedIdx = right;
                    int size = right - left + 1;
                    maxFound = Math.max(maxFound, size);
                    right++;
                } else {
                    left = changedIdx;
                    right = changedIdx + 1;
                    changedIdx = -1;
                }
            }
        }
        // the same in the opposite direction
        left = nums.length - 2;
        right = nums.length - 1;
        changedIdx = -1;
        while (left >= 0) {
            if ((left + 1 != changedIdx && nums[left] <= nums[left + 1]) || (left + 1 == changedIdx && nums[left] <= nums[left + 2])) {
                // fine, check the size
                int size = right - left + 1;
                maxFound = Math.max(maxFound, size);
                left--;
            } else {
                if (changedIdx == -1) {
                    // accept and mark
                    changedIdx = left;
                    int size = right - left + 1;
                    maxFound = Math.max(maxFound, size);
                    left--;
                } else {
                    right = changedIdx;
                    left = changedIdx - 1;
                    changedIdx = -1;
                }
            }
        }

        return maxFound;
    }
}