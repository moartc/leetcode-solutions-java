package solutions.algorithms._46_Permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> toReturn = new ArrayList<>();
        addRest(new ArrayList<>(), nums, toReturn);
        return toReturn;
    }

    void addRest(List<Integer> list, int[] allNums, List<List<Integer>> toReturn) {
        if (list.size() == allNums.length) {
            toReturn.add(list);
        } else {
            for (int num : allNums) {
                if (!list.contains(num)) {
                    List<Integer> newList = new ArrayList<>(list);
                    newList.add(num);
                    addRest(newList, allNums, toReturn);
                }
            }
        }
    }
}