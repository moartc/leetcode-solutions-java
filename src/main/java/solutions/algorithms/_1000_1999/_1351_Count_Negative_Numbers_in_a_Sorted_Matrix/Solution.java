package solutions.algorithms._1000_1999._1351_Count_Negative_Numbers_in_a_Sorted_Matrix;

class Solution {
    public int countNegatives(int[][] grid) {

        int negativeCounter = 0;
        for (int[] ints : grid) {
            for (int i : ints) {
                if (i < 0) {
                    negativeCounter++;
                }
            }
        }
        return negativeCounter;
    }
}