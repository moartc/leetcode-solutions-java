package solutions.algorithms._0_999._190_Reverse_Bits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String inputBinary = Integer.toBinaryString(n);
        char[] chars = inputBinary.toCharArray();
        long result = 0;
        int pow = 31;
        for (int i = chars.length - 1; i >= 0; i--) {
            result += ((chars[i] - 48) << pow--);
        }
        return (int) result;
    }
}