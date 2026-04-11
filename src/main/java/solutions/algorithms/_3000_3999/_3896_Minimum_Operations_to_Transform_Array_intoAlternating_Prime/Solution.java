package solutions.algorithms._3000_3999._3896_Minimum_Operations_to_Transform_Array_intoAlternating_Prime;

import java.util.Arrays;

class Solution {

    public int minOperations(int[] nums) {

        int max = (int) 10e5;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int increaseCtr = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i % 2 == 0) {
                while (!isPrime[num]) {
                    num++;
                    increaseCtr++;
                }
            } else {
                while (isPrime[num]) {
                    num++;
                    increaseCtr++;
                }
            }
        }
        return increaseCtr;
    }
}