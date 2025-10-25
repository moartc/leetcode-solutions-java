package solutions.algorithms._0_999._122_Best_Time_to_Buy_and_Sell_Stock_II;

class Solution {
    /*
    I could have something like:
    1 5 7 6, the best case is to buy on 1 and sell on 3 - profit 6
    I can but on 1 and sell on 2 - profit 4,
    buy again on 2 and sell on 3 - profit 2
    the total profit is the same
     */
    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int profit = 0;
        while (j < prices.length) {
            int f = prices[i];
            int s = prices[j];
            if (s > f) {
                // can make a profit so I'm selling
                profit += (s - f);
                i = j;
            } else {
                i++;
            }
            j++;
        }
        return profit;
    }
}

