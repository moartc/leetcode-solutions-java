package solutions.algorithms._0_999._978_Longest_Turbulent_Subarray;

class Solution {

    /*
    so basically the sequence a,b,c,d, should look like a>b<c>d or a<b>c<d and so on.

    I can iterate through the whole array and compare pairs at indices i and j.
    - special case: handle arrays of size < 2
    - First I compare the first 2 elements and, based on that, set a boolean flag telling me what comparison sign is expected next
    I also set a counter to 1.
    As I move forward, I check if the next pair matches what I expected (based on my flag). If it does,
    then I increase the counter and continue,
    if it doesn't: I compare the current result with the best one found so far and update it if needed.
    Since the numbers are not as expected I check them: if they are equal I just move forward and keep the info that I should try
    to initialise the counter and flag at the next pair.
    If they're not equal, then the inequality is opposite to the expected one, so I can reset the counter to 1
    and keep the boolean as it was - the next comparison should match the current pair's comparison sign.

    update: - additional check at the end if the counter is greater than the best found so far (I forgot about it)
    it beats 98.45%
     */
    public int maxTurbulenceSize(int[] arr) {


        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return 1;
        }
        int bestSoFar = 0;

        boolean nextSecondLower = false;
        boolean shouldInitialiseAtTheNextPair = true;
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            int f = arr[i];
            int s = arr[i + 1];
            if (shouldInitialiseAtTheNextPair) {
                if (f < s) {
                    nextSecondLower = true;
                    counter = 1;
                    shouldInitialiseAtTheNextPair = false;
                } else if (f > s) {
                    nextSecondLower = false;
                    counter = 1;
                    shouldInitialiseAtTheNextPair = false;
                } else {
                    // they're equal - continue to the next pair
                    continue;
                }
            } else {
                if (f < s) {
                    if (nextSecondLower) {
                        // not as expected
                        bestSoFar = Math.max(bestSoFar, counter);
                        counter = 1;

                    } else {
                        // it's a correct case
                        counter++;
                        nextSecondLower = !nextSecondLower;
                    }
                } else if (f > s) {
                    if (nextSecondLower) {
                        // correct case
                        counter++;
                        nextSecondLower = !nextSecondLower;
                    } else {
                        bestSoFar = Math.max(bestSoFar, counter);
                        counter = 1;
                    }
                } else { // they're equal
                    // check if it's the best result - reset at the next pair
                    bestSoFar = Math.max(bestSoFar, counter);
                    shouldInitialiseAtTheNextPair = true;
                }
            }
        }
        bestSoFar = Math.max(bestSoFar, counter);
        return bestSoFar + 1;

    }
}