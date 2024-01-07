package solutions.algorithms._10000_10999._10033_Minimum_Number_of_Operations_to_Make_X_and_Y_Equal;

import java.util.*;

class Solution {

    public int minimumOperationsToMakeEqual(int x, int y) {
        int bestFound = x - y;

        if (x <= y) {
            return y - x;
        } else { // x < y

            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(x, 0));
            Set<Integer> visited = new HashSet<>();
            while (!queue.isEmpty()) {
                Pair poll = queue.poll();

                if (poll.ctr >= bestFound) {
                    continue;
                }
                if (poll.x == y) {
                    bestFound = poll.ctr;
                }

                if (!visited.add(poll.x)) {
                    continue;
                }

                if (poll.x > y) {
                    if (poll.x % 11 == 0) {
                        queue.add(new Pair(poll.x / 11, poll.ctr + 1));
                    }
                    if (poll.x % 5 == 0) {
                        queue.add(new Pair(poll.x / 5, poll.ctr + 1));
                    }
                    queue.add(new Pair(poll.x + 1, poll.ctr + 1));
                    queue.add(new Pair(poll.x - 1, poll.ctr + 1));
                } else { // poll.x <= y
                    if (poll.ctr + y - poll.x < bestFound) {
                        bestFound = poll.ctr + y - poll.x;
                    }
                }
            }
        }
        return bestFound;
    }

    static class Pair {
        public int x;
        public int ctr;

        public Pair(int x, int y) {
            this.x = x;
            this.ctr = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && ctr == pair.ctr;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, ctr);
        }
    }
}