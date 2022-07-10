package solutions.algorithms._40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> toReturn = new ArrayList<>();
        generate(candidates, new ArrayList<>(), 0, target, 0, toReturn);
        return toReturn;
    }

    void generate(int[] candidates, List<Integer> current, int currentSum, int target, int lastIndex, List<List<Integer>> toReturn) {
        if (currentSum == target) {
            toReturn.add(current);
        } else {
            int counter = -1;
            for (int i = lastIndex; i < candidates.length; i++) {
                counter++;
                if (currentSum + candidates[i] > target) {
                    return;
                } else if (counter > 0 && candidates[i - 1] == candidates[i]) {
                    continue;
                } else if (currentSum + candidates[i] <= target) {
                    List<Integer> newCurrent = new ArrayList<>(current);
                    newCurrent.add(candidates[i]);
                    generate(candidates, newCurrent, currentSum + candidates[i], target, i + 1, toReturn);
                }
            }
        }
    }
}
