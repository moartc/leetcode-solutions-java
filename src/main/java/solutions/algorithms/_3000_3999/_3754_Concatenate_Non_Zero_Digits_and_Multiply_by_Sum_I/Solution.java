package solutions.algorithms._3000_3999._3754_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I;

class Solution {
    public long sumAndMultiply(int n) {

        int mult = 1;
        long x = 0;
        long sum = 0;
        while (n != 0) {
            long rem = n % 10;
            if (rem != 0) {
                x += (mult * rem);
                sum += rem;
                mult *= 10;
            }
            n /= 10;
        }
        return sum * x;
    }
}