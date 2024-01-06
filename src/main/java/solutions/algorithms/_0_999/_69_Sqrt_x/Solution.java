package solutions.algorithms._0_999._69_Sqrt_x;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        return (int) findSquare(0, (x / 2) + 1, x);
    }

    public long findSquare(long start, long end, int toFind) {
        long toCheck = (start + end + 1) / 2;
        if (toCheck * toCheck == toFind) {
            return toCheck;
        } else {
            if (toCheck * toCheck < toFind && (toCheck + 1) * (toCheck + 1) > toFind) {
                return toCheck;
            } else if (toCheck * toCheck > toFind) {
                return findSquare(start, toCheck, toFind);
            } else {
                return findSquare(toCheck, end, toFind);
            }
        }
    }
}