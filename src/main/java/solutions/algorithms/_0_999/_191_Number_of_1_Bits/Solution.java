package solutions.algorithms._0_999._191_Number_of_1_Bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        byte counter = 0;
        while (n != 0) {
            n &= n - 1;
            counter++;
        }
        return counter;
    }
}