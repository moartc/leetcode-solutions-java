package solutions.algorithms._1000_1999._1523_Count_Odd_Numbers_in_an_Interval_Range;

class Solution {
    public int countOdds(int low, int high) {

        int counter = (high - low) / 2;
        if (low % 2 == 0 && high % 2 == 0) {
            return counter;
        } else {
            return counter + 1;
        }
    }
}