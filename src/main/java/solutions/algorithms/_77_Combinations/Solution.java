package solutions.algorithms._77_Combinations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> listToReturn = new ArrayList<>();
        append(0, n, k, new LinkedList<>(), listToReturn);
        return listToReturn;
    }

    void append(int start, int n, int k, List<Integer> listToAppend, List<List<Integer>> finalList) {
        if (listToAppend.size() < k) {
            for (int i = start + 1; i <= n; i++) {
                if (k - listToAppend.size() <= (n  - i+1)) {
                    List<Integer> newList = new LinkedList<>(listToAppend);
                    newList.add(i);
                    append(i, n, k, newList, finalList);
                }
            }
        } else if (listToAppend.size() == k) {
            finalList.add(listToAppend);
        }
    }
}