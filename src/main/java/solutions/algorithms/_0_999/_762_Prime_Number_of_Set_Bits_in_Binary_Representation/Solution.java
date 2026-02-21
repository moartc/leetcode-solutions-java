package solutions.algorithms._0_999._762_Prime_Number_of_Set_Bits_in_Binary_Representation;

class Solution {

    /*
    The simplest solution, iterate between left and right, convert to bin and check if it's prime.
    I can use erastotenes sieve
    max number 10^6 = 1000000 <= 2^20, I can actually fill a set
    update: I will use Integer.bitCount instead of my own method and use array instead of set
    beats 98.83%
     */
    public int countPrimeSetBits(int left, int right) {
        boolean[] isPrime = new boolean[20];
        isPrime[2] = true;
        isPrime[3] = true;
        isPrime[5] = true;
        isPrime[7] = true;
        isPrime[11] = true;
        isPrime[13] = true;
        isPrime[17] = true;
        isPrime[19] = true;

        int counter = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime[Integer.bitCount(i)]) {
                counter++;
            }
        }
        return counter;
    }

}