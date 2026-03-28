package solutions.algorithms._0_999._31_Next_Permutation;

class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        // find an index to swap
        int swap = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                swap = i;
                break;
            }
        }
        // now replace swap with the lowest greater than swap
        if (swap != -1) {
            int lowestGr = Integer.MAX_VALUE;
            int lowestGrIdx = -1;
            for (int i = swap + 1; i < nums.length; i++) {
                if (nums[i] > nums[swap] && lowestGr >= nums[i]) {
                    lowestGr = nums[i];
                    lowestGrIdx = i;
                }
            }
            //swap them
            int temp = nums[lowestGrIdx];
            nums[lowestGrIdx] = nums[swap];
            nums[swap] = temp;
        } else {
        }
        // reverse remaining subarray
        int left = swap + 1;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}