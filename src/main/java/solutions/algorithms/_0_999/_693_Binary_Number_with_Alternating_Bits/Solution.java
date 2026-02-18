package solutions.algorithms._0_999._693_Binary_Number_with_Alternating_Bits;

class Solution {
    /*
    So I can simply change it to its binary representation,
    remember the first bit and then check the next one, if it's not as expected, return false,
    otherwise true
    11 mod 2 = 1
    5 mod 2  = 1
    2 mod 2 = 0
    1 mod 2 = 1
     */
    public boolean hasAlternatingBits(int n) {

        boolean expectedZero = true;
        boolean wasFirst = false;
        while (n > 0) {
            int rem = n % 2;
            if (wasFirst) {
                if (rem == 0 && !expectedZero) {
                    return false;
                } else if (rem == 1 && expectedZero) {
                    return false;
                }
            } else {
                wasFirst = true;
            }
            expectedZero = rem != 0;
            n /= 2;
        }
        return true;
    }
}