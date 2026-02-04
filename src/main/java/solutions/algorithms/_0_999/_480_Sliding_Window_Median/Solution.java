package solutions.algorithms._0_999._480_Sliding_Window_Median;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {

    /*
    if k is odd - I should track only one value
    if k is even - I need 2 values and take the mean of those 2
    I could use 2 heaps for that:
    - if arr size is even they should have equal sizes, otherwise one 1 larger by 1 (let's say maxHeap)
    - one is a max heap, the other a min heap
    the only problem is that I cannot efficiently remove the value that leaves the window from a heap.
    But since I know which heap it is in, I can mark it as 'deleted', and track that the heap is
    larger by 1 because of that. When I eventually poll this value , I delete (simply ignore) it and poll the next one.
     */
    public double[] medianSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        int maxHeapSize = 0;
        int minHeapSize = 0;
        Map<Integer, Integer> deleted = new HashMap<>();
        int resArraySize = nums.length - k + 1;
        double[] res = new double[resArraySize];

        // main loop, start from 0..size-1-k
        for (int i = 0; i < nums.length + 1 - k; i++) {
            // first setup
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    int val = nums[j];
                    minHeap.add(val);
                    minHeapSize++;
                }
                for (int j = 0; j < (k + 1) / 2; j++) {
                    maxHeap.add(minHeap.poll());
                    minHeapSize--;
                    maxHeapSize++;
                }
            } else {
                int outOfWindow = nums[i - 1];
                Integer currentCtr = deleted.getOrDefault(outOfWindow, 0);
                deleted.put(outOfWindow, currentCtr + 1);
                // decrease heap ctr and try to delete
                if (!maxHeap.isEmpty() && outOfWindow <= maxHeap.peek()) {
                    maxHeapSize--;
                } else {
                    minHeapSize--;
                }

                // get the next one
                int nextOne = nums[i + k - 1];
                // add it
                if (maxHeap.isEmpty() || nextOne <= maxHeap.peek()) {
                    maxHeap.add(nextOne);
                    deleteDeletedTopElement(maxHeap, deleted);

                    maxHeapSize++;
                } else {
                    minHeap.add(nextOne);
                    deleteDeletedTopElement(minHeap, deleted);

                    minHeapSize++;
                }


                // now rebalance
                while (!minHeap.isEmpty() && minHeapSize + (k % 2) != maxHeapSize) {
                    Integer minEl = minHeap.poll();
                    minHeapSize--;
                    maxHeap.add(minEl);
                    maxHeapSize++;
                }
                while (!maxHeap.isEmpty() && minHeapSize + (k % 2) != maxHeapSize) {
                    Integer maxEl = maxHeap.poll();
                    maxHeapSize--;
                    minHeap.add(maxEl);
                    minHeapSize++;
                }
            }
            // now I can check avg
            if (k % 2 == 0) {
                deleteDeletedTopElement(maxHeap, deleted);
                deleteDeletedTopElement(minHeap, deleted);
                int v1 = maxHeap.peek();
                int v2 = minHeap.peek();
                // weird way of calculating it, but otherwise I cannot handle the case
                // with Integer.MAX
                double avg = (v1 / 2.0 + v2 / 2.0);
                res[i] = avg;

            } else {
                deleteDeletedTopElement(maxHeap, deleted);
                int v = maxHeap.peek();
                res[i] = v;
//                System.out.println("v = " + v);
            }
        }
        return res;
    }

    void deleteDeletedTopElement(PriorityQueue<Integer> heap, Map<Integer, Integer> deleted) {
        while (!heap.isEmpty()) {
            Integer topElement = heap.peek();
            Integer currentCtr = deleted.getOrDefault(topElement, 0);
            if (currentCtr > 0) {
                deleted.put(topElement, currentCtr - 1);
                heap.poll();
            } else {
                break;
            }
        }
    }
}