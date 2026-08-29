package solutions.algorithms._2000_2999._2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    /*
    1. create list of connected elements (indices)
    2. sort elements within list
     */
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        // 0 - value, 1 - index
        int[][] numToIdx = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numToIdx[i][0] = nums[i];
            numToIdx[i][1] = i;
        }
        Arrays.sort(numToIdx, Comparator.comparingInt(o -> o[0]));
        List<List<int[]>> listOfGroups = new ArrayList<>();

        List<int[]> currentGroup = new ArrayList<>();
        currentGroup.add(numToIdx[0]);
        for (int i = 1; i < numToIdx.length; i++) {
            int[] lastAdded = currentGroup.get(currentGroup.size() - 1);
            int diff = Math.abs(lastAdded[0] - numToIdx[i][0]);
            if (diff <= limit) {
                currentGroup.add(numToIdx[i]);
            } else {
                listOfGroups.add(currentGroup);
                currentGroup = new ArrayList<>();
                currentGroup.add(numToIdx[i]);
            }
        }
        if (!currentGroup.isEmpty()) {
            listOfGroups.add(currentGroup);
        }

        for (List<int[]> group : listOfGroups) {
            List<Integer> values = new ArrayList<>();
            for (int[] ints : group) {
                values.add(ints[0]);
            }
            group.sort(Comparator.comparing(value -> value[1]));
            for (int i = 0; i < group.size(); i++) {
                int idx = group.get(i)[1];
                nums[idx] = values.get(i);
            }
        }
        return nums;
    }


}