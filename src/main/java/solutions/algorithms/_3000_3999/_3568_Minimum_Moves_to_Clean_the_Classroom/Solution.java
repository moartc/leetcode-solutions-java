package solutions.algorithms._3000_3999._3568_Minimum_Moves_to_Clean_the_Classroom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int[][] MOVES = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int minMoves(String[] classroom, int energy) {

        int n = classroom.length;
        int m = classroom[0].length();

        int y = -1;
        int x = -1;

        int lToCollect = 0;
        int[][] lIdxArr = new int[n][m];
        // find start
        // find L to collect
        int currLIdx = 0;
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                char currChar = classroom[i].charAt(i1);
                if (currChar == 'S') {
                    y = i;
                    x = i1;
                } else if (currChar == 'L') {
                    lIdxArr[i][i1] = currLIdx;
                    currLIdx++;
                    lToCollect++;
                }
            }
        }
        // return 0 instead of -1 if thre is nothing to collect
        if (lToCollect == 0) {
            return 0;
        }

        // visited with position + masking for L (max 2^10)/ value represents energy
        // bfs so I don't need steps
        int[][][] visitedEnergy = new int[n][m][1024];
        for (int[][] ints : visitedEnergy) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }
        Queue<int[]> queue = new LinkedList<>();
        // y, x, current energy, L masking, steps
        queue.add(new int[]{y, x, energy, 0, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currY = current[0];
            int currX = current[1];
            int currEnergy = current[2];
            int currMask = current[3];
            int currSteps = current[4];
            char currentChar = classroom[currY].charAt(currX);

            if (currentChar == 'R') {
                currEnergy = energy;
            } else if (currentChar == 'L') {

                int lIdx = lIdxArr[currY][currX];
                currMask = currMask | (1 << lIdx);
                if (currMask == Math.pow(2, lToCollect) - 1) {
                    return currSteps;
                }
            }

            currEnergy--;
            if (currEnergy >= 0) {
                for (int[] move : MOVES) {
                    int newY = currY + move[0];
                    int newX = currX + move[1];
                    if (newY >= 0 && newY < n && newX >= 0 && newX < m) {
                        char charAtNewPos = classroom[newY].charAt(newX);
                        if (charAtNewPos != 'X') {
                            if (visitedEnergy[newY][newX][currMask] < currEnergy) {
                                visitedEnergy[newY][newX][currMask] = currEnergy;
                                int[] newEntry = new int[]{newY, newX, currEnergy, currMask, currSteps + 1};
                                queue.add(newEntry);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}