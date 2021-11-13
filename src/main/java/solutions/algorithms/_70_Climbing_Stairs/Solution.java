package solutions.algorithms._70_Climbing_Stairs;

class Solution {
    public int climbStairs(int n) {

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