package solutions.algorithms._3000_3999._3550_Smallest_Index_With_Digit_Sum_Equal_to_Index;

class Solution {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i == getSum(nums[i])) {
                return i;
            }
        }
        return -1;
    }

    int getSum(int d) {
        int sum = 0;
        while (d != 0) {
            int r = d % 10;
            sum += r;
            d /= 10;
        }
        return sum;
    }
}