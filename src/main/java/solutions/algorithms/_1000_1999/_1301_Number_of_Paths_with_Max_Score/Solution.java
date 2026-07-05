package solutions.algorithms._1000_1999._1301_Number_of_Paths_with_Max_Score;

import java.util.List;

class Solution {

    /*
    something like a bottom up DP
    I will use additional array to store all the data I need
     */
    public int[] pathsWithMaxScore(List<String> board) {

        int modulo = 1000000000 + 7;

        int n = board.size();
        int[] not_calculated_yet = new int[]{-1, 0};

        // first 2 dims - nxn board and then 0 - value, 1 - counter
        int[][][] pathCalCtr = new int[n][n][2];
        for (int y = 0; y < pathCalCtr.length; y++) {
            for (int x = 0; x < pathCalCtr.length; x++) {
                pathCalCtr[y][x] = not_calculated_yet;
            }
        }

        for (int y = n - 1; y >= 0; y--) {
            for (int x = n - 1; x >= 0; x--) {
                char c = board.get(y).charAt(x);
                if (c == 'X') {
                    // don't do anything
                } else if (c == 'S') {
                    pathCalCtr[y][x] = new int[]{0, 1};
                } else {
                    int current = c == 'E' ? 0 : c - 48;
                    int[] right = x < n - 1 ? pathCalCtr[y][x + 1] : not_calculated_yet;
                    int[] down = y < n - 1 ? pathCalCtr[y + 1][x] : not_calculated_yet;
                    int[] diag = (x < n - 1 && y < n - 1) ? pathCalCtr[y + 1][x + 1] : not_calculated_yet;

                    int[] bestSum = not_calculated_yet;
                    if (right[0] > bestSum[0]) {
                        bestSum = new int[]{right[0], right[1] % modulo};
                    }
                    if (down[0] != -1 && down[0] == bestSum[0]) {
                        bestSum = new int[]{down[0], (bestSum[1] + down[1]) % modulo};
                    }
                    if (down[0] > bestSum[0]) {
                        bestSum = new int[]{down[0], down[1] % modulo};
                    }
                    if (diag[0] != -1 && diag[0] == bestSum[0]) {
                        bestSum = new int[]{diag[0], (bestSum[1] + diag[1]) % modulo};
                    }
                    if (diag[0] > bestSum[0]) {
                        bestSum = new int[]{diag[0], diag[1] % modulo};
                    }

                    if (bestSum != not_calculated_yet) {
                        // when I search for the max I don't want to add the current val there,
                        // so I have to do it here
                        bestSum[0] += current;
                    }
                    pathCalCtr[y][x] = bestSum;
                }
            }
        }
        return pathCalCtr[0][0] == not_calculated_yet ? new int[]{0, 0} : pathCalCtr[0][0];
    }
}