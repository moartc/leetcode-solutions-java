package solutions.algorithms._3000_3999._3133_Minimum_Array_End;

class Solution {

    /*
    I could first generate the binary representation of x
    if the bitwise AND should give this value - all my numbers have to have '1' there

    for x=7 I have 7 -> 111
    I cannot set any bit on the right side from the most significant bit, all number have to be on the 'left side' of it
    If there are any '0's I can use them to set additional numbers.
    Also, the first number can have exactly the same value as x, so for 1 '0' I can cover 2 values without going to the right side.
    For 2 zeros - 4.
    For 0 zeros - 1 - just x.
    --
    another case:
    n=4, x=2, I have 2 additional numbers and I have to use left side
    x=10
    I can have: 10 (just x), 11, then 110 and 111

    the algorithm might be:
    count all available 0s in the binary representation of x
    1. If there are no 'zeros' - shift n 'behind' (to the left of) the most significant bit
    2. If there are some zeros: take n-1 in binary. Iterate through the bits of 'x' from the right. When the bit is 1, skip it
    when it's 0, set the next bit from (n-1)

    update: failed on sum bigger numbers, I am switching to long
     */
    public long minEnd(int n, int x) {

        int zerosInX = zerosInBinRepresentation(x);
        // if there is no 0 - I can still use exact 'x'
        // if there are > 0 '0's, I can generate 2^<numbOf0s> numbers - including the one equal to x
        int numberOfNumbersWithoutGoingToTheLeft = zerosInX > 0 ? (int) Math.pow(2, zerosInX) : 1;

        if (zerosInX == 0) {
            int diff = n - numberOfNumbersWithoutGoingToTheLeft;
            if (diff == 0) {
                return x;
            }
            int noShifts = 32 - Integer.numberOfLeadingZeros(x);
            int toAdd = diff > 0 ? (diff << noShifts) : (1 << noShifts);
            return toAdd + x;
        } else {
            // I have to set it here
            int numToSet = n - 1;
            long bitInX = 1;
            long bitOfMyNumToSet = 1;// for example 1000, then I end it with my numToSet to determine if the value should be or'ed
            long res = x;
            while (bitOfMyNumToSet <= numToSet) {
                if ((res & bitInX) == 0) {
                    // bit in x == 0, I can set my bit
                    if ((numToSet & bitOfMyNumToSet) == bitOfMyNumToSet) {
                        // I want to set 1
                        res |= bitInX;
                    }
                    bitOfMyNumToSet <<= 1;
                }
                bitInX <<= 1;
            }
            return res;
        }
    }

    int zerosInBinRepresentation(int n) {
        int z = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                z++;
            }
            n = n / 2;
        }
        return z;
    }
}