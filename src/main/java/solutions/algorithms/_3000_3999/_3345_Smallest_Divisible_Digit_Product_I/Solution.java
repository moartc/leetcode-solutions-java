package solutions.algorithms._3000_3999._3345_Smallest_Divisible_Digit_Product_I;

class Solution {
    public int smallestNumber(int n, int t) {

        if (t == 1) {
            return n;
        }
        while (n < 200) {
            if (product(n) % t == 0) {
                return n;
            }
            n++;
        }
        // shouldn't happen
        return -1;
    }

    int product(int n) {
        int s = 1;
        while (n != 0) {
            int r = n % 10;
            s *= r;
            n /= 10;
        }
        return s;
    }
}