package solutions.algorithms._0_999._300_Longest_Increasing_Subsequence;

class Solution {

    int[] indexToPath;
    int max = 1;
    public int lengthOfLIS(int[] nums) {

        indexToPath = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (max > nums.length - i) {
                break;
            }
            int found;
            if (indexToPath[i] != 0) {
                found = indexToPath[i];
            } else {
                found = collect(i, nums);
            }
            if (found > max) {
                max = found;
            }
        }
        return max;
    }


    int collect(int start, int[] nums) {
        int maxFound = 0;
        if (indexToPath[start] != 0) {
            return indexToPath[start];
        } else {
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[start] < nums[i]) {
                    int collected;
                    if(indexToPath[i] != 0) {
                        collected = indexToPath[i];
                    } else {
                        collected = collect(i, nums);
                    }
                    if (maxFound < collected) {
                        maxFound = collected;
                    }
                }
            }
            indexToPath[start] = maxFound + 1;
            return maxFound + 1;
        }
    }
}

