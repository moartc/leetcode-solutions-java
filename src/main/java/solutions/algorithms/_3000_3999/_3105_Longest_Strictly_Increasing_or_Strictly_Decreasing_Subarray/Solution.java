package solutions.algorithms._3000_3999._3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray;

class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int answer = 1;
        int decreasingEqOrIncreasing = 0; //-1,0,1
        int current = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                current = 1;
            } else if (nums[i] < nums[i + 1]) {
                if (decreasingEqOrIncreasing == 1) {
                    current++;
                } else {
                    decreasingEqOrIncreasing = 1;
                    current = 2;
                }
            } else { //nums[i] > nums[i+1]
                if (decreasingEqOrIncreasing == -1) {
                    current++;
                } else {
                    decreasingEqOrIncreasing = -1;
                    current = 2;
                }
            }
            answer = Math.max(answer, current);
        }
        return answer;
    }
}