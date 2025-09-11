package solutions.algorithms._0_999._190_Reverse_Bits;

public class Solution {

    /*
    Somehow, step by step, I simplified my overcomplicated initial version
     */
    public int reverseBits(int n) {

        int x = 1;
        int x2 = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & x) != 0) {
                result ^= x2;
            }
            x2 = x2 >>> 1;
            x = x << 1;
        }
        return result;
    }
}