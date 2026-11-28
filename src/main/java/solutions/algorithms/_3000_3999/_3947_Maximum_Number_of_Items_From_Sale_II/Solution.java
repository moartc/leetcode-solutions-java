package solutions.algorithms._3000_3999._3947_Maximum_Number_of_Items_From_Sale_II;

import java.util.Arrays;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        // items[i] = [factor_i, price_i]

        int[] factors = new int[items.length + 1];
        int theCheapest = Integer.MAX_VALUE;
        for (int i = 0; i < items.length; i++) {
            theCheapest = Math.min(items[i][1], theCheapest);
            int factor = items[i][0];
            factors[factor]++;
        }

        int[] prodToFreeCopies = new int[items.length + 1];

        for (int factor = 1; factor <= items.length; factor++) {
            int mult = 1;
            int freeItems = -1; // my own copy
            while (mult * factor <= items.length) {
                freeItems += factors[mult * factor];
                mult++;
            }
            prodToFreeCopies[factor] = freeItems;
        }

        Arrays.sort(items, (o1, o2) -> o1[1] - o2[1]);

        int copies = 0;
        for (int[] item : items) {
            int currFactor = item[0];
            int currPrice = item[1];
            if (currPrice > 2 * theCheapest) {
                break;
                // I should buy the cheapest one
            }
            int freeCopies = prodToFreeCopies[currFactor];
            int numberOfCopiesICanBuy = budget / currPrice;
            int numberOfCopiesIShouldBuy = Math.min(numberOfCopiesICanBuy, freeCopies);

            budget -= numberOfCopiesIShouldBuy * currPrice;
            copies += (numberOfCopiesIShouldBuy * 2);
        }

        // buy the cheapest item for the remaining budget
        int numberOfTheCheapestICanBuy = budget / theCheapest;
        copies += numberOfTheCheapestICanBuy;
        return copies;
    }
}