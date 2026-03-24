package solutions.algorithms._2000_2999._2906_Construct_Product_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void constructProductMatrix1() {
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        int[][] answer = solution.constructProductMatrix(grid);
        Assertions.assertThat(answer[0]).contains(24, 12);
        Assertions.assertThat(answer[1]).contains(8, 6);
    }

    @Test
    void constructProductMatrix2() {
        int[][] grid = new int[][]{{12345}, {2}, {1}};
        int[][] answer = solution.constructProductMatrix(grid);
        Assertions.assertThat(answer[0]).contains(2);
        Assertions.assertThat(answer[1]).contains(0);
        Assertions.assertThat(answer[2]).contains(0);
    }

    @Test
    void constructProductMatrix3() {
        int[][] grid = new int[][]{{4,3,9}, {3,9,10}, {9,7,8}, {8,4,7}, {6,1,3}};
        int[][] answer = solution.constructProductMatrix(grid);
        Assertions.assertThat(answer[0]).contains(3255,225,75);
        Assertions.assertThat(answer[1]).contains(225,75,11178);
        Assertions.assertThat(answer[2]).contains(75,1860,7800);
        Assertions.assertThat(answer[3]).contains(7800,3255,1860);
        Assertions.assertThat(answer[4]).contains(6285,675,225);
    }

    @Test
    void constructProductMatrix4() {
        int[][] grid = new int[][]{{12345,12345}};
        int[][] answer = solution.constructProductMatrix(grid);
        Assertions.assertThat(answer[0]).contains(0,0);
    }

    @Test
    void constructProductMatrix5() {
        int[][] grid = new int[][]{{414750857},{449145368},{767292749}};
        int[][] answer = solution.constructProductMatrix(grid);
        Assertions.assertThat(answer[0]).contains(1462);
        Assertions.assertThat(answer[1]).contains(3103);
        Assertions.assertThat(answer[2]).contains(9436);
    }
}