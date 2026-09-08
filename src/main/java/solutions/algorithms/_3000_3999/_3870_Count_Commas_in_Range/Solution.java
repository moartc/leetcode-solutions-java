package solutions.algorithms._3000_3999._3870_Count_Commas_in_Range;

class Solution {
    public int countCommas(int n) {

        if (n < 1000) {
            return 0;
        } else {
            return n - 1000 + 1;
        }
    }
}