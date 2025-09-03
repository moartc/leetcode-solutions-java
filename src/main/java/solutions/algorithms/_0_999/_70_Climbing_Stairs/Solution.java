package solutions.algorithms._0_999._70_Climbing_Stairs;

import java.util.Arrays;

class Solution {

    /*
    Since it's a dynamic programming problem, I can cache sub-solutions in an int array from the i-th step to the n-th
     */
    int[] cache;

    public int climbStairs(int n) {

        cache = new int[n + 1];
        Arrays.fill(cache, -1);
        return countWays(0, n);
    }

    int countWays(int currentStep, int total) {

        if (cache[currentStep] != -1) {
            return cache[currentStep];
        }

        if (currentStep == total) {
            return 1;
        } else if (currentStep == total - 1) {
            return 1;
        } else { // at least 2
            int answer = countWays(currentStep + 2, total) + countWays(currentStep + 1, total);
            cache[currentStep] = answer;
            return answer;
        }
    }


    /*
    Below is my original (old) solution
     */
    public int climbStairs_v1(int n) {

        int result = n;
        for (int i = n - 2; i >= (n + 1) / 2; i--) {
            result += binomial(i, n - i);
        }
        return result;
    }

    public long binomial(int n, int k) {
        long value = 1;
        for (int i = 0; i < k; i++) {
            value = (value * (n - i)) / (i + 1);
        }
        return value;
    }


}