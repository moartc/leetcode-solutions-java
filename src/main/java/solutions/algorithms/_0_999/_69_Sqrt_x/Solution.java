package solutions.algorithms._0_999._69_Sqrt_x;

class Solution {

    public int mySqrt(int x) {

        int max = (x / 2) + 1;
        return findRoot(x, 0, max);

    }

    int findRoot(int x, long min, long max) {

        long mid = min + (max - min) / 2;
        long sq = mid * mid;

        if (sq == x) {
            return (int) mid;
        } else if (min > max) {
            // return smaller
            return (int) max;
        } else if (sq > x) {
            return findRoot(x, min, mid - 1);
        } else {
            return findRoot(x, mid + 1, max);
        }
    }
}
