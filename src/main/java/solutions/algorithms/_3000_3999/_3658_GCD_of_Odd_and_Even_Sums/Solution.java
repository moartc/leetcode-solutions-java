package solutions.algorithms._3000_3999._3658_GCD_of_Odd_and_Even_Sums;

class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sumOdd = 0;
        int sumEven = 0;

        int odd = 1;
        int even = 2;
        for (int i = 0; i < n; i++) {
            sumOdd += odd;
            sumEven += even;
            odd += 2;
            even += 2;
        }
        return gcd(sumOdd, sumEven);
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