package solutions.algorithms._0_999._703_Kth_Largest_Element_in_a_Stream;

import java.util.PriorityQueue;

class KthLargest {

    /*
    I need only top k values.
     */
    PriorityQueue<Integer> queue;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.add(val);
        } else {
            queue.add(val);
            queue.poll(); // poll the last which is k+1th
        }
        return queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */