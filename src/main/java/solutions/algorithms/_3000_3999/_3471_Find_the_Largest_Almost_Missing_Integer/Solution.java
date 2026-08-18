package solutions.algorithms._3000_3999._3471_Find_the_Largest_Almost_Missing_Integer;

class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] freq = new int[51];
        for (int num : nums) {
            freq[num]++;
        }
        int n = nums.length;

        if (n == k) {
            int max = -1;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0) {
                    max = i;
                }
            }
            return max;
        } else if (k == 1) {
            int max = -1;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] == 1) {
                    max = i;
                }
            }
            return max;
        } else {
            if (freq[nums[0]] == 1 && freq[nums[n - 1]] == 1) {
                return Math.max(nums[0], nums[n - 1]);
            } else if (freq[nums[0]] == 1) {
                return nums[0];
            } else if (freq[nums[n - 1]] == 1) {
                return nums[n - 1];
            } else {
                return -1;
            }
        }
    }
}