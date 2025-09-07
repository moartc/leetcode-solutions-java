package solutions.algorithms._0_999._322_Coin_Change;

import java.util.Arrays;

class Solution {


    // -1 means impossible, not set is -2
    int[] cache;


    // this is the original solution which beats ~30%

    /*
    Solution similar to the one below but without recursion
    update:
    a bit faster
     */
    public int coinChange(int[] coins, int amount) {

        int[] cache = new int[amount + 1];
        // instead of Integer.MAX I am assigning amount+1 to avoid overflowing
        Arrays.fill(cache, amount + 1);
        cache[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                // for example for i=11 and coin 5 diff is 6
                int diff = i - coin;
                // can change it
                if (diff >= 0) {
                    int valFromCache = cache[diff];
                    if (cache[i] > valFromCache + 1) {
                        // update cache
                        cache[i] = valFromCache + 1;
                    }
                }
            }
        }
        if (cache[amount] == amount + 1) {
            return -1;
        } else {
            return cache[amount];
        }
    }

    /*
    I can cache an amount to the best solution and then try to find in the cache when needed
     */

    public int coinChange_v1(int[] coins, int amount) {
        cache = new int[amount + 1];
        Arrays.fill(cache, -2);
        return change2(coins, amount);
    }

    public int change2(int[] coins, int amount) {

        if (cache[amount] != -2) {
            return cache[amount];
        }

        if (amount == 0) {
            return 0;
        }

        int best = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount >= coins[i]) {
                int changeRes = change2(coins, amount - coins[i]);
                if (changeRes != -1) {
                    int res = 1 + changeRes;
                    if (best > res) {
                        best = res;
                    }
                }
            }
        }
        if (best != Integer.MAX_VALUE) {
            cache[amount] = best;
            return best;

        } else {
            cache[amount] = -1;
            return -1;
        }
    }
}