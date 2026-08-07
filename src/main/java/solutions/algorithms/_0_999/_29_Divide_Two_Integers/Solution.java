package solutions.algorithms._0_999._29_Divide_Two_Integers;

class Solution {
    public int divide(int dividend, int divisor) {

        long dividendL = dividend;
        long divisorL = divisor;
        dividendL = Math.abs(dividendL);
        divisorL = Math.abs(divisorL);

        if (dividendL < divisorL) {
            return 0;
        }

        long ctr = 0;
        long currDivisor = divisorL;
        int mult = 1;
        while (dividendL >= divisorL) {
            while (dividendL > currDivisor + currDivisor) {
                currDivisor += currDivisor;
                mult += mult;
            }
            ctr += mult;
            dividendL -= currDivisor;
            currDivisor = divisorL;
            mult = 1;
        }
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            if (ctr > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int) ctr;
            }
        } else {
            if (-ctr < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) -ctr;
            }
        }
    }
}