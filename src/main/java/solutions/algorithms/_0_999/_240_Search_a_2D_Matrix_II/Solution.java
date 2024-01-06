package solutions.algorithms._0_999._240_Search_a_2D_Matrix_II;

import java.util.Arrays;

class Solution {

    // binary search on rows that may contain target
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int[] row : matrix) {
            if(row[0] <= target && row[matrix[0].length-1] >= target) {
                if(Arrays.binarySearch(row, target) >=0) {
                    return true;
                }
            }
        }
        return false;
    }
}

