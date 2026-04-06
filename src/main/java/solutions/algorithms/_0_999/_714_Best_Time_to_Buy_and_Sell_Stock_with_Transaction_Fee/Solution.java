package solutions.algorithms._0_999._714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import java.util.Arrays;

class Solution {
    int[][] cache;

    public int maxProfit(int[] prices, int fee) {

        cache = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            Arrays.fill(cache[i], Integer.MIN_VALUE);
        }
        return findBest(0, 1, prices, fee);
    }

    // can buy: 1-true, 0-false
    int findBest(int pos, int canBuy, int[] prices, int fee) {
        if (pos == prices.length - 1) {
            if (canBuy == 0) {
                return prices[pos] - fee;
            } else {
                return 0;
            }
        }
        if (cache[pos][canBuy] != Integer.MIN_VALUE) {
            return cache[pos][canBuy];
        }

        int best = -1;
        if (canBuy == 1) {
            int buy = -prices[pos] + findBest(pos + 1, 0, prices, fee);
            int skip = findBest(pos + 1, 1, prices, fee);
            best = Math.max(buy, skip);
        } else {
            int sell = prices[pos] - fee + findBest(pos + 1, 1, prices, fee);
            int skip = findBest(pos + 1, 0, prices, fee);
            best = Math.max(sell, skip);
        }
        cache[pos][canBuy] = best;
        return cache[pos][canBuy];
    }


}