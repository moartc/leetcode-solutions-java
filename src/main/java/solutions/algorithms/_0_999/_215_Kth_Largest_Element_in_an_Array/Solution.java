package solutions.algorithms._0_999._215_Kth_Largest_Element_in_an_Array;

import java.util.PriorityQueue;

class Solution {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int ctr = 0;
        for (int num : nums) {
            ctr++;
            if (ctr <= k) {
                priorityQueue.add(num);
            } else if (num >= priorityQueue.peek()) {
                // I don't want to add lower numbers which I would poll anyway
                priorityQueue.add(num);
                priorityQueue.poll();
            }

        }
        return priorityQueue.poll();
    }
}