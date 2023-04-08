package solutions.algorithms._48_Rotate_Image;

class Solution {
    public void rotate(int[][] matrix) {

        int offsetEnd = (matrix.length) / 2;
        for (int offset = 0; offset <= offsetEnd; offset++) {
            int end = matrix.length - offset - 1;
            for (int x = offset; x < end; x++) {
                swap(offset, end, x, matrix, offset);
            }
        }
    }

    private void swap(int beginning, int end, int x, int[][] arr, int offset) {

        int a = arr[beginning][x];
        int b = arr[x][end];
        int c = arr[end][end - x + offset];
        int d = arr[end + offset - x][beginning];

        arr[beginning][x] = d;
        arr[x][end] = a;
        arr[end][end - x + offset] = b;
        arr[end + offset - x][beginning] = c;
    }
}