package solutions.algorithms._1000_1999._1975_Maximum_Matrix_Sum;

class Solution {

    /*
    if in a row I have more > 1 negative, if the sum is even I can cancel to 0, otherwise to 1
    at the end I have some rows with 1 negative, I can cancel them the same
    the final answer is the total sum
    - minus the smallest element (if there was 1 negative number at the end)
    - minus 0, just the total
     */

    public long maxMatrixSum(int[][] matrix) {

        long totalSum = 0;
        long lowest = Integer.MAX_VALUE;
        long rowCounterWith1 = 0;
        for (int y = 0; y < matrix.length; y++) {
            long negativeCounter = 0;
            for (int x = 0; x < matrix[0].length; x++) {
                if (matrix[y][x] < 0) {
                    negativeCounter++;
                }
                totalSum += Math.abs(matrix[y][x]);
                lowest = Math.min(lowest, Math.abs(matrix[y][x]));
            }
            if (negativeCounter % 2 != 0) {
                rowCounterWith1++;
            }
        }

        if (rowCounterWith1 % 2 != 0) {
            // subtract the lowest
            // *2 because I added it once and I should've subtracted
            return totalSum - (lowest * 2L);
        } else { // return total
            return totalSum;
        }

    }
}