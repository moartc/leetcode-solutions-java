package solutions.algorithms._2000_2999._2897_Apply_Operations_on_Array_to_Maximize_Sum_of_Squares;

import java.util.List;

class Solution {
    private final int MOD = 1000000000 + 7;

    public int maxSum(List<Integer> nums, int k) {

        int[] bitCtr = new int[31];


        for (Integer num : nums) {

            int curr = 1;
            for (int i = 0; i < 31; i++) {
                if ((num & curr) != 0) {
                    bitCtr[i]++;
                }
                curr <<= 1;
            }
        }

        int answer = 0;
        while (k > 0) {
            long currNum = 0;
            long curr = 1;
            for (int i = 0; i < 31; i++) {
                if (bitCtr[i] > 0) {
                    currNum += curr;
                    bitCtr[i]--;
                }
                curr <<= 1;
            }
            long sq = currNum * currNum;
            int modToAdd = (int) (sq % MOD);
            answer += modToAdd;
            answer = answer % MOD;
            k--;
        }
        return answer;
    }
}