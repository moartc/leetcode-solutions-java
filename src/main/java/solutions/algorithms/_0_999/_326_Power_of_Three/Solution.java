package solutions.algorithms._0_999._326_Power_of_Three;

class Solution {

    /*
    3 ^ negative gives number < 0
    so I need to check positive only
     */
    public boolean isPowerOfThree(int n) {

        if (n == 1) {
            // (3^0) == 1
            return true;
        }
        int res = 3;
        while (res <= n && res > 0) {
            if (res == n) {
                return true;
            }
            res *= 3;
        }
        return false;
    }
}