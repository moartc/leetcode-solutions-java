package solutions.algorithms._1000_1999._1094_Car_Pooling;

import java.util.PriorityQueue;

class Solution {

    /*
    I could create 2 priority queues
    1. stores the number of passengers and the "from" value
    2. stores the number of passengers and the "to" value
    basically, I have sorted locations where passengers enter and leave the car

    Initially I fill both queues, and then in a  loop
    I poll from both and process the element with the lower "from" or "to" value
    for example
    pq1: 2 1, 3 3
    pq2: 2 5, 3 7
    I poll 2 1 and 2 5, set current taken places to 2, then poll again
    I get 3 3 | 2 5, 3 < 5 so the first poll wins, and I check if the expected capacity > than the actual.
    if so, I return false, if I am at the end I return true.

    update: performance is pretty bad - 5%, I will try to extend my class and keep info if the
    location is for enter or leave. With that I can use only one PQ
    and it beats 48%
     */
    public boolean carPooling(int[][] trips, int capacity) {


        PriorityQueue<Pair> pq = new PriorityQueue<>((o1, o2) -> {
            int comp = o1.fromOrTo - o2.fromOrTo;
            if (comp == 0) {
                return Boolean.compare(o1.isEnter, o2.isEnter); // false before true
            }
            return comp;
        });

        for (int[] trip : trips) {

            int nop = trip[0];
            int from = trip[1];
            int to = trip[2];
            pq.add(new Pair(true, nop, from));
            pq.add(new Pair(false, nop, to));
        }

        int currentTakenSpace = 0;
        while (!pq.isEmpty()) {
            Pair poll = pq.poll();
            if (poll.isEnter) {
                if (poll.numPass + currentTakenSpace > capacity) {
                    return false;
                } else {
                    currentTakenSpace += poll.numPass;
                }
            } else {
                currentTakenSpace -= poll.numPass;

            }
        }
        return true;
    }

    static class Pair {
        public boolean isEnter;
        public int numPass;
        public int fromOrTo;

        public Pair(boolean isEnter, int numPass, int fromOrTo) {
            this.isEnter = isEnter;
            this.numPass = numPass;
            this.fromOrTo = fromOrTo;
        }
    }
}