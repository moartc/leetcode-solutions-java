package solutions.algorithms._0_999._78_Subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        // handle empty here
        result.add(new ArrayList());

        for (int i = 0; i < nums.length; i++) {
            createSubset(i, nums, new ArrayList<>(), result);
        }

        return result;
    }

    void createSubset(int currentIndex, int[] nums, List<Integer> currentList, List<List<Integer>> result) {
        int currentValue = nums[currentIndex];
        // create a copy
        var newList = new ArrayList<>(currentList);
        newList.add(currentValue);
        result.add(newList);

        for (int i = currentIndex + 1; i < nums.length; i++) {
            createSubset(i, nums, newList, result);
        }
    }
}