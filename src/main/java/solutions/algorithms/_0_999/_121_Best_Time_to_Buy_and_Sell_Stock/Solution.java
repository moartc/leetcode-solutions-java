package solutions.algorithms._0_999._121_Best_Time_to_Buy_and_Sell_Stock;

class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        int bestFound = 0;
        int i1 = 0;
        int i2 = 1;
        while (i2 <= prices.length - 1) {

            int f = prices[i1];
            int s = prices[i2];
            if (f < s) {
                bestFound = Math.max(s - f, bestFound);
                i2++;
            } else {
                i1 = i2;
                i2++;
            }
        }
        return bestFound;
    }
}