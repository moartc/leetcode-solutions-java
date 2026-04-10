package solutions.algorithms._3000_3999._3740_Minimum_Distance_Between_Three_Equal_Elements_I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int minimumDistance(int[] nums) {

        Map<Integer, List<Integer>> valToIndices = new HashMap<>();
        int minFound = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            List<Integer> list = valToIndices.getOrDefault(val, new ArrayList<>());
            list.add(i);
            valToIndices.put(val, list);
            if (list.size() >= 3) {
                int first = list.get(list.size() - 3);
                int second = list.get(list.size() - 2);
                int last = list.get(list.size() - 1);
                int size = (second - first) + (last - first) + (last - second);
                minFound = Math.min(size, minFound);
            }
        }
        return minFound == Integer.MAX_VALUE ? -1 : minFound;
    }
}