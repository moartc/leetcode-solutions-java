package solutions.algorithms._0_999._473_Matchsticks_to_Square;

import java.util.Arrays;

class Solution {

    /*
    I could iterate through the whole array and compute the total sum
    one edge is equal to the total length divided by 4.
    I could also sort this array, so I can skip the same element.
    Then I start from the first element, if the total length is less than the expected one I add the next one.
    When at some point the total length is greater than the expected one, I revert my previous choice,
    skip the previously added length and get the next one. The first added match should not be 'undone'
    since there is a requirement that all matches have to be used.
     */
    public boolean makesquare(int[] matchsticks) {

        Arrays.sort(matchsticks);
        for (int l = 0, r = matchsticks.length - 1; l < r; l++, r--) {
            int tmp = matchsticks[l];
            matchsticks[l] = matchsticks[r];
            matchsticks[r] = tmp;
        }
        int totalSum = 0;
        for (int matchstick : matchsticks) {
            totalSum += matchstick;
        }
        if (totalSum % 4 != 0) {
            // idk if it makes sense, but let's make sure it's possible to build a square
            return false;
        }
        int edgeL = totalSum / 4;

        if (matchsticks[0] > edgeL) {
            return false;
        }

        boolean[] used = new boolean[matchsticks.length];

        return match(0, matchsticks, 0, used, edgeL);
    }

    boolean match(int alreadyMatchedSides, int[] matchSticks, int currentSum, boolean[] used, int expected) {

        if (currentSum == expected) {
            alreadyMatchedSides++;
            currentSum = 0;
        }

        if (alreadyMatchedSides == 3) {
            return true;
        }

        int i = 0;
        while (i < matchSticks.length) {

            if (!used[i]) {
                if (currentSum + matchSticks[i] <= expected) {

                    used[i] = true;
                    if (match(alreadyMatchedSides, matchSticks, currentSum + matchSticks[i], used, expected)) {
                        // if I found, return true
                        return true;
                    } else {
                        // revert and try the next one
                        if (i == 0) {
                            // I shouldn't revert the first one, since it has to be used
                            return false;
                        }
                        used[i] = false;
                        // since the previous one didn't work, it means that all the same values won't work
                        while (i + 1 < matchSticks.length && matchSticks[i] == matchSticks[i + 1]) {
                            i++;
                        }
                    }
                }
            }
            i++;
        }
        return false;
    }
}