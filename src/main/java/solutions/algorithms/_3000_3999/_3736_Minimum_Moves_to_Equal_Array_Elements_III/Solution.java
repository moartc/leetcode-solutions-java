package solutions.algorithms._3000_3999._3736_Minimum_Moves_to_Equal_Array_Elements_III;

class Solution {
    public int minMoves(int[] nums) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int answer = 0;
        for (int num : nums) {
            answer += (max - num);
        }
        return answer;
    }
}