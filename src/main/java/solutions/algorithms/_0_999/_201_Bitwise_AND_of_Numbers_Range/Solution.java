package solutions.algorithms._0_999._201_Bitwise_AND_of_Numbers_Range;

class Solution {

    /*
    another example
    1000101010 = 554
    0000111000 = 56
    -
    0000101000 = 40
    so in this case, the leftmost 1 can be below bit 7 (64dec)
    it seems that if there exists any number that has a singe bit in its binary representation within my range, the result is 0

    Another one:
    110001 = 49
    110010 = 50
    110011 = 51
    110100 = 52
    -------
    110000

    the algorithm could be:
    1. do the check described above - if highestOneBit is different - the result is 0;
    2. then find a common prefix - consecutive bits that are the same and if = 1 add the current bitVal to the final result
     */
    public int rangeBitwiseAnd(int left, int right) {

        if (left == 0 || right == 0) {
            return 0;
        }

        int res = 0;
        int hbl = Integer.highestOneBit(left);
        int hbr = Integer.highestOneBit(right);
        if (hbl != hbr) {
            return 0;
        }
        int highestBitVal = hbl;
        while (highestBitVal > 0) {
            int leftBit = (highestBitVal & left);
            int rightBit = (highestBitVal & right);
            if (leftBit == highestBitVal && rightBit == highestBitVal) {
                res += highestBitVal;
            } else if (leftBit == 0 && rightBit == 0) {
                // still continue
            } else {
                return res;
            }
            highestBitVal >>= 1;
        }
        return res;
    }
}