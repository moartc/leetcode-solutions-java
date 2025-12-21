package solutions.algorithms._0_999._77_Combinations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    Recursive function that starts at the first number and can make 2 decisions
    - add the current number to the list
    - skip the current number
    then we call the same function passing the updated list for the next number
    at the beginning of this function I can check if the size of the current list is equal to k,
    if so I add it to the list of results.

    It works but it beats only 9.9%
    Trying another oslution with backtracking - it's a little better - 33%

     */

    List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {

        if (k > n) {
            return new ArrayList<>();
        }
        result = new ArrayList<>();
        add(n, k, new ArrayList<>(), 1);
        return result;
    }

    void add(int n, int k, List<Integer> currentList, int currentInt) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
        } else if (currentInt > n) {
            return;
        } else {
            // go further with the same list
            currentList.add(currentInt);
            add(n, k, currentList, currentInt + 1);
            // when I am back, delete the last one
            currentList.remove(currentList.size() - 1);
            add(n, k, currentList, currentInt + 1);
        }
    }
}