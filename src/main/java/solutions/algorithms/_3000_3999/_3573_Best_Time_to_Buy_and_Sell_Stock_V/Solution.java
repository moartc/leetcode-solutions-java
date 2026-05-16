package solutions.algorithms._3000_3999._3573_Best_Time_to_Buy_and_Sell_Stock_V;


import java.util.Arrays;

class Solution {
    long[][][] cache;

    /*
    1, 7, 9, 8, 2
    b     s  s  b
    -     +  +  -
    */
    public long maximumProfit(int[] prices, int k) {

        cache = new long[prices.length + 1][3][k + 1];
        for (long[][] ints : cache) {
            for (long[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }
        return maxProfit(0, 0, 0, prices, k);
    }

    // transaction: 0 - no, 1 - normal, 2 - short
    long maxProfit(int day, int transaction, int transactionsMade, int[] prices, int k) {

        // the last day
        if (day == prices.length - 1) {
            if (transaction == 0) { // no transaction, I should not buy
                return 0;
            } else if (transaction == 1) { // regular buy
                return prices[day];
            } else { // transaction short
                return -prices[day];
            }
        }

        if (cache[day][transaction][transactionsMade] != -1) {
            return cache[day][transaction][transactionsMade];
        }
        long best = Long.MIN_VALUE;
        long skipProfit;
        if (transaction == 0) { // no transaction in progress
            // buy
            if (transactionsMade < k) {
                // buy
                long b1 = -prices[day] + maxProfit(day + 1, 1, transactionsMade + 1, prices, k);
                // short
                long b2 = prices[day] + maxProfit(day + 1, 2, transactionsMade + 1, prices, k);
                best = Math.max(b1, b2);
            }
        } else {
            // there is a transaction
            long b1 = Long.MIN_VALUE;
            long b2 = Long.MIN_VALUE;
            if (transaction == 1) { // regular buy
                // sell so add
                b1 = prices[day];
                b1 += maxProfit(day + 1, 0, transactionsMade, prices, k);

            } else { // transaction short
                // buy for short sell
                // doesn't look safe
                b2 = -prices[day];
                b2 += maxProfit(day + 1, 0, transactionsMade, prices, k);
            }
            best = Math.max(b2, b1);
        }
        skipProfit = maxProfit(day + 1, transaction, transactionsMade, prices, k);
        best = Math.max(best, skipProfit);
        cache[day][transaction][transactionsMade] = best;
        return cache[day][transaction][transactionsMade];
    }
}