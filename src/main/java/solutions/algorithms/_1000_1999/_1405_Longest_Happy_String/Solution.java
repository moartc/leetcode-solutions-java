package solutions.algorithms._1000_1999._1405_Longest_Happy_String;

import java.util.PriorityQueue;

class Solution {

    /*
    I can track the number of remaining occurrences in a priority queue,
    On top is the letter with the highest value.
    Until I can, I poll the max value and append it to the final string, decrease its counter,
    and push it back into the queue.
    I also have to track the last 2 characters. If they are the same as the polled character,
     I poll and use the next one then add both back.

     update:
     additional check to ensure the initial values are greater than 0 because my logic assumes than,
      and only after usage does it decrease the value and check whether it should be added back.
     */
    public String longestDiverseString(int a, int b, int c) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((o1, o2) -> o2.occ - o1.occ);
        if (a > 0) {
            pq.add(new Pair('a', a));
        }
        if (b > 0) {
            pq.add(new Pair('b', b));
        }
        if (c > 0) {
            pq.add(new Pair('c', c));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair poll = pq.poll();
            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2) && sb.charAt(sb.length() - 1) == poll.c) {
                // there are at least 2 characters, last 2 are equal, and they are equal to the polled one
                if (pq.isEmpty()) {
                    // cannot poll another one
                    return sb.toString();
                } else {
                    Pair anotherPoll = pq.poll();
                    sb.append(anotherPoll.c);
                    anotherPoll.occ--;
                    if (anotherPoll.occ > 0) {
                        pq.add(anotherPoll);
                    }
                    // also add back the main one
                    pq.add(poll);
                }
            } else {
                sb.append(poll.c);
                poll.occ--;
                if (poll.occ > 0) {
                    pq.add(poll);
                }
            }
        }
        return sb.toString();
    }

    class Pair {
        public char c;
        public int occ;

        public Pair(char c, int occ) {
            this.c = c;
            this.occ = occ;
        }
    }
}