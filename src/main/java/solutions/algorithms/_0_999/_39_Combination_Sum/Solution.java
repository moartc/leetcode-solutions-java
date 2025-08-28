package solutions.algorithms._0_999._39_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    note:
    the input array is not sorted

    algorithm
    start with a number (based on the candidates array index)
    first check if the current array sums to expected value (I can pass current sum as a parameter) - if so, then add it to the result array
    then check if I can add the current element to the current list (based on sum of this element and current sum) - if so, add and loop:
    from the current index (I can add the same value multiple times) to the end of the array and call the same method recursively
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        createSubset(0, 0, emptyList, resultList, candidates, target);
        return resultList;
    }


    void createSubset(int currIdx, int currentSum, List<Integer> currentSet, List<List<Integer>> result, int[] candidates, int target) {

        // I cannot check before adding the current element because it leads to duplicates
        for (int i = currIdx; i < candidates.length; i++) {
            int currentValue = candidates[i];
            if (currentSum + currentValue == target) {
                // add it once here
                var newSet = new ArrayList<>(currentSet);
                newSet.add(currentValue);
                result.add(newSet);
                // and return
            } else if (currentSum + currentValue < target) {
                // I need a copy
                var newSet = new ArrayList<>(currentSet);
                newSet.add(currentValue);
                var updatedSum = currentSum + currentValue;
                createSubset(i, updatedSum, newSet, result, candidates, target);
            }
        }
    }
}