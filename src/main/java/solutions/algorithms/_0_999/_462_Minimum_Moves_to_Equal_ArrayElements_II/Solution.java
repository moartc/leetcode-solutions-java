package solutions.algorithms._0_999._462_Minimum_Moves_to_Equal_ArrayElements_II;

import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int midIdx = nums.length / 2;
        int midEl = nums[midIdx];

        int answer = 0;
        for (int num : nums) {
            answer += Math.abs(num - midEl);
        }
        return answer;
    }
}