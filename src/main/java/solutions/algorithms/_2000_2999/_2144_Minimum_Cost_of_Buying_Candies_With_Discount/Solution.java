package solutions.algorithms._2000_2999._2144_Minimum_Cost_of_Buying_Candies_With_Discount;

import java.util.Arrays;

class Solution {

    /*
    sort, going backwards, buy 2 then get the next one for free
    repeat
     */
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);
        int buyCost = 0;
        int candyCtr = 1;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (candyCtr == 3) {
                // no cost
                candyCtr = 1;
            } else {
                candyCtr++;
                buyCost += cost[i];
            }
        }
        return buyCost;
    }
}