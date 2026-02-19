package solutions.algorithms._0_999._632_Smallest_Range_Covering_Elements_from_K_Lists;

import java.util.List;
import java.util.PriorityQueue;

class Solution {

    /*
    I could iterate through all the arrays from left to right tracking the min and max values and their range
    I'm looking for the smallest range (specifically for the min and max values)
    Every time I move the smallest index to the right and check again.

    I could keep these values in a min stack (si I can always get the smallest one), but I also need to track the index of
     the array then number comes from and its current index.
    to track the max I can use a normal variable
    I can prefill the stack by iterating through the first element of all arrays
    */
    public int[] smallestRange(List<List<Integer>> nums) {

        // value, arr idx, value idx
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> integers = nums.get(i);
            int value = integers.get(0);
            max = Math.max(max, value);
            pq.add(new int[]{value, i, 0});
        }

        int lowestRangeSoFar = Integer.MAX_VALUE;
        int minFound = 0;
        int maxFound = 0;
        while (!pq.isEmpty()) {
            int[] currentMin = pq.poll();
            int minVal = currentMin[0];
            int arrIdx = currentMin[1];
            int elIdx = currentMin[2];

            int currentRange = max - minVal + 1;
            if (currentRange < lowestRangeSoFar) {
                lowestRangeSoFar = currentRange;
                minFound = minVal;
                maxFound = max;
            }
            // I have to move
            if (elIdx + 1 < nums.get(arrIdx).size()) {
                int valueToAdd = nums.get(arrIdx).get(elIdx + 1);
                max = Math.max(max, valueToAdd);
                int[] newElementForPq = {valueToAdd, arrIdx, elIdx + 1};
                pq.add(newElementForPq);
            } else {
                // I have to keep this element as minimum if it's really minimum
                return new int[]{minFound, maxFound};
            }
        }
        return new int[]{minFound, maxFound};
    }
}