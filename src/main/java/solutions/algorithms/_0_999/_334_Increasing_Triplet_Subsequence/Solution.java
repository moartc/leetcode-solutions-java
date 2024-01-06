package solutions.algorithms._0_999._334_Increasing_Triplet_Subsequence;

class Solution {
    public boolean increasingTriplet(int[] nums) {

        int lowestI = Integer.MAX_VALUE;
        int lowestJ = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < lowestI) {
                lowestI = nums[i];
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] < lowestJ && nums[i] < nums[j]) {
                        lowestJ = nums[j];
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[j] < nums[k]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}