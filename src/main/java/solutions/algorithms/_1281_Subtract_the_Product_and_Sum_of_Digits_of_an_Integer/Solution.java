package solutions.algorithms._1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer;

class Solution {
    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}