package solutions.algorithms._2000_2999._2536_Increment_Submatrices_by_One;

class Solution {

    /*
    Bruteforce changed to prefixsum like solution
    0  0  0  0
    0  1  0 -1
    0  0  0  0
    0 -1  0  1
     */

    public int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] markMatrix = new int[n + 1][n + 1];
        for (int[] query : queries) {
            int startY = query[0];
            int startX = query[1];
            int endY = query[2];
            int endX = query[3];

            markMatrix[startY][startX] += 1;
            markMatrix[startY][endX + 1] -= 1;
            markMatrix[endY + 1][startX] -= 1;
            markMatrix[endY + 1][endX + 1] += 1;
        }

        int[][] answerMatrix = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (y > 0 && x > 0) {
                    int prevVal = answerMatrix[y - 1][x] + answerMatrix[y][x - 1] - answerMatrix[y - 1][x - 1];
                    answerMatrix[y][x] = prevVal + markMatrix[y][x];
                } else if (y > 0) {
                    int prevVal = answerMatrix[y - 1][x];
                    answerMatrix[y][x] = prevVal + markMatrix[y][x];
                } else if (x > 0) {
                    int prevVal = answerMatrix[y][x - 1];
                    answerMatrix[y][x] = prevVal + markMatrix[y][x];
                } else {  // y == 0 && x == 0
                    answerMatrix[y][x] = markMatrix[y][x];
                }
            }
        }
        return answerMatrix;
    }
}