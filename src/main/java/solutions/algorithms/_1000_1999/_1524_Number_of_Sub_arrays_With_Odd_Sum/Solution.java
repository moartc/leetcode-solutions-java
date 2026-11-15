package solutions.algorithms._1000_1999._1524_Number_of_Sub_arrays_With_Odd_Sum;

class Solution {


    public int numOfSubarrays(int[] arr) {

        int mod = 1000000000 + 7;

        int evenCtr = 1;
        int oddCtr = 0;
        int tot = 0;
        long currSum = 0;
        for (int i : arr) {
            currSum += i;
            if (currSum % 2 == 0) {
                tot += oddCtr;
                evenCtr++;
            } else {
                tot += evenCtr;
                oddCtr++;
            }
            tot = tot % mod;
        }

        return tot;
    }
}