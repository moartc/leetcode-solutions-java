package solutions.algorithms._0_999._191_Number_of_1_Bits;

public class Solution {
    public int hammingWeight(int n) {

        int counter = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                counter++;
            }
            n = n / 2;
        }
        return counter;
    }
}