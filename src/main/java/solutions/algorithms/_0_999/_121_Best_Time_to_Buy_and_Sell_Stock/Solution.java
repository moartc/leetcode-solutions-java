package solutions.algorithms._0_999._121_Best_Time_to_Buy_and_Sell_Stock;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int buyPrice = prices[0];
        int sellPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice > sellPrice) {
                sellPrice = currentPrice;
            }
            if (currentPrice < buyPrice) {
                maxProfit = Math.max(maxProfit, sellPrice - buyPrice);
                buyPrice = currentPrice;
                sellPrice = currentPrice;
            }
        }
        return Math.max(maxProfit, sellPrice - buyPrice);
    }
}