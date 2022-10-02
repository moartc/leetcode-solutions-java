package solutions.algorithms._673_Number_of_Longest_Increasing_Subsequence;

class Solution {

    int[] indexToMax;
    int[] occur;
    int max = 1;

    public int findNumberOfLIS(int[] nums) {

        indexToMax = new int[nums.length];
        occur = new int[nums.length];

        int maxToRet = 1;
        for (int i = 0; i < nums.length; i++) {
            int found;
            if (indexToMax[i] != 0) {
                found = indexToMax[i];
            } else {
                found = collect(i, nums);
            }
            if (found > max) {
                max = found;
                maxToRet = occur[i];
            } else if (found == max) {
                maxToRet += occur[i];
            }
        }
        return maxToRet;
    }

    int collect(int start, int[] nums) {
        int maxFound = 1;
        int numberOfMax = 1;
        if (indexToMax[start] != 0) {
            return indexToMax[start];
        } else {
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[start] < nums[i]) {
                    int collected;
                    if (indexToMax[i] != 0) {
                        collected = indexToMax[i];
                    } else {
                        collected = collect(i, nums);
                    }
                    if (maxFound < collected) {
                        maxFound = collected;
                        numberOfMax = occur[i];
                    } else if (maxFound == collected) {
                        numberOfMax += occur[i];
                    }
                }
            }
            indexToMax[start] = maxFound + 1;
            occur[start] = numberOfMax;
            return maxFound + 1;
        }
    }
}