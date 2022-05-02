package solutions.algorithms._74_Search_a_2D_Matrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = binSearchRow(matrix, target);
        if (low == -1) {
            return false;
        }
        return binSearchNumber(matrix[low], target);
    }

    int binSearchRow(int[][] matrix, int target) {
        int lastRow = matrix.length - 1;
        int lastCol = matrix[lastRow].length - 1;
        if (target > matrix[lastRow][lastCol] || target < matrix[0][0]) {
            return -1;
        }
        int low = 0;
        int high = matrix.length - 1;
        while (high - low > 1) {
            int middle = low + ((high - low) / 2);
            if (matrix[middle][0] > target) {
                high = middle;
            } else {
                low = middle;
            }
        }
        if (target >= matrix[high][0]) {
            return high;
        } else {
            return low;
        }
    }

    boolean binSearchNumber(int[] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (high - low > 1) {
            int middle = low + ((high - low) / 2);
            if (matrix[middle] == target) {
                return true;
            }
            if (matrix[middle] > target) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return target == matrix[high] || target == matrix[low];
    }
}