package solutions.algorithms._343_Integer_Break;

class Solution {
    public int integerBreak(int n) {


        if (n % 3 == 0) {
            int div = n / 3;
            if (div > 1) {
                return (int) Math.pow(3, div);
            } else {
                return 2;
            }
        } else if (n == 2) {
            return 1;
        } else if (n % 3 == 1) {
            int div = (n / 3) - 1;
            int sum = (int) Math.pow(3, div);
            int rest = n - div * 3;
            return sum * rest;
        } else { // n % 3 == 2
            int div = n / 3;
            int res = (int) Math.pow(3, div);
            return 2 * res;
        }
    }
}