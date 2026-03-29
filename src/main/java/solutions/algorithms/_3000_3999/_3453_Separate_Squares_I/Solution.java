package solutions.algorithms._3000_3999._3453_Separate_Squares_I;

class Solution {
    public double separateSquares(int[][] squares) {

        double left = 0;
        double right = 0;
        for (int[] square : squares) {
            long top = (long) square[1] + (long) square[2];
            right = Math.max(right, top);
        }

        while (right - left > (1e-5)) {
            double middle = (right + left) / 2.0;
            double areaAbove = countAreaAbove(middle, squares);
            double areaBelow = countAreaBelow(middle, squares);
            if (areaAbove > areaBelow) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right;
    }

    double countAreaAbove(double posY, int[][] squares) {
        double area = 0.0;
        for (int[] sq : squares) {
            int y = sq[1];
            int size = sq[2];
            int top = y + size;
            if (y >= posY) {
                area += (double) size * size;
            } else if (top <= posY) {
                // nothing
            } else {
                area += (double) size * (top - posY);
            }
        }
        return area;
    }

    double countAreaBelow(double posY, int[][] squares) {
        double area = 0.0;
        for (int[] sq : squares) {
            int y = sq[1];
            int size = sq[2];
            int top = y + size;
            if (top <= posY) {
                area += (double) size * size;
            } else if (y >= posY) {
                // nothing
            } else {
                area += (double) size * (posY - y);
            }
        }
        return area;
    }

}