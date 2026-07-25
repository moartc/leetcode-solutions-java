package solutions.algorithms._3000_3999._3536_Maximum_Product_of_Two_Digits;

class Solution {
    public int maxProduct(int n) {

        // maxProduct
        int max1 = -1; // top
        int max2 = -1; // 2nd highest

        while (n != 0) {
            int r = n % 10;
            if (r >= max2) {
                max2 = r;
            }
            // rebalance
            if (max2 > max1) {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
            n /= 10;
        }
        return max1 * max2;
    }
}