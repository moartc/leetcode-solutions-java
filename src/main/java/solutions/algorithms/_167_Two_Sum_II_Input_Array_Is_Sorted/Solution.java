package solutions.algorithms._167_Two_Sum_II_Input_Array_Is_Sorted;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (map.containsKey(target - num)) {
                int first = map.get(target - num);
                return new int[]{first + 1, i + 1};
            } else {
                map.put(num, i);
            }
        }
        return new int[]{0, 0};
    }
}