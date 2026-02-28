package solutions.algorithms._1000_1999._1680_Concatenation_of_Consecutive_Binary_Numbers;

class Solution {

    /*
    iterate 1..n
    track the current result and at each step move it left by x, where x is the
    length of the binary representation of the current value
     */
    public int concatenatedBinary(int n) {

        int mod = (int) (Math.pow(10, 9) + 7);
        if (n == 1) {
            return 1;
        }
        long current = 1;
        for (int i = 2; i <= n; i++) {
            int currNumbBits = 32 - Integer.numberOfLeadingZeros(i);
            current <<= currNumbBits;
            current += i;
            current = current % mod;
        }
        return (int) current;
    }
}