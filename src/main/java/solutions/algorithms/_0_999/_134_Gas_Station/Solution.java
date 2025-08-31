package solutions.algorithms._0_999._134_Gas_Station;

class Solution {

    /*
    So return the index of the gas station from which I can start and travel endlessly

    It seems that for each gas station I could calculate a difference between the cost of getting there from the previous
    gas station and amount of gas I can tank there.
    If the sum of these differences is negative, the answer is -1
    also, I can start only at these gas stations where the cost is lower than the amount of gas.

    update:
    I checked the solution on neetcode, since I couldn’t find it in a reasonable time.

    last comment: the first solution found after reaching the end of the array is our answer.
    If there's something else and it's negative, it can't be a new solution. If it's positive - it only adds to our previous starting point.

     */
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int temp = 0;
        int start = 0;
        for (int i = 0; i < cost.length; i++) {
            int val = gas[i] - cost[i];
            total += val;
            temp += val;
            if (temp <= 0) {
                temp = 0;
                start = i + 1;
            }
        }

        if (total < 0) {
            return -1;
        } else {
            return start % cost.length;
        }
    }
}