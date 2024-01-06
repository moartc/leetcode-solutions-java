package solutions.algorithms._0_999._78_Subsets;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int size = (int) Math.pow(2, nums.length);
        List<List<Integer>> resultList = new ArrayList<>(size);
        resultList.add(List.of());

        for (int elemNum = 1; elemNum <= nums.length; elemNum++) {
            for (int index = 0; index < nums.length - elemNum + 1; index++) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[index]);
                add(list, index, resultList, elemNum, nums);
            }
        }
        return resultList;
    }

    private void add(List<Integer> currentList, int index, List<List<Integer>> resultList, int elemNum, int[] nums) {
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