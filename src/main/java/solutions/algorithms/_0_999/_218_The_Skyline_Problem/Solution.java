package solutions.algorithms._0_999._218_The_Skyline_Problem;

import java.util.*;

class Solution {

    /*
    I think I could keep these buildings in a heap
    Actually it seems I could use 2 heaps:
    1. sorted by height
    2. sorted by right coordinate

    I take (from the sorted list) the first building
    - I mark the point and add it to the height heap
    - take the next one, if it's taller than the highest in the current heap, mark the point, if smaller, do nothing special
      in any case: add it to the height heap

    Also when taking the next one, add it to the ending heap. Actually, before processing the next one, I should check buildings that ends.

    for the example case:
    take the blue one, add it to height and ending heaps and mark 2,10 point
    take the red one, add it to both heaps. It's taller, so mark 3,15
    take the blue one, it's lower - add it to heaps but don't mark anything
    take the pink one: it's behind the first ending
    now process ending for the red one:
     - take the next highest and mark the point 7,12
    process ending for the blue one - it's lower than the highest still present (green one) so just remove it
    process ending for the green one - nothing in the height heap, so mark 12(x),0(ground)
    continue with the pink one...
    it proceeds the same as at the beginning of this "analysis"

    Some corner case (only one for now):
    - 2 buildings with different heights might share the same starting / ending point

    update: after some fixes, it actually passed. beats 87.06%
     */
    public List<List<Integer>> getSkyline(int[][] buildings) {

        PriorityQueue<int[]> heightHeap = new PriorityQueue<>((o1, o2) -> o2[2] - o1[2]);
        PriorityQueue<int[]> endHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        Arrays.sort(buildings, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[2] - o1[2];
            } else {
                return o1[0] - o2[0];
            }
        });

        List<List<Integer>> result = new ArrayList<>();
        int currentHighPoint = 0;

        for (int i = 0; i < buildings.length; i++) {

            int[] building = buildings[i];
            int start = building[0];
            int height = building[2];

            if (i == 0) { // just add the first one
                List<Integer> startingPoint = List.of(start, height);
                result.add(startingPoint);
                currentHighPoint = height;
                heightHeap.add(building);
                endHeap.add(building);
                continue;
            }
            // before I analyse the next one, check endings
            currentHighPoint = cleanUpEndHeap(endHeap, heightHeap, result, start, currentHighPoint);
            // process the new one
            if (height > currentHighPoint) {
                List<Integer> mark = List.of(start, height);
                result.add(mark);
                currentHighPoint = height;
            }
            heightHeap.add(building);
            endHeap.add(building);
        }
        // at the end I have to process all endings
        cleanUpEndHeap(endHeap, heightHeap, result, -1, 0);
        return result;
    }

    // start either real one, or -1 if I want to perform 'final' cleanup
    private int cleanUpEndHeap(PriorityQueue<int[]> endHeap, PriorityQueue<int[]> heightHeap, List<List<Integer>> result, int start,
                               int currentHighPoint) {
        while (!endHeap.isEmpty() && (start == -1 || endHeap.peek()[1] < start)) {
            int[] endedOne = endHeap.poll();
            if (endedOne == heightHeap.peek()) {
                // the one that ended is the highest
                int[] highest = heightHeap.poll();
                int right = endedOne[1];
                // here delete all lower that were not deleted but are ended
                while (!heightHeap.isEmpty() && heightHeap.peek()[1] <= right) {
                    heightHeap.poll();
                }
                int heightToMark = !heightHeap.isEmpty() ? heightHeap.peek()[2] : 0;
                if (heightToMark == highest[2]) {
                    // it's the same height, skip it
                    continue;
                }
                currentHighPoint = heightToMark;
                List<Integer> pointToAdd = List.of(right, heightToMark);
                result.add(pointToAdd);

            } else {
                // do nothing, just delete, keep in mind it still in heightHeap
            }
        }
        return currentHighPoint;
    }
}