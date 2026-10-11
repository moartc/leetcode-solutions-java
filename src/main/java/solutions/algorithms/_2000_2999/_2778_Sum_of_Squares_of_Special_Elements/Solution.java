package solutions.algorithms._2000_2999._2778_Sum_of_Squares_of_Special_Elements;

class Solution {
    public int sumOfSquares(int[] nums) {

        int n = nums.length;
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = i + 1;
            if (n % idx == 0) {
                answer += (nums[i] * nums[i]);
            }
        }
        return answer;
    }
}