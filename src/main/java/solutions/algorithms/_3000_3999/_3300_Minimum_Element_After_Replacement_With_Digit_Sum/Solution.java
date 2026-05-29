package solutions.algorithms._3000_3999._3300_Minimum_Element_After_Replacement_With_Digit_Sum;

class Solution {
    public int minElement(int[] nums) {


        int minFound = Integer.MAX_VALUE;

        for (int num : nums) {

            minFound = Math.min(minFound, getSum(num));
        }

        return minFound;
    }

    private int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}