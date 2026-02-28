package solutions.algorithms._0_999._752_Open_the_Lock;

import java.util.*;

class Solution {

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

    update (another try) - simpler version:
    I could bfs it, count moves, store visited states. Before visit check all deadlocks
     */
    public int openLock(String[] deadends, String target) {

        Set<String> deadendsSet = new HashSet<>();
        for (String deadend : deadends) {
            deadendsSet.add(deadend);
            if (deadend.equals("0000")) {
                return -1;
            }
        }
        Queue<String> list = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        visited.add("0000");
        list.add("0000");
        int roundCtr = -1;
        while (!list.isEmpty()) {
            int size = list.size();
            roundCtr++;

            for (int i = 0; i < size; i++) {
                String poll = list.poll();
                if (poll.equals(target)) {
                    return roundCtr;
                }
                List<String> possibleNextMoves = allPossibleMoves(poll);
                for (String newPossibleLock : possibleNextMoves) {
                    if (!deadendsSet.contains(newPossibleLock)) {
                        if (visited.add(newPossibleLock)) {
                            list.add(newPossibleLock);
                        }
                    }
                }
            }
        }
        return -1;
    }

    List<String> allPossibleMoves(String current) {
        List<String> allOptions = new ArrayList<>();
        StringBuilder sb = new StringBuilder(current);
        for (int i = 0; i < 4; i++) {
            char currentChar = current.charAt(i);
            char nextCharUp;
            char nextCharDown;
            if (currentChar < '9') {
                nextCharUp = (char) (currentChar + 1);
            } else {
                nextCharUp = '0';
            }
            if (currentChar > '0') {
                nextCharDown = (char) (currentChar - 1);
            } else {
                nextCharDown = '9';
            }
            sb.setCharAt(i, nextCharUp);
            String up = sb.toString();
            sb.setCharAt(i, nextCharDown);
            String down = sb.toString();
            sb.setCharAt(i, current.charAt(i));
            allOptions.add(up);
            allOptions.add(down);
        }

        return allOptions;
    }
}