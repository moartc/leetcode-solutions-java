package solutions.algorithms._3000_3999._3364_Minimum_Positive_Sum_Subarray;

import java.util.List;
import java.util.TreeMap;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int[] prefixBeforeIdx = new int[nums.size() + 1];
        prefixBeforeIdx[0] = 0;
        for (int i = 0; i < nums.size(); i++) {
            prefixBeforeIdx[i + 1] = prefixBeforeIdx[i] + nums.get(i);
        }
        int bestFound = Integer.MAX_VALUE;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = l - 1; i < nums.size(); i++) {
            int toRemove = i - r;
            if (toRemove >= 0) {
                int valToRemove = prefixBeforeIdx[toRemove];
                Integer counter = map.get(valToRemove);
                if (counter == 1) {
                    map.remove(valToRemove);
                } else {
                    map.put(valToRemove, counter - 1);
                }
            }
            int idxToAdd = i - l + 1;
            int valueToAdd = prefixBeforeIdx[idxToAdd];

            int currValueCtr;
            if (map.containsKey(valueToAdd)) {
                currValueCtr = map.get(valueToAdd) + 1;
            } else {
                currValueCtr = 1;
            }
            map.put(valueToAdd, currValueCtr);
            int curr = prefixBeforeIdx[i + 1];
            Integer bestPrev = map.lowerKey(curr);
            if (bestPrev == null) {
                continue;
            }
            int minTotal = curr - bestPrev;
            bestFound = Math.min(minTotal, bestFound);
        }
        return bestFound == Integer.MAX_VALUE ? -1 : bestFound;
    }
}