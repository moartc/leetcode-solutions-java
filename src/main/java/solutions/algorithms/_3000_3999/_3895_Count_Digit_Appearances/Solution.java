package solutions.algorithms._3000_3999._3895_Count_Digit_Appearances;

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int counter = 0;
        for (int num : nums) {
            while (num != 0) {
                int n = num % 10;
                if(n == digit) {
                    counter++;
                }
                num = num / 10;
            }
        }
        return counter;
    }
}