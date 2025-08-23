package solutions.algorithms._1000_1999._1046_Last_Stone_Weight;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {


    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue(Comparator.reverseOrder());

        for (int stone : stones) {
            queue.add(stone);
        }

        while (queue.size() >= 2) {
            int greater = queue.poll();
            int lower = queue.poll();
            if (greater == lower) {
                // no new stone
            } else {
                int newStone = greater - lower;
                queue.add(newStone);
            }
        }

        if (queue.isEmpty()) {
            return 0;
        } else {
            return queue.poll();
        }
    }
}