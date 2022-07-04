package solutions.algorithms._39_Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> toReturn = new ArrayList<>();
        generate(candidates, new ArrayList<>(), 0, target, toReturn);
        return toReturn;
    }

    void generate(int[] candidates, List<Integer> current, int currentSum, int target, List<List<Integer>> toReturn) {
        if (currentSum == target) {
            toReturn.add(current);
        } else {
            for (int c : candidates) {
                if (currentSum + c > target) {
                    break;
                } else if (currentSum + c <= target && (current.isEmpty() || c >= current.get(current.size() - 1))) {
                    List<Integer> newCurrent = new ArrayList<>(current);
                    newCurrent.add(c);
                    generate(candidates, newCurrent, currentSum + c, target, toReturn);
                }
            }
        }
    }
}