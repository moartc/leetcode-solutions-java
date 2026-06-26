package solutions.algorithms._3000_3999._3741_Minimum_Distance_Between_Three_Equal_Elements_II;

import java.util.*;

class Solution {

    public int minimumDistance(int[] nums) {

        Map<Integer, List<Integer>> valToIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            List<Integer> list = valToIndices.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            valToIndices.put(nums[i], list);
        }

        int best = Integer.MAX_VALUE;
        for (List<Integer> list : valToIndices.values()) {
            if (list.size() >= 3) {
                Collections.sort(list);
                for (int i = 0; i + 2 < list.size(); i++) {
                    int f = list.get(i);
                    int t = list.get(i + 2);
                    // s - f + t - f + t - s = -2f + 2t
                    int r = t + t - f - f;
                    best = Math.min(r, best);
                }
            }
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}