package solutions.algorithms._0_999._74_Search_a_2D_Matrix;

class Solution {


    public boolean searchMatrix(int[][] matrix, int target) {

        int lastIdx = (matrix.length * matrix[0].length) - 1;
        return search(0, lastIdx, matrix, target);
    }

    boolean search(int left, int right, int[][] matrix, int target) {

        int indexToCheck = (left + right) / 2;
        int rowToCheck = ((indexToCheck) / matrix[0].length);
        int colToCheck = indexToCheck - (rowToCheck * matrix[0].length);

        int value = matrix[rowToCheck][colToCheck];
        if (value == target) {
            return true;
        } else if (left == right) {
            return false;
        } else if (value > target) {
            return search(left, indexToCheck, matrix, target);
        } else {
            return search(indexToCheck + 1, right, matrix, target);
        }
    }
}