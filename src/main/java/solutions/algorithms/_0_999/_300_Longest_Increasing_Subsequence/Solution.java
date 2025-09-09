package solutions.algorithms._0_999._300_Longest_Increasing_Subsequence;

import java.util.*;

class Solution {

    // recursion with caching, beats 30%
    int[] cache;

    public int lengthOfLIS(int[] nums) {

        cache = new int[nums.length];
        Arrays.fill(cache, -1);

        int best = -1;
        for(int i = 0; i < nums.length; i++) {
            best = Math.max(solve(i, nums), best);
        }

        return best;
    }

    int solve(int idx, int[] nums) {

        if(idx == nums.length-1) {
            return 1;
        }

        if(cache[idx] != -1) {
            return cache[idx];
        }

        // from the current index I can go to any which is further in the nums array and has a greater value
        int current = nums[idx];
        int bestSolved = 1;
        for (int i = idx+1; i < nums.length; i++) {
            int v = nums[i];
            if(v > current) {
                bestSolved = Math.max(1 + solve(i, nums), bestSolved);
            }
        }
        cache[idx] = bestSolved;
        return bestSolved;
    }


    // below the first solution which beats ~20%
    /*
    I can track in a sorted map the max increasing subsequence to the current value
    update:
    my solution below, but it's O(n^2)
     */
    public int lengthOfLIS_v1(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(nums[0], 1);

        int currentMaxToReturn = 1;
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            // find max path for lower keys
            int maxFound = 0;
            for (Integer value : map.headMap(val).values()) {
                if (value > maxFound) {
                    maxFound = value;
                }
            }
            if (currentMaxToReturn < maxFound + 1) {
                currentMaxToReturn = maxFound + 1;
            }
            map.put(val, maxFound + 1);
        }

        return currentMaxToReturn;
    }
}

