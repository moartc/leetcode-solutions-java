package solutions.algorithms._0_999._746_Min_Cost_Climbing_Stairs;

import java.util.Arrays;

class Solution {

    /*
    Similar to the problem "70. Climbing Stairs"
     */

    // lower cost to reach the end from this step
    int[] cache;

    public int minCostClimbingStairs(int[] cost) {

        cache = new int[cost.length + 1];
        Arrays.fill(cache, -1);
        solve(0, cost);
        solve(1, cost);
        return Math.min(cache[0], cache[1]);
    }

    private int solve(int currentStep, int[] cost) {
        int currentCost = cost[currentStep];

        if (cache[currentStep] == -1) {
            if (currentStep == cost.length - 1 || currentStep == cost.length - 2) {
                cache[currentStep] = currentCost;
            } else {
                int firstPath = solve(currentStep + 1, cost);
                int secondPath = solve(currentStep + 2, cost);
                int min = currentCost + Math.min(firstPath, secondPath);
                cache[currentStep] = min;
            }
        }
        return cache[currentStep];
    }

}