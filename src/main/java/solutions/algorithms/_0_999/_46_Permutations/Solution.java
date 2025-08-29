package solutions.algorithms._0_999._46_Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {


    /*
    This is another approach, where I try not to copy arrays all the time, but to do something more like backtracking instead

    It's actually not better than the previous one - beats 92.67% (1ms), it is sometimes even 2ms
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] nothingVisited = new boolean[nums.length];
        addPermutation(new ArrayList<>(), nums, nothingVisited, result);

        return result;
    }

    void addPermutation(List<Integer> currentPermutation, int[] nums, boolean[] visited, List<List<Integer>> results) {

        if (currentPermutation.size() == nums.length) {
            // but I still have to copy it here
            results.add(new ArrayList<>(currentPermutation));
        }

        // and call it for other elements
        for (int i = 0; i < nums.length; i++) {

            // but don't visit already visited
            if (!visited[i]) {
                int valAtIdx = nums[i];
                visited[i] = true;
                currentPermutation.add(valAtIdx);
                addPermutation(currentPermutation, nums, visited, results);
                // just remove the last added element and revert visited
                currentPermutation.remove(currentPermutation.size() - 1);
                visited[i] = false;
            }
        }
    }


    // ############################################# INITIAL APPROACH #############################################

    /*
    I can start with an empty array from the first index
    then for every element - add a value on the current index
    If I add it - I can track added values (their indices) in a boolean array (I don't want to have any duplicates and even visit it again)

    because I might add first value at index i + n and then i, I have to iterate the whole array instead of going forward
    to the next index (idx+1)

    some processing example
    starting with [1,2,3]
    I can initially call my new method 3 times, for 1, 2 and 3
    then add it and I have 3 calls like:
    [1]
    [2]
    [3]
    and mark the added indices
    for each of them, iterate from the beginning through the nums array and if index is not yet added - visit it
    ------------

    this solution beats 34.60% (2ms) - 92.67% (1ms)
     */
    public List<List<Integer>> permute_v1(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] nothingVisited = new boolean[nums.length];
        List<Integer> emptyList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            findPermutation_v1(i, emptyList, nothingVisited, nums, result);
        }
        return result;
    }

    void findPermutation_v1(int currentIndex, List<Integer> currentPermutations, boolean[] alreadyVisited, int[] nums,
                            List<List<Integer>> result) {
        if (alreadyVisited[currentIndex]) {
            // nothing to do here
            return;
        } else {
            int valueAtIdx = nums[currentIndex];
            // now add it
            List<Integer> newList = new ArrayList<>(currentPermutations);
            newList.add(valueAtIdx);
            // here I might already finish and I need to check it here, because there are no other elements to visit
            if (newList.size() == nums.length) {
                result.add(newList);
                return;
            }
            boolean[] updatedVisited = Arrays.copyOf(alreadyVisited, alreadyVisited.length);
            updatedVisited[currentIndex] = true;
            // and now, visit all not visited
            for (int i = 0; i < nums.length; i++) {
                if (!updatedVisited[i]) {
                    findPermutation_v1(i, newList, updatedVisited, nums, result);
                }
            }
        }
    }

}