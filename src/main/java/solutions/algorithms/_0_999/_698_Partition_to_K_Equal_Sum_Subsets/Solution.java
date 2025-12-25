package solutions.algorithms._0_999._698_Partition_to_K_Equal_Sum_Subsets;

import java.util.Arrays;

class Solution {
    /*
    I could iterate through the array and compute the total sum. Then I can verify with modulo
    if it's even possible to do the split.

    Then iterate through the whole array, add elements (if possible) and count the current sum for a single set.
    I will track already added elements. Sorting the array initially can help me skip the same elements.
    */
    public boolean canPartitionKSubsets(int[] nums, int k) {

        Arrays.sort(nums);
        // reverse array
        for (int i = 0; i < (nums.length / 2); i++) {
            int temp = nums[i];
            int j = nums.length - i - 1;
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % k != 0) {
            return false;
        }
        int oneSetSum = totalSum / k;

        if (nums[0] > oneSetSum) {
            return false;
        }

        boolean[] alreadyUsed = new boolean[nums.length];
        return split(nums, 0, k, oneSetSum, alreadyUsed, 0);
    }

    boolean split(int[] nums, int currentSum, int k, int oneSetSum, boolean[] alreadyUsed, int startIndex) {

        if (currentSum == oneSetSum) {
            if (k == 1) {
                // I created the last one
                return true;
            } else {
                // increase number of created set and start finding the next one
                k--;
                currentSum = 0;
                startIndex = 0;
            }
        }

        int i = startIndex;
        while (i < nums.length) {
            if (alreadyUsed[i]) {
                // skip
            } else {
                if (currentSum + nums[i] <= oneSetSum) {
                    alreadyUsed[i] = true;
                    boolean success = split(nums, currentSum + nums[i], k, oneSetSum, alreadyUsed, i + 1);
                    if (success) {
                        return true;
                    } else {
                        if (i == 0) {
                            // I don't want to remove the first element. If I wasn't able to use it, I won't be able to use it later
                            return false;
                        }
                        // revert marker and continue
                        alreadyUsed[i] = false;
                        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                            i++;
                        }
                    }
                }
            }
            i++;
        }
        return false;

    }
}