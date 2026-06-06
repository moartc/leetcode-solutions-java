package solutions.algorithms._2000_2999._2574_Left_and_Right_Sum_Differences;

class Solution {
    public int[] leftRightDifference(int[] nums) {

        // my 2nd approach - without additional arrays (except the one for the answer)
        int[] answer = new int[nums.length];
        int leftTotal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer[i] = leftTotal;
            leftTotal += nums[i];
        }
        int rightTotal = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            answer[i] = Math.abs(answer[i] - rightTotal);
            rightTotal += nums[i];
        }
        return answer;
    }
}