package solutions.algorithms._322_Coin_Change;

import java.util.Arrays;

class Solution {

    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        for (int c = 0; c < coins.length; c++) {
            for (int a = 1; a <= amount; a++) {
                if(c > a) {
                    continue;
                }
                int cV = coins[c];
                int rest = a - cV;
                if (rest < 0 || arr[rest] == Integer.MAX_VALUE) {
                    continue;
                }
                int toAdd = 1 + arr[rest];
                if (arr[a] > toAdd) {
                    arr[a] = toAdd;
                }
            }
        }
        return arr[amount] == Integer.MAX_VALUE ? -1 : arr[amount];
    }
}