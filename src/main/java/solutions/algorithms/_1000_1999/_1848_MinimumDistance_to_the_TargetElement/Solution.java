package solutions.algorithms._1000_1999._1848_MinimumDistance_to_the_TargetElement;

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int left = start;
        int right = start + 1;
        while (left >= 0 || right < nums.length) {
            if (left >= 0) {
                if (nums[left] == target) {
                    return Math.abs(left - start);
                }
                left--;
            }
            if (right < nums.length) {
                if (nums[right] == target) {
                    return Math.abs(right - start);
                }
                right++;
            }
        }
        // shouldn't happen
        return -1;
    }
}