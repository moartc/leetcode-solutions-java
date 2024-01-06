package solutions.algorithms._0_999._231_Power_of_Two;

class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;
        return (n & n-1) == 0;
    }
}