package solutions.algorithms._201_Bitwise_AND_of_Numbers_Range;

class Solution {

    public int rangeBitwiseAnd(int left, int right) {

        int res = 0;
        while (left != 0 && right != 0) {
            int bound = getHighestPow2(right);
            if (left >= bound) {
                res += bound;
                left -= bound;
                right -= bound;
            } else {
                return res;
            }
        }
        return res;
    }

    int getHighestPow2(int n) {
        int p = (int) (Math.log(n) / Math.log(2));
        return (int) Math.pow(2, p);
    }
}