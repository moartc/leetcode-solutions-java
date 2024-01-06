package solutions.algorithms._0_999._547_Number_of_Provinces;

class Solution {
    public int findCircleNum(int[][] isConnected) {

        int counter = 0;
        boolean[] isVisited = new boolean[isConnected.length];
        for (int y = 0; y < isConnected.length; y++) {
            if (!isVisited[y]) {
                isVisited[y] = true;
                counter++;
                visitAllConnected(isConnected, y, isVisited);
            }
        }
        return counter;
    }

    void visitAllConnected(int[][] isConnected, int y, boolean[] isVisited) {
        for (int i = 0; i < isConnected.length; i++) {
            if (!isVisited[i] && isConnected[y][i] == 1) {
                isVisited[i] = true;
                visitAllConnected(isConnected, i, isVisited);
            }
        }
    }
}