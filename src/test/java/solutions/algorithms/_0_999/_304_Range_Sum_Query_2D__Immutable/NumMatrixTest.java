package solutions.algorithms._0_999._304_Range_Sum_Query_2D__Immutable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumMatrixTest {

    @Test
    void test1() {

        int[][] matrix = new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix numMatrix = new NumMatrix(matrix);

        int i1 = numMatrix.sumRegion(2, 1, 4, 3);
        int i2 = numMatrix.sumRegion(1, 1, 2, 2);
        int i3 = numMatrix.sumRegion(1, 2, 2, 4);

        Assertions.assertThat(i1).isEqualTo(8);
        Assertions.assertThat(i2).isEqualTo(11);
        Assertions.assertThat(i3).isEqualTo(12);
    }

    @Test
    void test2() {

        int[][] matrix = new int[][]{{-1}};
        NumMatrix numMatrix = new NumMatrix(matrix);

        int i1 = numMatrix.sumRegion(0, 0, 0, 0);

        Assertions.assertThat(i1).isEqualTo(-1);
    }
}