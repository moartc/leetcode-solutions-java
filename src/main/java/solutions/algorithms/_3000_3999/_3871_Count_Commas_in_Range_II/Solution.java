package solutions.algorithms._3000_3999._3871_Count_Commas_in_Range_II;

class Solution {

    /*
    max:     1,000,000,000,000,000
    max -1:    999,999,999,999,999
    1: (1,000,000 ... 1000>
    2: (1,000,000,000 ... 1,000,000>
    3: (1,000,000,000,000 ... 1,000,000,000>
    4: (1,000,000,000,000,000 ... 1,000,000,000,000>
     */
    public long countCommas(long n) {

        long tot = 0;

        long toSubtract = 1000;
        while (n >= toSubtract) {
            tot += (n - toSubtract + 1);
            toSubtract *= 1000;
        }
        return tot;
    }
}