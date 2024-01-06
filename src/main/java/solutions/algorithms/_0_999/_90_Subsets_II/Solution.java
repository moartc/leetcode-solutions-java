package solutions.algorithms._0_999._90_Subsets_II;

import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        resultSet.add(List.of());
        for (int elemNum = 1; elemNum <= nums.length; elemNum++) {
            Set<Integer> handled = new HashSet<>();
            for (int index = 0; index < nums.length - elemNum + 1; index++) {
                if (handled.contains(nums[index])) {
                    continue;
                }
                List<Integer> list = new ArrayList<>();
                list.add(nums[index]);
                handled.add(nums[index]);
                add(list, index, resultSet, elemNum, nums);
            }
        }
        return new ArrayList<>(resultSet);
    }

    private void add(List<Integer> currentList, int index, Set<List<Integer>> resultList, int elemNum, int[] nums) {
        if (currentList.size() == elemNum) {
            resultList.add(currentList);
        } else {
            for (int i = index + 1; i < nums.length; i++) {
                List<Integer> newList = new ArrayList<>(currentList);
                newList.add(nums[i]);
                add(newList, i, resultList, elemNum, nums);
            }
        }
    }
}