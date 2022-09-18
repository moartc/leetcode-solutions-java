package solutions.algorithms._91_Decode_Ways;

class Solution {

    char[] s;
    int[] mem;

    public int numDecodings(String s) {
        this.s = s.toCharArray();
        mem = new int[this.s.length];
        return decode(0);
    }

    int decode(int startIndex) {
        if (startIndex == s.length) {
            return 1;
        } else {
            if (mem[startIndex] != 0) {
                return mem[startIndex];
            }
            // case for 1 char
            int int1 = s[startIndex] - 48;
            if (int1 == 0) {
                return 0;
            }
            int toRet = decode(startIndex + 1);
            // case for 2 chars
            if (startIndex < s.length - 1) {
                int int2 = s[startIndex + 1] - 48;
                int totalVal = int1 * 10 + int2;
                if (totalVal >= 1 && totalVal <= 26) {
                    toRet += decode(startIndex + 2);
                }
            }
            mem[startIndex] = toRet;
            return toRet;
        }
    }
}