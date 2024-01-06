package solutions.algorithms._0_999._15_3Sum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.merge(i, 1, (integer, integer2) -> ++integer);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry1 : map.entrySet()) {
            int key1 = entry1.getKey();
            if(key1 > 0) {
                continue;
            }
            for (int key2 : map.keySet()) {
                if(key2 < key1) {
                    continue;
                }
                int toFind = -(key1 + key2);
                if (toFind < key2) {
                    continue;
                }
                if (map.containsKey(toFind)) {
                    if (key1 != key2 && key2 != toFind) {
                        result.add(List.of(key1, key2, toFind));
                    } else {
                        if (key1 == key2) { // i == j
                            if (key1 == toFind) { // i == j == k
                                if (entry1.getValue() >= 3) {
                                    result.add(List.of(key1, key2, toFind));
                                }
                            } else if (map.get(key1) >= 2) {
                                result.add(List.of(key1, key2, toFind));
                            }
                        } else if (map.get(toFind) >= 2) { // i != j && (i == k || j == k)
                            result.add(List.of(key1, key2, toFind));
                        }
                    }
                }
            }
        }
        return result;
    }
}