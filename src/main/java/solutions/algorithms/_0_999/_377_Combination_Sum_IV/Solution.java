package solutions.algorithms._0_999._377_Combination_Sum_IV;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /*
    At every step iterate through sorted array skipping duplications

    update: I need a cache, and it works without sorting, but it only beats  6.75%
    todo to improve
     */

    Map<Integer, Integer> cache = new HashMap<>();

    public int combinationSum4(int[] nums, int target) {

        return add(0, nums, target);
    }

    int add(int currentSum, int[] nums, int target) {

        if (cache.containsKey(currentSum)) {
            return cache.get(currentSum);
        }
        if (currentSum == target) {
            return 1;
        } else if (currentSum > target) {
            return 0;
        } else {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                res += add(currentSum + nums[i], nums, target);
            }
            cache.put(currentSum, res);
            return res;
        }
    }
}