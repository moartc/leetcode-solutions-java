package solutions.algorithms._0_999._371_Sum_of_Two_Integers;

class Solution {

    /*
    Notes:
    again a few integers:
    0  -> 0000
    1  -> 0001
    2  -> 0010
    3  -> 0011
    4  -> 0100
    5  -> 0101
    6  -> 0110
    7  -> 0111
    8  -> 1000
    9  -> 1001
    10 -> 1010
    11 -> 1011
    12 -> 1100
    13 -> 1101
    14 -> 1110
    15 -> 1111
    16 -> 10000
    17 -> 10001
    18 -> 10010

    so it looks like xoring with moving one bit
    for example:
    9 + 8 = 17
    1001
    1000

    I can iterate bit by bit and AND it with the current number to isolate the bit
    then xor them, and if needed, move the remainder.

    update: I forgot about negative numbers
    but, it works out of the box if I extend iteration to 32 bits
     */
    public int getSum(int a, int b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int currentBit = 1;
        int answer = 0;
        boolean reminder = false;
        int bitCounter = 0;
        while (bitCounter <= 32) {
            int aBit = currentBit & a;
            int bBit = currentBit & b;
            if (aBit == 0 && bBit == 0) {
                if (reminder) {
                    answer ^= (currentBit);
                    reminder = false;
                }
            } else if ((aBit != 0 && bBit == 0) || (aBit == 0 && bBit != 0)) {
                if (!reminder) {
                    answer ^= (currentBit);
                }
            } else {    // 1 1
                if (reminder) {
                    answer ^= (currentBit);
                }
                reminder = true;

            }
            currentBit <<= 1;
            bitCounter++;
        }
        return answer;
    }
}