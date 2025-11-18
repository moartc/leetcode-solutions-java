package solutions.algorithms._1000_1999._1011_Capacity_To_Ship_Packages_Within_D_Days;

class Solution {

    /*
    total sum in the array divided by the number of days or the maximum value in the weights array
     is the lowest possible value
    The maximum is the total sum (I can't think of a better upper bound)

    after reading the hint:
    I can binary search the answer (by checking each value)
     */
    public int shipWithinDays(int[] weights, int days) {

        int current = 0;
        int maxWeight = 0;
        for (int weight : weights) {
            current += weight;
            if (maxWeight < weight) {
                maxWeight = weight;
            }
        }
        int max = current;
        int minAvg = (int) Math.ceil((double) max / days);
        int min = Math.max(minAvg, maxWeight);
        return findAnswer(weights, min, max, days);
    }

    int findAnswer(int[] weights, int min, int max, int maxDays) {
        int mid = min + (max - min) / 2;

        if (min == max) {
            return max;
        }
        if (canSolveInLimit(weights, mid, maxDays)) {
            return findAnswer(weights, min, mid, maxDays);
        } else {
            return findAnswer(weights, mid + 1, max, maxDays);
        }
    }

    boolean canSolveInLimit(int[] weights, int limit, int maxDays) {
        int currentLoad = 0;
        int currentDays = 1;
        for (int weight : weights) {
            if (currentLoad + weight > limit) {
                currentDays++;
                currentLoad = weight;
                if (currentDays > maxDays) {
                    return false;
                }
            } else {
                currentLoad += weight;
            }
        }
        return true;
    }
}