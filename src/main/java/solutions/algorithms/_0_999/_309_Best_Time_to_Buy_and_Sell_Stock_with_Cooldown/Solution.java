package solutions.algorithms._0_999._309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown;

import java.util.Arrays;

class Solution {

    /*
    If I don't currently have any stocks
     - I can buy -> go to the day+1
     - I can skip -> go to the day+1
    If I have some:
     - I can sell -> go to the day+2
     - I can keep -> go to the day+1

    update:
    after TLE I am adding a cache
    idx, currentlyBought - best res

    and with this cache it beats ~82%
     */

    int[][] cache;

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }
        if (prices.length == 2) {
            if (prices[0] > prices[1]) {
                return 0;
            } else {
                return prices[1] - prices[0];
            }
        }

        // 0 - currentlyBought - false, 1 - true
        cache = new int[prices.length][2];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        return buy(0, prices, false);
    }

    int buy(int idx, int[] prices, boolean currentlyBought) {

        if (idx >= prices.length) {
            return 0;
        }

        if (!currentlyBought) {
            if (cache[idx][0] != -1) {
                return cache[idx][0];
            }
            // I can buy
            int currentPrice = -prices[idx];
            int r1 = currentPrice + buy(idx + 1, prices, true);
            // I can also skip
            int r2 = buy(idx + 1, prices, currentlyBought);
            cache[idx][0] = Math.max(r1, r2);
            return cache[idx][0];
        } else {
            if (cache[idx][1] != -1) {
                return cache[idx][1];
            }
            // I already have some stocks
            // I can sell
            int r1 = buy(idx + 2, prices, false) + prices[idx];
            // I can do nothing
            int r2 = buy(idx + 1, prices, currentlyBought);
            cache[idx][1] = Math.max(r1, r2);
            return cache[idx][1];
        }
    }
}