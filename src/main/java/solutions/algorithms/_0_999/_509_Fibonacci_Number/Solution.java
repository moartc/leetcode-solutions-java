package solutions.algorithms._0_999._509_Fibonacci_Number;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int minus2 = 0;
        int minus1 = 1;
        for (int i = 2; i <= n; i++) {
            int current = minus2 + minus1;
            minus2 = minus1;
            minus1 = current;
        }
        return minus1;
    }

}