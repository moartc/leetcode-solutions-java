package solutions.algorithms._1000_1999._1851_Minimum_Interval_to_Include_Each_Query;

import java.util.*;

class Solution {

    /*
    I could sort the intervals by their start and end points - I will keep them in PriorityQueue.
    I could also sort the queries and then iterate through both arrays using 2 pointers.

    I will also need a mapping from the sorted query array to the original array.

    update1:
    after some time of struggling I found a hint - PriorityQueue for interval sizes can help
    So I think I can iterate through queries, add to heap all intervals where query fits
    then get the top one - it's the shortest one

     */

    public int[] minInterval(int[][] intervals, int[] queries) {


        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                var l1 = o1[1] - o1[0];
                var l2 = o2[1] - o2[0];
                return l1 - l2;
            }
        });

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        int[] queryCopy = Arrays.copyOf(queries, queries.length);
        Arrays.sort(queries);

        Map<Integer, Integer> tempResultMap = new HashMap<>();

        int currIntervalIdx = 0;
        for (int query : queries) {
            // clean-up
            while (!heap.isEmpty() && heap.peek()[1] < query) {
                heap.poll();
            }
            // add to heap
            while (currIntervalIdx < intervals.length && intervals[currIntervalIdx][0] <= query) {
                if (query >= intervals[currIntervalIdx][0] && query <= intervals[currIntervalIdx][1]) {
                    heap.add(intervals[currIntervalIdx]);
                }
                currIntervalIdx++;
            }
            // get the smallest one
            if (!heap.isEmpty()) {
                int[] poll = heap.peek();
                tempResultMap.put(query, poll[1] - poll[0] + 1);
            } else {
                tempResultMap.put(query, -1);
            }
        }

        // read from map and restore the original order
        for (int i = 0; i < queryCopy.length; i++) {
            queryCopy[i] = tempResultMap.get(queryCopy[i]);
        }
        return queryCopy;
    }
}