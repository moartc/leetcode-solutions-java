package solutions.algorithms._3000_3999._3644_Maximum_K_to_Sort_a_Permutation;

class Solution {
    public int sortPermutation(int[] nums) {

        int answer = -1; // only 1s in bin
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                answer &= nums[i];
            }
        }
        return answer == -1 ? 0 : answer;
    }
}