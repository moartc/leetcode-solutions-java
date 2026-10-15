package solutions.algorithms._2000_2999._2913_Subarrays_Distinct_Element_Sum_of_Squares_I;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int sumCounts(List<Integer> nums) {

        int counter = 0;
        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> setCounter = new HashSet<>();
            for (int j = i; j < nums.size(); j++) {
                setCounter.add(nums.get(j));
                int size = setCounter.size();
                counter += (size * size);
            }
        }
        return counter;
    }
}