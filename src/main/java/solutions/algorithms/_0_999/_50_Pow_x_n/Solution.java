package solutions.algorithms._0_999._50_Pow_x_n;

class Solution {

    /*
    fast exponentiation
     */
    public double myPow(double x, int n) {

        if (x == 0) {
            return 0.0;
        }
        if (n == 0 || x == 1) {
            return 1.0;
        }
        if (n < 0) {
            x = 1 / x;
        }

        if (n % 2 == 0) {
            // to handle -Integer.MAX_VALUE case
            int startN = (n < 0) ? -(n / 2) : n / 2;
            return pow(x * x, startN);
        } else {
            // to handle -Integer.MAX_VALUE case
            int startN = (n < 0) ? -(n / 2) : (n - 1) / 2;
            return x * pow(x * x, startN);
        }
    }

    double pow(double x, int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        } else {
            return x * pow(x * x, (n - 1) / 2);
        }
    }

}