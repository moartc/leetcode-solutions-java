package solutions.algorithms._0_999._752_Open_the_Lock;

import java.util.*;

class Solution {

    // todo refactor / simplify it
    /*
    It's like finding the shortest path (I could use BFS).
    The total distance is the sum of all 4 wheels.

    The starting point is an array [0,0,0,0]
    at each step I generate possible new positions - 8 in total, where only one wheel changes.
    I keep track of already visited "states" + check that they are valid (not in deadends)

    The starting point is an array [0,0,0,0].
    At each step I generate possible new positions — 8 in total —
    where only one wheel changes. I keep track of already visited states
    and check that they’re valid (not in deadends).

     */
    public int openLock(String[] deadends, String target) {


        Set<Wheels> deadendSet = new HashSet<>();
        for (String deadend : deadends) {
            int[] ints = {deadend.charAt(0) - '0', deadend.charAt(1) - '0', deadend.charAt(2) - '0', deadend.charAt(3) - '0'};
            deadendSet.add(new Wheels(ints[0], ints[1], ints[2], ints[3]));
        }

        if (deadendSet.contains(new Wheels(0, 0, 0, 0))) {
            // precheck for this corner-case
            return -1;
        }

        Queue<State> queue = new LinkedList<>();
        Set<Wheels> visited = new HashSet<>();

        int[] targetArray = new int[]{target.charAt(0) - '0', target.charAt(1) - '0', target.charAt(2) - '0', target.charAt(3) - '0'};
        Wheels targetWheel = new Wheels(targetArray[0], targetArray[1], targetArray[2], targetArray[3]);

        State initialState = new State(new Wheels(0, 0, 0, 0), 0);

        queue.add(initialState);
        visited.add(initialState.wheels);

        while (!queue.isEmpty()) {
            State state = queue.poll();

            if (state.wheels.equals(targetWheel)) {
                return state.steps;
            }
            List<Wheels> toVisit = getNext(state.wheels);
            for (Wheels singleToVisit : toVisit) {
                if (!deadendSet.contains(singleToVisit) && visited.add(singleToVisit)) {
                    queue.add(new State(singleToVisit, state.steps + 1));
                }
            }
        }

        return -1;
    }

    public List<Wheels> getNext(Wheels current) {

        List<Wheels> nextList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Wheels next1 = new Wheels(current.a, current.b, current.c, current.d);
            Wheels next2 = new Wheels(current.a, current.b, current.c, current.d);
            if (i == 0) {
                next1.a = (next1.a + 1) % 10;
                next2.a = next2.a == 0 ? 9 : next2.a - 1;
            } else if (i == 1) {
                next1.b = (next1.b + 1) % 10;
                next2.b = next2.b == 0 ? 9 : next2.b - 1;
            } else if (i == 2) {
                next1.c = (next1.c + 1) % 10;
                next2.c = next2.c == 0 ? 9 : next2.c - 1;
            } else {
                next1.d = (next1.d + 1) % 10;
                next2.d = next2.d == 0 ? 9 : next2.d - 1;
            }
            nextList.add(next1);
            nextList.add(next2);
        }

        return nextList;
    }

    static class Wheels {
        int a;
        int b;
        int c;
        int d;

        public Wheels(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        @Override
        public boolean equals(Object o) {

            if (o == null || getClass() != o.getClass()) return false;
            Wheels wheels = (Wheels) o;
            return a == wheels.a && b == wheels.b && c == wheels.c && d == wheels.d;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c, d);
        }
    }


    class State {
        public Wheels wheels;
        public int steps;

        public State(Wheels wheels, int steps) {
            this.wheels = wheels;
            this.steps = steps;
        }

        @Override
        public boolean equals(Object o) {

            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return steps == state.steps && Objects.equals(wheels, state.wheels);
        }

        @Override
        public int hashCode() {
            return Objects.hash(wheels, steps);
        }
    }
}