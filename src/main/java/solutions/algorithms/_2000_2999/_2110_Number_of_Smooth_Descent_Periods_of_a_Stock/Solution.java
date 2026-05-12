package solutions.algorithms._2000_2999._2110_Number_of_Smooth_Descent_Periods_of_a_Stock;

class Solution {
    public long getDescentPeriods(int[] prices) {
        long total = 1;
        long prev = 1;
        for (int i = prices.length - 2; i >= 0; i--) {
            long ctr = 1;
            if (prices[i + 1] + 1 == prices[i]) {
                ctr += prev;
            }
            prev = ctr;
            total += ctr;
        }
        return total;
    }

}