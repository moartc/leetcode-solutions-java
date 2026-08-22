package solutions.algorithms._3000_3999._3622_Check_Divisibility_by_Digit_Sum_and_Product;

class Solution {
    public boolean checkDivisibility(int n) {

        return n % sumDigitProductAndSum(n) == 0;
    }

    int sumDigitProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            prod *= r;
            sum += r;
            n /= 10;
        }
        return prod + sum;
    }
}