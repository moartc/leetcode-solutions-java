package solutions.algorithms._0_999._135_Candy;

class Solution {

    /*
    to fulfil the first requirement I need n candies, where n = ratings.length

    I can have something like this:
    0 1 2 3 2 3 1 0
    I skip assigning 1 to all of them and just assume it's already done
    interesting case, when I have 2 decreasing values:
    1 3 2 1
    starting from 0:
    I keep 1
    I increase 3 to 1
    I increase 2 to 1 -> because of the following '1' but then the value for '3' becomes invalid

    the easiest solution: create an endless loop, iterate through the values and 'fix' them until
    there is an iteration with no changes.

    update: this works (after some additional fixes) but beats 5.17% only

    update2: I can iterate twice in both directions
    first check and update the values comparing the current one with the left neighbour
    then do the same comparing it with the right neighbour
     */

    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int candiesCtr = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                int diff = candies[i - 1] - candies[i];
                candies[i] = (diff + 1);
                candiesCtr += (diff + 1);
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                int diff = candies[i + 1] - candies[i];
                candies[i] = (diff + 1);
                candiesCtr += (diff + 1);
            }
        }
        return candiesCtr + ratings.length;
    }

    // initial poor solution
    public int candy1(int[] ratings) {

        int[] candies = new int[ratings.length];

        int candyCalc = 0;
        boolean changesDone = true;
        while (changesDone) {

            changesDone = false;
            for (int i = 0; i < ratings.length; i++) {
                if (i > 0) {
                    if (ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                        int diff = candies[i - 1] - candies[i];
                        candies[i] += (diff + 1);
                        candyCalc += (diff + 1);
                        changesDone = true;
                    }
                }
                if (i < ratings.length - 1) {
                    if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                        int diff = candies[i + 1] - candies[i];
                        candies[i] += (diff + 1);
                        candyCalc += (diff + 1);
                        changesDone = true;
                    }
                }
            }
        }
        return candyCalc + ratings.length;
    }
}