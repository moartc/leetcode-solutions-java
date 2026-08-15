package solutions.algorithms._3000_3999._3702_Longest_Subsequence_With_Non_Zero_Bitwise_XOR;

class Solution {


    /*
    it's a subsequence not a subarray o_O
     */
    public int longestSubsequence(int[] nums) {

        int totalXor = 0;
        boolean anyNonZero = false;
        for (int i = 0; i < nums.length; i++) {
            totalXor ^= nums[i];
            if (nums[i] != 0) {
                anyNonZero = true;
            }
        }
        if (totalXor != 0) {
            return nums.length;
        } else if (anyNonZero) {
            return nums.length - 1;
        } else {
            return 0;
        }
    }
}