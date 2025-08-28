package solutions.algorithms._0_999._40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    /*
    Actually something similar to the previous problem "39. Combination Sum"

    notes:
    It might make sense to sort the elements
    then I can avoid cases where for ... 1, 7, 1... I create [1,7] and [7,1]

    I make from [10, 1, 2, 7, 6, 1, 5] this -> [1, 1, 2, 5, 6, 7, 10]

    I should start with the same number only once

     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        // start with the same number only once
        int i = 0;
        ArrayList<Integer> emptyArray = new ArrayList<>();
        while (i < candidates.length) {
            int valueForI = candidates[i];
            createSet(i, 0, emptyArray, result, candidates, target);
            int newI = i;
            while (newI < candidates.length && candidates[newI] == valueForI) {
                newI++;
            }
            i = newI;
        }
        return result;
    }


    void createSet(int currentIdx, int currentSum, List<Integer> currentSet, List<List<Integer>> resultList, int[] candidates, int target) {
        int value = candidates[currentIdx];

        if (value + currentSum == target) {
            List<Integer> newSet = new ArrayList<>(currentSet);
            newSet.add(value);
            resultList.add(newSet);
        } else if (value + currentSum < target) {
            int i = currentIdx + 1;
            List<Integer> newSet = new ArrayList<>(currentSet);
            newSet.add(value);
            while (i < candidates.length) {
                createSet(i, currentSum + value, newSet, resultList, candidates, target);
                int valueForI = candidates[i];
                int newI = i;
                while (newI < candidates.length && candidates[newI] == valueForI) {
                    newI++;
                }
                i = newI;
            }
        }
    }
}
