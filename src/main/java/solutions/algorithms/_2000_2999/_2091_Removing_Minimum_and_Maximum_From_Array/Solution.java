package solutions.algorithms._2000_2999._2091_Removing_Minimum_and_Maximum_From_Array;

class Solution {
    public int minimumDeletions(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int minIdx = 0;
        int minValue = nums[0];
        int maxIdx = 0;
        int maxValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            if (v < minValue) {
                minIdx = i;
                minValue = v;
            }
            if (v > maxValue) {
                maxValue = v;
                maxIdx = i;
            }
        }

        int leftIdx = Math.min(minIdx, maxIdx);
        int rightIdx = Math.max(minIdx, maxIdx);

        // remove the left index from the left side and the right index from the right side
        int toRemoveFromRight = nums.length - rightIdx;
        int toRemoveFromLeft = leftIdx + 1;
        int total1 = toRemoveFromLeft + toRemoveFromRight;

        // remove both indices from the right side
        int toRemLeft2 = leftIdx + 1;
        int toRemRight2 = rightIdx - toRemLeft2 + 1;
        int total2 = toRemLeft2 + toRemRight2;

        // remove both indices from the left side
        int toRemRight3 = nums.length - rightIdx;
        int toRemLeft3 = nums.length - leftIdx - toRemRight3;
        int total3 = toRemLeft3 + toRemRight3;

        return Math.min(Math.min(total1, total2), total3);
    }
}