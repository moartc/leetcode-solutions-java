package solutions.algorithms._1000_1999._1840_Maximum_Building_Height;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxBuilding1() {
        int n = 5;
        int[][] restrictions = new int[][]{{2, 1}, {4, 1}};
        int answer = solution.maxBuilding(n, restrictions);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxBuilding2() {
        int n = 6;
        int[][] restrictions = new int[][]{};
        int answer = solution.maxBuilding(n, restrictions);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maxBuilding3() {
        int n = 10;
        int[][] restrictions = new int[][]{{5, 3}, {2, 5}, {7, 4}, {10, 3}};
        int answer = solution.maxBuilding(n, restrictions);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maxBuilding4() {
        int n = 10;
        int[][] restrictions = new int[][]{{8, 5}, {9, 0}, {6, 2}, {4, 0}, {3, 2}, {10, 0}, {5, 3}, {7, 3}, {2, 4}};
        int answer = solution.maxBuilding(n, restrictions);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxBuilding5() {
        int n = 6;
        int[][] restrictions = new int[][]{{5, 0}, {6, 0}};
        int answer = solution.maxBuilding(n, restrictions);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}