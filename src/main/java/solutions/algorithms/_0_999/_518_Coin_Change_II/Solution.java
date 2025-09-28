package solutions.algorithms._0_999._518_Coin_Change_II;

import java.util.Arrays;

class Solution {

    /*
    Recursive solution
     */

    int[][] cache;

    public int change(int amount, int[] coins) {
        cache = new int[amount][coins.length];
        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        return findNumberOfCombinations(0, amount, 0, coins);
    }

    int findNumberOfCombinations(int currentAmount, int amount, int currentCoinIdx, int[] coins) {

        if (currentCoinIdx >= coins.length) {
            return 0;
        }

        if (currentAmount > amount) {
            return 0;
        }

        if (currentAmount == amount) {
            return 1;
        }

        if (cache[currentAmount][currentCoinIdx] != -1) {
            return cache[currentAmount][currentCoinIdx];
        }

        int coinVal = coins[currentCoinIdx];

        int numberOfCombinations = findNumberOfCombinations(currentAmount, amount, currentCoinIdx + 1, coins);
        numberOfCombinations += findNumberOfCombinations(currentAmount + coinVal, amount, currentCoinIdx, coins);

        cache[currentAmount][currentCoinIdx] = numberOfCombinations;
        return cache[currentAmount][currentCoinIdx];
    }


}