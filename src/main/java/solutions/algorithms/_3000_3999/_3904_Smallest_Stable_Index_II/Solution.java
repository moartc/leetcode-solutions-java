package solutions.algorithms._3000_3999._3904_Smallest_Stable_Index_II;

class Solution {
    // the same solution as yesterday o_O
    public int firstStableIndex(int[] nums, int k) {
        int[] leftMax = new int[nums.length];
        leftMax[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
        }
        // use the original array instead of a new rightMin
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i] = Math.min(nums[i + 1], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int instabilityScore = leftMax[i] - nums[i];
            if (instabilityScore <= k) {
                return i;
            }
        }
        return -1;
    }
}