package solutions.algorithms._47_Permutations_II;

import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> resultSet = new HashSet<>();
        addNext(nums, new boolean[nums.length], new ArrayList<>(), resultSet);
        return resultSet.stream().toList();
    }

    void addNext(int[] all, boolean[] added, List<Integer> currentList, Set<List<Integer>> toReturn) {

        if (currentList.size() == all.length ) {
            toReturn.add(currentList);
        } else {
            for (int i = 0; i < all.length; i++) {
                if (!added[i]) {
                    boolean[] newAdded = Arrays.copyOf(added, added.length);
                    newAdded[i] = true;
                    List<Integer> newCurrent = new ArrayList<>(currentList);
                    newCurrent.add(all[i]);
                    addNext(all, newAdded, newCurrent, toReturn);
                }
            }
        }
    }
}


