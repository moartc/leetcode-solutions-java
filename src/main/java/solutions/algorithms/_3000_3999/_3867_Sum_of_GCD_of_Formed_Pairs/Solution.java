package solutions.algorithms._3000_3999._3867_Sum_of_GCD_of_Formed_Pairs;

import java.util.Arrays;

class Solution {
    public long gcdSum(int[] nums) {

        int[] prefixGcd = new int[nums.length];
        int max = nums[0];
        prefixGcd[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            max = Math.max(curr, max);
            prefixGcd[i] = gcd(curr, max);
        }
        Arrays.sort(prefixGcd);

        long answer = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int leftIdx = i;
            int rightIdx = nums.length - 1 - i;
            int leftV = prefixGcd[leftIdx];
            int rightV = prefixGcd[rightIdx];
            int pairGcd = gcd(leftV, rightV);
            answer += pairGcd;
        }
        return answer;

    }

    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}