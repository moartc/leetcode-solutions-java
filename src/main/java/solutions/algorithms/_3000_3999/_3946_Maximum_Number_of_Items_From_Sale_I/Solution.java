package solutions.algorithms._3000_3999._3946_Maximum_Number_of_Items_From_Sale_I;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int theCheapest = Integer.MAX_VALUE;

        int[] prodToFreeCopies = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            // i'll need it later
            theCheapest = Math.min(theCheapest, items[i][1]);
            int mainItemFactor = items[i][0];
            int ctr = 0;
            for (int j = 0; j < items.length; j++) {
                int otherFactor = items[j][0];
                if (i != j) {
                    if (otherFactor % mainItemFactor == 0) {
                        ctr++;
                    }
                }
            }
            prodToFreeCopies[i] = ctr;
        }

        // how many items i can but for the budget == i
        int[] dp = new int[budget + 1];
        dp[0] = 0;

        for (int i = 0; i < items.length; i++) {
            int[] item = items[i];
            int price = item[1];
            for (int currBudget = budget; currBudget > 0; currBudget--) {
                if (currBudget >= price) {
                    int freeProducts = prodToFreeCopies[i];
                    int remainingPrice = currBudget - price;
                    int productsForRemaining = dp[remainingPrice];
                    int withBuying = 1 + freeProducts + productsForRemaining;
                    // consider skipping
                    dp[currBudget] = Math.max(dp[currBudget], withBuying);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            int remainingBudget = budget - i;
            int numberOfItems = remainingBudget / theCheapest;
            int totalForBudget = dp[i] + numberOfItems;
            max = Math.max(totalForBudget, max);
        }

        return max;
    }
}