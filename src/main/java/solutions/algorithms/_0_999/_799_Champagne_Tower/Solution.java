package solutions.algorithms._0_999._799_Champagne_Tower;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] sim = new double[query_row + 1][query_row + 1];
        sim[0][0] = poured;
        for (int row = 1; row <= query_row; row++) {

            int numberOfGlasses = row + 1;
            for (int i = 0; i < numberOfGlasses; i++) {
                if (i == 0) {
                    sim[row][i] = Math.max((sim[row - 1][i] - 1) / 2.0, 0.0);
                } else if (i == numberOfGlasses - 1) {
                    sim[row][i] = Math.max((sim[row - 1][i - 1] - 1) / 2.0, 0);
                } else {
                    double amount1 = Math.max((sim[row - 1][i - 1] - 1) / 2.0, 0.0);
                    double amount2 = Math.max((sim[row - 1][i] - 1) / 2.0, 0.0);
                    double total = amount1 + amount2;
                    sim[row][i] = total;
                }
            }
        }
        return Math.min(sim[query_row][query_glass], 1.0);
    }

}