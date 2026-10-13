package solutions.algorithms._3000_3999._3727_Maximum_Alternating_Sum_of_Squares;

import java.util.Arrays;

class Solution {

    /*
    I can get max when I add the biggest values and subtract the lowest
    I should consider abs values
    I could create a new array and sort it, then split by 2
    alternatively 2 stacks
     */
    public long maxAlternatingSum(int[] nums) {

        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            newNums[i] = Math.abs(n);
        }
        Arrays.sort(newNums);
        int l = 0;
        int r = newNums.length - 1;
        long answer = 0;
        while (l <= r) {
            long rV = newNums[r];
            answer += (rV * rV);
            long lV = newNums[l];
            answer -= (lV * lV);
            if (l == r) {
                // add one and return
                answer += (lV * lV);
                return answer;
            }
            l++;
            r--;
        }
        return answer;
    }
}