package solutions.algorithms._1000_1999._1049_Last_Stone_Weight_II;

class Solution {
    /*
    so basically there is a trick that I should divide all stones in 2 groups
    whose sums are as close as possible to totalSum / 2

    I can use a recursive method for this, visiting all combinations where
    I either include a number or exclude it and keep track of the value closest to totalSum / 2.

    update: TLE - I am adding caching
    improve performance (beats ~5%):
     - replacing map with 2d array - beats 60%

     simulation:
     2   0 2
     7   0 2 7 9
     4   0 2 4 7 11 13
     1
     8
     1
     I can iterate through all stones and for each stone through all sums in 0..expectedSum range
     rewritten version beats 71%
     */

    boolean[][] dp;

    public int lastStoneWeightII(int[] stones) {

        int totalSum = 0;
        for (int stone : stones) {
            totalSum += stone;
        }
        int expectedSum = (totalSum) / 2;

        // iterate to expectedSum only and cache it in dp
        dp = new boolean[stones.length][expectedSum + 1];
        for (int i = 0; i < stones.length; i++) {
            int stone = stones[i];

            if (i == 0) {
                if (stone <= expectedSum) {
                    dp[i][stone] = true;
                }
                // also - 0 always can be set
                dp[i][0] = true;
            } else {
                for (int j = 0; j <= expectedSum; j++) {
                    if (dp[i - 1][j]) { // can reach
                        // add the same = it's like skipping the stone
                        dp[i][j] = true;
                        if (j + stone <= expectedSum) {
                            // add the current
                            dp[i][j + stone] = true;
                        }
                    }
                }
            }

        }

        int firstIndexWithReachableSum = 0;
        for (int i = dp[stones.length - 1].length - 1; i >= 0; i--) {
            if (dp[stones.length - 1][i]) {
                firstIndexWithReachableSum = i;
                break;
            }
        }
        return totalSum - 2 * firstIndexWithReachableSum;
    }
}