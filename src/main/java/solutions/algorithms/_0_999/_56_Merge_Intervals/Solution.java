package solutions.algorithms._0_999._56_Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {

    /*
    I could first sort them by the starting value, then iterate through them and merge.

    To merge, I can use a while loop and 2 pointers
    Initially, the first pointer is at 0, and the second at 1
    I check if the two intervals can be merged:
     - if so, I merge them, move the 2nd pointer and check again.
       I repeat this until they can't be merged anymore.
       Then I move the first pointer to the position of the 2nd one, and set the second pointer just after it.
     - if not, I add the first interval to the list and move both pointers forward by 1


     Updated idea (because it seems to be an easier solution):
     Create a result list and add the first interval, then iterate through the intervals, comparing each one with the
     last element int the result list.
     */
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        // since I don't know the final size of the result array, I will first add them all to a list.
        List<int[]> list = new ArrayList<>(intervals.length);
        list.add(intervals[0]);
        int[] lastAdded = list.get(0);
        for (int i = 1; i < intervals.length; i++) {
            int[] currentOne = intervals[i];
            if (lastAdded[1] >= currentOne[0]) {
                // update last added
                int end = Math.max(currentOne[1], lastAdded[1]);
                lastAdded[1] = end;
            } else {
                // else add the current one and update last added
                list.add(currentOne);
                lastAdded = currentOne;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}