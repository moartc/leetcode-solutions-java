package solutions.algorithms._0_999._773_Sliding_Puzzle;

import java.util.*;

class Solution {

    /*
    I can actually "brute force" it with BFS + some decent caching
    beats 88.89%
     */
    public int slidingPuzzle(int[][] board) {

        Set<State> alreadyVisited = new HashSet<>();

        Queue<State> queue = new ArrayDeque<>();
        State initState = new State(board);
        queue.add(initState);
        alreadyVisited.add(initState);

        int moves = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                State currentState = queue.poll();

                if (isFinalState(currentState)) {
                    return moves;
                }

                List<State> states = moveZero(currentState);
                for (State state : states) {
                    if (alreadyVisited.add(state)) {
                        queue.add(state);
                    }
                }
            }
            moves++;
        }
        return -1;
    }

    List<State> moveZero(State current) {
        List<State> newStates = new LinkedList<>();
        if (current.a == 0) {
            newStates.add(new State(current.b, 0, current.c, current.d, current.e, current.f));
            newStates.add(new State(current.d, current.b, current.c, 0, current.e, current.f));
        } else if (current.b == 0) {
            newStates.add(new State(0, current.a, current.c, current.d, current.e, current.f));
            newStates.add(new State(current.a, current.e, current.c, current.d, 0, current.f));
            newStates.add(new State(current.a, current.c, 0, current.d, current.e, current.f));
        } else if (current.c == 0) {
            newStates.add(new State(current.a, 0, current.b, current.d, current.e, current.f));
            newStates.add(new State(current.a, current.b, current.f, current.d, current.e, 0));
        } else if (current.d == 0) {
            newStates.add(new State(0, current.b, current.c, current.a, current.e, current.f));
            newStates.add(new State(current.a, current.b, current.c, current.e, 0, current.f));
        } else if (current.e == 0) {
            newStates.add(new State(current.a, current.b, current.c, 0, current.d, current.f));
            newStates.add(new State(current.a, 0, current.c, current.d, current.b, current.f));
            newStates.add(new State(current.a, current.b, current.c, current.d, current.f, 0));
        } else { // f
            newStates.add(new State(current.a, current.b, 0, current.d, current.e, current.c));
            newStates.add(new State(current.a, current.b, current.c, current.d, 0, current.e));
        }
        return newStates;
    }

    boolean isFinalState(State s) {
        return s.a == 1 && s.b == 2 && s.c == 3
                && s.d == 4 && s.e == 5 && s.f == 0;
    }


}

class State {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public State(int[][] b) {
        this.a = b[0][0];
        this.b = b[0][1];
        this.c = b[0][2];
        this.d = b[1][0];
        this.e = b[1][1];
        this.f = b[1][2];
    }

    public State(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return a == state.a && b == state.b && c == state.c && d == state.d && e == state.e && f == state.f;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d, e, f);
    }
}