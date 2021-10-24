package solutions._121_Best_Time_to_Buy_and_Sell_Stock;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int buy = prices[0];
        int sell = prices[1];
        int profit = sell - buy;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price > sell) {
                sell = price;
                int currentProfit = sell - buy;
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
            if (price < buy && i < prices.length - 1) {
                buy = price;
                sell = prices[i + 1];
                int currentProfit = sell - buy;
                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }
        return profit > 0 ? profit : 0;
    }
}