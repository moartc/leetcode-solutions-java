package solutions.algorithms._1000_1999._1004_Max_Consecutive_Ones_III;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int ctr = 0;
        int l = 0;
        int r = 0;
        int best = 0;
        while (r < nums.length) {
            if (k < 0) {
                if (nums[l] == 0) {
                    k++;
                }
                l++;
                ctr--;
            } else {
                if (nums[r] == 0) {
                    k--;
                }
                ctr++;
                if (k >= 0 && ctr > best) {
                    best = ctr;
                }
                r++;
            }
        }
        return best;
    }
}